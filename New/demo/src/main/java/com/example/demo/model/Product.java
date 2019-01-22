package com.example.demo.model;

public class Product {
	
	private String ean;

	private Integer qty;
	private String vendorId;
	
	
	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}	

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	
	public Product(String ean, Integer qty, String vendorId) {
		super();
		this.ean = ean;
		this.qty = qty;
		this.vendorId = vendorId;
	}
	
	public Product() {
		
	}

}
