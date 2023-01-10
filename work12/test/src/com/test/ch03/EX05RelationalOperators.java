package com.test.ch03;

public class EX05RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 7;
		int c = 3;
		int d = 8;
		
		System.out.printf("%d != %d && %d == %d, (%b)%n", a, b, a, c, a != b && a == c);
		System.out.printf("%d >= %d && %d == %d, (%b)%n", a, b, a, c, a >= b && a == c);
		System.out.printf("%d >= %d || %d == %d, (%b)%n", a, b, a, c, a >= b || a == c);
		
		System.out.printf("%d == %d || %d < %d && %d == %d, (%b)%n", a, c, c, d, a, b, a == c || c < d && a == b);
		System.out.printf("(%d ==%d || %d < %d) && %d == %d, (%b)%n", a, c, c, d, a, b, (a == c || c < d) && a == b);

	}

}
