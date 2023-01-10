package com.test.ch01;

public class Ex04_1Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
		System.out.println("현재 잔액은 " + balance + "원입니다.");
		System.out.println();
		
		int tvPrice = 500;
		System.out.println("TV는 " + tvPrice + "원입니다.");
		System.out.println("TV를 구매하였습니다.");
		
		int comPrice = 300;
		System.out.println("Computer는 " + comPrice + "원입니다." );
		System.out.println("Computer를 구매하였습니다.");
		
		balance = balance - tvPrice - comPrice;
		System.out.println("현재 잔액은 " + balance + "원입니다.");
		System.out.println();
		
		int salary = 500;
		System.out.println("월급" + salary + "웝이 입금되었습니다.");
		
		balance = balance + salary;
		System.out.println("현재 잔액은 " + balance + "원입니다.");
		
	
		
		
		
		

	}

}
