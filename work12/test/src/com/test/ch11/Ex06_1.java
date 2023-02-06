package com.test.ch11;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println(car.getMinspeed());
		System.out.println(Car.year);//static 접근은 인스턴스가 아닌 클래스명으로 하기

	}

}

class Car {
	private String name;
	static int year;
	private String color;
	private int maxSpeed;
	private int minSpeed;
	
	static{
		year = 10;
	}
	
	{
		this.minSpeed = 0;
	}
	
	Car(String name, String color, int maxSpeed, int minSpeed){
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public int getMinspeed() {
		return minSpeed;
	}
	
	public int getMaxspeed() {
		return maxSpeed;
	}
}

/*
문제 1.
정적 초기화 블록과 인스턴스 초기화 블록을 사용한 예제를 작성하세요.
문제 2.
정적 초기화 블럭에서는 인스턴스 변수를 사용할 수 없습니다.
이유를 설명하세요.
스태틱 블럭은 객체가 생성되기 이전에 수행되므로 인스턴스 멤버에 접근할 수 없어 인스턴스 변수를 생성할 수 없다.
*/