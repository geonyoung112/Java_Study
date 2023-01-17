/**
 * 
 */
package com.test.ch08;

import java.util.Calendar;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.floor;
/**
 * @author l5-morning
 *
 */
public class Ex08Import {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date d =  new java.util.Date();
		System.out.println(d.toString());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		
		System.out.println(PI);
		System.out.println(random());
		System.out.println(round(3.14));
		System.out.println(floor(PI));
	}

}

/*
 * import 사용
 * 현재 우리가 사용하는 syso, scan, String 등은 기존 자바 lang에 있는 것을 자동으로 사용하고 있다.
 * 만약 math, calendar를 사용하고 싶으면 공식문서를 참고해 import하면 된다.
 * 또한, 불어온 메소드를 클래스네임이 길어 중복해서 작성하기 싫다면 클래스까지 선언하면 된다.
 */

/*
문제 1.
Math.floor() 메소드를 사용하여 PI의 정수값만 출력하세요.
Math.floor() 메소드에 import static 을 적용하세요. 
*/