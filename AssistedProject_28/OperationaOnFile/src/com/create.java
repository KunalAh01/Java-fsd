package com;

import java.io.File;
import java.io.IOException;

public class create {

	public static void main(String[] args){
		File myFile=new File("abc.txt");
		try {
		myFile.createNewFile();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
