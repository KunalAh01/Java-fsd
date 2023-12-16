package com.main;

import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration(); //org.hibernate for class and javax for annotation.
		con.configure("hibernate.cfg.xml");
		System.out.println("File loaded sucessfully");

	}
}
