package com.test.ch07;

public class Ex13CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Book book = new Ex12Book("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 번호: " +book.bookNo);
		
		Ex12Book.generateBookNo(book.bookNo);
		
		System.out.println("책 번호: " + book.bookNo);
		
		book.price = Ex12Book.generatePrice(book.price);
		
		System.out.println("책 가격: " + book.price);

	}

}

/*
문제 1.
call by value 를 이용해 책의 금액을 수정하는 메소드를 작성하세요.
힌트) 수정된 금액을 return 하세요. 
*/
