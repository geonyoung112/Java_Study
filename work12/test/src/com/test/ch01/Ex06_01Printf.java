package com.test.ch01;

public class Ex06_01Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 10;
		System.out.printf("현재 슈펴에는 %d개의 사탕이 있습니다. %n%n", balance);
		
		int man = 3;
		System.out.printf("철수는 %d개의 사탕을 샀습니다.%n", man);
		
		int woman = 2;
		System.out.printf("영희는 %d개의 사탕을 샀습니다.%n", woman);
		
		int animal = 2;
		System.out.printf("둘리는 %d개의 사탕을 환불했습니다.%n%n", animal);
		
		balance = balance - man - woman + animal;
		System.out.printf("현재 슈퍼에 남아 있는 사탕의 재고는 %d개 입니다.", balance);
		

	}

}
