package com.test.ch06;

import java.util.Scanner;


public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean buy = true;
		int price = 0;
		int count = 0;
		int balance = 1000;
		
		while(buy) {
			System.out.println("명령어를 입력해주세요.\n(MENU -> 1: 콜라(500원), 2: 사이다(300원), 3. 환타(200원), -1: 종료");
			count = scanner.nextInt();
			 System.out.println();
			
			if(count == -1) {
					System.out.println("프로그램을 종료합니다.");
					buy = false;
			} else if(count == 1) {
				price = 500;
				balance -= price;
				System.out.printf("콜라를 구매하셨습니다. 남은 잔액은 %d입니다.", balance);

			} else if(count == 2) {
				price = 300;
				balance -= price;
				System.out.printf("사이다를 구매하셨습니다. 남은 잔액은 %d입니다.", balance);

			} else if(count == 3) {
				price = 200;
				balance -= price;
				System.out.printf("환타를 구매하셨습니다. 남은 잔액은 %d입니다.", balance);

			}  else {
				System.out.printf("잘못된 명령어를 입력하였습니다.%n", count);
			}
			 System.out.println();
			
			if (balance <=100){
				System.out.printf("잔액이 부족합니다. 프로그램을 종료합니다.");
				buy = false;
			}
		}

	}

}
/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/