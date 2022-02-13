package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex06")
public class ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		//id
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		out.println("id : " + id);
		out.println("<br>");
		
		//pw
		String pw = request.getParameter("pw");
		System.out.println("pw : " + pw);
		out.println("pw : " + pw);
		out.println("<br>");

		//gender
		String gender = request.getParameter("gender");
		System.out.println("gender : " + gender);
		out.println("gender : " + gender);
		out.println("<br>");

		//b 
		String b = request.getParameter("b");
		System.out.println("b : " + b);
		out.println("b : " + b);
		out.println("<br>");

		//date
		String date = request.getParameter("date");
		System.out.println("date : " + date);
		out.println("date : " + date);
		out.println("<br>");

		//hobby 중복체크
		String[] hobby = request.getParameterValues("hobby");
		String hobby_res = "";

		for (int i = 0; i < hobby.length; i++) {
			hobby_res += hobby[i];
		}

		System.out.println("hobby : " + hobby_res);
		out.println("hobby : " + hobby_res);
		out.println("<br>");

		//color
		String color = request.getParameter("color");
		System.out.println("color : " + color);
		out.println("color : " + color);
		out.println("<br>");

		//talk
		String talk = request.getParameter("talk");
		System.out.println("talk : " + talk);
		out.println("talk : " + talk);
		out.println("<br>");
	}

}
