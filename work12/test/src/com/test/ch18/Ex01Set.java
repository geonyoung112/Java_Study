package com.test.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//set은 자동으로 중복을 제거함
public class Ex01Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intg1 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, intg1);
		print(list1);
		System.out.println();
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(6);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		s1.add(10);
		print(s1);
		Collection<Integer> c1 = s1;
		print(c1);
		System.out.println();
		
		Set<Integer> s2 = new HashSet<>(list1);
		print(s2);
		s2.remove(1);
		s2.remove(2);
		s2.remove(8);
		print(s2);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.addAll(s2);
		System.out.println("addAll");
		print(s1);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.retainAll(s2);
		System.out.println("retainAll");
		print(s1);
		print(s2);
		System.out.println();
		
		print(s1);
		print(s2);
		s1.removeAll(s2);
		System.out.println("removeAll");
		print(s1);
		print(s2);

	}
	
	//set, list를 쓸지 결정x라면 콜렉션을 받아오기(가장 위에 있는 부모)
	public static void print(Collection<Integer> c) {
		for(Integer i : c) 
			System.out.println(i + ", ");
		System.out.println();
	}

}

/*
문제 1.
둘리는 국어, 영어 수업을 듣습니다.
또치는 영어, 수학 수업을 듣습니다.
도우너는 국어, 수학, 과학 수업을 듣습니다.
학생들이 수강하는 모든 과목을 중복 없이 출력하세요.
*/
