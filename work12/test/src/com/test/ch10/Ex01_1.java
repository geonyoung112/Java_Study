package com.test.ch10;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer(); // 아우터
		Outer.Inner i = o.new Inner();//이너
		i.method();
		
		System.out.println();
		System.out.println(o.value);
		System.out.println(i.value);
		
		
	}

}

class Outer{
	
	int value = 10;
	
	class Inner{
		 public final int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("value: " + value);
			System.out.println("this.value: " + this.value);
			System.out.println("Outer.this.value: " + Outer.this.value);
		}
	}
}

/*
class Outer{
	class InstanceInner{}
    static class StaticInner{}
    
    void myMethod(){
    	class LocalInner{}
    }
}
*/

/*
문제 1.
이너 클래스를 사용한 예제를 작성하세요: 실제 사용하는 것처럼 예시 작성하기
문제 2. o
아우터 클래스의 인스턴스 변수, 이너 클래스의 인스턴스 변수, 이너 크래스의 메소드내 지역 변수 모두 이름을 같게 설정하고 각각의 값을 출력하는 코드를 작성하세요.  
*/