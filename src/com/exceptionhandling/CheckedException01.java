package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class CheckedException01 {

	//IO Exception
	public static void main(String[] args) {

		System.out.println("Hello main method!!");
		//"D is the correct place instead of E"
		File f = new File("E:\\JavaKosmik\\workspaces02\\CoreJavaWorkSpace\\Adarsh.txt");

		try {
			boolean status = f.createNewFile();

			if (status) {
				System.out.println("File has Created Successfully!!");
			} else {
				System.out.println("File might be there already or File has not been created for other reasons ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Hello guys welcome to Files info");
	}

}
