package com.test.ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
	    // 주차장 인스턴스를 파일에 쓰기
	    try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
	            new FileOutputStream("src/com/test/ch21/parking.txt")));
	    ) {
	    	Parking parking = new Parking();
			parking.add("A");
			parking.add("B");
			
	        out.writeObject(parking);
	        System.out.println("주차장 인스턴스를 파일에 썼습니다.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // 주차장 인스턴스 파일 읽어오기
	    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
	    		new FileInputStream("src/com/test/ch21/parking.txt")));
	    ) {
	        Parking	parking2 = (Parking) in.readObject();
	        System.out.println("주차장 인스턴스를 파일에서 읽어왔습니다.");
	        parking2.print();
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}

}

class Parking implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<String> parkedCar = new ArrayList<>();
	
	public void add(String name) {
		parkedCar.add(name);
	}
	
	public void print() {
		System.out.println("현재 주차된 차: " + parkedCar);
	}
}
/*
문제 1.
두 대의 차를 주차장에 주차하는 코드를 작성하세요.
주차장 인스턴스를 파일에 쓴 뒤 다시 읽어 와 주차장의 상태를 출력하세요.
*/