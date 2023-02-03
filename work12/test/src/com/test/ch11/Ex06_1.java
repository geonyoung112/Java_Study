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
	
	Car(String name, int year, String color, int maxSpeed, int minSpeed){
		this.name = name;
		this.year = year;
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
