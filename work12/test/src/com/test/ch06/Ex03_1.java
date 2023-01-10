package com.test.ch06;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student = {40, 60, 70, 100, 90}; 
		
		int max = student[0];
		int min = student[0];
		for (int i=1; i<student.length; i++) {
			if(student[i]>max) {
				max = student[i];
			}
		}
		
		for (int i=1; i<student.length; i++) {
			if(student[i]<min) {
				min = student[i];
			}
		}
		System.out.println("현재 학생이 " + max + "점으로 최고점수입니다.");
		System.out.println("현재 학생이 " + min + "점으로 최저점수입니다.");
	}

}

/*
문제 1.
학생 5명의 점수를 저장하는 배열을 작성 한 뒤 
최저점수와 최고점수를 찾아 출력하세요. 
*/

