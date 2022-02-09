<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>훠</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>번호</th>	
			<th>제목</th>	
			<th>내용</th>	
			<th>작성자</th>
			<th>날짜</th>		
		</tr>
		<c:forEach var="article" items="${list}">
			<tr>
				<td>${article.no}</td>
				<td>${article.title}</td>
				<td>${article.contents}</td>
				<td>${article.regUser}</td>
				<td>${article.regDate}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>