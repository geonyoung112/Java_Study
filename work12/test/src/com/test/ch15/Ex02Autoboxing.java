package com.test.ch15;

public class Ex02Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * autoBoxing이란?
		 * 원시 타입의 값을 해당하는 wrapper 클래스의 객체로 바꾸는 과정을 의미
		 * 
		 * unBoxing이란?
		 * Wrapper 클래스 타입을 원시 타입으로 변환하는 과정의 의미
		 * ex) Integer -> int
		 * 자바 컴파일러는 원시타입이 아래 두 가지 경우에 해당될 때 unBoxing을 적용한다.
		 * Wrapper 클래스 타입이 원시 타입의 파라미터를 받는 메서드를 통과할 때
		 * Wrapper 클래스 타입이 원시 타입의 변수로 할당될 때
		 * 
		 * 박싱 된 기본 타입보다는 기본 타입을 사용하기
		 * 기본 타입과 박싱 된 타입의 차이
		 * 1. 기본 타입은 값만 가지고 있지만 박싱 된 타입은 값 + 식별성이라는 속성을 갖는다.
		 * 즉 박싱된 타입의 두 인스턴스는 값이 같아도 다르다고 식별될 수 있다.
		 * 2. 기본 타입의 값은 NULL을 허용하지만 박싱된 타입은 허용하지 않는다.
		 * 3. 기본 타입이 박싱된 타입보다 시간과 메모리 사용면에서 효율적이다.
		 */
		Integer intg = 3;
		System.out.println(intg); //스트링 타입이 아님 +7을 했을때 37이 아닌 10으로 연산되어 출력되기 때문
		
		Integer intg2 = Integer.valueOf(3); 
		System.out.println(intg2.intValue()); //참조->기본(int)로 자동변롼되는 과정: Boxing
		
		System.out.println();
		
		Integer intg3 = intg + intg2;
		System.out.println(intg3);
		
		Integer intg4 = Integer.valueOf(intg.intValue() + intg2.intValue());
		System.out.println(intg4.intValue()); //참조->기본(int)로 자동변롼되는 과정: Boxing
		
		System.out.println();
		
		int i = intg;
		System.out.println(i);
		
		int i2 = intg.intValue(); //unBoxing 과정
		System.out.println(i2); 
		
		System.out.println();
		
		System.out.println(intg + 7);
		System.out.println(intg.intValue() + 7); //unBoxing 과정
		
		System.out.println();
		
		double d = (Double)3.14;
		System.out.println(d);
		
		double d2 = Double.valueOf(3.14).doubleValue(); //과정
		System.out.println(d2);
		
		System.out.println();
		
		Object obj = (Object)3.14;
		System.out.println(obj);
		
		Object obj2 = (Object)Double.valueOf(3.14); //과정
		System.out.println(obj2);

	}

}
/*
문제 1.
Integer intgA = 3;
Integer intgB = 7;
int sum = intgA + intgB;
위 내용을 오토박싱과 오토언박싱이 필요 없는 코드로 수정하세요.
*/