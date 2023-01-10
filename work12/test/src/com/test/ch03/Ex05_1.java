package com.test.ch03;

import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int P;	
		
		System.out.println("티비의 가격을 입력하세요.");
		P = scan.nextInt();
		
	
		System.out.printf("%d < 300 || %d > 500 || %d < 600, (%b)%n", P, P, P, P < 300 || (P > 500 && P<600) );
	}

}
