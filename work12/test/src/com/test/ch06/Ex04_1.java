package com.test.ch06;

import java.util.Arrays;

public class Ex04_1 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for (int i=0; i<lotto.length; i++) {
			int n = (int)(Math.random() * lotto.length);
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		System.out.println(Arrays.toString(lotto));
		
		for (int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		
/*		int lotto[] = new int[6];
		
		for(int i=0; i< 6; i++) {
			lotto[i] = (int)(Math.random()*45) +1;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));*/

	}
}


/*
중복을 제거하는 방법
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요. 
*/