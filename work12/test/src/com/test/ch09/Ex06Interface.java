package com.test.ch09;



public class Ex06Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book6 book1 = new Book6();
		book1.setTitle("자바 알고리즘");
		book1.setAuthor("엘컴퓨터학원");
		book1.setPrice(50000);
		
		EBook5 eb = new EBook5();
		eb.setTitle("자바 기본문법");
		eb.setAuthor("엘컴퓨터학원");
		eb.setPrice(30000);
		eb.setFontColor("블루");
		
		Car car = new Car();
		car.setModelName("소나타");
		car.setDoor(2);
		car.setTotalPrice(4000000);
		
		Cart2 cart = new Cart2();
		cart.add(book1);
		cart.add(eb);
		cart.add(car);
		
		OrderService orderService = new OrderService();
		orderService.order(cart);

		PrintService printService = null;
		printService = eb;
		printService.printInfo();
		
		printService = car;
		printService.printInfo();
		
		OrderService.orderPrint(eb);
		OrderService.orderPrint(car);
		
		//printServixe.setting();
		PrintServiceForPrinter pfp = car;
		pfp.setting();
		PrintServiceForPrinter.getPrinterType();
		pfp.setPrinter();
		pfp.printInfo();
		
		//printService = book1; 	//error - PrintServiceForPrinter를 구현하지 않음
		//printService.printInfo();
		
	}

}

/*interface & abstract의 차이
 * 추상 클래스는 public, protected, private 메소드를 가질 수 있다. 반면에 인터페이스는 public만 허용된다.
 * abstract는 부모 자식간의 이용 -> 자바는 다중속성이 불가능하고 하나의 부모만 가진다.
 * interface는 "특정 메소드를 이용하기" 위해 사용하고
 * 선언할땐 interface
 * 구현할땐 implements로 구현하고 클래스는 인터페이스를 여러개를 가져올 수 있음, 
 * 추상은 여러개를 가지지 못함
 * 공통점은 둘다 인스턴스를 생성하지 못한다.
 * 더불어 인터페이스는 인터페이스끼리 부모, 자식으로 받아 오는 것도 가능하다.
 * 만약 북이라는 부모가 아이템이라는 인터페이스를 받고있고 상속받은 이북이라는 자식이 있다면 굳이 implements를 작성하지 않아도 된다.
 * default를 이용해 나중에 메소드를 추가해도 자동으로 생성하는 기능도 있다.
 * 추상 클래스에는 멤버변수 선언이 가능하지만 인터페이스는 public static 변수만 선언이 가능하다.
 * 인터페이스는 implements 키워드로 여러 인터페이스를 구현있다. 반면에 추상클래스는 extends 키워드로 1개의 클래스만 상속받을 수 있다.
 */

//INTERFACE CLASS
interface OrderItem {
	public abstract String getOrderName();//추상으로 선언만
	public abstract int getOrderPrice();
	
}

interface PrintService { //인터페이스 부모
	public abstract void printInfo();
	
}

interface PrintServiceForPrinter extends PrintService { //인터페이스 자식
	public abstract void setting(); //자식이 가지는 메소드
	/*
	 * 만약 이 인터페이스를 가지는 100개의 클레스가 있다.
	 * 나중에 버전을 업데이트 하기 위해
	 * static으로 작성된 메소드를 수정한다면, 100개의 클래스 모두에게 오류가 난다. 
	 * 또한 하나하나 수정하면 개발 비용이 많이 든다.
	 * 그래서 이를 주의하고 보완하기 위해 "default"를 이용한다.
	 * default는 추가하고 싶은 메소드를 작성해 해당 인터페이스를 구현한 100개의 클래스에 자동으로 적용하는 것
	 */
	default public void setPrinter() { //default를 이용한 메소드 구현
		System.out.println("기본값: 1번 프린터"); 
	}
	
	public static void getPrinterType() {
		System.out.println("- 프린터 타입 -");
		System.out.println("레이저 프린터입니다.");
	}
}

//

class Cart2 {
	OrderItem[] items; //인터페이스를 이용해 배열생성가능
	int index;
	
	public Cart2() {
		items = new OrderItem[10];
		index = 0;
	}
	
	public void add(OrderItem item) {
		items[index] = item;
		index++;
	}
	
	public OrderItem[] get() {
		return items;
	}
}

class Book6 implements OrderItem {
	String title;
	String author;
	int price;
	
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
		return (int)(price*1.1f);
	}
	
	public void setPrice(int price) {
		if(!(price >= 0 && price <= 50000))
			return;
		this.price = price;
	}
	
	@Override 
	public String getOrderName() { //오버라이딩 후 메소드 내용 생성
		return getTitle();
	}
	
	@Override
	public int getOrderPrice() { //오버라이딩 후 메소드 내용 생성
		return getPrice();
		
	}
}



class EBook5 extends Book6 implements PrintService{ //부모를 상속받으면서 implements를 구현하기
		private String fontColor; //자식이 가지는 메소드
		
		public String getFontColor() {
			return fontColor;
		}
		
		public void setFontColor(String fontColor) {
			this.fontColor = fontColor;
		}
		
		@Override //Book 메소드 상속
		public void setTitle(String title) {
			super.setTitle("[e북]" + title);
			
		}
		
		@Override //Book 메소드 상속
		public int getPrice() {
			return (int)(price * 1.2f);
		}
		
		@Override  //OderItem 인터페이스
		public String getOrderName() {
			String title = getTitle() + ", 폰트" + getFontColor();
			return title;
			
		}

		
		@Override //OderItem 인터페이스
		public int getOrderPrice() {
			return getPrice();
			
		}
		
		@Override
		public void printInfo() { //PrintService 인터페이스 메소드 정의하기
			System.out.println("---e북---");
			System.out.println("책 이름: " + getTitle());
			System.out.println("저자: " + getAuthor());
			System.out.println("가격: " + getPrice());
			System.out.println("폰트색상: " + getFontColor());
			System.out.println("감사합니다.");
			System.out.println();
		}
		
		
}

class Car implements OrderItem, PrintServiceForPrinter {
	private String modelName;
	private int totalPrice;
	private int door;
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public int getDoor() {
		return door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	@Override //OderItem 인터페이스 메소드
	public String getOrderName() {
		return getModelName() + "[" + getDoor() + "도어]";
	}
	
	@Override //OderItem 인터페이스 메소드
	public int getOrderPrice() {
		return getTotalPrice();
	}
	
	@Override //PFP 인터페이스 메소드
	public void printInfo() { //상속받는 부모의 메소드 오버라이딩
		System.out.println("- 차량정보 -");
		System.out.println("모델명: " + getModelName());
		System.out.println("가격: " + getTotalPrice());
		System.out.println("Door: " + getDoor());
		System.out.println("프린터로 해당 정보가 전송되었습니다.");
		System.out.println();
	}

	@Override
	public void setting() { //자식인 PFP 인터페이스의 메소드
		System.out.println("- 프린터 설정 -");
		System.out.println("폰트 사이즈 9pt");
		System.out.println("5매 출력");
	}


	
	/*
	@Override
	public void setPrinter() {
		System.out.println("3번 프린터로 설정");
	}
	*/
}

class OrderService { // 카트에 담은 아이템을 출력하는 클래스
	public void order(Cart2 cart) {
		OrderItem[] items = cart.get();
		for(int i=0; i<items.length; i++) {
			if(items[i] == null)
				break;
			System.out.println("상품명: " +items[i].getOrderName() + "\n가격: " + items[i].getOrderPrice() + "\n주문 데이터베이스에 저장되었습니다.\n");
			
		}
	}
	public static void orderPrint(PrintService p) { // 인터페이스는 파라미터로 받아올 수 있음
		p.printInfo(); 
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