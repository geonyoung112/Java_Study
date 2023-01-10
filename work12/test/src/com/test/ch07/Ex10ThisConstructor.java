package com.test.ch07;

public class Ex10ThisConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book11 b1 = new Book11();
		Book11.printInfo(b1);
		
		Book11 b2 = new Book11("자바8 문법");
		Book11.printInfo(b2);
		
		Book11 b3 = new Book11("파이썬 문법", 35000);
		Book11.printInfo(b3);
		
		Book11 b4 = new Book11("SQL 문법", 38000, "엘컴퓨터학원");
		Book11.printInfo(b4);
		

	}

}

	class Book11 {
		String title;
		int price;
		String author;
		
		Book11() {
			this("제목입력", 0, "저자입력");
		}
		
		Book11(String title) {
			this(title, 0, "저자입력");
		}
		
		Book11(String title, int price) {
			this(title, price, "저자입력");
		}
		
		Book11(String title, int price, String author) {
			this.title = title;
			this.price = price;
			this.author = author;
		}
		
		static void printInfo(Book11 book) {
			System.out.printf("제목:  %s%n 가격: %d%n 저자: %s%n%n", book.title, book.price, book.author);
		}
	}
