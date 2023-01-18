package com.test.ch09;

public class Ex02Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 book = new Book2();
		book.setTitle("자바 기본문법");

		
		EBook2 ebook = new EBook2();
		ebook.setTitle("자바 알고리즘");
		ebook.setFontColor("블루");
		
		ComicBook cbook = new ComicBook();
		cbook.setTitle("만화로 배우는 자바");
		
		AudioBook abook = new AudioBook();
		abook.setTitle("오디오로 배우는 자바");

		
		Cart cart  = new Cart();
		cart.add(book);
		cart.add(ebook);
		cart.add(cbook);
		cart.add(abook);
		
		cart.printList();
		

	}

}

class Book2 {
	protected String title;
	
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

}


class EBook2 extends Book2 {
	private String fontColor;
	
	public String getFontColor() {
		return "[폰트색] " + fontColor;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public String getTitle() {
		return "[e북]" + title;
	}
}

class ComicBook extends Book2 {
	private boolean color;
	
	public boolean isColor() {
		return color;
	}
	
	public void setColor(boolean color) {
		this.color = color;
	}
	
	@Override
	public String getTitle() {
		return "[만화책]" + title;
	}
}

class AudioBook extends Book2 {
	
	@Override
	public String getTitle() {
		return "[오디오북]" + title;
	}
	//오버라이딩은 다형성을 많이 도와줌
}


class Cart {
	private Book2[] books = new Book2[10];
	private int index = 0;
	
	public void add (Book2 book) {
		books[index] = book;
		index++;
	}
	
	public void printList() {
		for(int i=0; i<books.length; i++) {
			if(books[i] == null)
				break;
			System.out.println(books[i].getTitle());
			System.out.println((books[i]).getFontColor());
			System.out.println();
		}
	}
}


/*
문제 1. o
(1) 컴파일 에러가 발생하지 않도록 수정하세요.
문제 2. o
AudioBook 클래스를 추가하세요.
카트에 오디오북을 담으세요.
카트의 리스트 출력 시 오디오북은 [오디오북]책제목의 형식으로 출력되도록 코딩하세요. 
*/