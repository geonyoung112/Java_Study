package com.test.ch19;

import java.util.Optional;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Monitor {
	private Optional<Screen> screen;
	
	public Optional<Screen> getScreen() {
		return screen;
	}
	public void setScreen(Optional<Screen> screen) {
		this.screen = screen;
	}
}

class Screen {
	private Optional<Panel> panel;
	
	public Optional<Panel> getPanel(){
		return panel;
	}
	
	public void setPanel(Optional<Panel> panel) {
		this.panel = panel;
	}
}

class Panel {
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}

/*
문제 1.
입력 받은 자동차 정보를 이용해 인스턴스를 생성하세요.
인스턴스의 toString을 이용해 자동차의 정보를 출력하세요.
정보가 미입력 될 경우 참조변수에 null이 저장되어야 합니다.
옵셔널을 사용해 미입력된 자동차일 경우 '미입력차량'을 출력하세요.
문제 2.
옵셔널과 맵을 사용해 자동차의 금액을 출력하되 자동차의 금액이 없을 경우 1이 출력되도록 코딩하세요. 
*/