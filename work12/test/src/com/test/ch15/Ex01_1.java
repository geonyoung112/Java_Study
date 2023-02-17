package com.test.ch15;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		int a = 3;
		int b = 7;
		Integer intgA = Integer.valueOf(a);
		Integer intgB = Integer.valueOf(b);
		
		//2.
		Integer result1 = Integer.sum(intgA.intValue(), intgB.intValue());
		System.out.println("더하기 결과:" + result1.intValue());
		
		/* 결과를 int로 변환하기 위해선 intValue()로 변환시켜주면 된다.
		Integer intgC = Integer.valueOf(intgA.intValue() + intgB.intValue());
		System.out.println(intgC.intValue());
		*/
		
		
		//3.
		System.out.println("비교값: " + (intgA.compareTo(intgB)>0? intgA: intgB));
		
		//4.
		System.out.println("최대: " + Integer.max(intgA, intgB));
		System.out.println("최소: " + Integer.min(intgA, intgB));
		

	}

}

/*
문제 1.
int a = 3;
int b = 7;
Integer intgA;
Integer intgB;
a와 b의 값을 갖는 intgA, intgB를 코딩하세요.
문제 2.
intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.
문제 3.
intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.
문제 4.
intgA 와 intgB의 최소값과 최대값을 구하세요.
힌트) max, min을 사용하세요.
*/