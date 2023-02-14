package com.test.ch13;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("벤츠", 3000);
		Car c2 = new Car("벤츠", 3000);
		Car c3 = new Car("아반떼", 3000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		
		System.out.println();
		
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c2.equals(c3));
		
		
		

	}

}
class Car{
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		Car car = (Car)obj;
		
		return name.equals(car.name) && price == car.price ;
	}
	
	@Override
	public String toString() {
		return "Car[name = " + name + ", price = " + price + "]";
	}
}


/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
equals 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 true 를 반환하도록 코딩하세요. 
*/
