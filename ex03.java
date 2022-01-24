package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03")
public class ex03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. 사용자가 입력한 값을 가져오기
		String num1 = request.getParameter("num1"); 
		String num2 = request.getParameter("num2");

		//2. 사용자가 입력한 값이 문자 타입이므로 정수 타입으로 변환
		//int 새 변수명 = Integer.parseInt(문자형 변수);
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
				
		System.out.println(num3+num4);
		}
}
