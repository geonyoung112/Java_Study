package com.test.ch05;

import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int level;
		String name;
		
		System.out.printf("본인의 레벨을 입력하세요.%n");
		level = scan.nextInt();
		
		
		
		if (level > 3) {
			name = "정회원님";
		} else {
			name = "회원님";
		}
		
		System.out.printf("%s 안녕하세요.%n", name);
		
	}

}
/*
문제 1.
사용자에게 입력 받은 레벨이 3 보다 크다면 "정회원님 안녕하세요."를 출력하고
3보다 작다면 "회원님 안녕하세요."를 출력하는 코드를 작성하세요. 
*/