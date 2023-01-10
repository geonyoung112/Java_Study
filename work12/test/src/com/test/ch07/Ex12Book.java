package com.test.ch07;

public class Ex12Book {
	String title;
	String author;
	int bookNo;
	int price;
	
	Ex12Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//int bookNo = book.bookNo;
	static void generateBookNo(int bookNo) {
		bookNo = (int)(Math.random()*9000)+1000;
	}
	
	static void generateBookNo(Ex12Book book) {
		book.bookNo = (int)(Math.random()*9000)+1000;
	}
}