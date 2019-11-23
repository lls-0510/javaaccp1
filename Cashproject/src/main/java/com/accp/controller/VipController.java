package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Supplier;
import com.accp.domain.Vip;
import com.accp.domain.VipCount;
import com.accp.service.VipService;
import com.github.pagehelper.PageInfo;

@Controller
public class VipController {
	@Autowired
	VipService vipService;
	
	@RequestMapping("/excelUpload")
	public String excelUpload(MultipartFile file) {
		try {
			//将传入的文件转换成excel
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				int rows = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rows;j++) {
					//根据下标获取行
					Row row = sheet.getRow(j);
					Cell idCell = row.getCell(0);
					Cell nameCell = row.getCell(1);
					Cell phoneCell = row.getCell(2);
					Cell priceCell = row.getCell(3);
					Cell integralCell = row.getCell(4);
					Vip stu = new Vip();
					Integer id = (int) idCell.getNumericCellValue();
					stu.setVtypeid(id.intValue());
					stu.setVname(nameCell.getStringCellValue());
					stu.setVphone(phoneCell.getStringCellValue());
					stu.setVprice(priceCell.getStringCellValue());
					stu.setIntegral(integralCell.getStringCellValue());
					vipService.insertvip(stu);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	/**
	 * 下载模板
	 * @return
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("D:/images/模板.xlsx");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", new String("导出的会员信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	/**
	 * 会员信息的导出
	 * @param vname
	 * @return
	 */
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String vname){
		System.out.println("进来了");
		//查询出需要导出的学生
		List<VipCount> list =vipService.find(vname);
		//导出学生信息为excel
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("姓名");
		titleRow.createCell(1).setCellValue("手机");
		titleRow.createCell(2).setCellValue("余额");
		titleRow.createCell(3).setCellValue("积分");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<list.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell nameCell = row.createCell(0);
			
			nameCell.setCellValue(list.get(i).getVname());
			Cell phoneCell = row.createCell(1);
			System.out.println("list.get(i).getVname()");
			phoneCell.setCellValue(list.get(i).getVphone());
			Cell price = row.createCell(2);
			
			price.setCellValue(list.get(i).getVprice());
			Cell Integral = row.createCell(3);
			Integral.setCellValue(list.get(i).getIntegral());
		}
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("导出的信息会员.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	
	/**
	 * 模糊查询的会员姓名
	 * @param model
	 * @param vname
	 * @return
	 */
	@RequestMapping("/find")
	public String find(Model model,String vname) {
		List<VipCount> list = vipService.find(vname);
		model.addAttribute("list", list);
		return null;
	}
	
	/**
	 * 会员分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/Vipcount")
	@ResponseBody
	public PageInfo<VipCount>Vipcount(Integer pageNum, Integer pageSize,String vname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<VipCount> page = vipService.Vipcount(pageNum, pageSize, vname);
		System.out.println(page.toString());
		return page;
	}
	
	/**
	 * 会员新增信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/insertvip")
	@ResponseBody
	public int insertvip(Vip record) {
		int i= vipService.insertvip(record);
		if(i>0) {
			return 000;
		}else {
			return 1111;
		}
	}
	/**
	 * 会员修改id
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/queryVipid")
	@ResponseBody
	public Vip queryVipid(Integer vid) {
		return vipService.queryVipid(vid);
	}
	
	/**
	 * 会员修改
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/updatetvip")
	@ResponseBody
	public int updatetvip(Vip record) {
		System.out.println("进来了会员修改");
		int i= vipService.updatetvip(record);
		if(i>0) {
			return 000;
		}else {
			return 1111;
		}
	}
	
	/**
	 * 会员删除
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/deleteVip")
	@ResponseBody
	public int deleteVip(Integer vid) {
		int i=  vipService.deleteVip(vid);
		if(i>0) {
			return 000;
		}else {
			return 1111;
		}
	}

}
