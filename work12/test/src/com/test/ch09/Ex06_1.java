package com.test.ch09;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p = new Phone();
		p.setName("휴대폰");
		p.setBrand("애플");
		p.setPrice(1000000);
		
		
		Iphone i = new Iphone ();
		i.setName("아이폰 10");
		i.setBrand("애플");
		i.setPrice(1500000);
		
		Iphonepro pro = new Iphonepro();
		pro.setName("모니터");
		pro.setBrand("애플");
		pro.setPrice(1800000);
		
		Warehouse house = new Warehouse();
		house.add(i);
		
		StockService sts = new StockService();
		sts.stock(house);
		
		Print print = null;
		print = p;
		print.printInfo();
		print = i;
		print.printInfo();
		print = pro;
		print.printInfo();

	}

}

interface Stock {
	public abstract String getStockName();
	public abstract int getStockPrice();
	//인터페이스에서 getter, setter 정의하는 법 질문하기
	public abstract String getIn();
	public abstract String getOut();
}

interface Print{ 
	public abstract void printInfo();
	
}

class Phone implements Print{
	private String name;
	private int price;
	private String brand;

	
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
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	@Override
	public void printInfo() { 
		System.out.println("---폰---");
		System.out.println("상품명: " + getName());
		System.out.println("브랜드: " + getBrand());
		System.out.println("평균 가격: " + getPrice()+ "원");
		System.out.println();
	}

}

class Iphone extends Phone implements Stock, Print {
	
	//인터페이스에서 getter, setter 정의하는 법 
	@Override 
	public String getIn() {
		return "10일 전";
	}
	
	@Override
	public String getOut() {
		return "5일 후";
	}
	
	@Override
	public void printInfo() { 
		System.out.println("---아이폰 10---");
		System.out.println("상품명: " + getName());
		System.out.println("브랜드: " + getBrand());
		System.out.println("가격: " + getPrice()+ "원");
		System.out.println("입고일자: " + getIn());
		System.out.println("줄고일자: " + getOut());
		System.out.println();
	}

	@Override
	public String getStockName() {
		return getName();
	}

	@Override
	public int getStockPrice() {
		return getPrice();
	}
}


class Iphonepro extends Phone implements Print{
private String brand;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void setName(String name) {
		super.setName("[노트북]" + name);
	}
	
	@Override
	public void printInfo() { 
		System.out.println("---아이폰 프로---");
		System.out.println("상품명: " + getName());
		System.out.println("종류: " + getBrand());
		System.out.println("가격: " + getPrice()+ "원");
		System.out.println();
	}
}

class Warehouse{
	Stock[] stocks;
	int index;
	
	public Warehouse() {
		stocks = new Stock[10];
		index = 0;
	}
	
	public void add (Stock stock) {
		stocks[index] = stock;
		index++;
	}
	
	public Stock[] get() {
		return stocks;
	}
}

class StockService {
	public void stock(Warehouse house) {
		System.out.println("--재고 현황--");
		Stock[] stocks = house.get();
		for(int i=0; i<stocks.length; i++) {
			if(stocks[i] == null)
				break;
			System.out.println("상품명: " + stocks[i].getStockName() + "\n가격: " + stocks[i].getStockPrice() + "\n해당 재고가 창고에 저장되었습니다.\n");
				
		}
	}
}


/*
문제 1.
상품들을 창고에 저장하고 창고에 저장된 상품들을 출력하세요.
창고에 저장될 재고의 정보는 상품명, 가격, 입고일자(String), 출고일자(String) 입니다.
모든 상품이 재고 정보를 가지고 있지 않고 재고 인터페이스를 구현한 상품은 재고 정보를 가지고 있습니다.
재고 인터페이스를 구현한 상품만 창고에 저장이 가능하도록 구현하세요.
힌트) 창고 클래스, 재고 인터페이스, 재고 인터페이스가 적용된 상품 클래스들, 재고들이 저장될 배열 등이 필요합니다.  
*/