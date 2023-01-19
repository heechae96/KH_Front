<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>nice member web</title>
<link rel="stylesheet" href="/resources/css/login.css">
<!-- <link rel="stylesheet" href="resources/css/login.css"> -->
</head>
<body>
	<div id="container">
	<h1>나이스 멤버 웹~!</h1>
		<h2>로그인 페이지</h2>
		<fieldset>
			<legend>로그인</legend>
			<form action="/member/login.kh" method="post">
				<input type="text" name="member-id" placeholder="ID"> <br> 
				<input type="password" name="member-pw" placeholder="PW"> <br> 
				<div id="login-area">
					<input type="submit" value="로그인"> 
					<input type="reset" value="취소">				
				</div>
			</form>
		</fieldset>
	</div>
</body>
</html>