package com.test.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제 1.
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "B", "D", "C", "E", "A");
		System.out.println(list);
		System.out.println();
		
		System.out.println("< binarySearch >");
		System.out.println(Collections.binarySearch(list, "A"));
		System.out.println();
		
		System.out.println("< sort >");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< binarySearch >");
		System.out.println(Collections.binarySearch(list, "A"));
		System.out.println();
		
		System.out.println("< reverseOrder >");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println();
		
		
		//문제 2.
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list2.add(7);
		System.out.println(list2);
		System.out.println();
		
		/*
		String[] strs = {"alpha", "beta", "charlie"};
      	System.out.println(Arrays.toString(strs));
		List<String> list = Arrays.asList(strs); 
	    list.add("ttt");   
	    위의 예시처럼 작성시
	    error : asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음
	    */
		
		//문제 3.
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[][] arr3 = {{1, 2}, {3, 4}};
        int[][] arr4 = {{1, 2}, {3, 4}};
        
        System.out.println(Arrays.equals(arr1, arr2));
        //1차원 배열에선 Arrays.equals만 사용
        System.out.println(Arrays.deepEquals(arr3, arr4));
        //2차원 배열에서 Arrays.deepEquals를 사용해야 올바른 값이 출력된다.

	}

}
/*
문제 1.
addAll 을 이용해 리스트에 임의의 값들을 입력 후
binarySearch 를 이용해 검색하세요.
오름차순과 내림차순을 적용 후 출력하세요.
문제 2.
Arrays.asList를 이용해 리스트 생성 후 해당 리스트에 임의의 값을 추가하세요.
문제 3.
Arrays.equals 와 Arrays.deepEquals 를 사용하여 1차원 배열과 2차원 배열의 값을 비교하는 코드를 작성하세요.
*/