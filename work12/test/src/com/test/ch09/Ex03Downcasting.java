package com.test.ch09;

public class Ex03Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 book = null;
		EBook3 ebook = null;
		
		book = new Book3();
		book.setTitel("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook3();
		book.setTitel("자바 알고리즘");
		System.out.println(book.getTitle());
		//book.setFontColor("블랙");
		ebook = (EBook3)book; //다운캐스팅
		ebook.setFontColor("블랙");
		System.out.println(ebook.getFontColor());

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