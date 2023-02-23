package com.test.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen("연필1", 2000);
		Pen p2 = new Pen("연필2", 3000);
		Pen p3 = new Pen("연필3", 4000);
		
		Box<Pen> box = new Box<Pen>();
		box.add(p1);
		box.add(p2);
		box.add(p3);
		box.printAllItems();
		System.out.println();
		
		Tv t1 = new Tv("삼성TV", 10000);
		Tv t2 = new Tv("엘지TV", 20000);
		
		Box<Tv> box2 = new Box<Tv>();
		box2.add(t1);
		box2.add(t2);
		box2.printAllItems();


	}

}

class Pen{
	private String name;
	private int price;
	
	public Pen(String name, int number) {
		this.name = name;
		this.price = number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return price;
	}
	
	@Override 
	public String toString() {
		return "Pen [name=" + name + ", number=" + price + "]";
	}
}

class Tv{
	private String brand;
	private int score;
	
	public Tv (String brand, int score) {
		this.brand = brand;
		this.score = score;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override 
	public String toString() {
		return "Tv [brand=" + brand + ", score=" + score + "]";
	}
}

class Box<T> {
	private List<T> items;
	
	public Box() {
		items = new ArrayList<T>();
	}
	
	public Box(T[] arr) {
		items = new ArrayList<T>(Arrays.asList(arr));
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	public T get(int index) {
		return items.get(index);
	}
	
	public void printAllItems() {
		for (T item : items) {
			System.out.println(item);
		}
	}
}
/*
문제 1.
상자에 연필과 티비를 담는 프로그램을 코딩하세요.
상자에는 연필, 티비 외에 어떠한 타입도 받을 수 있도록 타입 파라미터를 사용하세요. 
*/