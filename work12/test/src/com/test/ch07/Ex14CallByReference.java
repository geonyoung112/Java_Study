package com.test.ch07;

public class Ex14CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Book book = new Ex12Book("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 번호: " + book.bookNo);
		
		Ex12Book.generateBookNo(book);
		
		System.out.println("책 번호: " +book.bookNo);
		
		Ex12Book.generatePrice(book);
		
		System.out.println("책 가격: " +book.price);
	}

}
/*
문제 1.
call by reference 를 이용해 책의 금액을 수정하는 메소드를 코딩하세요. 
*/