package com.test.ch19;

import java.util.HashMap;
import java.util.Map;

public class Ex02_1 {
	public static void main(String[] args) {
		Map<String, Car2> allCars = CarService.getcarMap();
		Map<String, Car2> filteredCars = null;
		
		System.out.println("< 차량 출입 시간이 5시에서 9시 사이인 차량만 출력 >");
		filteredCars = CarService.filter(allCars, c -> c.getTime() >5 && c.getTime() < 9);
		CarService.printCars(filteredCars);
	}
}


@FunctionalInterface
interface CarFilter {
    public abstract boolean test(Car2 car);
}

class CarService {
	private static Map<String, Car2> carMap;
	
	static {
		carMap = new HashMap<>();
		CarService.add("가2356", new Car2("가2356", 6));
		CarService.add("바5455", new Car2("바5455", 7));
		CarService.add("사3355", new Car2("사3355", 5));
		CarService.add("다7777", new Car2("다7777", 8));
		CarService.add("바8888", new Car2("바8888", 3));
	}
	
	public static Map<String, Car2> getcarMap() {
		return carMap;
	}
	
	public static void add(String id, Car2 car) {
		carMap.put(id, car);
	}
	
	public static Map<String, Car2> filter(Map<String, Car2>cars, CarFilter c) {
		Map<String, Car2> filteredCars = new HashMap<>();
		
		for (Map.Entry<String, Car2> entry : cars.entrySet()) {
			if (c.test(entry.getValue())) {
				filteredCars.put(entry.getKey(), entry.getValue());
			}
		}
		
		return filteredCars;
	}
	
	public static void printCars(Map<String, Car2> cars) {
		for (Map.Entry<String, Car2> entry : cars.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
class Car2 {
	private String id;
	private int time;
	public Car2(String id, int time) {
		this.id = id;
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public int getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "Car[id=" + id + ", time=" + time + "]";
	}	
}
/*
문제 2.
차량 출입 시간이 5시에서 9시 사이인 차량만 출력하는 프로그램을 코딩하세요.
위 회원 검색 프로그램과 같이 함수형 인터페이스를 작성하고 람다식을 사용해야 합니다.  
*/