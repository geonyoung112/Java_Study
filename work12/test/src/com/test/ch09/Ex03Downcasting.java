package com.test.ch09;

public class Ex03Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 book = null;
		EBook3 ebook = null;
		AudioBook3 abook = null;
		
		
		book = new Book3();
		book.setTitel("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook3();
		book.setTitel("자바 알고리즘");
		System.out.println(book.getTitle());
		book.setFontColor("블랙");
		ebook = (EBook3)book; //다운캐스팅
		ebook.setFontColor("블랙");
		System.out.println(ebook.getFontColor());
		
		book = new AudioBook3(); //이 코드가 없으면 에러가 뜨는데 그 이유는 book이라는 인스턴스는 먼저 EBook3를 받아왔다.
		//이는 AudioBook3의 메소드를 사용하기 위해선 다시 인스턴스를 선언 혹은 업캐스팅을 한다.
		//즉,ebook의 메소드에서 Audiobook에서 사용하고 싶은 메소드가 없다면 instance of가 불가능해 (형변환) 다운캐스팅을 하더라도 에러가 뜬다.
		book.setTitel("자바 오디오북");
		System.out.println(book.getTitle());
		abook = (AudioBook3)book;
		abook.setVol(50);
		System.out.println("Volume: " + abook.getVol());

		
		

	}

}

class Book3 {
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitel(String title) {
		this.title = title;
	}
	
	public String getFontColor() {
		return "";
	}
	public void setFontColor(String fontColor) {
		
	}
	
	public int getVol() {
		return 0;
	}
	
	public void setVol(int volume) {
	
	}
}

class EBook3 extends Book3 {
	private String fontColor;
	
	public String getFontColor() {
		return fontColor;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
}

class AudioBook3 extends Book3 {
	private int volume;
	
	public int getVol() {
		return volume;
	}
	
	public void setVol(int volume) {
		this.volume = volume;
	}
}

/*
문제 1. o
오디오북 클래스를 추가하세요.
볼륨을 저장하는 정수타입의 속성을 추가하세요.
main 메소드에서 다운캐스팅을 사용하여 오디오북의 볼륨을 출력하는 코드를 작성하세요. 
*/