package com.demo.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy2 {

	public static void main(String[] args) {
		try (FileInputStream fin = new FileInputStream("new.txt");
			FileOutputStream fout = new FileOutputStream("newCopy.txt")) {
			
			int i = fin.read();
			while(i != -1) {
				fout.write(i);
				i = fin.read();
			}
			System.out.println("File coped successfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
