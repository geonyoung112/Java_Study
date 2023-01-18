package com.test.ch09;

public class Ex01Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = null;
		book = new Book();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook(); //업	캐스팅
		book.setFontColor("블랙");
		System.out.println(book.getFontColor());
		book.setTitle("자바 자료구조");
		System.out.println(book.getTitle());
		
		book = new AudioBook2(); //업 캐스팅
		//book.setTitle("파이썬 자료구조");
		//System.out.println(book.getTitle());
		book.printVol(50);
	}

}

class Book {
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFontColor() {
		return "";
	}
	
	public void setFontColor(String fontColor) {
		
	}
	
	public void printVol(int volume) {

	}
}

class EBook extends Book {
	private String fontColor;
	
	public String getFontColor() {
		return fontColor;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public void setTitle(String title) {
		title = "[EBOOK] " + title;
		super.setTitle(title);
	}
}

class AudioBook2 extends Book {
	private String fontColor;
	private int volume;
	
	public void printVol(int volume) {
		this.volume = volume;
		System.out.println("볼륨은 : " + this.volume);
	}
	
	public String getFontColor() {
		return fontColor;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public void setTitle(String title) {
		title = "[AUDIO BOOK] " + title;
		super.setTitle(title);
	}
}

/*
 * 업캐스팅이란?
 * 부모는 자식을 모두 받을 수 있다.
 * 부모> 자식 : 자식의 크기가 더 커서 착각할 수 있어도 부모는 자식을 다 받을 수 있는 것은 공식
 * 업캐스팅을 이용해 자식의 메소드를 불러올 수 있다.
 * 이는 다형성, 부모를 지역변수로 가져와 사용한다면 이는 부모의 자식도 각각 사용할 수 있다.
 * 하지만 주의점은 부모에 없는 자식의 메소드는 사용할 수 없다.
 * 그래서 내용을 제거하더라도 부모에 자식 메소드의 정의라도 해야지 사용할 수 있다.
 */

/*
문제 1. o
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.
문제 2. o
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/