package com;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		File myFile = new File("abc.txt");
		if(myFile.delete()) {
			
			System.out.println("file is deleted successfully");
		}
		else {
			System.out.println("some problem occured");
		}
	}

}
