<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/resources/css/member.css">
</head>
<body>
	<h1>회원가입</h1>
	<h3>회원정보를 입력하세요</h3>
	<div>
		<form action="/member/enrollView.kh" method="post">
			<fieldset>
				<legend>회원가입</legend>
				<ul id="member-register">
					<li>
						<label for="member-id">아이디</label>
						<input type="text" id="member-id" name="member-id">
					</li>
					<li>
						<label for="member-pw">비밀번호</label>
						<input type="password" id="member-pw" name="member-pw">
					</li>
					<li>
						<label for="member-name">이름</label>
						<input type="text" id="member-name" name="member-name">
					</li>
					<li>
						<label for="age">나이</label>
						<input type="text" id="age" name="member-age">
					</li>
					<li>
						<label for="member-gender">성별</label>
						남 <input type="radio" id="member-gender" name="member-gender" value="M">
						여 <input type="radio" name="member-gender" value="F"> 
					</li>
					<li>
						<label for="email">이메일</label>
						<input type="text" id="email" name="member-email">
					</li>
					<li>
						<label for="address">주소</label>
						<input type="text" id="address" name="member-address">
					</li>
					<li>
						<label for="phone">전화번호</label>
						<input type="text" id="phone" name="member-phone">
					</li>
					<li>
						<label for="hobby">취미</label>
						<input type="text" id="hobby" name="member-hobby">
					</li>					
				</ul>
			</fieldset>
			<div>
				<input type="submit" value="가입하기">
				<input type="reset" value="초기화">
			</div>
		</form>
	</div>
</body>
</html>