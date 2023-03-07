package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SquareServlet 
extends HttpServlet{
 
	 public void service
	 (HttpServletRequest req, HttpServletResponse res) throws IOException
	
	 {
		//3// 
		//int k=(int)req.getAttribute("k");
		 
		//k=k*k;
		 //2//
		 
		 int num = (int) req.getAttribute("k");
		 PrintWriter out=res.getWriter();
			out.println("hello to Square : " + num);
		//3//
			//out.println(k);
	 }
	
 }