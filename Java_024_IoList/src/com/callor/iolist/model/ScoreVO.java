package com.callor.iolist.model;

public class ScoreVO {
	
	private String strNum;
	private String straccount;
	private String productName;
	
	private int srot;
	private int price;
	private int sales;
	private int qty;
	
	public ScoreVO() {
		
	}
	
	

	public ScoreVO(String strNum, String straccount, String productName, int srot, int price, int sales, int qty) {
		super();
		this.strNum = strNum;
		this.straccount = straccount;
		this.productName = productName;
		this.srot = srot;
		this.price = price;
		this.sales = sales;
		this.qty = qty;
	}



	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStraccount() {
		return straccount;
	}

	public void setStraccount(String straccount) {
		this.straccount = straccount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSrot() {
		return srot;
	}

	public void setSrot(int srot) {
		this.srot = srot;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", straccount=" + straccount + ", productName=" + productName + ", price="
				+ price + ", sales=" + sales + ", qty=" + qty + "]";
	}
	
	
}
