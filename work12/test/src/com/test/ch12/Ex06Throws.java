package com.test.ch12;

import java.util.Scanner;

public class Ex06Throws {
	
	//main은 사용자의 입장에서 생각해 작성한 객체를 사용하는 공간
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			User2 user = null;
			
			user = LoginService2.form();
			
			try {
				LoginService2.login(user);
				
			} catch (IDMismatchException2 e) {
				System.out.println(e.getMessage());
				System.out.println("아이디 찾기를 원하시면 클릭해 주세요.");
				System.out.println("문의사항은 000-1234-5678 로 연락주세요.\n");
				
			} catch (PasswordMismatchException2 e) {
				System.out.println(e.getMessage());
				System.out.println("비밀번호 찾기를 원하시면 클릭해 주세요.");
				System.out.println("문의사항은 000-1234-5678 로 연락주세요.\n");
				
			} finally {
				LoginService2.increaseCount();
			}
			
			if (user.isLogin()) {
				LoginService2.success(user);
				break;
			}
			
			System.out.println("로그인에 실패하였습니다.\n");
		}
		
		System.out.println("1. 회원정보");
		System.out.println("2. 커뮤니티");
		System.out.println("3. 쇼핑");
		System.out.println("4. 로그아웃");
	}

}

//개발자의 입장에서 작성되는 공간
class LoginService2{
	private static final String DB_ID = "admin";
	private static final String DB_PW = "1234";
	private static int count = 0;
	
	public static void login(User2 user)throws IDMismatchException2, PasswordMismatchException2{//throws는 발생한 예외를 메소드로 넘기는 것
		if(!DB_ID.equals(user.getId())) {
			throw new IDMismatchException2("잘못된 아이디를 입력하였습니다.");
			//throw는 예외를 발생시키는 것
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IDMismatchException2(String message) {
		super(message);
	}
}

class  PasswordMismatchException2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  PasswordMismatchException2(String message) {
		super(message);
	}
}

/*
문제 1.
자판기 프로그램을 throws 가 적용된 코드로 수정하세요.
*/
