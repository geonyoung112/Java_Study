package com.test.ch08;

public class Ex09Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book7 b1 = new Book7();
		System.out.println(b1.tax);
		//b1.tax = 1.2f;

	}

}
class Book7 {
	String title;
	String author;
	int price;
	final float tax;
	//final float tax = 1;
	//final은 최초선언시 값을 정해서 선언하거나 생성자에서 딱 한 번만 정의 내릴 수 있다.
	//또한 변수말고 클래스에도 사용할 수 있는데 이는 다른 자식이나 클래스들이 final class에 접근할 수 없다.
	public Book7() {
		tax = 1.1f;
	}
}


 class EBook6 extends Book7 {
 
 }


class Book8 {
	String title;
	String author;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	final public String getTitle(String title) {
		return title;
	}
	
	
}

class EBook7 extends Book8 {
	String fontColor;
	

	 public void setTitle(String title) {
		this.title = "[E북]" + title;
	}
	 
	/* 
	 final public String getTitle(String title) {
			return title;
		}
	*/
		
}

/*
문제1.
Book8클래스에 getTitle 메소드를 추가하고 EBook7 클래스에서 getTitle 메소드를 오버라이딩 할 수 없도록 코딩하세요.
문제2.
EBook6 클래스가 Book7 클래스를 상속 받을 수 있도록 수정하세요. 
*/