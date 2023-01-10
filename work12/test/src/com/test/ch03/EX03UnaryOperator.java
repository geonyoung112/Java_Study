package com.test.ch03;

public class EX03UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		System.out.printf("a = %d%n", a++);
		System.out.printf("a = %d%n", a);
		System.out.printf("a = %d%n%n", ++a);
		
		a = 3;
		int b = a++;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a = 3;
		b = ++a;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a = 3;
		System.out.printf("a = %d%n%n", --a);
	}

}
