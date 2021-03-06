<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
<link rel="stylesheet" href="resources/css/board.css">
<style>
.table, th, tr, td{ 
	border:1px solid gray;
	border-collapse:collapse;
	text-align:center;
}
</style>
</head>
<body>
	<table class="table">
		<tr>
			<th>번호</th>	
			<th>제목</th>	
			<th>내용</th>	
			<th>작성자</th>	
			<th>조회수</th>
			<th>날짜</th>		
		</tr>
		<c:forEach var="article" items="${list}">
			<tr>
				<td>${article.no}</td>
				<td><a href="detail?no=${article.no}">${article.title}</a></td>
				<td>${article.contents}</td>
				<td>${article.regUser}</td>
				<td>${article.readCount}</td>
				<td>${article.regDate}</td>
			</tr>
		</c:forEach>
	</table>
	<button type="button" onclick="fnNewWrite()">글쓰기</button>
</body>
<script>
	function fnNewWrite(){
		location.href="newWrite";
	}
</script>
</html>