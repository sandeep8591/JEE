package com.capgemini.salesmanagement.ui;

import java.io.BufferedReader;
import java.io.IOException;						//import statements
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

import com.capgemini.salesmanagement.bean.Sales;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.exception.SalesException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		ISaleService is=null;
		while(true)
		{
			System.out.println("WELCOME TO SALES MANAGEMENT APPLICATION");
			System.out.println("---------------------------------------");		//UI design for user interaction
			System.out.println();
			System.out.println("Press 1 to enter details");
			System.out.println("Press 2 to exit");
		
			try {
				 ch=Integer.parseInt(br.readLine());	//Accepting choice from user
			} catch (Exception e) {					
				System.out.println("Please enter number only");
			}
			
			if(ch==1)
			{
				is=new SaleService(); int pcode=0; int pqty=0; String pcat="";String pname="";String pdes=""; float pprice=0.0f;
				while(true)
				{
					System.out.println("Enter the Product Code");  //Collecting the product related informations
					try {
						 pcode=Integer.parseInt(br.readLine());
					} catch (Exception e) {
						System.out.println("please enter number only");
					}
					
					boolean flag=is.validateProductCode(pcode); 
					if(flag)
					{
						break;
					}
					else
					{
						System.out.println("Product code entered should be 4 digit number");
					}
				}
				
				while(true)
				{
					System.out.println("Enter the quantity of the product");
					try {
						 pqty=Integer.parseInt(br.readLine());
					} catch (Exception e) {
						System.out.println("please enter number only");
					}
					
					boolean flag=is.validateQuantity(pqty);
					if(flag)
					{
						break;
					}
					else
					{
						System.out.println("product quantity must be greater than 0 and less than 5");
					}
					
				}
				
				while(true)
				{
					System.out.println("Enter Product Category");
					try {
						 pcat=br.readLine();
					} catch (Exception e) {
						System.out.println("please enter Alphabets only");
					}
					
					boolean flag=is.validateProdcutCat(pcat);
					if(flag)
					{
						break;
					}
					else
					{
						System.out.println("product category can be either electronics or toys");
					}
				}
				
				while(true)
				{
					System.out.println("Enter Product Name");
					try {
						 pname=br.readLine();
					} catch (Exception e) {
						System.out.println("please enter Alphabets only");
					}
					SaleService.prodCat=pcat;
					
					boolean flag=is.validateProductName(pname);
					if(flag)
					{
						break;
					}
					else
					{
						System.out.println("product name can be tv, iphone, video game for Electroniccs Category or Soft toy, telescope, barbee doll for Toys category");
					}
					
				}
				while(true)
				{
					System.out.println("Enter the product description");
					try {
						 pdes=br.readLine();
						 break;
					} catch (Exception e) {
						System.out.println("please enter Alphabets only");
					}
					
				}
				while(true)
				{
					System.out.println("Please enter the product price");
					
					try {
						 pprice=Float.parseFloat(br.readLine());
					} catch (Exception e) {
						System.out.println("please enter numbers only");
					}
					
					boolean flag=is.validateProductPrice(pprice);
					
					if(flag)
					{
						break;
					}
					else
					{
						System.out.println("price should be greater than 200");
					}
				}
				SaleService ss=new SaleService();
				
				
				int saleId=(int)(Math.round(Math.random()*1024)); //generating the sale id
				
				LocalDate ld=LocalDate.now(); //generating current date
				
				float lineTotal=ss.getLineTotal(pprice, pqty); // calculating linetotal
				
				Sales s= new Sales(saleId,pcode, pname, pdes,pcat,ld,pqty,lineTotal); 
				HashMap<Integer, Sales> mp=null;
				try {
					 mp=is.insertSalesDetails(s); //calling service layer insert method
				} catch (SalesException e) {
					System.out.println(e.getMessage());
				}
				
				if(mp.size()!=0)
				{
					Set<Integer> st= mp.keySet();			//display purpose
					for(Integer i: st)
					{
						System.out.println(mp.get(i));
					}
				}
				
			}
			
			if(ch==2)
			{
				System.out.println("Thank You for using this application");		//exit application
				System.out.println("Have a Wonderfull Day");
				break;
			}
			
		}
		
		

	}

}
