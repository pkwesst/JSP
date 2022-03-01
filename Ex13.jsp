<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 페이지 지시자 : <%@ 태그이름 errorPage="속성값"%>-->
<%@ page errorPage="ex04error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- java 코드는 스크립틀릿 <% %> 안에 작성 --> 
<%
   int result = 2/0;
%>

<h1><%=result %></h1>

</body>
</html>
