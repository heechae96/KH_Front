<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취향 설문 결과</title>
</head>
<body>
	<h2>개인 취향 테스트 결과 화면</h2>
	${name }님의 개인 취향 색깔은
	<c:if test="${color eq '빨강' }">빨간색</c:if>
	<c:if test="${color eq '파랑' }">파란색</c:if>
	<c:if test="${color eq '노랑' }">노란색</c:if>
	<c:if test="${color eq '초록' }">초록색</c:if>
	을 좋아하고
	동물은
	<c:choose>
		<c:when test="${animal eq '강아지' }">귀여운강아지</c:when>
		<c:when test="${animal eq '고양이' }">시크한고양이</c:when>
		<c:when test="${animal eq '돼지' }">뚱뚱한돼지</c:when>
		<c:when test="${animal eq '새' }">알록달록새</c:when>
		<c:when test="${animal eq '뱀' }">무서운뱀</c:when>
	</c:choose>
	을 좋아하고
	음식은
	<c:forEach items="${foods}" var="food">
		<c:if test="${food eq '짜장면' }">안뿔은 짜장면</c:if>
		<c:if test="${food eq '짬뽕' }">매운 짬뽕</c:if>
		<c:if test="${food eq '탕수육' }">바삭바삭 탕수육</c:if>
		<c:if test="${food eq '양장피' }">소주 안주 양장피</c:if>
		<c:if test="${food eq '팔보채' }">고량주 안주 팔보채</c:if>
	</c:forEach>
	를 좋아합니다
</body>
</html>