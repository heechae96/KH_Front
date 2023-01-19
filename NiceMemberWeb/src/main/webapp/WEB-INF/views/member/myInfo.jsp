<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="stylesheet" href="/resources/css/member.css">
</head>
<body>
	<h1>마이페이지</h1>
	<div>
		<form action="">
			<fieldset>
				<legend>회원 상세 정보</legend>
				<ul id="member-register">
					<li>
						<label for="member-id">아이디</label>
						<input type="text" id="member-id" name="member-id" value="${member.memberId }">
					</li>
					<li>
						<label for="member-pw">비밀번호</label>
						<input type="password" id="member-pw" name="member-pw" value="${member.memberPw }">
					</li>
					<li>
						<label for="member-name">이름</label>
						<input type="text" id="member-name" name="member-name" value="${member.memberName }">
					</li>
					<li>
						<label for="age">나이</label>
						<input type="text" id="age" name="member-age" value="${member.memberAge }">
					</li>
					<li>
						<!-- 성별은 value값 pass -->
						<label for="member-gender">성별</label>
						남 <input type="radio" id="member-gender" name="member-gender" value="M">
						여 <input type="radio" name="member-gender" value="F"> 
					</li>
					<li>
						<label for="email">이메일</label>
						<input type="text" id="email" name="member-email" value="${member.memberEmail }">
					</li>
					<li>
						<label for="address">주소</label>
						<input type="text" id="address" name="member-address" value="${member.memberAddress }">
					</li>
					<li>
						<label for="phone">전화번호</label>
						<input type="text" id="phone" name="member-phone" value="${member.memberPhone }">
					</li>
					<li>
						<label for="hobby">취미</label>
						<input type="text" id="hobby" name="member-hobby" value="${member.memberId }">
					</li>		
					<li>
						<label for="m-date">가입날짜</label>
						<input type="text" id="m-date" value="${member.memberDate }">
					</li>			
				</ul>
			</fieldset>
			<div>
				<input type="submit" value="수정하기">
				<input type="reset" value="초기화">
			</div>
		</form>
	</div>
</body>
</html>