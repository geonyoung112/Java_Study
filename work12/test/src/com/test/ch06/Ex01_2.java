package com.test.ch06;


public class Ex01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = {70, 80, 90};
		
		for (int i=0; i<student.length; i++) {
			System.out.println((i+1)+ "번째 학생의 중간고사 점수는 " + student[i] + "점 입니다.");
		}
	}

}
/*
 * 문제 2.
학생 3명의 중간고사 점수가 저장된 배열을 만들고 임의의 점수를 저장한 뒤
for 문을 사용하여 출력하세요.

 */
