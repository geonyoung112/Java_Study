package com.test.ch12;


import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("0~2 숫자를 입려하세요: "); // 예외처리 하는 법
			int i = scanner.nextInt();
			System.out.println(i);
			
			System.out.println("문자열을 입력하여 예외를 발생시키세요: ");
			int j = scanner.nextInt();
			System.out.println(j);
			
			System.out.print("0 이외의 숫자를 입력하세요: "); // 예외처리 하는 법
			int num1 = scanner.nextInt();
			System.out.println(num1);
						
		}catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}

}

/*
문제 1.
i에 0~2 이외의 숫자를 입력하여 예외를 발생 시키세요.
문제 2. 
문자열을 입력하여 예외를 발생 시키세요.
문제 3.
num에 0을 입력하여 예외를 발생 시키세요.
문제 4.
예외가 발생되지 않도록 값을 입력한 뒤 실행하세요.
*/