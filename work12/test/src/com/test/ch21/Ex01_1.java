package com.test.ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			FileInputStream in = new FileInputStream("src/com/test/ch21/hello.txt");
			FileOutputStream out = new FileOutputStream("src/com/test/ch21/out1-fileoutputstream3.txt");
		) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream > (try-with-resources)");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

	}

}
