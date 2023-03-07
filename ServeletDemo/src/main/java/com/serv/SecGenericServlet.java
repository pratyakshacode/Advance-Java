package com.serv;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.PrintWriter;

public class SecGenericServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Generic servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1> My Generic Constructor</h1>");
	}
	
}
