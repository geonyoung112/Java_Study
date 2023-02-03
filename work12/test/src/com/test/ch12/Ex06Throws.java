package com.test.ch12;

import java.util.Scanner;

public class Ex06Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class LoginService2{
	private static final String DB_ID = "admin";
	private static final String DB_PW = "1234";
	private static int count = 0;
	
	public static void login(User user)throws IDMismatchException2, PasswordMismatchException2{
		if(!DB_ID.equals(user.getId())) {
			throw new IDMismatchException2("잘못된 아이디를 입력하였습니다.");
			
		}else if(!DB_PW.equals(user.getPassword())) {
			throw new PasswordMismatchException2("잘못된 패스워드를 입력하였습니다.");
		}else {
			user.setLogin(true);
		}
	}
	
	public static User2 form() {
		Scanner scanner = new Scanner(System.in);
		User2 user = new User2();
		
		System.out.println("- 로그인 화면 -");
		System.out.println("아이디를 입력하세요: ");
		user.setId(scanner.nextLine());
		System.out.println("패스워드를 입력하세요: ");
		user.setPassword(scanner.nextLine());
		
		return user;
	}
	
	public static void success(User2 user) {
		System.out.println(user.getId() + "님 환영합니다.\n");
	}
	
	public static void increaseCount() {
		count++;
		System.out.println("로그인 시도" + count + "회");
		
	}
}

class User2{
	private String id;
	private String password;
	private boolean login;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isLogin() {
		return login;
	}
	
	public void setLogin(boolean login) {
		this.login = login;
	}
}

class IDMismatchException2 extends Exception{
	public IDMismatchException2(String message) {
		super(message);
	}
}

class  PasswordMismatchException2 extends Exception {
	public  PasswordMismatchException2(String message) {
		super(message);
	}
}
