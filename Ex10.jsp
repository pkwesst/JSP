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
	JSP 실행되는 과정
		처음 실행될 때 : JSP -> Tomcat -> Servlet -> class -> HTML
		두번째 실행될 때 : JSP -> 톰캣 메모리 저장된 class파일을 가져와서 실행
		JSP = Servlet
	--%>
   int num = 10;
   
   <% //스크립틀릿(scriptlet) : JSP에서 Java코드를 구현할 수 있는 영역
      int num = 10;
      System.out.print(num);
   %>
   
   <style>
      b {
         font-size: 50px;
      }
   </style>
   <br>num 변수 안에 들어 있는 값 :   <b><%=num %></b>
   <%--표현식(expression) : JSP에서 Java 변수를 웹브라우저에 출력할 수 있는 영역 --%>
   
   <%--1~100까지의 합을 웹 브라우저에 출력하시오(for) --%>
   
   <% 
   int num2 =0;
   for(int i = 1; i < 101; i++) {
      num2 += i;
   }
   %>
   <br>1~100까지의 합 : <%=num2 %>
   
   <table>
      <tr>
      <%--아래의 td태그를 10번 반복하시오(for) --%>
         <% for (int i = 1; i <= 10; i++) { %>
            <td>1</td>   
         <% } %>
         
      </tr>
   </table>
</body>
</html>
