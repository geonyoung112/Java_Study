package com.test.ch09;

public class Ex05AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperBook pb = new PaperBook();
		pb.setTitle("자바 기본문법");
		pb.setAuthor("엘컴퓨터학원");
		pb.setPrice(50000);
		pb.setType("양장본");
		pb.print();
		
		EBook4 eb = new EBook4();
		eb.setTitle("자바 자료구조");
		eb.setAuthor("엘코딩연구소");
		eb.setPrice(30000);
		eb.setFontColor("블루");
		eb.print();

		System.out.println();
		
		Bookcase bc = new Bookcase();
		bc.add(pb);
		bc.add(eb);
		bc.printBooks();

	}

}

//추상 클래스 (abstract class)
abstract class Book5 {
	protected String title;
	protected int price;
	private String author;
	
	public abstract String getTitle(); // 추상 메소드 (abstract method)
	public abstract int getPrice();
	public abstract void print();
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class PaperBook extends Book5 {
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "[종이책,"+type+"] " + title;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return (int)(price * 1.1f);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title + ", " + getAuthor() + ", " + getPrice() + ", " + type);
		
	}
}

class EBook4 extends Book5 {
	private String fontColor;
	
	public String getFontColor() {
		return fontColor;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public String getTitle() {
		return "[e북, 폰트:"+fontColor+"] " + title;
	}
	
	@Override
	public int getPrice() {
		return (int)(price * 1.2f);
	}
	
	@Override
	public void print() {
		System.out.println(title + ", " + getAuthor() + ", " + getPrice() + ", " + fontColor);
	}
}

class Bookcase {
	private Book5[] books;
	private int index;
	
	public Bookcase() {
		books = new Book5[5];
		index = 0;
	}
	
	public void add(Book5 book) {
		books[index] = book;
		index++;
	}
	
	public void printBooks() {
		for(int i=0; i<books.length; i++) {
			if (books[i] == null)
				return;
			System.out.println(books[i].getTitle());
		}
	}
}

class Cart5 {

}




abstract class AudioBook6 extends Book5 {
	private int volume;
	
	@Override
	public void print() {
		System.out.println(title + ", " + getAuthor() + ", " + getPrice() + ", " + volume);
		
	}
	
}



/*
문제 1. o
AudioBook 클래스에서 컴파일 오류가 발생하지 않도록 추상 메소드를 구현하세요.
문제 2.
AudioBook 클래스에 볼륨 속성을 추가하고 print 메소드 호출 시 볼륨 정보가 출력되도록 오버라이딩 하세요.
문제 3.
장바구니 클래스를 추가하세요.
장바구니에 책을 담을 수 있는 메소드를 추가하세요.
장바구니에 담긴 책의 제목과 저자, 금액을 출력하는 메소드를 추가하세요. 
*/


/*
//추상클래스를 사용하는 이유는 컴파일 타임에서 오류를 잡기 위함이다.
//보통 런타임에서 나타나는 에러는 상당히 복잡하고 이유를 찾기 힘들기에 다형성과 추상, 오버라이딩을 사용하면 컴파일 과정에서 오류를 찾을 수 있다. 
// (여기서 에러: 작성하는 도중에 코드에서 오류가 나타나는 것)
//컴파일 타임이란 자바를 읽는 기계가 읽을 수 있도록 바이트를 변환하는 과정이다. 즉, 컴퓨터 언어로 바꿔주는 것
*/