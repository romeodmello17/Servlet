package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadData extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String password = req.getParameter("password");

		System.out.println("Name : " + name);
		System.out.println("Password : " + password);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");

		pw.print("<h1>Welcome : " + name + "</h1>");
		pw.print("</html></body>");
	}
}
