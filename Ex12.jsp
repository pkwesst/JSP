<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//내장객체 : JSP가 Servlet으로 변환될 때 개발자가 많이 사용하는 객체를 자동으로 선언
		request.setCharacterEncoding("utf-8");
	
		String name = request.getParameter("name");
		String java = request.getParameter("java");
		String web = request.getParameter("web");
		String android = request.getParameter("android");
		String iot = request.getParameter("iot");
		//response.setContentType("");
	%>
	
	이름 : <%=name %><br>
	Java 점수 :<%=java %><br>
	WEB 점수 : <%=web %><br>
	iot 점수 :<%=iot %><br>
	android 점수 :<%=android %><br>
	
	<fieldset>
			<legend>성적확인프로그램</legend>
			<table width="500">	
				<tr>
					<td>이름</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>JAVA점수</td>
					<td><input type="text" name="java"></td>
				</tr>
				<tr>
					<td>WEB점수</td>
					<td><input type="text" name="web"></td>
				</tr>
					<tr>
					<td>IOT점수</td>
					<td><input type="text" name="iot"></td>
				</tr>		
				<tr>
					<td>ANDROID점수</td>
					<td><input type="text" name="android"></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="확인하기!"></td>
				</tr>																																			
			</table>
		</fieldset>


</body>
</html>
