<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>문자열 함수 기능</title>
		
	</head>
	<body>
		<c:set var="title1" value="hellow world!"/>
		<c:set var="title2" value="쇼핑몰 중심 JSP입니다."/>
		<c:set var="str1" value="중심"/>
		
		<h3> 여러 가지 문자열 함수 기능 </h3>
		title1: ${title1} <br>
		title2: ${title2} <br>
		str1: ${str1} <br>
		
		title1의 문자열 길이 : ${fn:length(title1) }<br>
		title1을 대문자로 변경 : ${fn:toUpperCase(title1) }<br>
		
		
		<!-- substring, trim, replace, contains, indexOf-->
		title1의 3~5번째 문자열 추출 : ${fn:substring(title1,2,5)}<br>
	 	title1의 앞뒤 공백 제거 : ${fn:trim(title1) }<br>
	 	title1의 공백 / 로 변환 : ${fn:replace(title1," ","/")}<br>
	 	
	 	
	 	title1에 '중심' 포함 여부 : ${fn:contains(title1,"중심") }<br>
	 	title2의 '중심' 문자 시작위치 : ${fn:indexOf(title2,str1)}
		
		
	</body>
</html>