package com.test.ch01;

import java.util.Scanner;

public class EX07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int balance;
		int man;
		int woman;
		int animal;
		
		System.out.printf("현재 슈퍼에 남아있는 사탕의 수를 입력하세요.%n");
		balance = scan.nextInt();
		System.out.printf("철수가 구매한 사탕의 수를 입력하세요.%n");
		man = scan.nextInt();
		System.out.printf("영희가 구매한 사탕의 수를 입력하세요.%n");
		woman = scan.nextInt();
		System.out.printf("둘리가 환불한 사탕의 수를 입력하세요.%n");
		animal = scan.nextInt();
		
		System.out.printf("현재 남아있는 사탕은 %d개 입니다.%n%n", balance);
		
		System.out.printf("철수는 사탕을 %d개 구매했습니다.%n", man);
		System.out.printf("영희는 사탕을 %d개 구매했습니다.%n", woman);
		System.out.printf("둘리는 사탕을 %d개 환불했습니다.%n", animal);
		
		balance = balance - man - woman + animal;
		System.out.printf("현재 슈퍼에 사탕의 수는 %d개 입니다.", balance);

	}

}
