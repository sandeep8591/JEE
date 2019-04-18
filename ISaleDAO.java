package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.exception.SalesException;

public interface ISaleDAO { // Dao layer Interface which contains the insert method
	
	public HashMap<Integer, Sales> insertSalesDetails(Sales sale) throws SalesException;
	

}
