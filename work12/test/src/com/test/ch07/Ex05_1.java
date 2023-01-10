package com.test.ch07;


public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booktest1.tax = 1.5f;
		Booktest1.kategorie = "문화";
		
		Booktest1 b1 = new Booktest1();
		b1.title = "자바";
		b1.price = 30000;
		b1.printInfo();
		
		Booktest1.kategorie = "도서";
		Booktest1 b2 = new Booktest1();
		b2.title = "파이썬";
		b2.price = 80000;
		b2.printInfo();
	}

}

class Booktest1 {
	String title;
	int price;
	static float tax;
	static String kategorie;
	
	void printInfo() {
		String message = "책 이름: " + title +", 카테고리: " + kategorie + ", 책 가격: " +((int)(price*tax)) + "원, 세율: " + tax;
		System.out.println(message);
	}
	
}

/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/