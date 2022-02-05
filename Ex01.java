package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01")
public class ex01 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Servlet : Server+Applet
		// 서버를 만드는 서버 프로그래밍 페이지
		// Java -> main() / Servlet -> service()
		// 내 IP주소 : 172.30.1.3 /220.71.175.247

		System.out.println("누군가 접속했다.");

		// request : 서버에 접속하는 사용자의 정보가 담겨 있는 객체
		String ip = request.getRemoteAddr();
		// 사용자의 IP를 가져오는 기능 중에 사용자의 IP를 가져오는 기능
		System.out.println("접속한 사용자의 IP : " + ip);

		// response : 서버가 사용자에게 응답을 할 수 있게 해주는 객체
		// 응답하는 파일을 선택(html로 만들어진 text파일,charset=utf-8로 읽음
		// html과 servlet을 연결하는 getWriter()길을 만들고 통로 이름은 PrintWriter
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("Hello"); // 통로를 통해 "Hello"를 출력

		// 접속한 IP가 팀원IP였을 때는
		// "팀원 환영합니다" 출력
		// 접속한 IP가 다른 IP였을 때는
		// "손님 환영합니다" 출력
		String tip = "172.30.1.19";
		String tip1 = "172.30.1.43";
		String tip2 = "172.30.1.31";

		if (ip == "172.30.1.17") {
			out.println("선생님 환영합니다");
		} else if (ip.equals(tip) || ip.equals(tip1) || ip.equals(tip2)) {
			out.println("팀원 환영합니다");
		}
		// 접속한 IP가 '172.30.1.17'였을 때는
		// "선생님 환영합니다" 출력
		else {
			out.println("손님 환영합니다");
		}

	}
}
