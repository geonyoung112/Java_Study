package com.test.ch06;

public class EX06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 2;
		
		while(i <= 9) {
			while(j <= 9) {
				System.out.printf("%d*%d=%02d ",j, i, j*i);;
				j++;
			}
			System.out.println();
			j=2;
			i++;
		}

	}

}
/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다. 
중첩 while문을 이용해 구구단을 출력하세요. 
*/
