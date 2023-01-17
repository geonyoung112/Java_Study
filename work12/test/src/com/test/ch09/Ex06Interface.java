package com.test.ch09;



public class Ex06Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Cart2 {
	OrderItem[] items;
	int index;
	
	public Cart2() {
		items = new OrderItem[10];
		index = 0;
	}
	
	public void add(OrderItem item) {
		items[index] = item;
		index++;
	}
	
	public OrderItem[] get() {
		return items;
	}
}

interface OrderItem {
	public abstract String getOrderName();
	public abstract int getOrderPrice();
	
}

class Book6 implements OrderItem {
	String title;
	String author;
	int price;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return (int)(price*1.1f);
	}
	
	public void setPrice(int price) {
		if(!(price >= 0 && price <= 50000))
			return;
		this.price = price;
	}
	
	@Override
	public String getOrderName() {
		return getTitle();
	}
	
	@Override
	public int getOrderPrice() {
		return getPrice();
		
	}
}

class EBook5 extends Book6 implements PrintService{
		private String fontColor;
		
		public String getFontColor() {
			return fontColor;
		}
		
		public void setFontColor(String fontColor) {
			this.fontColor = fontColor;
		}
		
		@Override 
		public void setTitle(String title) {
			super.setTitle("[e북]" + title);
			
		}
		
		@Override
		public int getPrice() {
			return (int)(price * 1.2f);
		}
		
		@Override 
		public String getOrderName() {
			String title = getTitle() + ", 폰트" + getFontColor();
			return title;
			
		}
		
}

interface PrintService {
	
}