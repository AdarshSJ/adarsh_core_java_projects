package com.constructors;

import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;

public class Constructors02 {

	public static void main(String[] args) throws IOException {
		
		Constructors01 c1 = new Constructors01(07, "Dhoni");
		System.out.println(c1.jerseyNo);
		System.out.println(c1.name);
		
		File f = new File("D:\\JavaKosmik\\workspaces02\\CoreJavaWorkSpace\\newfile.txt");
		f.createNewFile();
		
		//ArrayList a1 = new ArrayList(1000);
		}

}
