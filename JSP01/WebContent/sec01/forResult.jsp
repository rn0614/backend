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
			int num=Integer.parseInt(request.getParameter("num"));
		%>
		 <%=num %> 단
		 
		 <table border="1">
		 <% 
		 	for(int i=1; i<=9; i++){
		 %>
		 		<tr><td><%=num %>*<%=i %>=<%=num*i %></td></tr>
		 <%
		 	} 
		 %>
		 
		 </table>
	</body>
</html>