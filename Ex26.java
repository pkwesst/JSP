package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetSession")
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//session 안에 값 확인하는 방법
		//1. client가 가진 세션을 불러온다 -> getSession()
		HttpSession session = request.getSession();
		//2. session에서 값을 가져오기 ->getAtrribute()
		//session 안에 저장되어 있는 가져오고 싶은 값의 이름을 적음
		//getAttribute()이 Object로 상속 => 이때 Object가 부모
		//그러나 부모가 아닌 자식(String)에게 상속받고 싶음  => down casting
		String id = (String)session.getAttribute("id");
		System.out.println(id);
		
		//세션의 만료시기
		//세션은 브라우저 종료시 만료=>나이와 상관없이 무조건(쿠키와의 차이점)
		//나이 설정 따로 안하고 브라우저도 종료하지 않는다면 유효시간은 30분 (ex.은행)
		//유효시간(나이)은 개발자가 따로 설정 가능
		PrintWriter out = response.getWriter();
		out.print(id);
		
	}

}
