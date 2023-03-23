package com.test.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car5> cars = new ArrayList<>();
		cars.add(new Car5("기아", 1000));
		cars.add(new Car5("아우디", 200));
		cars.add(new Car5("BMW", 400));
		cars.add(new Car5("기아", 100));
		cars.add(new Car5("현대", 600));
		
		//문제 1.
		double avg = 
				cars
					.stream()
					.mapToInt(Car5::getPrice)
					.average()
					.getAsDouble();
		System.out.printf("%.0f원%n", avg);
		System.out.println();
		
		//문제 2.
		long max = 
				cars
					.stream()
					.mapToInt(Car5::getPrice)
					.max()
					.getAsInt();
		System.out.println(max);
		System.out.println();
		
		//문제 3.
		int tax =
				cars
					.stream()
					.mapToInt(Car5::getPrice)
					.reduce(0, (a,b) -> a+(int)(b*1.1f));
		System.out.println(tax);
		System.out.println();
		
		//문제 4.
		 List<String> list1 = new ArrayList<>(Arrays.asList("아우디", "기아"));
	     List<String> list2 = new ArrayList<>(Arrays.asList("현대", "도요타"));

	     List<String> list3 = Stream.concat(list1.stream(), list2.stream())
	                                       .collect(Collectors.toList());

	     System.out.println("List3: " + list3);
	     
	     //문제 4번 다른 방식
	     List<String> tmpList = list1.stream()
	             .collect(Collectors.toCollection(() -> list2));
	     System.out.println(tmpList);
	    
	     /*
	     List<String> tmpList = list1.stream()
	 	     	.collect(() -> list2, (a, b) -> a.add(b), ArrayList::addAll);
	 	 */
	     
	     //System.out.println(tmpList);
		

	}

}



/*
문제 1.
자동차 금액의 평균가를 출력하세요.
문제 2.
가장 높은 자동차의 금액을 출력하세요.
문제 3.
세금 10% 부가된 자동차 가격 총액을 출력하세요.
힌트) reduce를 사용하세요.
문제 4.
두 개의 리스트를 생성 후 collect를 사용하여 병합하세요.
병합된 리스트를 출력하세요.
*/