<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	tr{
		height: 40px;
		text-align: center;
	}
	table{
		margin: 0 auto;
	}
</style>

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
		
		//평균
		int java_int = Integer.parseInt(java); //
		int web_int = Integer.parseInt(web);
		int iot_int = Integer.parseInt(iot);
		int android_int = Integer.parseInt(android);
		int sum = java_int+web_int+iot_int+android_int;
		float avg = sum/4;
		
		//학점
		String score = "";
		if (avg <= 100 && avg >= 95) {
			score = "A+";
		} else if (avg >= 85) {
			score = "A";
		} else if (avg >= 80) {
			score = "B+";
		} else if (avg >= 70) {
			score = "C";
		} else {
			score = "F";
		}
		
		
		//response.setContentType("");
	%>
	
	<fieldset>
			<legend>성적확인프로그램</legend>
			<table width="500">	
				<tr>
					<td>이름</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>JAVA점수</td>
					<td><%=java %></td>
				</tr>
				<tr>
					<td>WEB점수</td>
					<td><%=web %></td>
				</tr>
					<tr>
					<td>IOT점수</td>
					<td><%=iot %></td>
				</tr>		
				<tr>
					<td>ANDROID점수</td>
					<td><%=android %></td>
				</tr>		
				<tr>
					<td>평균</td>
					<td>
					<%=avg %>
					</td>
				</tr>
				<tr>
					<td>학점</td>
					<td>
					<h3><%=score%></h3>
					
					</td>
				</tr>
				
																																							
			</table>
		</fieldset>


</body>
</html>
