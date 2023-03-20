package com.test.ch19;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("< BiPredicate >");
		BiPredicate<Integer, Integer> sum = (a, b) -> (a + b) % 2 == 0;
		System.out.println(sum.test(4, 5));
		System.out.println();
		
		System.out.println("< BinaryOperator >");
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(1, 2));
		System.out.println();
		
		/*
		 * BinaryOperator는 인수 2 개를 받아, 인수와 같은 타입의 값을 리턴하는 함수를 의미한다.
		 * 입력 인수와 반환값의 타입이 같다.
		 * 두 인수는 타입이 같아야 한다.
		 */
		
		System.out.println("< IntConsumer >");
		IntConsumer i = x -> System.out.println(x * x);
		i.accept(4);
		System.out.println();
		
		System.out.println("< IntFunction >");
		IntFunction<String> i2 = x -> Integer.toString(x);
		System.out.println(i2.apply(123));
		System.out.println();
		
		System.out.println("< IntPredicate >");
		IntPredicate i3 = x -> x > 0;
		System.out.println(i3.test(5));
		System.out.println();
		//IntPredicate는 인자로 전달된 정수값을 입력으로 받아 true 또는 false 값을 반환
		
		System.out.println("< IntUnaryOperator >");
		IntUnaryOperator i4 = x -> x * x;
		System.out.println(i4.applyAsInt(5));
		System.out.println();
		// IntUnaryOperator: 입력받은 int 값을 받아서, int 값을 리턴하는 함수형 인터페이스
		// applyAsInt 메서드를 오버라이딩하여 사용

		System.out.println("< IntBinaryOperator >");
		IntBinaryOperator i5 = (x, y) -> x + y;
		System.out.println(i5.applyAsInt(5, 3)); 
		System.out.println();
		// IntBinaryOperator: 입력받은 int 값을 2개 받아서, int 값을 리턴하는 함수형 인터페이스
		// applyAsInt 메서드를 오버라이딩하여 사용
		
		System.out.println("< IntToDoubleFunction >");
		IntToDoubleFunction i6 = x -> x / 2.0;
		System.out.println(i6.applyAsDouble(9));
		System.out.println();
		// IntToDoubleFunction: 입력받은 int 값을 받아서, double 값을 리턴하는 함수형 인터페이스
		// applyAsDouble 메서드를 오버라이딩하여 사용
		
		System.out.println("< ToIntFunction >");
		ToIntFunction<String> strToInt = str -> Integer.parseInt(str);
		System.out.println(strToInt.applyAsInt("123"));
		System.out.println();
		// ToIntFunction: 입력받은 객체를 받아서, int 값을 리턴하는 함수형 인터페이스
		// applyAsInt 메서드를 오버라이딩하여 사용
		
		System.out.println("< ToIntBiFunction >");
		ToIntBiFunction<String, Integer> ToInt = (str, num) -> str.length() + num;
		System.out.println(ToInt.applyAsInt("Hello", 3));
		System.out.println();
		// ToIntBiFunction: 입력받은 2개의 객체를 받아서, int 값을 리턴하는 함수형 인터페이스
		// applyAsInt 메서드를 오버라이딩하여 사용
	}

}


/*
문제 1.
BiPredicate
BinaryOperator
IntConsumer
IntFunction
IntPredicate
IntUnaryOperator
IntBinaryOperator
IntToDoubleFunction
ToIntFunction
ToIntBiFunction
위 함수형 인터페이스들을 이용해 람다식을 작성하고 출력하세요. 
*/