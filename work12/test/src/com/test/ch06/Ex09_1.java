package com.test.ch06;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char ch = ' ';
		do {
			System.out.println("문자를 입력해주세요: ");
			String str = scanner.nextLine();
			ch = str.charAt(0);
			System.out.println(ch);
		}while( ch != 'Z');
		System.out.println("프로그램을 종료합니다.");

	}

}
/*
문제 1.
do while문을 사용하여 대문자 Z가 입력될 때까지 입력된 문자를 출력하는 코드를 작성하세요.
Z가 입력되면 프로그램을 종료한다는 문구를 출력 후 프로그램을 종료하세요. 
*/