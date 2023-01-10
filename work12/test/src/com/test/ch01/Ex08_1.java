package com.test.ch01;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 30;
		int c = 70;
		System.out.printf("a의 값은 %d이고, b의 값은 %d이고, c의 값은 %d 입니다.%n%n", a, b, c);
		
		int tmp = a;
		a = b;
		b = c;
		c = tmp;
		System.out.printf("a의 값은 %d이고 b의 값은 %d이고, c의 값은 %d 입니다.%n%n", a, b, c);
		

	}

}
