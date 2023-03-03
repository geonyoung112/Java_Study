package com.test.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Set은 중복은 제거하지만 정렬은 하지 못한다.
//그래서 Set을 List로 다시 바꿔줘야 한다.

public class Ex02Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로 부터 입력 받은 과목들이라고 가정합니다.
		String[] arrSubjects = { "자바", "파이선", "자바", "알고리즘", "스프링", "자료구조", "자바스크립트", "데이터베이스", "스프링", "스프링", "C", "람다" };
		System.out.println(Arrays.toString(arrSubjects));
		System.out.println();
		
		Student s1 = new Student("A");
		s1.addSubject("자바");
		s1.addSubject("알고리즘");
		s1.addSubject("파이썬");
		s1.addSubject("스프링");
		Student s2 = new Student("B");
		s2.addSubject("자바");
		s2.addSubject("데이터베이스");
		s2.addSubject("스프링");
		Student s3 = new Student("C");
		s3.addSubject("자바");
		s3.addSubject("스프링");
		s3.addSubject("자바스크립트");
		
		Course course = new Course();
		course.setStudents(s1, s2, s3);
		
		System.out.println("- 모든 과목 -");
		course.setSubjects(arrSubjects);
		Set<String> subjects = course.getSubjects();
		Course.print(subjects);
		
		System.out.println("- 정렬된 과목 -");
		List<String> oSubjects = course.getOrderedSubjects();
		Course.print(oSubjects);
		
		System.out.println("- 학생들이 수강 중인 모든 과목 (합집합) -");
		Set<String> rSubjects = course.getRegisteredSubjects();
		Course.print(rSubjects);
		
		System.out.println("- 모든 학생들이 수강 중인 과목 (교집합)");
		Set<String> bSubjects = course.getBasicSubjects();
		Course.print(bSubjects);
		
		System.out.println("- 모든 학생들이 수강 중이지 않은 과목 (여집합)");
		Set<String> cSubjects = course.getCanceledSubjects();
		Course.print(cSubjects);
	}

}

class Course {
	private Set<String> subjects;
	private List<Student> students;
	
	public void setStudents(Student... arrStudent) { //가변인자로 학생을 받아오기
		students = new ArrayList<>();
		Collections.addAll(students, arrStudent); //배열처럼 받아옴
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setSubjects(String[] arrSubjects) {
		List<String> list = new ArrayList<>(); //모든 과목을 불러오면서 셋으로 중복을 제거
		Collections.addAll(list, arrSubjects);
		subjects = new HashSet<>(list);
	}
	
	public Set<String> getSubjects() {
		return subjects;
	}
	
	public List<String> getOrderedSubjects() {
		List<String> oSubjects = new ArrayList<>(subjects);
		Collections.sort(oSubjects); //셋을 다시 리스트로 바꿔서 오름차순으로 정렬
		return oSubjects;
	}
	
	public Set<String> getRegisteredSubjects() {
		Set<String> rSubjects = new HashSet<>();
		for (Student student : students) {
			rSubjects.addAll(student.getSubjects()); //학생들의 중복없이 모든 과목을 불러옴  
		}
		return rSubjects;
	}
	
	public Set<String> getBasicSubjects() {		
		Set<String> subjects = null;
		for (Student student : students) {
			if (subjects == null)
				subjects = new HashSet<>(student.getSubjects());
			subjects.retainAll(student.getSubjects()); //공통으로 듣는 과목만 불러옴
			//처음 학생의 과목을 눌로 정의하고 첫 학생의 과목과 두번째 학생의 과목을 비교해서 같은 것만 남김 
		}
		
		return subjects;
	}
	
	public Set<String> getCanceledSubjects() {
		Set<String> allSubjects = new HashSet<>(subjects);//중복없는 모든 과목
		Set<String> rSubjects = getRegisteredSubjects();//교집합 과목
		
		allSubjects.removeAll(rSubjects);//뺀다
		
		return allSubjects;//남는 것이 여집합 과목
	}
	
	public static void print(Collection<String> subjects) {
		for (String subject : subjects) {
			System.out.print(subject + ", "); //하나씩 불러와서 프린트 메소드
		}
		System.out.println("\n");
	}
}

class Student {
	private String name;
	private Set<String> subjects;
	
	public Student(String name) {
		this.name = name;
		subjects = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addSubject(String subject) {
		subjects.add(subject);
	}
	
	public Set<String> getSubjects() {
		return subjects;
	}
}


/*
엘컴퓨터식당에는 짜장면, 짬뽕, 된장찌개, 김치찌개, 탕수육 식사 메뉴가 있습니다.
A는 짜장면, 짬뽕을 시켰습니다.
B는 짜장면, 탕수육을 시켰습니다.
C는 짜장면, 김치찌개를 시켰습니다. 
문제 1.
주문한 모든 메뉴를 중복 없이 정렬하여 출력하세요.
문제 2.
모든 사람이 주문한 메뉴를 출력하세요.
문제 3.
한 명도 시키지 않은 메뉴들을 출력하세요.
*/
