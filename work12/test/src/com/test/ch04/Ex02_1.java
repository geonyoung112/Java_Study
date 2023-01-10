package com.test.ch04;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{80, 95, 60, 40},
				{30, 20, 90, 80},
				{70, 50, 30, 90}
		};
		
		System.out.printf("이름 국어 영어 수학 과학 %n");
		System.out.printf("영희 %d, %d, %d, %d%n", arr[0][0], arr[0][1], arr[0][2], arr[0][3]);
		System.out.printf("철수 %d, %d, %d, %d%n", arr[1][0], arr[1][1], arr[1][2], arr[1][3]);
		System.out.printf("철수 %d, %d, %d, %d%n", arr[2][0], arr[2][1], arr[2][2], arr[2][3]);
		
		System.out.printf("모든 학생들의 국어 점수의 합은 무엇인가? %n");
		System.out.printf("합은 %d입니다.", arr[0][0]+arr[1][0]+arr[2][0] );
		
	}

}

/*
문제 1.
총 3명의 학생이 있고 각각의 학생들은 국어, 영어, 수학, 과학 점수를 가지고 있습니다.
이를 2차원 배열로 만들고 모든 학생들의 국어 점수를 합하여 출력하세요. 
*/