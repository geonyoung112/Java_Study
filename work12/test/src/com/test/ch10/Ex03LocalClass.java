package com.test.ch10;

//로컬 클래스 (지역 클래스)
public class Ex03LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(EBook3.vaildatePrice(45000));
		
		System.out.println();
		
		EBook3 eb = new EBook3();
		eb.setAuthor("자바");
		eb.setPrice(50000);
		System.out.println(eb.getPrice());
		

	}

}

class EBook3 {
	private String title;
	private String author;
	private int price;
	public final static float tax = 1.1f;
	
	public static boolean vaildatePrice(int price) {
		float dollar = 1100f; 
		//지역클래스의 주의점 -> 여기서 정의한 달러 값을 지역 클래스에서 다시 정의하는 것이 불가능
		//이전에는 final로 선언했지만 버전 업데이트로 정의하진 않아도 된다. 그러나 위와 같은 주의점이 있다.
		
		class Price {
			int taxPrice;
			
			Price(int price){
				taxPrice = (int)(price*EBook3.tax);
				//dollar = 1200f; //error
				//읽기만 가능하고 값을 바꾸면 에러가 난다.
			}
			
			int getTaxPrice() {
				return taxPrice;
			}
			
			float getDollarPrice() {
				return taxPrice/dollar;
			}
 		}
		
		
		
		Price p = new Price(price);
		int taxPrice = p.getTaxPrice();
		System.out.println(taxPrice);
		
		float dollarPrice = p.getDollarPrice();
		System.out.println(dollarPrice);
		
		if(!(taxPrice >= 0 && dollarPrice <= 50))
			return false;
		else if (!(dollarPrice >= 0 && dollarPrice <= 50))
			return false;
		
		return true;
	}
	
	// 다시 풀기
	public  static boolean vaildateAuthor (String author) {
		
		class Author {
			private String author;
			
			public Author(String author) {
				this.author = author;
			}
			public boolean validateSpell() {
				return true;
			}
			
			public boolean validateLength() {
				return true;
			}
		}
		
		Author authorObj = new Author(author);
		if (authorObj.validateLength() && authorObj.validateSpell())
			return true;
		else 
			return false;
	
	}
	//
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void SetTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(!EBook3.vaildatePrice(price))
			return;
		this.price = price;
	}

}

/*
문제 1.
로컬 클래스를 사용하여 저자 이름 유효성 검사 메소드를 코딩하세요.
저자 이름은 영문 대문자, 공백만 가능합니다.
*/
