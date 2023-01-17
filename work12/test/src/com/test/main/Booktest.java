package com.test.main;

import com.test.ch08.ex10.Book;

public class Booktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book2 = new Book();
		book2.setTitle("자바 기본문법");
		System.out.println(book2.getTitle());
		book2.setPrice(30000);
		System.out.println(book2.getPrice() + "원입니다.");
		System.out.println(book2.getDollarPrice() + "달러입니다.");

	}

}
