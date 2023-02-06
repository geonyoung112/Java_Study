package com.test.ch12;

import java.util.Scanner;

public class Ex01TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		//개발자가 개발하면서 만드는 오류가 아닌 사용자가 입력하거나 사용하면서 생기는 오류를 예외로 처리하며 
		//눈에 띄게 하는 것
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("문자열을 일력하여 예외를 발생시키세요: ");
			int num = scanner.nextInt(); // 여기서 잘못 입력되면 캐치문으로 넘어간다
			System.out.println(num);
			
		}catch(Exception e) {
			System.out.println("숫자만 입력 가능합니다.");
			
		}
			
		System.out.println("프로그램이 종료됩니다.");
	}

}
