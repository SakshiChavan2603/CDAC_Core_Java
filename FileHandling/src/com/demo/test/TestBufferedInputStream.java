package com.demo.test;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		File f = new File("myfileCopy1.txt");
		BufferedOutputStream bos = null;
		try {
			if(f.exists()) {
				bos = new BufferedOutputStream(new FileOutputStream(f,true));
			} else {
				bos = new BufferedOutputStream(new FileOutputStream(f));
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myfile.txt"));
				BufferedOutputStream bos1 = bos;){
			int i = bis.read();
			while(i!=-1) {
				bos1.write(i);
				i = bis.read();
			}
			System.out.println("File copied successsfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
