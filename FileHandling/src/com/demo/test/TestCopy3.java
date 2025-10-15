package com.demo.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
//open file in append mode and write in it
public class TestCopy3 {

	public static void main(String[] args) {
		File f = new File("TextCopy.txt");
		FileOutputStream fout1 = null;
		try {
			if(f.exists()) {
				//open in append mode
				fout1 = new FileOutputStream("TextCopy.txt",true);
			}else {
				//open in write mode
				fout1 = new FileOutputStream("TextCopy.txt");
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (FileInputStream fin = new FileInputStream("Text.txt");
			FileOutputStream fout2 = fout1){
			
			int i = fin.read();
			while(i != -1) {
				fout2.write(i);
				i = fin.read();
			}
			System.out.println("Copied successfully");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
