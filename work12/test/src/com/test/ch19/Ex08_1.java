package com.test.ch19;

import java.util.Optional;
import java.util.Scanner;

public class Ex08_1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("자동차 모델을 입력하세요 : ");
	        String model = scanner.nextLine();

	        System.out.print("자동차 가격을 입력하세요 : ");
	        int priceStr = scanner.nextInt();
	        
	        Optional<Car> car = Optional.ofNullable(new Car(model, priceStr));
	        System.out.println(car.orElse(new Car("미입력차량", 0)));
	       
	    }
	}

	class Car {
	    private String model;
	    private int price;

	    public Car(String model, int price) {
	        this.model = model;
	        this.price = price;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getPrice() {
	        return price;
	    }

	    @Override
	    public String toString() {
	        return "Car [model=" + model + ", price=" + price + "]";
	    }
	}

		
/*
문제 1.
모델과 가격을 입력 받은 자동차 정보를 이용해 인스턴스를 생성하세요.
인스턴스의 toString을 이용해 자동차의 정보를 출력하세요.
정보가 미입력 될 경우 참조변수에 null이 저장되어야 합니다.
옵셔널을 사용해 미입력된 자동차일 경우 '미입력차량'을 출력하세요.
문제 2.
옵셔널과 맵을 사용해 자동차의 금액을 출력하되 자동차의 금액이 없을 경우 1이 출력되도록 코딩하세요. 
*/
