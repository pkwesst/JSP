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
	//1. 인코딩
	
	//2. Parameter 수집
	
	//3. id가 smart 이고 pw가 1234인지 비교
	
	//4. 조건 맞다면 -> ex07LoginTrue.jsp로 이동, 틀리다면 -> ex07LoginFalse.jsp
	//reponse.sendRedirect("주소") : method 사용
	// 주소 : 1. 절대경로 : 완전한 url(http://www.naver.com)
	//		2. 상대경로 : 같은 프로젝트 내, 파일 경로
	
	// 실습에서 상대경로  => 같은 WebContent폴더에 있으므로 파일 이름만 적음
	
	//url을 이용해서 데이터를 보내는 방식
	//get : Query String 형태로 데이터를 보낸다
	//ex07LoginTrue.jsp?보낼이름=보낼값
	
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	String move = "";

	if(id.equals("smart") & pw.equals("1234")){
		response.sendRedirect("ex07LoginTrue.jsp?id="+id+"&pw"+pw);
		// 쿼리 스트링 : ?변수이름=전달할 값 => (get 방식) => url에 id=smart 노출됨
	}
	else{
		move = "ex07LoginFalse.jsp";
	}

		response.sendRedirect(move);
%>

</body>
</html>
