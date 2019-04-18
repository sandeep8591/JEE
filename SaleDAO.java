package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.exception.SalesException;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {
CollectionUtil cu=null;
	@Override
	public HashMap<Integer, Sales> insertSalesDetails(Sales sale) throws SalesException { // implementation of the dao layer contains the same insert method
		cu=new CollectionUtil();
		HashMap<Integer,Sales> mp=cu.getCollection();
	
		try {
			
			mp.put(sale.getSaleId(), sale);
		
		}catch(Exception e)
		{
			throw new SalesException("Failed to add Record, please try again");
		}
		
		
		
		return mp;
	}
	

}
