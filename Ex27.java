package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RemoveSession")
public class RemoveSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//세션을 삭제하는 방법
		//1. 현재 페이지에 접근한 client의 session을 가져옴 
		HttpSession session = request.getSession();
		//2. session 안에 지우고 싶은 값의 name을 입력
		session.removeAttribute("id");
		
		
	}
}
