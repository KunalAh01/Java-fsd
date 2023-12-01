package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws FileNotFoundException {
		File myFile=new File("abc.txt");
		Scanner sc =new Scanner(myFile);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
			sc.close();
}

	}


