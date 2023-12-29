package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("beans.xml");
	
		Address add1=(Address)obj.getBean("add");
		System.out.println(add1);
		Employee e9=(Employee)obj.getBean("employee");
		System.out.println(e9);
	}
}
