package com.serv;

import java.io.IOException;
//import java.io.PrintWriter;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add1")
public class AddServletSr extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
		//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	//public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		System.out.println("sum is " + k);
//		PrintWriter out=res.getWriter();
//		res.getWriter().println("sum is " +k);
		
		k = k*k;
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
//		req.setAttribute("k", k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
		res.sendRedirect("square1?k=" + k);
		
	}
}