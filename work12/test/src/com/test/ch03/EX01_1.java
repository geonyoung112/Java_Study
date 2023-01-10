package com.test.ch03;

import java.util.Scanner;

public class EX01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int tvcount;
		int tvprice;
		
		System.out.println("티비의 수량을 입력하세요.");
		tvcount = scan.nextInt();
		System.out.println("티비의 금액을 입력하세요.");
		tvprice = scan.nextInt();
		
		int sum = tvcount *  tvprice;
		System.out.printf("티비의 총액은 %d입니다.", sum);
	}

}
