package com.test.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1("자바1", "엘컴퓨터학원");
		Book1 b2 = new Book1("자바2", "엘컴퓨터학원");
		Book1 b3 = new Book1("자바3", "엘컴퓨터학원");
		Book1 b4 = new Book1("자바4", "엘컴퓨터학원");
		Book1[] arrBook = new Book1[10];
		List<Book1> books2 = new ArrayList<Book1>(Arrays.asList(arrBook));
		System.out.println(books2.toString());

			

	}

}

class Book1 {
	private String title;
	private String author;
	
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	@Override 
	public String toString() {
		return "Book[title=" + title + ", author=" + author + "]";
	}
}

class Cart1 {
	private List<Book1> books1;
	
	public Cart1() {
		books1 = new ArrayList<Book1>(10);
	}
	public void add(Book1 book) {
		books1.add(book);
	}
	public void add(int index, Book1 book) {
		books1.add(index, book);
	}
	public boolean checkForDuplicateBook(Book1 book) {
		return books1.contains(book);
	}
	public List<Book1> getAllBooks() {
		return books1;
	}
	public Book1 getBook(int index) {
		return books1.get(index);
	}
	
	public static void printAllBooksWithForEach(List<Book1> books1) {
		System.out.println("foreach");
		for (Book1 book : books1) {		// 바이트 코드 변환 시 보일러 플레이트 최소화
			System.out.println(book);
		}
	}
	
	public static void removeWithForEach(List<Book1> books1) { 
		try {
			for (Book1 book : books1) {		// Iterable
				books1.remove(book);
				System.out.println("삭제: " + book);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Iterable은 삭제 기능을 지원하지 않습니다.\n");
		}
		
		System.out.println(books1.toString());
	}
	
}
/*
문제 1.
Book 타입 인스턴스 10개를 생성하여 배열에 저장합니다.
배열을 ArrayList로 변경합니다.
foreach 문을 사용하여 리스트에 저장된 모든 책들을 출력합니다.
Book의 저자가 엘컴퓨터학원인 것을 제외한 나머지 책은 모두 삭제합니다.
리스트에 남아 있는 책들을 출력합니다.
힌트) 삭제 시 foreach문은 예외가 발생될 수 있습니다.
*/