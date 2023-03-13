package com.test.ch18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Queue<String> notices = new LinkedList<>();
		
		while(true) {
			System.out.println("- 공지사항 -");
			System.out.println("1. 공지사항 등록");
			System.out.println("2. 공지사항 목록");
			System.out.println("3. 공지사항 삭제");
			System.out.println("4. 종료");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			Function[] functions = Function.values();
			Function menu = functions[choice-1];
			
			
			switch(menu) {
				case ADD:
					System.out.println("제목과 내용을 입력하세요: ");
					String notice = scanner.nextLine();
					notices.offer(notice);
					break;
				case LIST:
					if (notices.isEmpty()) {
						System.out.println("공지사항이 없습니다.");
					} else {
						System.out.println("- 공지사항 목록 -");
						for (String num : notices) {
							System.out.println("- " + num + " -");
						}
					}
					break;
				case DELETE:
					if(notices.isEmpty()) {
						System.out.println("공지사항이 없습니다.");
					} else {
						String oldestNotice = notices.poll();
						System.out.println("오래된 순으로 삭제하겠습니다.");
						System.out.println("[" + oldestNotice + "] 가 삭제되었습니다.");
					}
					break;
				case EXIT:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
}


class Notice {
	private int id;
	private String title;
	private String content;
	
	
	public Notice(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}

enum Function{
    ADD(1),
    LIST(2),
    DELETE(3),
    EXIT(4);
	

    private final int value;

    Function(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/