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

		//sendRedirect()와 같은 페이지 이동은 한번만 가능
		//=> response를 여러번 쓸 경우 조건문 안에 작성해야 함
		//=> response를 한 번만 쓰려면 변수를 따로 지정해 response.sendRedirect(변수); 작성하면 됨
		
		//----------적용-----------
		//1. 인코딩
		//post방식의 경우 => request 객체
		request.setCharacterEncoding("utf-8");
	
		//2. 전달받은 데이터를 request.getParameter("태그의 name값") 메소드로 값을 가져옴.
		//가져온 값은 문자타입의 변수 site에 저장
		String site = request.getParameter("page");
		
		//3. 변수 site에 저장해 둔 "값"과"비교할 문자열"이 같다면
		//4. 해당 사이트로 이동
		if (site.equals("네이버")){
			response.sendRedirect("http://www.naver.com");
		}
		else if(site.equals("구글")){
			response.sendRedirect("http://www.google.com");
		}
		else if(site.equals("다음")){
			response.sendRedirect("http://www.daum.net");
		}
	%>
	
</body>
</html>
