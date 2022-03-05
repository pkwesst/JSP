//ex06reponse.jsp 선생님 해설

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
		//out.print("jsp페이지 입니다.");
	
		// response 객체의 sendRedirect("이동하고 싶은 주소");
		//response.sendRedirect("http://www.naver.com");
	%>
	<%
		//1. 인코딩
				
		//2. 전달받은 데이터를 변수에 담아 놓는 것 : Parameter 수집 
		//select 태그로부터 값을 받아왔음 --> 변수에 담아줘야 함
		//request.getParameter() : 해당 method로 값을 가져옴. String 타입으로만 리턴
		
		//3. 구분( .equals("비교할 문자열") )
		
		//4. sendRedirect 이용해서 각각에 따라 페이지 이동
		//http://www.naver.com --> 네이버 이동
		//http://www.goolge.com --> 구글 이동
		//http://www.daum.net --> 다음 이동
		
		//----------적용-----------
		//1. 인코딩
		request.setCharacterEncoding("utf-8");
	
		//2. 전달받은 데이터를 request.getParameter() 메소드로 값을 가져옴.
		//가져온 값은 문자타입의 변수 site에 저장
		String site = request.getParameter("page");
		
		//3. 변수 site에 저장해 둔 "값"과"비교할 문자열"이 같다면
		String url = "";
		
		if (site.equals("네이버")){
			url = "http://www.naver.com";
		}
		else if(site.equals("구글")){
			url = "http://www.google.com";
		}
		else{
			url = "http://www.daum.net";
		}
		
		//4. 해당 사이트로 이동
		response.sendRedirect(url);
	%>
	
	

</body>
</html>//ex06reponse.jsp 선생님 해설

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
		//out.print("jsp페이지 입니다.");
	
		// response 객체의 sendRedirect("이동하고 싶은 주소");
		//response.sendRedirect("http://www.naver.com");
	%>
	<%
		//1. 인코딩
				
		//2. 전달받은 데이터를 변수에 담아 놓는 것 : Parameter 수집 
		//select 태그로부터 값을 받아왔음 --> 변수에 담아줘야 함
		//request.getParameter() : 해당 method로 값을 가져옴. String 타입으로만 리턴
		
		//3. 구분( .equals("비교할 문자열") )
		
		//4. sendRedirect 이용해서 각각에 따라 페이지 이동
		//http://www.naver.com --> 네이버 이동
		//http://www.goolge.com --> 구글 이동
		//http://www.daum.net --> 다음 이동
		
		//----------적용-----------
		//1. 인코딩
		request.setCharacterEncoding("utf-8");
	
		//2. 전달받은 데이터를 request.getParameter() 메소드로 값을 가져옴.
		//가져온 값은 문자타입의 변수 site에 저장
		String site = request.getParameter("page");
		
		//3. 변수 site에 저장해 둔 "값"과"비교할 문자열"이 같다면
		String url = "";
		
		if (site.equals("네이버")){
			url = "http://www.naver.com";
		}
		else if(site.equals("구글")){
			url = "http://www.google.com";
		}
		else{
			url = "http://www.daum.net";
		}
		
		//4. 해당 사이트로 이동
		response.sendRedirect(url);
	%>
	
	

</body>
</html>
