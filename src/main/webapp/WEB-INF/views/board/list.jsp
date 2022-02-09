<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>	
			<th>제목</th>	
			<th>내용</th>	
			<th>작성자</th>	
			<th>조회수</th>
			<th>날짜</th>		
		</tr>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.no}</td>
				<td>${row.title}</td>
				<td>${row.contents}</td>
				<td>${row.regUser}</td>
				<td>${row.readCount}</td>
				<td>${row.regDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>