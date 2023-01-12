package com.test.ch08;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe cafe = new Cafe();
		cafe.price = 5000;
		System.out.println("음료 평균 가격(세금포함): " + cafe.getPrice() + "원");
		
		System.out.println();
		
		Coffee coffee = new Coffee();
		coffee.price = 3000;
		System.out.println("커피 평균 가격(세금포함): " + coffee.getPrice() + "원");
		String[] menu = {"카페라떼","에스프레소","바닐라라떼"};
		coffee.coffeemenu = menu;
		coffee.printcoffee();
		
		System.out.println();
		
		Smoothie smoothie = new Smoothie();
		smoothie.price = 6000;
		System.out.println("스무디 평균 가격(세금포함): " + smoothie.getPrice() + "원");
		String[] menu2 = {"딸기스무디","율무스무디","블루베리스무디"};
		smoothie.smoothiemenu= menu2;
		smoothie.printsmoothie();

	}

}

class Cafe {
	String name;
	int price;
	
	int getPrice() {
		int taxPrice = (int)(price *1.1);
		return taxPrice;
	}
}

class Coffee extends Cafe {
	String[] coffeemenu;
	
	void printcoffee() {
		System.out.println("----커피메뉴----");
		for(int i = 0; i<coffeemenu.length; i++) {
			System.out.println("메뉴" +(i+1) + ":" + coffeemenu[i]);
		}
	}
}

class Smoothie extends Cafe {
	String[] smoothiemenu;
	
	void printsmoothie() {
		System.out.println("----스무디 메뉴----");
		for(int i=0; i<smoothiemenu.length; i++) {
			System.out.println("메뉴" +(i+1) + ":" + smoothiemenu[i]);
		}
	}
	
	
}

/*내가 작성한 클래서는 부모 자식 클래스는 맞지만
is 상속이 아닌 HAS상속 관계이다.
즉, IS는 ~~이다. 라는 의미인데
예시로 소나타는 자동차이다.
볼펜은 펜이다.라는 것들인데 위의 예시는 커피가 카페는 아니다.
바꾸려면 커피는 티이다. 이러식으로 작성해야 IS 관계가 된다.
*/

/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/