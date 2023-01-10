package com.test.ch07;

import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기입니다.");
		Calculator cal = new Calculator();
		
		
		
		boolean run = true;
		
		while(true) {
			System.out.println("------------");
			System.out.println("메뉴를 선택하세요. 1:더하기, 2:빼기, 3:곱하기, 4:나누기, 0:종료");
			System.out.println(">>");
			int userInput = scanner.nextInt();
			
			System.out.print("첫 번째 숫자를 입력하세요: ");
			int n1;
			n1 = scanner.nextInt();
			
			System.out.print("두 번째 숫자를 입려하세요: ");
			int n2;
			n2 = scanner.nextInt();
			
			switch(userInput) {
			case 1:
				System.out.println("Result -> " + n1 + "+" + n2 + "=" + Calculator.add(n1, n2));
				break;
				
			case 2: 
				System.out.println("Result -> " + n1 + "-" + n2 + "=" + Calculator.min(n1, n2));
				break;
				
			case 3: 
				System.out.println("Result -> " + n1 + "*" + n2 + "=" + Calculator.mul(n1, n2));
				break;
				
			case 4: 
				System.out.println("Result -> " + n1 + "/" + n2 + "=" + Calculator.div(n1, n2));
				break;
				
			case 0: 
				run = false;
				break;
			}
			
			if(!run)
				break;
			
		}
		System.out.println("------------");
		System.out.println("프로그램이 종료됩니다.");

		

	}

}
/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/

class Calculator {
	
	int n1;
	int n2;
	boolean run;
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int min(int n1, int n2) {
		return n1 - n2;
	}
	
	static int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	static double div(double n1, double n2) {
		return (double)(n1/n2);
	}
	
}