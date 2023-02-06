package com.test.ch12;

import java.util.Scanner;

public class Ex01TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("문자열을 일력하여 예외를 발생시키세요: ");
			int num = scanner.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			System.out.println("숫자만 입력 가능합니다.");
			
		}
			
		System.out.println("프로그램이 종료됩니다.");
	}

}
