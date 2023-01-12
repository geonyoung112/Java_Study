package com.test.ch08;

public class Ex03Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook2 eb = new EBook2();
		System.out.println("책의 체목은 [" + eb.title + "] 이고 글자색은 [" + eb.fontColor + "] 입니다.");

	}

}
class Book3 {
	String title;
	String author;
	int price;
	
	Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	/*
	 * 
	 */
}

class EBook2 extends Book3 {
	String fontColor;
	
	EBook2() {
		super("언어 문법", "엘컴퓨터학");
		this.fontColor = "블랙";
	}
}