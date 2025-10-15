package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("Textfile.txt");
			FileOutputStream fout = new FileOutputStream("TextfileCopy.txt");
			
			//read file
			int i = fin.read();
			while(i != -1) { // check file EOF
				fout.write(i); //write into second file
				i = fin.read();
			}
			fin.close();
			fout.close();
			System.out.println("File copied successfully!");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
