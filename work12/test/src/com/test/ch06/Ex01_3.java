package com.test.ch06;

public class Ex01_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {0, 70, 60, 50, 90, 80};
		
		for (int i=1; i<score.length; i++) {
			if (score[i]>=60) {
				System.out.println(i+"번째 학생의 점수는 " + score[i] + "점 입니다.");
			}
		}
			
	}

}
/*
 문제 3.
중간고사 점수가 저장된 배열의 점수를 출력하되 점수가 60점 이상일 경우에만 출력하고 60점 미만일 경우 "재시험"을 출력하는 코드를 작성하세요. 

*/