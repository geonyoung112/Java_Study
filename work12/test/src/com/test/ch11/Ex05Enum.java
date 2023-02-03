package com.test.ch11;

public class Ex05Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 b1 = new Book2();
		b1.setTitle("자바 열거형");
		b1.setAuthor("엘컴퓨터학원");
		b1.setPrice(30000);
		b1.setCountry(Ex04Country.KOREA);
		Book2.print(b1);
		
		ReGerne re = ReGerne.valueOf("ACTION");
		System.out.println("장르: " + re.getName());
		System.out.println();
		
		
		Book2 b2 = new Book2();
		b2.setTitle("Java Enum");
		b2.setAuthor("lcomputerstudy");
		b2.setPrice(30000);
		b2.setCountry(Ex04Country.USA);
		Book2.print(b2);
		
		ReGerne re1 = ReGerne.valueOf("FANTASY");
		System.out.println("장르: " + re1.getName());
		System.out.println();
		
		Book2 b3 = new Book2();
		b3.setTitle("Java Enum");
		b3.setAuthor("lcomputerstudy");
		b3.setPrice(30000);
		b3.setCountry(Ex04Country.ETC);
		Book2.print(b3);
		
		ReGerne re2= ReGerne.valueOf("STUDY");
		System.out.println("장르: " + re2.getName());
		System.out.println();

	}

}
class Book2 {
	private String title;
	private String author;
	private int price;
	private Ex04Country country;
	
	public void setCountry(Ex04Country country) {
		this.country = country;
	}
	
	public Ex04Country getCountry() {
		return country;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return (int)(price * country.getRefundTax());
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
	
	public static void print(Book2 book) {
		System.out.println("제목: " + book.getTitle());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("가격: " + book.getPrice());
	}
}

enum ReGerne {
	ACTION("액션"), 
	FANTASY("판타지"), 
	STUDY("학습용");
	
	private final String name;
	
	ReGerne(String name) {
		this.name = name;
	}	
	
	public String getName() {
		return name;
	}
}

/*
문제 1.
장르 enum에 getString 메소드를 추가하세요.
메소드 호출 시 해당 장르를 한글로 리턴 하도록 코딩하고 출력하세요.
*/
