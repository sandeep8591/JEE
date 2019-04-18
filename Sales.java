package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sales {
	
	private int saleId;
	private int prodCode;
	private String productName;				//Bean class with constructor and getters and setters
	private String description;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	public Sales(int saleId,int prodCode, String productName, String description, String category, LocalDate saleDate,
			int quantity, float lineTotal) {
		super();
		this.saleId=saleId;
		this.prodCode = prodCode;
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal=lineTotal;
	}
	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", prodCode=" + prodCode + ", productName=" + productName + ", description="
				+ description + ", category=" + category + ", saleDate=" + saleDate + ", quantity=" + quantity
				+ ", lineTotal=" + lineTotal + "]";
	}
	public Sales() {
		super();
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	
	

}
