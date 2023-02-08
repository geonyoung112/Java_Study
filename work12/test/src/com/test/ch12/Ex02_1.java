package com.test.ch12;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = {0, 1, 2};
		
		try {
			System.out.println("0~2 이외의 숫자를 입려하세요: "); // 예외처리 하는 법
			int i = scanner.nextInt();

			
			System.out.println("문자열을 입력하여 예외를 발생시키세요: ");
			int j = scanner.nextInt();
			System.out.println(j);
			
			System.out.print("0 이외의 숫자를 입력하세요: "); // 예외처리 하는 법
			int num = scanner.nextInt();
			System.out.println(arr[i] / num);
			
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			
		}catch(ArithmeticException e) {
			System.out.println("산술 예외가 발생되었습니다.");
			
		}catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
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