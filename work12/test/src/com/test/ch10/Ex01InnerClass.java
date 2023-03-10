package com.test.ch10;

public class Ex01InnerClass {
	
	// 이너 클래스 (내부 클래스)
	/*
	1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있다.
	2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킨다.
	3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있다.
	종류
	1. 정적 클래스(static class)
	2. 인스턴스 클래스(instance class)
	3. 지역 클래스(local class)
	4. 익명 클래스(anonymous class)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook book = new EBook();
		book.setTitle("자바 알고리즘");
		book.setAuthor("엘컴퓨터학원");
		book.setTax(1.1f);
		book.setCountry(EBook.TaxCalculator.USA);
		book.setPrice(50000);
		book.print();

		System.out.println();
		
		//EBook.TaxCalculator calc = new TaxCalculator();
		EBook.TaxCalculator calc1 = book.new TaxCalculator();
		EBook.TaxCalculator calc2 = book.new TaxCalculator();
		calc1.calcName = "계산기1";
		calc2.calcName = "계산기2";
		System.out.println(calc1.calcName);
		System.out.println(calc2.calcName);
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
	
	public void setCountry(int country) {
		this.country = country;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void print() {
		System.out.println("책이름: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + amount);
		System.out.println("판매국가: " + getCountryString());
	}
}

/*
문제 1.
이너 클래스를 사용한 예제를 작성하세요.
문제 2.
아우터 클래스의 인스턴스 변수, 이너 클래스의 인스턴스 변수, 이너 크래스의 메소드내 지역 변수 모두 이름을 같게 설정하고 각각의 값을 출력하는 코드를 작성하세요.  
*/