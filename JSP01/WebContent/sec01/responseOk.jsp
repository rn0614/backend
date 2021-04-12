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
			// 클라이언트로부터 입력값 받아오기 : response 객체 사용
			request.setCharacterEncoding("utf-8");
			
			String answer = request.getParameter("answer");
		
			
			// 클라이언트에게 결과 전송
			if(answer.equals("서울")){
				response.sendRedirect("pass.jsp");
	
			}else{
				response.sendRedirect("fail.jsp");
				
			}
		%>
	</body>
</html>