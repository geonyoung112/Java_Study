package com.test.ch08;

public class Ex05Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook4 eb = new EBook4();
		eb.setPrice(30000);
		eb.printPrice();
		
		eb.title = "어린왕자";
		eb.printAlltitle();
		
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
	
	void printTitle() {
		System.out.println("제목: " + title);
	}
	
	void setPrice() {
		
	}
}

class EBook4 extends Book5 {
	int price;
	String fontColor;
	
	@Override
	//overriding은 부모와 똑같은 메소드를 자식에게도 똑같이 작성할시 부모의 값은 자식이 덮어쓴다.
	//overriding 시 부모와 자신의 메소드가 같이 때문에 오타가 나면 새로운 메소드를 작성한 것으로 착각할 수 있다.
	//그래서 @Override라고 작성해야만 한다.
	void setPrice(int price) {
		super.setPrice(price + 10000);
		this.price = price;
	}
	
	@Override
	void printTitle() {
	System.out.println("제목 [이뷱]: " + title);
}
	
	void printAlltitle() {
		super.printTitle();
		printTitle();
	}

	
	/* 오버라이딩: 
    부모 클래스로부터 상속받은 메서드의 내용을 변경하는것으로 
    메서드의 선언부는 부모의 것과 완전히 일치해야함
      이름, 파라미터, 반환타입 같아야함 */
	
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