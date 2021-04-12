<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>변수 선언 및 사용</title>
	</head>
	<body>
		<%!
			//변수 선언 및 초기화 기능
			int x= 10;
			long y;
			//y=100; 값 설정시에는 선언과 함께 설정해야함(초기화만 가능)
			
			float floatValue =3.14f;		// float 형은 f 붙임
			double doubleValue =3.14; // double 형 기본
			
			char ch = 'a';
			String job ="프로그래머";
			boolean b = true;
		%>
		<%
			// 스크립트 영역 : 자바코드 자유롭게 기술 
			y=100; // 선언한 값 바꿀 수 있음.
		%>
		<h3>변수 값 출력</h3>
		x: <%= x %><br>
		y:<%=y %><br>
		floatValue : <%=floatValue %><br>
		doubleValue: <%=ch %><br>
		ch : <%=ch %><br>
		job : <%=job %><br>
		b:<%=b %><br>
	</body>
</html>