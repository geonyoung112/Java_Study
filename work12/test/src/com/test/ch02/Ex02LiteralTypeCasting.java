package com.test.ch02;

public class Ex02LiteralTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5 / 2 = " + 5/2);//정수끼리 연산을 하면 뒷 소수가 나오지 않음
		System.out.println("5 / 2f = " + 5/2f);//나눠지는 수에 플롯, 소수점, 더블형을 붙이면 나온다.
		System.out.println("5/ 2.0 = " + 5/2.0);
		System.out.println("5/ (doble)2 = " +5/(double)2);
		System.out.println();
		
		System.out.println(1000000*1000000);//정수끼리의 곱은 정해진 비트공간보다 커지면 제대로 값이 나오지 않음
		System.out.println(1000000*1000000L);//그래서 롱타입 붙이고, 숫자 자체만으로 범위가 커지면 롱타입을 붇여야 함
		System.out.println(10000000000L);
		System.out.println();
		
		System.out.println("둘리의 나이는 " + 20 + "살 입니다.");
		System.out.println(20);
		System.out.println(""+20);
		System.out.println(20+20+"");
		System.out.println(""+20+20);

	}

}
