package com.test.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex14_1 {
	public static void main(String[] args) {
		List<Student4> stu = new ArrayList<>();
		Collections.addAll(stu, new Student4(2, "홍길동"), new Student4(1, "김갑"), new Student4(2,"장김"));
		
		System.out.println("< 번호 내림차순, 이름 오름차순으로 정력>");
		Collections.sort(stu);
		System.out.println(stu);
		System.out.println();
		
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
	}
}




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