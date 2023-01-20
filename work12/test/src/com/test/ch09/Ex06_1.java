package com.test.ch09;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Stock {
	public abstract String getStockName();
	public abstract int getStockPrice();
	public abstract String getIn();
	public abstract String getOut();
}

class Store {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	

}

class NoteBook extends Store implements Stock{
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override // store 
	public void setName(String name) {
		super.setName("[노트북]" + name);
	}
	
	@Override
	public String getStockName() {
		return getStockName();
	}
	
	@Override
	public int getStockPrice() {
		return getStockPrice();
	}
	
	@Override 
	public String getIn() {
		return getIn();
	}
	
	@Override
	public String getOut() {
		return getOut();
	}
}
/*
문제 1. //프린트인터페이스 생성, 재고 인터 메소드 내용 작성
상품들을 창고에 저장하고 창고에 저장된 상품들을 출력하세요.
창고에 저장될 재고의 정보는 상품명, 가격, 입고일자(String), 출고일자(String) 입니다.
모든 상품이 재고 정보를 가지고 있지 않고 재고 인터페이스를 구현한 상품은 재고 정보를 가지고 있습니다.
재고 인터페이스를 구현한 상품만 창고에 저장이 가능하도록 구현하세요.
힌트) 창고 클래스, 재고 인터페이스, 재고 인터페이스가 적용된 상품 클래스들, 재고들이 저장될 배열 등이 필요합니다.  
*/