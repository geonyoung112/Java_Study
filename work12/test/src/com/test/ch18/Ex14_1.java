package com.test.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Ex14_1 {
	public static void main(String[] args) {
		List<Student4> stu = new ArrayList<>();
		Collections.addAll(stu, new Student4(2, "홍길동"), new Student4(1, "김갑"), new Student4(2,"장김"));
		
		//문제 1.
		System.out.println("< 번호 내림차순, 이름 오름차순으로 정력>");
		Collections.sort(stu);
		System.out.println(stu);
		System.out.println();
		
		//문제 2.
		System.out.println("< 번호 내림차순 정렬, 이름 내림차순 정렬 >");
		Collections.sort(stu, new Comparator<Student4>() {
			@Override
			public int compare(Student4 s1, Student4 s2) {
				int result = Integer.valueOf(s1.getNo()).compareTo(s2.getNo()) * -1;
				if (result == 0)
					result = s1.getName().compareTo(s2.getName()) * -1;
				return result;
			}
		});
		System.out.println(stu);
		System.out.println();
		
		//문제 3.
		// Comparable을 이용, 가격이 높은 책부터 제거
        PriorityQueue<Book5> queue1 = new PriorityQueue<>();
        queue1.add(new Book5(15000, "Java"));
        queue1.add(new Book5(5000, "Python"));
        queue1.add(new Book5(20000, "C++"));
        
        System.out.println("< Comparable을 이용해 가격이 높은 책부터 제거 >");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
        System.out.println();
        
        // Comparator를 이용해 가격이 낮은 책부터 제거
        PriorityQueue<Book5> queue2 = new PriorityQueue<>(new DescendingPrice2());
        queue2.add(new Book5(10000, "Java"));
        queue2.add(new Book5(5000, "Python"));
        queue2.add(new Book5(20000, "C++"));
        
        System.out.println("< Comparator를 이용해 가격이 낮은 책부터 제거 >");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}


//문제 3.
class Book5 implements Comparable<Book5> {
    private int price;
    private String title;
    
    public Book5(int price, String title) {
        this.price = price;
        this.title = title;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public int compareTo(Book5 b) {
        return Integer.compare(b.getPrice(), this.price);
    }
    
    @Override
	public String toString() {
		return "(" + price + ", " + title + ")";
	}
}

//낮은 가격부터 제거 & 출력
class DescendingPrice2 implements Comparator<Book5> {
    @Override
    public int compare(Book5 b1, Book5 b2) {
        return Integer.compare(b1.getPrice(), b2.getPrice());
    }
}

//문제 1, 2
class Student4 implements Comparable<Student4> {
	private int no;
	private String name;
	public Student4(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Student4 stu) {
		int result = Integer.valueOf(no).compareTo(stu.getNo()) * -1;
		if(result == 0)
			result = name.compareTo(stu.name);
		return result;
	}
	@Override
	public String toString() {
		return "(" + no + ", " + name + ")";
	}
	
}
/*
문제 1.
학생들을 Comparator 를 이용해 정렬하여 출력하세요.
번호 내림차순, 이름 오름차순으로 정렬하여 출력하세요.
문제 2.
번호 내림차순, 이름 내림차순으로 정렬하는 Comparator 를 이용해 출력하세요.
Comparator 는 익명클래스로 작성하세요.
문제 3.
PriorityQueue에 책들을 입력하세요.
Queue에서 책의 가격이 높은 책 부터 제거되도록 코딩하세요.
Comparable을 이용해 가격이 높은 책부터 제거되도록 작성하세요. 
Comparator를 이용해 가격이 낮은 책부터 제거되도록 코딩하세요.
*/