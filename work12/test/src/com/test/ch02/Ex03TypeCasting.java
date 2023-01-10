package com.test.ch02;

public class Ex03TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.14; //변수를 선언하고 연산을 하는 경우도 같다
		System.out.println("double d = " + d);
		
		float f = 3.14f;
		System.out.println("float f = " + f);
		float ff = (float)3.14;
		System.out.println("float ff = " + f);
		
		double d2 = 7.12f;
		System.out.println("double d2 = " + d2 );
		
		int i = 5;
		int i2 = 2;
		System.out.println(i + "/" + i2 + "=" + i/i2);
		System.out.println(i + "/" + i2 + "=" + i/(float)i2);
		System.out.println(i + "/" + i2 + "=" + i/(double)i2);
		
		float fff = 3.14f;
		int ii =(int)fff;
		System.out.println("int ii = " + ii);
		
		int i3 = 7;
		long l = i3;
		System.out.println("long은 int를 저장할 수 있습니다: l=" +l);
		System.out.println("int는 long을 저장할 수 없습니다.");
		
		long l2 = 1000000000L;
		System.out.println("long l2 = " + l2 );
		
		float f2 = l2;
		System.out.printf("float f2 = %f%n", f2);
		double d3 = l2;
		System.out.printf("double d3 = %f%n", d3);
		
		String name = "들리";
		int age = 20;
		char bloodType = 'A';
		float height = 203.7f;
		System.out.println(name + "의 나이는 " + age + "살이고 혈액형은 " +  bloodType + "형이며 키는 " + height + "cm입니다.");
		
		//여기서 중요한 점은 실수는 무조건 정주보다 큰 범위다.
		//큰 범위인 타입에 작은 타입을 넣는 것은 형변환이 필요없다.
		//하지만 작은 타입에 큰 타입을 넣는 경우
		//예를 들어 실수에 정수를 입력하는 경우
		//long i = 100L
		//int b = (int) i
		//로 형변환 해야만 함
	
	}

}
