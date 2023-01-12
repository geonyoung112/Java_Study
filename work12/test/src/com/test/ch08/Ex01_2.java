package com.test.ch08;

public class Ex01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.price =200000;
		System.out.println("자동차 가격(세금포함): " + car.getPrice() +"원");
		
		System.out.println();
		
		Sonata so = new Sonata();
		so.price = 10000000;
		System.out.println("자동차 가격(세금포함): " + so.getPrice() +"원");
		String[] thing = {"기어","브레이크","에어컨"};
		so.sonatathing = thing;
		so.printsonata();
		
		System.out.println();
		
		Benz b = new Benz();
		b.price = 20000000;
		System.out.println("자동차 가격(세금포함): " + b.getPrice() +"원");
		String[] thing2 = {"안전장치","히터", "거울"};
		b.benzthing = thing2;
		b.printbenz();
	}

}
class Car {
	String name;
	int price;
	
	int getPrice() {
		int taxPrice = (int)(price *1.1);
		return taxPrice;
	}
}

class Sonata extends Car {
	String[]  sonatathing;
	
	void printsonata() {
		System.out.println("----소나타의 기능----");
		for(int i=0; i<sonatathing.length; i++) {
			System.out.println("기능" + (i+1) + ":" + sonatathing[i]);
		}
	}
}

class Benz extends Car {
	String[] benzthing;
	
	void printbenz() {
		System.out.println("----벤츠의 기능-----");
		for(int i=0; i<benzthing.length; i++) {
			System.out.println("기능" + (i+1) + ":" + benzthing[i]);
		}
	}
	
}