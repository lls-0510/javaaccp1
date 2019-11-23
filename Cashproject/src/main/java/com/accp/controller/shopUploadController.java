package com.accp.controller;

import com.accp.domain.Good;
import com.accp.domain.Shop;
import com.accp.domain.Size;
import com.accp.domain.Store;
import com.accp.service.shopUploadService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class shopUploadController {

	// 尺寸操作
	@Autowired
	shopUploadService shopUploadService; // 尺寸

	@RequestMapping("/getSize")
	@ResponseBody 
	public List<Size> getSize() { 
		return shopUploadService.queryAllSize();
	}

	
	  @RequestMapping("/addsize")
	  @ResponseBody
	  public String addsize(@RequestBody List<Size> sizes) {
		  	shopUploadService.addsize(sizes);
		  	return "success"; 
	  } 
	    
	  // 商品类别  
	  @RequestMapping("/getgType")
	  @ResponseBody
	  public List<Good> getgType(){
		  return this.shopUploadService.queryAllGtype();
	  }
	  
	  
	  @RequestMapping("/addshop")
	  @ResponseBody  
	  public String addshop(@RequestBody Shop shop) {
		  shopUploadService.addshop(shop);
		  return "success";
	  }
	  
	  
	   @RequestMapping("/uploadsimg") 
		@ResponseBody
		public String uploadAjax(MultipartFile [] files) {
			File directory = new File("D:\\staticSource");
			if(!directory.exists()) {
				directory.mkdirs();
			} 
			String urls  = "";
			try {
				for(MultipartFile l : files) {
					String url = "D:\\staticSource";
					url = url+"/"+l.getOriginalFilename();
					if(urls.equals("")) {
						urls = l.getOriginalFilename() ; 
					}else {
						urls = urls+","+l.getOriginalFilename() ; 
					}
					File f = new File(url); 
					l.transferTo(f);
				} 
				System.out.println("to成功了");
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return urls; 
		}
	   
	   
	   // 商品管理  
	   
	   @RequestMapping("/getshops")
	   @ResponseBody  
	   public PageInfo<Shop> queryShops(Integer pagenum,Integer pagesize,Integer storeid,Integer goodid,String sname){
		   if(pagenum == null) {
			   pagenum  = 1; 
		   }
		   if(pagesize == null) {
			   pagesize  = 15; 
		   } 
		   if(goodid == null) {
			   goodid = 0 ;
		   }
		   if(sname == null) {
			   sname = "";
		   }
		   if(storeid == null){
			   storeid= 6 ;
		   }
		   PageHelper.startPage(pagenum,pagesize);
		   PageInfo<Shop> page = new PageInfo<Shop>(shopUploadService.queryAllShop(goodid, sname,storeid));
		   return page;
	   } 
	   
	   @RequestMapping("/deleteproducinfo")
	   @ResponseBody 
	   public String deleteproducinfo(Integer sid) {
		   shopUploadService.delshop(sid); 
		   return "true";
	   } 
	    
	   @RequestMapping("/getDshop")
	   @ResponseBody  
	   public Shop getDshop(Integer sid) {
		   return shopUploadService.queryAllShopbysid(sid);
	   }

	   @RequestMapping("/exportExcel")
	   @ResponseBody
	   public ResponseEntity<byte []> exportExcel(Integer stroeid){
		   List<Shop> shops= shopUploadService.queryAllShop(0,"",stroeid);
		   //导出学生信息为excel
		   Workbook wb = new XSSFWorkbook();
		   Sheet sheet = wb.createSheet();

		   Row titleRow = sheet.createRow(0);


		   titleRow.createCell(0).setCellValue("类别");
		   titleRow.createCell(1).setCellValue("商品编码（条码）");
		   titleRow.createCell(2).setCellValue("商品名称");
		   titleRow.createCell(3).setCellValue("款号/型号");
		   titleRow.createCell(4).setCellValue("颜色");
		   titleRow.createCell(5).setCellValue("尺码");
		   titleRow.createCell(6).setCellValue("铭牌价");
		   titleRow.createCell(7).setCellValue("数量");
		   titleRow.createCell(8).setCellValue("进货成本");
		   SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		   for(int i=0;i<shops.size();i++) {
			   Row row = sheet.createRow(i+1);
			   Cell c1 = row.createCell(0);
			   c1.setCellValue(shops.get(i).getGood().getGoodid());
			   Cell c2 = row.createCell(1);
			   c2.setCellValue(shops.get(i).getShh());
			   Cell c3 = row.createCell(2);
			   c3.setCellValue(shops.get(i).getSname());
			   Cell c4 = row.createCell(3);
			   c4.setCellValue("");
			   Cell c5 = row.createCell(4);
			   c5.setCellValue(shops.get(i).getScolor());
			   Cell c6 = row.createCell(5);
			   c6.setCellValue(shops.get(i).getScc());
			   Cell c7 = row.createCell(6);
			   c7.setCellValue(shops.get(i).getSdpprice());
			   Cell c8 = row.createCell(7);
			   c8.setCellValue(shops.get(i).getKc());
			   Cell c9 = row.createCell(8);
			   c9.setCellValue(shops.get(i).getScbprice());
			   /*if(shops.get(i).getBirthday()!=null) {
				   birtydayCell.setCellValue(f.format(list.get(i).getBirthday()));
			   }*/
		   }
		   HttpHeaders headers = new HttpHeaders();
		   ByteArrayOutputStream bot = new ByteArrayOutputStream();
		   try {
			   wb.write(bot);
			   headers.setContentDispositionFormData("attachment", new String("proList.xlsx".getBytes("utf-8"),"iso-8859-1"));
			   headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
		   return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	   }
	   @RequestMapping("/getstore")
	   @ResponseBody
	   public List<Store> getstore(){
			return this.shopUploadService.queryStore();
	   }
	   @RequestMapping("/uploadExcel")
	   @ResponseBody
	  public String uploadExcel(MultipartFile file){
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
					   Cell c1 = row.getCell(0);
					   Cell c2 = row.getCell(1);
					   Cell c3 = row.getCell(2);
					   Cell c4 = row.getCell(3);
					   Cell c5 = row.getCell(4);
					   Cell c6 = row.getCell(5);
					   Cell c7 = row.getCell(6);
					   Cell c8 = row.getCell(7);
					   Cell c9 = row.getCell(8);

					   Shop sh = new Shop();

					   sh.setGoodid((int) c1.getNumericCellValue());
					   sh.setShh(c2.getStringCellValue());
					   sh.setSname(c3.getStringCellValue());

					   sh.setScolor(c5.getStringCellValue());
					   sh.setScc(c6.getStringCellValue());
					   sh.setSdpprice(c7.getNumericCellValue());
					   sh.setKc((int) c8.getNumericCellValue());
					   sh.setScbprice(c9.getNumericCellValue());

					   this.shopUploadService.addshop(sh);
				   }
			   }
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
			return "true";
	   }
}
