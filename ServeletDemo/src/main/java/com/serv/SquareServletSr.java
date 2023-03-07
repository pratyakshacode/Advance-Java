package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/square1")
public class SquareServletSr extends HttpServlet{
 
	 public void service
	 (HttpServletRequest req, HttpServletResponse res) throws IOException
	
	 {
//		3
//		int k= Integer.parseInt(req.getParameter("k")); // by using send redirect method
		 HttpSession session = req.getSession();
//		 session.removeAttribute("k");
		 int k= (int) session.getAttribute("k");
		 
//		k=k*k;
		 //2//
		 
//		 int num = (int) req.getAttribute("k");
		 PrintWriter out=res.getWriter();
			out.println("hello to Square : " + k);
		//3//
			//out.println(k);
	 }
	
 }