<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>회원가입</h3>
		<form name="frmMember" method="post" action="newMember2.jsp">
			<table>
				<tr><td>아이디</td>
				<td><input type="text" name ="id"></td></tr>
				<tr><td>비밀번호</td>
				<td><input type="text" name ="pwd"></td></tr>
				<tr><td>이름</td>
				<td><input type="text" name ="name"></td></tr>
				<tr><td>이메일</td>
				<td><input type="text" name ="email"></td></tr>
			</table>
			<input type ="submit" value="가입">
			<input type ="reset" value="취소">
		</form>
	</body>
</html>