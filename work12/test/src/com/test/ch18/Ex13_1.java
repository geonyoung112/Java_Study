package com.test.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> stu = new ArrayList<>();
		Collections.addAll(stu, new Student2(1, "주건영"), new Student2(1, "김건영"), new Student2(3, "주건영") );
		Collections.sort(stu);
		System.out.println(stu);

	}
}

class Student2 implements Comparable<Student2> {
	private String name;
	private int no;
	
	public Student2(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNo() {
		return no;
	}
	
	
	@Override
	public int compareTo(Student2 stu) {
		int result = Integer.valueOf(no).compareTo(stu.getNo()); //오름차순
		if(result == 0)
			result = name.compareTo(stu.name)* -1; //내림차순
		return result;
	}
	@Override
	public String toString() {
		return "(" + no + ", " + name + ")";

	}
}
/*
문제 1.
번호와 이름을 가진 학생 클래스를 만드세요.
학생의 번호를 오름차순으로 정렬하여 출력하세요.
번호가 같을 경우 이름을 내림차순으로 정렬하여 출력하세요.
*/