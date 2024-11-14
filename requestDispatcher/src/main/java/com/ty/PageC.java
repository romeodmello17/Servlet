package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagec")
public class PageC extends HttpServlet{

	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String option =req.getParameter("opt");
	PrintWriter pw = resp.getWriter();
	
	if (option.equals("Animal")) {
		pw.print("<h1>This is Animal Page</h1>");
	} else if (option.equals("Plant")) {
		
		pw.print("<h1>This is Plant Page</h1>");
	} else if (option.equals("Human")) {
		
		pw.print("<h1>This is Human Page</h1>");
	}else {	
//		resp.sendRedirect("https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1");
//		resp.sendRedirect("pageb"); // request will be redirected to servlet with url pageb
//		resp.sendRedirect("Demo.jsp"); // request will be redirected to demo.jsp page
		resp.sendRedirect("Test.html");
	}
}


}


