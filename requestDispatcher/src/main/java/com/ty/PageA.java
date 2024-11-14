package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagea")
public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String userName=	req.getParameter("uname");
		
		System.out.println("Welcome to page A :"+userName);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Welcome to Page A "+userName+ "</h1>");
		pw.print("</html></body>");
		
		req.setAttribute("un", userName);
		
		RequestDispatcher rd = req.getRequestDispatcher("pageb");
//		rd.forward(req, resp); //Forward the Request to  the page B
		rd.include(req, resp); // include page b into page a
	}
}
