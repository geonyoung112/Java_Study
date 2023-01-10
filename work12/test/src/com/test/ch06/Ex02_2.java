package com.test.ch06;

public class Ex02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%02d ",j, i, j*i);
			}
			System.out.println();
		}

	}

}
/*
 문제 2.
구구단을 아래와 같이 출력하세요.
2x1=2  3x1=3 ... 9x1=9
2x2=4  3x2=6 ... 9x2=18
..
2x9=18 3x9=27 ... 9x9=81
 */
