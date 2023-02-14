package com.test.ch13;

public class Ex01ObjectClass {

	//모든 자식들의 부모 = Object Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = null;
		o = new Object();
		System.out.println(o.toString());
		
		System.out.println("---");
		
		Book b1 = new Book("엘컴", "자바");
		System.out.println(b1.toString());
		
		System.out.println("---");
		
		System.out.println(b1);
		
		System.out.println("---");
		
		Book2 b2 = new Book2("자바 기본문법", "엘컴퓨터학원");
		System.out.println();
		
		System.out.println("---");
		
		o = b2;
		System.out.println(o);

	}

}

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + ", 저자: " + author;
	}
}

class Book2{
	private String title;
	private String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + ", 저자: " + author;
	}
	
	public static void print(Object o) {
		Book2 b = (Book2)o;
		System.out.println("제목: " + b.title + ", 저자: " + b.author );
	}
}


/*
문제 1.
print 메소드의 주석 처리된 부분을 수정하여 오류 없이 출력하도록 수정하세요.
힌트) 다운캐스팅을 사용하세요.
문제 2.
Book 클래스에 toString 메소드를 오버라이딩 하여 해시코드가 아닌 인스턴스 변수의 내용이 출력되도록 코딩하세요.
*/