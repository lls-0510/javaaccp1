package com.accp.service;

import com.accp.domain.Pruchasedetails;
import com.accp.domain.PruchasedetailsExample;
import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;
import com.accp.mapper.PruchasedetailsMapper;
import com.accp.mapper.PurchaseMapper;
import com.accp.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;



@Service
@Transactional
public class PurchaseService {


	@Autowired
	PurchaseMapper purchaseMapper;
	@Autowired
	PruchasedetailsMapper pruchasedetailsMapper;
	@Autowired
	SupplierMapper supplierMapper;

	public List<Purchase> queryPurchases(Date startDate, Date endDate, Integer gysid, String bz){

		PurchaseExample pe  = new PurchaseExample();
		if(startDate != null && endDate != null) {
			if(gysid>0) {
				pe.createCriteria().andPurdataBetween(startDate,endDate).andGysidEqualTo(gysid).andPurtextLike("%"+bz+"%");
			}else {
				pe.createCriteria().andPurdataBetween(startDate,endDate).andPurtextLike("%"+bz+"%");

			}
		}else {
			if(gysid>0) {
				pe.createCriteria().andGysidEqualTo(gysid).andPurtextLike("%"+bz+"%");
			}else {
				pe.createCriteria().andPurtextLike("%"+bz+"%");
			}
		}

		List<Purchase> purchases =  purchaseMapper.selectByExample(pe);
		for (Purchase purchase : purchases) {
			PruchasedetailsExample dte = new PruchasedetailsExample();
			  dte.createCriteria().andBz1EqualTo(purchase.getPurid());
			  purchase.setPrd(pruchasedetailsMapper.selectByExample(dte));
			  purchase.setSp(supplierMapper.selectByPrimaryKey(purchase.getGysid()));
			  int num  = 0 ;
			  double price = 0 ;
			  for (Pruchasedetails pt : pruchasedetailsMapper.selectByExample(dte)) {
				num+=pt.getSnum();
				price += pt.getSprice();
			  }
			 purchase.setBz1(""+num);
			 purchase.setBz2(price+"");
		}
		return purchases;
	}


	public boolean delpur(Integer prid){
		PruchasedetailsExample dde = new PruchasedetailsExample();
		dde.createCriteria().andBz1EqualTo(prid);
		pruchasedetailsMapper.deleteByExample(dde);
		purchaseMapper.deleteByPrimaryKey(prid);
		System.out.println("删除成功");
		return true;
	}


	/**
	 * 查询单个 采购单
	 * @param prid
	 * @return
	 */
	public Purchase queryPurchase(Integer prid){

			Purchase purchases =  purchaseMapper.selectByPrimaryKey(prid);
			PruchasedetailsExample dte = new PruchasedetailsExample();
			dte.createCriteria().andBz1EqualTo(purchases.getPurid());
			purchases.setPrd(pruchasedetailsMapper.selectByExample(dte));
			purchases.setSp(supplierMapper.selectByPrimaryKey(purchases.getGysid()));
			int num  = 0 ;
			double price = 0 ;
			for (Pruchasedetails pt : pruchasedetailsMapper.selectByExample(dte)) {
				num+=pt.getSnum();
				price += pt.getSprice();
			}
			purchases.setBz1(""+num);
			purchases.setBz2(price+"");

		return purchases;
	}

	public String findMax(String deliverytime) {
		return purchaseMapper.findMax(deliverytime);
	}


	public boolean addpur(Purchase purchase){
		if (purchaseMapper.selectByPrimaryKey(purchase.getPurid()) ==null) {
			purchaseMapper.insert(purchase);
			for (Pruchasedetails prd:purchase.getPrd()) {
				prd.setBz1(purchase.getPurid());
				pruchasedetailsMapper.insert(prd);
			}
		}else {
			purchaseMapper.updateByPrimaryKey(purchase);
			for (Pruchasedetails prd:purchase.getPrd()) {
				if(pruchasedetailsMapper.selectByPrimaryKey(prd.getPrdid()) ==null){
					prd.setBz1(purchase.getPurid());
					pruchasedetailsMapper.insert(prd);
				}else {
					pruchasedetailsMapper.updateByPrimaryKey(prd);
				}

			}
		}

		return true;
	}


}
