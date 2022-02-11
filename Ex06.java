package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex06")
public class ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      request.setCharacterEncoding("utf-8");
      String id=request.getParameter("id");
      String pw=request.getParameter("pw");
      String gender=request.getParameter("gender");
      String b=request.getParameter("b");
      String birth=request.getParameter("birth");
      
      String[] hobby = request.getParameterValues("hobby");
      String color=request.getParameter("color");
      String talk=request.getParameter("talk");
      
      String hobby1="";
      for (int i = 0; i < hobby.length; i++) {
         hobby1=hobby1+hobby[i]+" ";
      }
      System.out.println("ID : "+id);
      System.out.println("PW : "+pw);
      System.out.println("gender : "+gender);
      System.out.println("blood type : "+b);
      System.out.println("birth : "+birth);
      System.out.println("hobby : "+hobby1);
      System.out.println("color : "+color);
      System.out.println("talk : "+talk);
      
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out =response.getWriter(); 
      
      out.println("ID : "+id+"<br>");
      out.println("PW : "+pw+"<br>");
      out.println("gender : "+gender+"<br>");
      out.println("blood type : "+b+"<br>");
      out.println("birth : "+birth+"<br>");
      out.println("hobby : "+hobby1+"<br>");
      out.println("color : "+color+"<br>");
      out.println("talk : "+talk+"<br>");
   }
}
