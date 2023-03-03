package com.test.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrMenus = { "짜장면", "짬뽕", "된장찌개", "김치찌개", "탕수육" };

		Customer c1 = new Customer("A");
		c1.addMenu("짜장면");
		c1.addMenu("짬뽕");
		
		Customer c2 = new Customer("B");
		c2.addMenu("짜장면");
		c2.addMenu("탕수육");
		
		Customer c3 = new Customer("C");
		c3.addMenu("짜장면");
		c3.addMenu("김치찌개");
		
		El el = new El();
		el.SetCustomers(c1, c2, c3);
		
		System.out.println("- 엘컴퓨터식당 메뉴 -");
		el.setMenus(arrMenus);
		Set<String> Menus = el.getMenus();
		Course.print(Menus);
		
		System.out.println("- 손님들이 시킨 모든 메뉴 (합집합) -");
		Set<String> rMenus = el.getRegisteredMenus();
		El.print(rMenus);
		
		System.out.println("- 모든 손님들이 시킨 메뉴 (교집합) -");
		Set<String> bMenus = el.getBasicMenus();
		El.print(bMenus);
		
		System.out.println("- 모든 손님들이 시키지 않은 메뉴 (여집합) -");
		Set<String> cMenus = el.getCanceledMenus();
		El.print(cMenus);

	}

}

class El {
	private Set<String> menus;
	private List<Customer> customers;
	
	public void SetCustomers(Customer...arrCustomer) {
		customers = new ArrayList<>();
		Collections.addAll(customers, arrCustomer);
	}
	
	public List<Customer> getStudents() {
		return customers;
	}
	
	public void setMenus(String[] arrMenus) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, arrMenus);
		menus = new HashSet<>(list);
	}
	
	public Set<String> getMenus() {
		return menus;
	}
	
	
	public Set<String> getRegisteredMenus() {
		Set<String> rMenus = new HashSet<>();
		for (Customer customer : customers) {
			rMenus.addAll(customer.getMenus());
		}
		return rMenus;
	}
	
	public Set<String> getBasicMenus() {
		Set<String> menus = null;
		for (Customer customer : customers) {
			if (menus == null)
				menus = new HashSet<>(customer.getMenus());
			menus.retainAll(customer.getMenus());
		}
		return menus;
	}
	
	public Set<String> getCanceledMenus() {
		Set<String> allMenus = new HashSet<>(menus);
		Set<String> rMenus = getRegisteredMenus();
		
		allMenus.removeAll(rMenus);
		
		return allMenus;
	}
	
	public static void print(Collection<String> menus) {
		for(String menu: menus) {
			System.out.print(menu + ", ");
		}
		System.out.println("\n");
	}
}

class Customer {
	private String name;
	private Set<String> menus;
	
	public Customer(String name) {
		this.name = name;
		menus = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addMenu(String menu) {
		menus.add(menu);
	}
	
	public Set<String> getMenus() {
		return menus;
	}
}
/*
엘컴퓨터식당에는 짜장면, 짬뽕, 된장찌개, 김치찌개, 탕수육 식사 메뉴가 있습니다.
A는 짜장면, 짬뽕을 시켰습니다.
B는 짜장면, 탕수육을 시켰습니다.
C는 짜장면, 김치찌개를 시켰습니다. 
문제 1.
주문한 모든 메뉴를 중복 없이 정렬하여 출력하세요.
문제 2.
모든 사람이 주문한 메뉴를 출력하세요.
문제 3.
한 명도 시키지 않은 메뉴들을 출력하세요.
*/