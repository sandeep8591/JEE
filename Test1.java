package com.capgemini.salesmanagement.test;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.exception.SalesException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;

import junit.framework.Assert;

public class Test1 {

	ISaleService iss=null;
	@Before
	public void setup() // will run before test case
	{
		iss=new SaleService();
	}
	@Test
	public void isValidInsertDetails() // will validate the functionality of insert method
	{
		
		HashMap<Integer, Sales> mp=null;
		Sales s= new Sales();
		s.setProductName("iphone");
		try {
			 mp=iss.insertSalesDetails(s);
			 Assert.assertTrue(true);
			 
		} catch (SalesException e) {
			System.out.println(e.getMessage());
			Assert.assertFalse(true);
		}
		
	}
	@After
	public void teardown() // will run after the test case
	{
		iss=null;
	}
	
}
