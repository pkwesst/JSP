//AddSession.java

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
	//세션의 특징
	//1. 세션은 브라우저당 1개씩만 발급
	//2. 세션은 브라우저가 닫히면 기본적으로 만료되며,
	//	 브라우저를 닫지 않아도 지정해놓은 일정 시간이 지나면 말료(별도로 지정된 시간이 없다면 30분 초과시 만료) 
	//3. 세션의 시간을 지정했다고 하더라도 action(새로고침, 페이지 이동 등)을 하게 되면 시간은 다시 처음부터 카운팅
	//4. 세션 안에 저장할 수 있는 데이터 형태는 Object(모든 것을 저장 가능함)
	//5. 세션의 개수는 서버의 메모리가 가능하다면 계속해서 발급 가능

	
	//세션 만드는 법
	//1. client의 키(쿠키)값을 가져와서 세션을 생성
	HttpSession session = request.getSession();
	//2. session에 값을 넣음
	session.setAttribute("id", "hodoodady");
	//3.session의 나이 설정(초 단위)
	session.setMaxInactiveInterval(30);	 //session의 유효기간이 30초	
		
	}

}
