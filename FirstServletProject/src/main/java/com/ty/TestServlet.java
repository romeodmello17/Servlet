package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/test")
public class TestServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hello This is Generic Servlet");

		PrintWriter pw = res.getWriter();

		pw.print("<body><html>");
		pw.print("<h1>Hello Servlet is trigger</h1>");
		pw.print("</body></html>");
	}

}
