package com.test.ch19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_1 {

	public static void main(String[] args) {
		//문제 1.
		Stream<String> stream = Stream.of("가", "나", "다");
		stream.forEach(str -> System.out.print(str + ", "));
		System.out.println("\n");
		
		//문제 2.
		IntStream intStream = new Random()
				.ints(1, 101)
				.limit(10);
			intStream.forEach(System.out::println);
			System.out.println();
		//문제 3. 
		List<Car5> cars = new ArrayList<>();
		cars.add(new Car5("기아", 1000));
		cars.add(new Car5("아우디", 200));
		cars.add(new Car5("BMW", 400));
		cars.add(new Car5("기아", 100));
		cars.add(new Car5("현대", 600));
		
		cars.stream()
	       .filter(car -> car.getPrice() > 500)
	       .forEach(System.out::println);
		System.out.println();
		
		//문제 4.
		cars.stream()
	       .map(Car5::getName)
	       .distinct()
	       .forEach(System.out::println);
		System.out.println();
		
		//문제 5.
		cars.stream()
	       .mapToInt(Car5::getPrice)
	       .limit(3)
	       .forEach(System.out::println);
		System.out.println();
		
		//문제 6.
		cars.stream()
	       .map(Car5::getName)
	       .flatMapToInt(CharSequence::chars)
	       .distinct()
	       .sorted()
	       .forEach(c -> System.out.print((char)c + " "));
		System.out.println();
		
		//문제 7.
		cars.stream()
	       .filter(car -> car.getName().equals("아우디"))
	       .forEach(System.out::println);
		
	}

}

class Car5 {
	private String name;
	private int price;
	
	public Car5(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Car{" +"name=" + name + ", price=" + price + '}';
	}
}
/*
문제 1.
스트림에 '가', '나', '다' 를 추가하는 코드를 작성하세요.
문제 2.
스트림을 사용하여 1~100 사이의 숫자 중 난수 10개를 출력하세요.
문제 3.
자동차 인스턴스 5개를 가진 배열을 만들고 스트림으로 변환하세요.
500원 보다 비싼 차량들을 출력하세요.
문제 4.
자동차 이름을 중복 제거 후 출력하세요.
문제 5.
자동차 인스턴스로 이뤄진 스트림을 자동차 금액들로만 이뤈진 스트림으로 변환 후 3개만 출력하세요.
문제 6.
스트림에 저장된 자동차명의 모든 글자를 나누어 한 글자씩 출력하되 오름차순으로 정렬하여 출력하세요.
힌트) flatMap, sorted 를 사용하세요.
문제 7.
스트림에서 특정 차량이름을 검색하여 출력하세요.
*/
