<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>폼에 입력한 값으로 바자 빈의 속성값 설정 </title>
	</head>
	<body>
		<%
		request.setCharacterEncoding("utf-8");
		
		/* String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email"); */
		%>
		<h3>MemberBean 속성 값 출력</h3>
		아이디 : ${param.id}<br>
		비밀번호 : ${param.pwd}<br>
		성별 : ${param.name}<br>
		이베일 : ${param.email}<br>
		
		<!-- 로그인 페이지로 이동하는 방법 -->
		<a href="http://locaalhost:8080/JSP01/sec02/login.jsp">로그인</a><br>
		<a href="/JSP01/sec02/login.jsp">로그인</a>
		<a href="<%=request.getContextPath() %>.sec02/login.jsp">로그인</a>
		<a href="${pageContext.request.contextPath}/sec02/login.jsp">로그인</a>
	</body>
</html>