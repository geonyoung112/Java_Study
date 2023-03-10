package com.test.ch12;

import java.util.Scanner;


//만약 로그인 예외처리에서 10개 넘게 예외처리를 해야한다면, 관련된 예외처리를 그룹화하여 
//처리할땐 그룹 네임만 불러오게 하는 방법

public class Ex08ChainedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			User4 user = null;
			
			user = LoginService4.form();
			
			try {
				LoginService4.login(user);
				
			} catch (LoginException e) {
				System.out.println("문의사항은 000-1234-5678 로 연락주세요.\n");
				e.printStackTrace();
			}
			
			if (user.isLogin()) {
				LoginService4.success(user);
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
class LoginService4{
	private static final String DB_ID = "admin";
	private static final String DB_PW = "1234";
	private static int count = 0;
	
	public static void login(User4 user) throws LoginException{
		try {
			if(!DB_ID.equals(user.getId())) {
				throw new IDMismatchException4("잘못된 아이디를 입력하였습니다.");
				
			} else if (!DB_PW.equals(user.getPassword())) {
				throw new PasswordMismatchException4("잘못된 패스워드를 입력하였습니다.");
			} else {
				user.setLogin(true);
			}
		} catch (IDMismatchException4 e) {
			System.out.println("아이디 찾기를 원하시면 클릭해주세요.");
			throw new LoginException("로그인 예외가 발생하였습니다.", e); 
			//catch문을 작성할때도 뒤에 파라미터들을 받아오면 사용가능
			
		} catch(PasswordMismatchException4 e) {
			System.out.println("비밀번호 찾기를 원하시면 클릭해 주세요.");
			throw new LoginException("로그인 예외가 발생하였습니다.", e);
			//catch문을 작성할때도 뒤에 파라미터들을 받아오면 사용가능
			
		}finally {
			increaseCount();
		}
	}
	
	public static User4 form() {
		Scanner scanner = new Scanner(System.in);
		User4 user = new User4();
		
		System.out.println("- 로그인 화면 -");
		System.out.println("아이디를 입력하세요: ");
		user.setId(scanner.nextLine());
		System.out.println("패스워드를 입력하세요: ");
		user.setPassword(scanner.nextLine());
		
		return user;
	}
	
	public static void success(User4 user) {
		System.out.println(user.getId() + "님 롼영합니다.\n");
	}
	
	public static void increaseCount() {
		count++;
		System.out.println("로그인 시도" + count + "회");
	}
}

class User4{
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

//그룹으로 처리하고
class LoginException extends Exception{
	private static final long serialVersionUID = 1L;
	
//담겨져있는 예외들의 인스턴스를 파라미터로 받아온다.
	public LoginException(String message, Exception e) {
		super(message, e);
	}
}

class IDMismatchException4 extends Exception {
	private static final long serialVersionUID = 1L;

	public IDMismatchException4(String message) {
		super(message);
	}
}

class PasswordMismatchException4 extends Exception {
	private static final long serialVersionUID = 1L;

	public PasswordMismatchException4(String message) {
		super(message);
	}
}


/*
문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/