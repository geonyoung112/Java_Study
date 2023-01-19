package com.test.ch09;


public class Ex04Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		Product p2 = p;
		System.out.println(p.equalsProduct(p2));//true
		
		
		Book4 b1 = new Book4();
		b1.setTitle("자바 자료구조1");
		b1.setAuthor("엘컴퓨터학원");
		b1.setPrice(30000);
		
		Book4 b2 = new Book4();
		b2.setTitle("자바 자료구조2");
		b2.setAuthor("엘컴퓨터학원");
		b2.setPrice(40000);
		
		Book4 b3 = new Book4();
		b3.setTitle("자바 자료구조");
		b3.setAuthor("엘코딩랩");
		b3.setPrice(50000);
		
		System.out.println(b1.equalsProduct(b2));
		System.out.println(b1.equalsProduct(b3));//같다면 true, 다르면 false

		Book4 resultBook = (Book4)b1.compareProduct(b2); 
		System.out.println(resultBook.getTitle());
		// 그냥 b1.compareProduct(b2)로 불러낼수 있지만 이경우 오버라이딩을 사용해서 부모에 없는 gettitle, settitle을 가져오지 못한다.
		//그래서 임의의 인스턴스를 생성하고 다운캐스팅을 해서 title을 불러내야한다.
		//다운캐스팅을 이용하는 과정이 복잡하지만 이를 사용하는 이유는 객체클래스를 사용해서 부모에 없는 메소드를 자식에게서 불러오는 상황이 있기 때문이다.
		

	}

}

class Product {
	
	public boolean equalsProduct(Product p) {
		return this == p;
	}
	
	public Product compareProduct(Product p) {
		return null;
	}
	
	
}

class Book4 extends Product {
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equalsProduct(Product p) {
		if (!(p instanceof Book4)) //p가 Book4로 instance of로 형변환이 가능한지 먼저 확인하기 (instance 기본값: true)
			return false;//불가능하다면 멈춘다
		
		Book4 book = (Book4)p;
		boolean result = title.equals(book.title) && author.equals(book.author);
		
		return result;
	}

	
	@Override
	public Product compareProduct (Product p) {
		if (!(p instanceof Book4)) return null;
		
		Book4 b = (Book4)p;
		return this.getPrice() > b.getPrice() ? this : b;			
	}
	/*에러가 난 이유: 보통 부모에 없는 메소드를 자식에게 받기 위해 다운캐스팅을 하는데
	 * 다운캐스팅을 하지 않음
	 * int 타입으로 받으면 숫자만 받지 부모객체 자체를 받아서 사용할 순 없다.
	 * 그래서 product 작성
	 * 또한 다운캐스팅의 경우 instanceof로 형변환이 가능한지 확인해주기
	 * 그리고 다운캐스팅을 한다
	 * 이어 삼항연산자를 이용해서 비교값을 출력하기 
	 * 또한 price 자체로 메소드를 사용하는 건 이제 어려움 
	 * private price이기 때문에 접근하는 것을 막아서 보통 get, set "캡슐화"를 이용해 사용하자
	 */

}

/*
문제 1. 
Product 클래스에 두 인스턴스간의 크기를 비교하는 메소드인 compareProduct 메소드를 추가하세요.
Book4 클래스에 compareProduct 메소드를 오버라이딩 후 가격이 높은 책의 인스턴스를 반환하도록 코딩하세요.
반환된 인스턴스의 title을 출력하세요. 
*/
