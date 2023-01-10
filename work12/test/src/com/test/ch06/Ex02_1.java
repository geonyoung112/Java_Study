package com.test.ch06;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d = %02d ", i, j, i*j);
			}
			System.out.println();
		}
 
	}

}

/*
문제 1.
2단에서 9단까지의 구구단을 아래와 같이 출력하세요.
예) 
2x1=2 ... 2x9=18
3x1=3 ... 3x9=27
...
9x1=9 ... 9x9=81
*/


