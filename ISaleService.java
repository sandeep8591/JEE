package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.exception.SalesException;

public interface ISaleService {
	
	
	public HashMap<Integer, Sales> insertSalesDetails(Sales sale) throws SalesException;	//interface of service layer containg validatiuons methods and insert method
	
	public boolean validateProductCode(int productId);
	boolean validateQuantity(int qty);
	public boolean validateProdcutCat(String prodCat);
	public boolean validateProductName(String prodName);
	public boolean validateProductPrice(float price);

}
