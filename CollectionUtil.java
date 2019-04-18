package com.capgemini.salesmanagement.util;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sales;

public class CollectionUtil { // collection util class which contains the map
	
	
	private static Map<Integer, Sales> sales=new HashMap<Integer,Sales>();
	
	
	static {
		
		
		sales.put(1010, new Sales(1010,1000,"iPhone","goodproduct","Electronics",java.time.LocalDate.of(2010,Month.JUNE,13),2,10000));
		sales.put(1011,new Sales(1011,1001,"Telescope","children toys","Toys",java.time.LocalDate.of(2010,Month.JUNE,13),4,1000));
	}
	
	public static HashMap<Integer, Sales> getCollection(){
		return (HashMap<Integer, Sales>) sales;
	}

}
