package com.test.ch11;

import java.util.Scanner;

//열거형
public class Ex03Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Book1 b1 = new Book1();
		b1.setTitle("자바 열거형");
		b1.setAuthor("엘컴퓨터학원");
		b1.setPrice(30000);
		b1.setCountry(Country.KOREA);
		b1.setGenre(Genre.STUDY);
		Book1.print(b1);
		
		Book1 b2 = new Book1();
		b2.setTitle("Java Enum");
		b2.setAuthor("lcomputerstudy");
		b2.setPrice(30000);
		b2.setCountry(Country.USA);
		b2.setGenre(Genre.FANTASY);
		Book1.print(b2);
		
		System.out.println("국가를 입력해주세요: ");
		Book1 b3 = new Book1();
		b3.setTitle("Java 컬렉션");
		b3.setAuthor("엘컴퓨터학원");
		b3.setPrice(50000);
		b3.setGenre(Genre.ACTION);
		b3.setCountry(Country.valueOf(s.nextLine())); //사용자의 입력값을 받아오는 코드
		Book1.print(b3);
		
		Country[] countries = Country.values();
		for(int i=0; i<countries.length; i++) {
			System.out.println("name: " + countries[i].name() + ", \tindex: " + countries[i].ordinal());
		}
		
		System.out.println();
		
		

	}

}

class Book1 {
	private String title;
	private String author;
	private int price;
	private Country country;
	private Genre genre;
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		float tax = 0f;
		int taxPrice = 0;
		
		switch(country) {
		case KOREA:
			tax = 1.1f;
			break;
		case USA:
			tax = 1.2f;
			break;
		case UK:
			tax = 1.3f;
			break;
		default:
			tax = 1.5f;
		}
		
		taxPrice = (int)(price * tax);
		
		return taxPrice;
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
	
	public static void print(Book1 book) {
		System.out.println("제목: " + book.getTitle());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("가격: " + book.getPrice());
		System.out.println("나라: " + book.getCountry());
		System.out.println("장르: " + book.getGenre());
		System.out.println();
	}
}

enum Country{
	KOREA, USA, UK
}

enum Genre{
	STUDY, ACTION, FANTASY
}

/*
문제 1.
책의 장르를 enum을 사용해 설정하고 출력하세요.
*/

