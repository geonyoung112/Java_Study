package com.test.ch18;


import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ex05ConcurrentLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread printService = new Thread(new PrintService());
		printService.start();
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("프린트할 내용을 입력하세요: ");
			Printer.print(new Paper(s.nextLine()));
		}

	}

}

class Printer {
	public static void print(Paper p) {
		PrintService.q.offer(p);
	}
}

class PrintService implements Runnable {
	//public static Queue<Paper> q = new LinkedList<>();	/Queue<E>로 인한 오류 발생
	public static Queue<Paper> q = new ConcurrentLinkedQueue<>(); //멀티쓰레드를 사용할때는 콘커렌트링크드큐를 사용해야함
	//하나의 인스턴스에서 2개의 쓰레드가 접근할 시 사용끝나기도 전에 값을 반환해 2번째 쓰레드의 값을 먼저가져온다든지 등 오류가 생김
	// 쓰레드의 정확하게 순서를 할당해오는 지 모르기 때문에 그냥 링크드리스트는 금한다.
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\n 프린트 대기 중입니다...");
			try {
				for(Iterator<Paper> it = q.iterator(); it.hasNext();) {
					Paper p = it.next();
					
					System.out.println("\n프린트 중입니다...\n---");
					Thread.sleep(3000);
					System.out.println(p.getContents());
					q.remove();
					System.out.println("프린트가 완료되었습니다!!!");
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Paper {
	private String contents;

	public Paper(String contents) {
		this.contents = contents;
	}
	
	public String getContents() {
		return contents;
	}
}