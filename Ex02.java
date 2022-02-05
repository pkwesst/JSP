//ex02.java
package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02")
public class ex02 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	// request : 사용자한테 입력 받기 위해 getParameter를 통해 값을 요청
	// html의 name="값"과 java의 .getParameter("값");에서 "값"이 일치해야 함
		String id = request.getParameter("id"); 
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		System.out.println("사용자가 보낸 ID값 : " + id); //값 가져온 후 변수명은 ""없이 작성
		System.out.println("사용자가 보낸 PW값 : " + pw);
		System.out.println("사용자가 보낸 NICK값 : " + nick);

		// response : 요청
		// 콘솔창에 출력되는 아래의 값들을 브라우저창에 출력하세요
		// PrintWriter를 통해 사용자가 적은 값을 out에 저장
	      response.setContentType("text/html;charset=utf-8"); //확인? 사용자가 입력한 값을 가상의 문서로 저장
	      PrintWriter out = response.getWriter();
	      
	      out.println("사용자가 보낸 ID값 : " + id);
	      out.println("사용자가 보낸 PW값 : " + pw);
	      out.println("사용자가 보낸 NICK값 : " + nick);

		// 주의사항
		// 사용자에게 입력받을 값이 있다면 실행순서
		// 1. 입력받는 HTML 실행
		// 2. Servlet 파일 실행(자동)
		// 순서가 뒤바뀌면 null값이 HTML에 출력됨

	}

}
