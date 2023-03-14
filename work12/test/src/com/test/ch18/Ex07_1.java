package com.test.ch18;

import java.util.ArrayDeque;
import java.util.Deque;

//스택처럼 사용하기
public class Ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarm al = new Alarm();
		al.addAlarm("오늘은 넷플릭스 자동이제 날입니다.");
		al.addAlarm("구독하신 ooo님의 새로운 동영상입니다.");
		al.checkAlarm();
		al.allAlarm();

	}
}
	

class Alarm {
	private Deque<String> alarms = new ArrayDeque<>();
	
	// 알림 등록
	public void addAlarm(String alarm) {
		System.out.println("== 알람 등록 ==");
		alarms.push(alarm);
		System.out.println("새로운 알림: " + alarm);
		System.out.println();
	}
	
	//알림 확인, 확인 시 제거
	public void checkAlarm() {
		System.out.println("== 알람 확인 ==");
			String alarm = alarms.pop();
			System.out.println("확인한 알람: " + alarm);
			System.out.println("확인하신 알람은 제거됩니다.");
			System.out.println();
	}
	
	//미확인 알람용
	public void allAlarm() {
		System.out.println("== 미확인 알림 목록 ==");
		if(alarms.isEmpty()) {
			System.out.println("알람이 없습니다.");
			return;
		}
		for(String alarm : alarms) {
			System.out.println("확인하지 않은 알람: " + alarm);
		}
	}
}

/* 
문제 1.
스마트폰의 알림기능은 마지막 알림부터 확인할 수 있습니다.
알림 등록, 확인, 확인 시 제거 기능을 구현하세요.
*/