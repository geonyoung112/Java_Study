package com.test.ch19;

import java.util.ArrayList;
import java.util.List;

public class EX07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book8> books = new ArrayList<>();
		books.add(new Book8("자바 기본문법", 50000));
		books.add(new Book8("자바 알고리즘", 30000));
		books.add(new Book8("파이썬 기본문법", 35000));
		books.add(new Book8("파이썬 기본문법", 33000));
		books.add(new Book8("리눅스", 40000));
		
		books
				.parallelStream()
				.sorted((b1, b2) -> Integer.compare(b2.getPrice(), b1.getPrice()))
				.forEachOrdered(System.out::println);
		
		System.out.println("---");
		books.parallelStream()
			.map(b -> b.getPrice())
			.sorted(Integer::compare)
			.forEachOrdered(System.out::println);
			

	}

}

class Book8 {
	private String title;
	private int price;
	
	public Book8(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "[" + title + ", " + price + "]";
	}
}

/*
문제 1. 
모든 책들의 정보를 책가격 기준 내림차순 정렬하여 출력하세요.
패러렐 스트림을 이용해야 합니다.
힌트) sorted와 Comparator를 사용하세요.
*/