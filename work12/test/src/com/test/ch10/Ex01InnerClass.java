package com.test.ch10;

public class Ex01InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class EBook {
	private String title;
	private String author;
	private int price;
	private float tax;
	private int country;
	private int amount;
	
	class TaxCalculator {
		public String calcName;
		private float tax;
		public static final int KOREA = 1;
		public static final int USA = 2;
		public static final int UK = 3;
		
		void setTotalPrice() {
				switch (country) {
					case KOREA:
						tax = 0f;
						break;
					case USA:
						tax = 0.1f;
						break;
					case UK:
						tax = 0.2f;
						break;
					default:
						tax = 0.3f;	
				}
				
				EBook.this.amount = (int)(price *(EBook.this.tax + tax));
		}
	}
	
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
	
	public void setPrice(int price) {
		this.price = price;
		EBook.TaxCalculator calc = this.new TaxCalculator();
		calc.setTotalPrice();
	}
	
	public float getTax() {
		return tax;
	}
	
	public void setTax(float tax) {
		this.tax = tax;
	}
	
	public int getCountry() {
		return country;
	}
	
	public String getCountryString() {
		String str;
		
		switch(country) {
			case TaxCalculator.KOREA:
				str = "KOREA";
				break;
				
			case TaxCalculator.USA:
				str = "USA";
				break;
				
			case TaxCalculator.UK:
				str = "UK";
				break;
			default:
				str = "기타";
		}
		return str;
	}
}
