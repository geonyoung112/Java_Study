package com.test.ch07;

public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booktax b1 = new Booktax();
		b1.price=2000;
		b1.printInfo();

	}

}

class Booktax {
	final static float tax = 1.5f;
	int price;
	
	void printInfo() {
		String message = "세율이 적용된 책의 가격은 " + ((int)(price*tax)+"원입니다.");
		System.out.println(message);
	}
	
}
