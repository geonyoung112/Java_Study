package com.test.ch18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex04Queue {
	/*
	 * 큐의 특징
	 * 1. 먼저 들어간 자료가 먼저 나오는 구조(FIFO)
	 * 2. 큐는 한 쪽 끝은 프런트로 정하여 삭제 연산만 수행
	 * 3. 다른 한 쪽 끝은 리어로 정하여 삽입 연산만 수행
	 * 4. 그래프의 넓이 우선 탐색에서 사용
	 * 5. 컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		
		System.out.println("첫 번째 손님은 " + Restaurant.firstGuest() + "번 손님입니다.");
		System.out.println();
		
		Restaurant.printQueue();

		while(Restaurant.q.size() > 0) {
			Restaurant.seving();
		}
		System.out.println();
		
		Restaurant.printQueue();

	}

}

class QueueTicketDispenser {
	private static int num = 1;
	
	public static int takeNum() {
		Restaurant.q.offer(num);
		//큐에 값을 추가하고 싶다면 add(value), offer(value)를 쓰기
		return num++;
	}
}

class Restaurant {
	public static Queue<Integer> q = new LinkedList<>();
	//자바의 큐는 링크드리스트를 활용하기
	//Queue<Element> queue = new LinkedList<>()와 같이 선언
	
	public static void seving() {
		int num = q.poll();
		//큐에서 첫번째 값을 반환하고 제거, 비어있다면 null
		System.out.println(num + "번 손님에게 서빙되었습니다.");
	}
	
	public static void printQueue() {
		System.out.println("대기열\n-----");
		for(Iterator<Integer> it = q.iterator(); it.hasNext();) {
			int num = it.next();
			
			System.out.println(num + "번 손님");
		}
		System.out.println();
	}
	
	public static int firstGuest() {
		return q.peek();
		// 큐에서 첫번째로 저장된 값을 참조하고 싶을 때 사용
	}
}

/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/