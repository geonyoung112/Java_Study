package com.test.ch08;

public class Ex05Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook4 eb = new EBook4();
		eb.setPrice(30000);
		eb.printPrice();
		
		eb.printAllPrice();
	}

}
class Book5 {
	String title;
	String author;
	int price;
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void printPrice() {
		System.out.println("paperbook price: " + price);
	}
	
	/*void printTitle() {
		System.out.println("[이뷱]: " + title);
		System.out.println("제목: " + title);
	}*/
	
	void setPrice() {
		
	}
}

class EBook4 extends Book5 {
	int price;
	String fontColor;
	
	void setPrice(int price) {
		super.setPrice(price + 10000);
		this.price = price;
	}
	
	void printPrice() {
		System.out.println("ebook price: " + price);
	}
	
	void printAllPrice() {
		super.printPrice();
		printPrice();
	}
}

/*
문제 1. ?
제목 설정 메소드를 부모클래스와 자식클래스에 모두 작성하고 자식클래스의 제목 설정 메소드는 제목에 [이북]이 추가되도록 작성하세요.
부모의 타이틀과 자식의 타이틀 모두 출력하세요. 
*/