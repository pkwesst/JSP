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
		//out내장객체 : JSP에 스크립틀릿 영역 안에서 브라우저로 출력할 수 있는 객체
		out.print("Hello");
		//Servlet에서 PrintWriter = out내장객체
	%>
	
	<%
   for(int i = 1; i <= 10; i++) {%>
      <td>1</td>
   <%} %>
   
   <%
   for(int i = 1; i <= 10; i++) {
      out.print("<td>1</td>");
   } %>

</body>
</html>
