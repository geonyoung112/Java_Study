package com.test.ch10;

public class Ex02StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = EBook2.TaxCalculator.getTotalDollarPrice(30000, EBook2.TaxCalculator.USA);
		System.out.println(price);
		
		EBook2 eb = new EBook2();
		eb.setTitle("자바 기본문법");
		eb.setAuthor("엘컴퓨터학원");
		eb.setPrice(50000);
		eb.print();
		
		EBook2.TaxCalculator et = new EBook2.TaxCalculator();
		et.calcName = "asdfa";
		EBook2.TaxCalculator et2 = new EBook2.TaxCalculator();
		et2.calcName = "asdfasdf2";

	}

}

class EBook2 {
	private String title;
	private String author;
	public int price;
	
	static class TaxCalculator {
		private static float tax;
		public static final int KOREA = 1;
		public static final int USA = 2;
		public static final int UK = 3;
		public String calcName;
		
		static int getTotalDollarPrice(int price, int country) {
			switch(country) {
				case KOREA:
					tax = 1f;
					break;
				case USA:
					tax = 1.1f;
					break;
				case UK:
					tax = 1.2f;
					break;
				default:
					tax = 1.3f;
			}
			
			//문제 2번
			/*
			 * 이전에는 아우터 클래스의 price를 static으로 바꿨음
			 * 하지만 아우터 클래스의  price는 고정되면 안도기 때문에 
			 * 파라미터로 받아오기
			 */
			System.out.println(price);
			
			return (int)(price * tax);
					
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
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("책이름: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + TaxCalculator.getTotalDollarPrice(price, TaxCalculator.KOREA));
	}
}

/*
문제 2. (1)의 코드를 오류가 나지 않도록 수정하세요.
*/