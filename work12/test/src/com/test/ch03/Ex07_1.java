package com.test.ch03;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.printf("숫자를 입력하시오.%n");
		n = scan.nextInt();
		
		String result = n>0? "양수" : n==0 ? "0" :"음수";
		System.out.println(result);
		

	}

}
