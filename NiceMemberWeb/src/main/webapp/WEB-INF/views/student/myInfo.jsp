<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 마이페이지</title>
<link rel="stylesheet" href="/resources/css/student.css">
</head>
<body>
	<h1>학생 상세 정보</h1>
	<div>
		<form action="" method="get">
			<fieldset>
				<legend>학생 정보</legend>
				<ul>
					<li><label>아이디</label> <input type="text" name="id" value="${student.studentId }"></li>
					<li><label>비밀번호</label> <input type="password" name="pw" value="${student.studentPw }"></li>
					<li><label>이름</label> <input type="text" name="name" value="${student.studentName }"></li>
					<li><label>이메일</label> <input type="email" name="email" value="${student.studentEmail }"></li>
					<li><label>휴대폰번호</label> <input type="tel" name="number" value="${student.studentPhone }"></li>
					<li><label>주소</label> <input type="text" name="addr" value="${student.studentAddress }"></li>
					<!-- 성별을 넣으면 에러 발생.. 우선 value지정 제외 -->
					<li><label>성별</label> <input type="text" name="gender"></li>
					<li><label>가입일</label> <input type="text" name="addr" value="${student.studentDate }"></li>
				</ul>
			</fieldset>
			<div>
				<input type="submit" value="수정"> 
				<input type="reset" value="초기화">
			</div>
		</form>
	</div>
</body>
</html>