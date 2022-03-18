package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//세션 만드는 법
	//1. client의 키(쿠키)값을 가져와서 세션을 생성
	HttpSession session = request.getSession();
	//2. session에 값을 넣음
	session.setAttribute("id", "hodoodady");
	}
}
