package com.test.ch10;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album al = new Album();
		al.setTitle("사건의 지평선");
		al.setSinger("윤하");
		al.setPrice(40000);
		// "int price = " 작성하기 않아도 된다. price를 사용하지 않기 때문에 그냥 정의 가능
		Album.Shippingfee.getShippingfee(40000, Album.Shippingfee.JEJU);
		al.print();

	}

}
class Album {
	private String title;
	private String singer;
	public int price;
	
	static class Shippingfee {
		private static int fee;
		public static final int SEOUL = 1;
		public static final int GANGWONDO = 2;
		public static final int JEJU = 3;
		private static int total;
		
		static int getShippingfee(int price, int korea) {
			switch(korea) {
			case SEOUL:
				fee = 4000;
				break;
			case GANGWONDO:
				fee = 5000;
				break;
			case JEJU:
				fee = 6000;
				break;
			default:
				fee = 3500;
				
			}
			return total = (int)(price + fee);
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;

	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("앨범 제목: " + title);
		System.out.println("가수: " + singer);
		System.out.println("가격: " + this.price);
		System.out.println("배송비 포함 가격: " + Shippingfee.total);
		
	}
}
/*
문제 1.
static 중첩 클래스를 사용한 예제를 작성하세요.
*/