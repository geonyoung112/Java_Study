package com.test.ch09;

public class Ex04Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		Product p2 = p;
		System.out.println(p.equalsProduct(p2));//true
		
		
		Book4 b1 = new Book4();
		b1.setTitle("자바 자료구조");
		b1.setAuthor("엘컴퓨터학원");
		
		Book4 b2 = new Book4();
		b2.setTitle("자바 자료구조");
		b2.setAuthor("엘컴퓨터학원");
		
		Book4 b3 = new Book4();
		b3.setTitle("자바 자료구조");
		b3.setAuthor("엘코딩랩");
		
		System.out.println(b1.equalsProduct(b2));
		System.out.println(b1.equalsProduct(b3));//같다면 true, 다르면 false

		

	}

}

class Product {
	public boolean equalsProduct(Product p) {
		return this == p;
	}
	
	public Product compareProduct(Product p) {
		return null;
	}
}

class Book4 extends Product {
	private String title;
	private String author;
	
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
	
	@Override
	public boolean equalsProduct(Product p) {
		if (!(p instanceof Book4)) //p가 Book4로 instance of로 형변환이 가능한지 먼저 확인하기 (instance 기본값: true)
			return false;//불가능하다면 멈춘다
		
		Book4 book = (Book4)p;
		boolean result = title.equals(book.title) && author.equals(book.author);
		
		return result;
	}

}

/*
문제 1. compareProduct?
Product 클래스에 두 인스턴스간의 크기를 비교하는 메소드인 compareProduct 메소드를 추가하세요.
Book4 클래스에 compareProduct 메소드를 오버라이딩 후 가격이 높은 책의 인스턴스를 반환하도록 코딩하세요.
반환된 인스턴스의 title을 출력하세요. 
*/
