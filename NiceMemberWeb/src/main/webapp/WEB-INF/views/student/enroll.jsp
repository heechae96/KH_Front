<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 가입</title>
<link rel="stylesheet" href="/resources/css/student.css">
</head>
<body>
	<h1>가입 정보</h1>
	<div>
		<form action="/student/enroll.do" method="post">
			<fieldset>
				<legend>학생 가입 정보</legend>
				<ul>
					<li><label>아이디</label> <input type="text" name="id"></li>
					<li><label>비밀번호</label> <input type="password" name="pw"></li>
					<li><label>이름</label> <input type="text" name="name"></li>
					<li><label>이메일</label> <input type="email" name="email"></li>
					<li><label>휴대폰번호</label> <input type="tel" name="number"></li>
					<li><label>주소</label> <input type="text" name="addr"></li>
					<li><label>성별</label> <input type="text" name="gender"></li>
				</ul>
			</fieldset>
			<div>
				<input type="submit" value="가입"> <input type="reset"
					value="초기화">
			</div>
		</form>
	</div>

</body>
</html>