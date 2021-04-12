<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%!
			int width, height;
		%>
		<%
			width = Integer.parseInt(request.getParameter("width"));
			height = Integer.parseInt(request.getParameter("height"));
		%>
		가로 : <%=width %>
		
		세로 : <%=height %>
		사각형의 넓이 : <%=width*height %>
	</body>
</html>