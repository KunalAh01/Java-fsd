package com;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class InterfaceDemo implements Servlet {
	ServletConfig conf;
	@Override
	public void destroy() {
		System.out.println("Going to destroy servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf	;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this is a servlet interface";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.conf=conf;
		System.out.println("creating object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	System.out.println("Servicing");
		
	}

}
