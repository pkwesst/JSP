package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05")
public class Ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post 방식이면 반드시 작성
		request.setCharacterEncoding("utf-8");
		
		//hobby로 중복 선택된 값을 배열값으로 데이터 저장 -> getParameterValues
		//getParameterValues은 배열 타입 -> String[]
		//사용자로부터 받은 값을 배열 타입의 변수 hobby로 받음
		String[] hobby = request.getParameterValues("hobby");
		
		//문자 타입의 hobby_res 변수는 비어있음
		String hobby_res = "";
		
		//hobby의 크기만큼 i를 반복하면서 hobby[인덱스번호]에 해당하는 값을 hobby_res에 누적해서 추가
		for (int i = 0; i < hobby.length; i++) {
			hobby_res += hobby[i];
		}
		
		String gender = request.getParameter("gender");
		
		System.out.println("선택한 취미 : " + hobby_res);
		System.out.println("선택한 성별 : " + gender);
	}

}
