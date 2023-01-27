<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
<link rel="stylesheet" href="/resources/css/notice.css">
</head>
<body>
	<h1>공지사항 목록</h1>
	<!-- 번호 / 제목 / 작성자 / 작성일 / 조회수 -->
	<table>
		<colgroup>
			<col width="10%">
			<col width="55%">
			<col width="10%">
			<col width="15%">
			<col width="10%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody style="text-align: center">
			<c:forEach items="${nList }" var="notice">
				<tr>
					<td>${notice.noticeNo }</td>
					<td><a href ="/notice/detail?notice-no=${notice.noticeNo }">${notice.noticeSubject }</a></td>
					<td>${notice.noticeWriter }</td>
					<td>${notice.noticeDate }</td>
					<td>${notice.viewCount }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">
					<!-- 동적으로 변경 필요. 없는 페이지는 안나오도록! -->
					<!-- <a href="/notice/list?page=1">1</a>
					<a href="/notice/list?page=2">2</a>
					<a href="/notice/list?page=3">3</a>
					<a href="/notice/list?page=4">4</a>
					<a href="/notice/list?page=5">5</a> -->
					${pageNavi }
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>