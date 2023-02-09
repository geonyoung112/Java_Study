package com.test.ch12;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendingmachine2.User();
	}

}
class Vendingmachine2 {
	public static final int Max = 5;
	
	static String[] box = new String[Max];
	static int[] price = new int[Max];
	static int count = 5;
	
	
	
	public static void list() {
		
		box[0] = "코카콜라";
		price[0] = 1500;
		
		box[1] = "밀키스";
		price[1] = 1000;
		
		box[2] = "펩시";
		price[2] = 1400;
		
		box[3] = "핫식스";
		price[3] = 2000;
		
		box[4] = "파워에이드";
		price[4] = 2500;
		
	}
	
	public static void User() {
		Scanner scanner = new Scanner(System.in);
		Boolean run = true;
		int money = 0;
	
		while(true) {
			
				list();
				
				System.out.println("---음료 자판기---");
					for(int i=0; i<count; i++) {
					System.out.println("메뉴" + (i+1)+ ": " + box[i] + ", " + price[i] + "원");
					
					}
					System.out.println("--------------");
					
					if(run) {
					System.out.println("동전이나 지폐를 넣어주세요: ");
					money = scanner.nextInt();
			
					System.out.println("메뉴를 골라두세요: ");
					int num = scanner.nextInt();
					
					try {
						 if(num>5)
							throw new MisInput2("메뉴 입력번호 오류");

						}catch(MisInput2 e) {
							System.out.println("번호를 잘못입력하셨습니다.");
							System.out.println("처음으로 돌아갑니다.");
							continue;
						}
					
					if(money >= price[num-1]) {
						System.out.println(box[num-1] + " 이/가 나왔습니다.");
						money = money - price[num-1];
						System.out.println("잔액은 " + money + "입니다.");
						System.out.println();
						
					} else {
						try {
							if(money < price[num-1]) {
							throw new NotEnoughBalance2("잔액이 부족합니다.");
							}
						} catch (NotEnoughBalance2 e) {
							System.out.println("잔액이 부족합니다. 고객님의 " + money + "원을 반환합니다.");
							System.out.println("처음으로 돌아갑니다.");
							continue;
						} 
					}
					
				}
				
			if(money == 0) {
				System.out.println("이용해주셔서 감사랍니다.");
				run = true;
			}
			
	
			
			
			System.out.println("1: 계속 구매하기 2: 잔돈 반환하기" );
			System.out.println("번호를 입력하세요: ");
			int num1 = scanner.nextInt();
			
					if(num1 == 1) {
						continue;
					} 
					else if (num1 == 2) {
						System.out.println("거스름돈 " + money + "원이 반환됩니다.");
						System.out.println("감사합니다.");
						break;
						
					}
		}
	}
}

class MisInput2 extends Exception{
	private static final long serialVersionUID = 1L;
	//네트워크 상에서 클래스를 넘겨줄때 시리얼 넘버를 요구함
	//그래서 시리얼 넘버를 작성

	MisInput2(String msg){
		super(msg);
	}
}
 
class NotEnoughBalance2 extends Exception {
	private static final long serialVersionUID = 1L;

	NotEnoughBalance2(String msg) {
		super(msg);
	}
}

/*
문제 1.
자판기 프로그램을 throws 가 적용된 코드로 수정하세요.
*/