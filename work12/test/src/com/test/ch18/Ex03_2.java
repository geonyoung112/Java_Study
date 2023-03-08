package com.test.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<List<Integer>> nestedList = new ArrayList<>();

	        List<Integer> list1 = Arrays.asList(1, 2);
	        List<Integer> list2 = Arrays.asList(2, 2, 3, 4, 4);
	        List<Integer> list3 = Arrays.asList(5, 5, 6, 7, 6, 7);

	        nestedList.add(list1);
	        nestedList.add(list2);
	        nestedList.add(list3);

	        // 중복 제거
	        Set<Integer> set = new HashSet<>();
	        for (List<Integer> list : nestedList) {
	            set .addAll(list);
	        }

	        System.out.println("중첩리스트: " + nestedList);
	        System.out.println("중복 제거한 값: " + set);
	}
}

/*
문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.
문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요. 
*/
