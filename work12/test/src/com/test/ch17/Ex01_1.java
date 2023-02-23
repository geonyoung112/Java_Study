package com.test.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book21[] arrBook = {
							new Book21("자바1", "엘컴퓨터학원"),
							new Book21("자바2", "엘컴"),
							new Book21("자바3", "엘컴"),
							new Book21("자바4", "엘컴퓨터학원"),
							new Book21("자바5", "엘컴퓨터학원"),
							new Book21("자바6", "엘컴"),
							new Book21("자바7", "엘컴"),
							new Book21("자바8", "엘컴퓨터학원"),
							new Book21("자바9", "엘컴퓨터학원"),
							new Book21("자바10", "엘컴퓨터학원"),
							
		};
		
		List<Book21> books2 = new ArrayList<Book21>(Arrays.asList(arrBook));
		Cart21.printAllBooksWithForEach(books2);
		System.out.println();
		Cart21.removeWithForEach(books2);
		
	
			

	}

}

class Book21 {
	private String title;
	private String author;
	
	public Book21(String title, String author) {
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

class Cart21{
	private List<Book21> books; 
	
	public Cart21() {
		books = new ArrayList<Book21>(10);
	}
	
	public static void printAllBooksWithForEach(List<Book21> books) {
		for (Book21 book : books) {		// 바이트 코드 변환 시 보일러 플레이트 최소화
			System.out.println(book);
		}
	}
	
	public static void removeWithForEach(List<Book21> books) { 
		try {
			for (Book21 book : books) {		
				books.remove(book);
				System.out.println("삭제:" + book);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Iterable은 삭제 기능을 지원하지 않습니다.\n");
			}
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