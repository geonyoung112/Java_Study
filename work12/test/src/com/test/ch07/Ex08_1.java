package com.test.ch07;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carInfo car = new carInfo();
		car.setInfo("제네시스",200,"현대");
		System.out.println(car.getInfo());
		
		car.setInfo("bmw",500,"BMW");
		System.out.println(car.getInfo());

	}

}

class carInfo {
	String name;
	String company;
	int speed;
	
	void setInfo(String name, int speed, String company) {
		this.name = name;
		this.company = company;
		this.speed = speed;
		
	}
	
	String getInfo() {
		return "자동차 이름: " + name + "\n최대속도: " + speed + "\n회사: " + company + "\n";
	}
	
	
}
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.
문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/