package com.test.ch07;

public class Ex14CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Book book = new Ex12Book("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 번호: " + book.bookNo);
		
		Ex12Book.generateBookNo(book);
		
		System.out.println("책 번호: " +book.bookNo);

	}

}
