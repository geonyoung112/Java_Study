package com.test.ch07;

import java.util.Arrays;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book15 book1 = new Book15();
		book1.title = "자바";
		book1.setAuthor("엘컴퓨터","주건영","주건영","주건영");
		
		Book15.printInfo(book1);
		
		Book15 book2 = new Book15();
		book2.title = "파이썬";
		book2.setAuthor("엘컴퓨터","주건영","주건영","주건영");
		
		Book15.printInfo(book2);
		
		
		

	}

}

class Book15{
	String title;
	String[] author;
	
	void setAuthor(String...params) {
		author = new String[params.length];
		for(int i=0; i<author.length; i++) {
			author[i] = params[i];
		}
	}
	
	static void printInfo(Book15 book ) {
		System.out.printf("제목: %s%n", book.title);
		System.out.printf("저자: %s%n%n", Arrays.toString(book.author));
	}
}
/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요. 
*/