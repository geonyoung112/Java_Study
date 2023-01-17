package com.test.ch08.ex10;

public class Book {
	private String title;
	private int price;
	private int dollarPrice; 
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		this.price = price;
		setDollarPrice(price);
	}
	
	public int getPrice() {
		return price;
	}
	
	protected void setDollarPrice(int price) {
		dollarPrice = (int)(price / 1000f);
	}
	
	public int getDollarPrice() {
		return dollarPrice;
	}

}
