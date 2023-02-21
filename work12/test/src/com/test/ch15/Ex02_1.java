package com.test.ch15;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intgA = Integer.valueOf(3);
		System.out.println(intgA.intValue());
		

		
		Integer intgB = Integer.valueOf(7);
		System.out.println(intgB.intValue());
		
		
		Integer intgSum = Integer.valueOf(intgA.intValue() + intgB.intValue());
		System.out.println("Sum: " + intgSum.intValue());
	}

}
/*
문제 1.
Integer intgA = 3;
Integer intgB = 7;
int sum = intgA + intgB;
위 내용을 오토박싱과 오토언박싱이 필요 없는 코드로 수정하세요.
*/