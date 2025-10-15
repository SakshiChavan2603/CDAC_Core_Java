package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy1 {

	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("myfile.txt");
			fout = new FileOutputStream("myfileCopy.txt");
			
			int i = fin.read();
			while(i != -1) {
				fout.write(i);
				i = fin.read();
			}
			System.out.println("File copied successfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
