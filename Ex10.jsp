<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
		JSP(Java Server Page)
			-> 응답하는 페이지를 개발자가 쉽게 만들 수 있게 해주는 서버 페이지	
	 --%>

	int num = 10;

	<%//스크립틀릿(scriptlet) : JSP에서 Java 코드를 구현할 수 있는 영역
	int num = 10;
	System.out.print(num);
	%>
	
	<style>
		b {
			font-size: 50px;
		}
	</style>

	<br>num변수 안에 들어있는 값 :
	<b><%=num%></b>
	<%--표현식(expression) : JSP에서 Java변수를 웹브라우저에 출력할 수 있는 영역 --%>
	
	<%--1~100까지의 합을 웹 브라우저에 출력하시오(for) --%>
	
	<br>
	<%
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.print(sum);
		}
	 %>
	<br>1~100까지의 합 : <b><%=sum%></b>
</body>
</html>
