package com.test.ch05;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 5;
		String name = "익명";
		
		if (level >= 5) {
			name = "VIP 회원";
		}
		
		System.out.printf("%s님 안녕하세요.", name);
	}

}
/*
문제 1.
로그인한 회원의 레벨이 5 이상이면 "VIP회원님 안녕하세요"를 출력하는 코드를 작성하세요. 
*/