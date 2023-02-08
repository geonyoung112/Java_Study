package com.test.ch12;

import java.io.File;
import java.io.IOException;

public class Ex04UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			File f = new File("./src/com/test/ch12/hello.txt");
			
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// Checked Exception: 위험한 것 무조건 체크하도옥 체크 예외
			
			int[] arr = {3, 7, 5};
			System.out.println(arr[5]);		// Unchecked Exception, runtime Exception: 런타임에서 오류
	}

}
/*
문제 1.
f.createNewFile 의 주석을 제거합니다.
발생된 예외를 try catch 를 이용하여 처리하세요.
*/