<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>전송된 데이터 받아서 출력</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			String name  =request.getParameter("name");
			String id  =request.getParameter("id");
			String pwd  =request.getParameter("pwd");
			String hp1  =request.getParameter("hp1");
			String hp2  =request.getParameter("hp2");
			String hp3  =request.getParameter("hp3");
			String year  =request.getParameter("year");
			String[] interest = request.getParameterValues("interest");
			String department =request.getParameter("department");
			
			//데이터 전처리
			// 전화번호 : h1 h2 h3 -> 010-1234-1234
			String hp =hp1+"-"+ hp2+"-"+hp3;
			
			String interest_list ="";
			
			for(String elm : interest){
				interest_list +=elm+" ";
			}
			
		%>
		
		성명 : =<%=name %><br>
		아이디 : =<%=name %><br>
		비밀번호 : =<%=name %><br>
		전화번호 : =<%=name %><br>
		학년 : =<%=name %><br>
		관심분야
		<%
			// 매일 interest 의 각 요소 출력
			for(int i=1; i<interest.length;i++){
		%>
			<%--출력은 HTMl 영역에 변수값으로 출력 --%>
			<%=interest[i]+", " %>
		<% 
		} %><br>
			학과
		
		
		
	</body>
</html>