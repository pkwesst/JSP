package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04")//com.example.ex04.java
//URL Mapping : URL 어려워지고, 보안 취약해지기 때문에
public class ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String td = request.getParameter("td");

		int td_num = Integer.parseInt(td);
		
		// 브라우저창에 출력
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<table border=1>");
		out.print("<tr>");
		
		
		for (int i = 1; i <= td_num; i++) {
			out.print("<td>"+i+"</td>");
			
		}
				
		out.print("</tr>");
		out.print("<table>");

	}

}
