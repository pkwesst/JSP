<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//1. 쿠키 생성 - 생성자에 (쿠키이름, 값);
		//조건 - 쿠키값과 이름은 Text형태(String)만 가능
		Cookie cookie = new Cookie("id","Myid");
		
		//번외 - 쿠키의 나이를 설정하는 방법(쿠키를 보내기 전에 나이 설정해야 함)
		//기본적으로 쿠키는 브라우저가 종료되면 만료됨
		//하지만 내가 원하는 시간만큼 쿠키를 보존할 수 있음
		//(숫자)초
		cookie.setMaxAge(60*60*24*365*10); 
		
		//2. client에게 cookie 전달
		response.addCookie(cookie);
	%>

</body>
</html>
