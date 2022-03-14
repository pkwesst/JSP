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
		//쿠키 삭제하기
		//사실 아직까지 쿠키를 삭제하는 코드는 존재하지 않음
		//하지만 우회해서 삭제하는 방법은 존재
		//동일한 이름의 쿠키를 생성해 덮어 씌우게 되는 순간 새로운 쿠키로 변경됨
		//그때 (동일한 이름의)새로운 쿠키를 만들 때 나이를 0살로 제한함
		//문제 : id라는 이름의 쿠키를 삭제하시오
		
		Cookie cookie = new Cookie("id","");  //쿠키 생성 후 name값을 동일하게 지정한 후 값을 주지 않음
		cookie.setMaxAge(0); //쿠키의 나이는 0초로 설정
		response.addCookie(cookie);
	%>

</body>
</html>
