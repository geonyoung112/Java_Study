package com.test.ch12;


//자판기 프로그램
//VendingMachine
public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}

class Vendingmachine {
	public static final int Max = 5;
	
	static String[] box = new String[Max];
	static int[] price = new int[Max];
	static int count = 4;
	static int admin = 1004;
	
	
	
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
		Boolean run = true;
		int money = 0;
	
		while(true) {
			System.out.println("---음료 자판기---");
			for(int i=0; i<count; i++) {
				System.out.println("메뉴: " + (i+1)+ ": " + box[i] + ", " + price[i] + "원 입니다.");
			}
		}
	}
}



/*class User{
	private Boolean run = true;
	private int money = 0;
	
	while(true) {
		System.out.println("----음료 자판기-----");
		
	}
}
*/

/*
문제 1.
음료를 뽑을 수 있는 자판기 프로그램을 만들어 주세요. 
제공되는 음료 외의 번호 입력 시 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
잔액이 부족할 경우 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
각각의 예외 발생에 대해 예외처리하는 코드를 작성해 주세요.
*/