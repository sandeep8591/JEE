package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.SalesException;

public class SaleService implements ISaleService {
ISaleDAO isd= null;
public static String prodCat="";

/*	public String getProdCat() {
	return prodCat;
}

public void setProdCat(String prodCat) {
	this.prodCat = prodCat;
}*/

	@Override
	public HashMap<Integer, Sales> insertSalesDetails(Sales sale) throws SalesException {
		
		isd=new SaleDAO();
		
		HashMap<Integer, Sales> mp=isd.insertSalesDetails(sale);
		
		
		return mp;
	}

	@Override
	public boolean validateProductCode(int productId) {  //validation for the product code, 
														//the product code should not be greater than 4 digits.
		boolean flag=false;
		String regex="[0-9]{4}";
		String pid=String.valueOf(productId);
		flag=pid.matches(regex);
		return flag;
	}

	@Override
	public boolean validateQuantity(int qty) {
		boolean flag=false;
		if(qty>0 && qty<5)
		{
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean validateProdcutCat(String prodCat) {	//validation of product category
		boolean flag=false;
		
		if(("Electronics".equalsIgnoreCase(prodCat))||("Toys".equalsIgnoreCase(prodCat)))
		{
			flag=true;
		}
		return flag;
		
	}

	@Override
	public boolean validateProductName(String prodName) {  //validation of product name
		boolean flag=false;
		
		String prodcat=SaleService.prodCat;
		
		if("Electronics".equalsIgnoreCase(prodcat))
		{
			if(("TV".equalsIgnoreCase(prodName))||("iPhone".equalsIgnoreCase(prodName))||("Video Game".equalsIgnoreCase(prodName)))
			{
				flag=true;
			}
			
			
		}else if("Toys".equalsIgnoreCase(prodcat))
		{
			
			if(("Soft Toy".equalsIgnoreCase(prodName))||("Telescope".equalsIgnoreCase(prodName))||("Barbee Doll".equalsIgnoreCase(prodName)))
			{
				flag=true;
			}
			
		}
		return flag;
		
	}

	@Override
	public boolean validateProductPrice(float price) { //validation of product price
		boolean flag=false;
		if(price>200)
		{
			flag=true;
		}
		return flag;
	}
	
	public float getLineTotal(float price, int qty) // calculating the total price 
	{
		return price*qty;
	}

}
