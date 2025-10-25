package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileNotFoundException
public class CheckedException02 {

	public static void main(String[] args) {

		File f = new File("D:\\JavaKosmik\\workspaces02\\CoreJavaWorkSpace\\Samarth.txt");

		try {
			@SuppressWarnings("resource")
			FileReader fr = new FileReader(f);
			try {
				int i = fr.read();
				while(i!=-1) {
					System.out.print((char)i);
					try {
						//InterruptedException
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i = fr.read();
				}
				//System.out.println((char) i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}