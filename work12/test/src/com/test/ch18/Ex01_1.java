package com.test.ch18;


import java.util.HashSet;
import java.util.Set;


public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] a = {"국어", "영어"};
		
		List<String> a1 = new ArrayList<>();
		Collections.addAll(a1, a);
		
		Set<String> b = new HashSet<>(a1);
		b.add("영어");
		b.add("수학");
		
		Set<String> c = new HashSet<>(b);
		c.add("국어");
		c.add("수학");
		c.add("과학");
		System.out.println("- 전체과목 -");
		System.out.println(c);
		*/
		
		Set<String> a = new HashSet<>();
		a.add("국어");
		a.add("영어");
		
		Set<String> b = new HashSet<>(a);
		b.add("영어");
		b.add("수학");
		b.addAll(a);

		Set<String> c = new HashSet<>();
		c.add("국어");
		c.add("수학");
		c.add("과학");
		c.addAll(b);
		
		System.out.println("- 전체과목 -");
		System.out.println(c);
		
		

	}

}

/*
문제 1.
둘리는 국어, 영어 수업을 듣습니다.
또치는 영어, 수학 수업을 듣습니다.
도우너는 국어, 수학, 과학 수업을 듣습니다.
학생들이 수강하는 모든 과목을 중복 없이 출력하세요.
*/