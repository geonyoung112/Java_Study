package com.test.ch15;

import java.util.Scanner;

public class Ex01WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WrapperClass는 Primitive type 변수를 감싸는 것
		 * 자바에서 사용되는 원천타입의 데이터를 서로 형 변환이 가능하도록 지원해주는 Class로써, 원찬타입의 자료형들을 Class화 한것이다.
		 * 사용이유: 형변환과 비교연산을 하기 위해서
		 * 
		 * 1. 기본형(Primitive type)은 8가지 기본적인 자료형 이들은 실제 값을 직접 저장하는 공간으로 Stack 영역에 저장된다.
		 * Primitive type 은 모두 스택에 그외 static 이 붙지 않은 건 다 heap에 저장된다. 
		 * 변수에 static이 붙는경우는 static 영역에 저장된다.
		 * 
		 * 2. 참조형은 기본 타입을 제외한 모든 자료형 주소 값을 저장하는 공간으로 Heap 영역에 저장된다.
		 * 구별: 자바에서 참조형에는 생성 시 new 키워드가 반드시 함께 쓰인다.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 7을 입력하세요: ");
		String str = s.nextLine();
		String str2 = str + 10; //그냥 스트링으로 출력
		System.out.println(str2);
		
		int i = Integer.parseInt(str); //인트타입으로 받아오는 방법(기본형<->기본형)
		int i2 = i+10;
		System.out.println(i2);
		System.out.println();
		
		Integer intg1 = Integer.valueOf(i);//인트타입으로 변환되지만 참조형으로 변환 (기본형 -> 참조형)
		System.out.println(intg1.intValue());
		System.out.println(intg1.compareTo(Integer.valueOf(5))); //5라는 기본형을 잠조형으로 바꿔야 compareTo가 실행
		System.out.println(intg1.compareTo(Integer.valueOf(20)));
		System.out.println(intg1.compareTo(Integer.valueOf(7)));
		System.out.println();
		
		Integer intg2 = Integer.valueOf(22);
		System.out.println(intg1.intValue());//인테저 밸류는 해쉬코드도 값이 똑같이 생성된다.
		System.out.println(intg1.hashCode());
		System.out.println(System.identityHashCode(intg1));
		System.out.println(intg2.intValue());
		System.out.println(intg2.hashCode());
		System.out.println(System.identityHashCode(intg2));
		System.out.println();
		
		System.out.println(intg1.equals(intg2));
		System.out.println(intg1.equals(Integer.valueOf(7)));
		System.out.println();
		
		System.out.println(Integer.max(intg1, intg2)); //연산시에도 인테져 사용
		System.out.println(Integer.min(intg1, intg2));
		System.out.println(Integer.sum(intg1, intg2));
		System.out.println();
		
		System.out.println(intg2.intValue() + 777);
		System.out.println(intg2.toString() + 777); //문자로 출력 연산되지 않음 
		System.out.println();
		
		String str3 = "3.14";
		System.out.println(str3 + 0.01);//문자로 출력
		System.out.println(Double.parseDouble(str3) + 0.01); //더블타입도 인트랑 같음
		Double objpi = Double.valueOf(3.14);
		double pi = objpi.doubleValue(); //참조형으로 변환되기 때문에 호풀시 더블밸류 적어야함
		System.out.println(pi);
		System.out.println();
		
		
		
		

	}

}

/*
문제 1.
int a = 3;
int b = 7;
Integer intgA;
Integer intgB;
a와 b의 값을 갖는 intgA, intgB를 코딩하세요.
문제 2.
intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.
문제 3.
intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.
문제 4.
intgA 와 intgB의 최소값과 최대값을 구하세요.
힌트) max, min을 사용하세요.
*/
