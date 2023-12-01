package com;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt");
		fw.write("Hello welcome to java");
		fw.close();

	}

}
