<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 등록</title>
<link rel="stylesheet" href="/resources/css/notice.css">
</head>
<body>
	<h1>공지사항 작성</h1>
	<form action="/notice/write" method="post">
		<fieldset>
			<legend>공지사항 작성</legend>
			<ul>
				<li>
					<label for="notice-subject">제목</label>
					<input type="text" id="notice-subject" name="subject">
				</li>
				<li>
					<label for="notice-content">내용</label>
					<textarea rows="30" cols="40" id="notice-content" name="content"></textarea>
				</li>
				<li>
					<!-- 첨부는 안할거라 name값 부여안했음 -->
					<label for="notice-attach">첨부파일</label>
					<input type="file" id="notice-attach">
				</li>
			</ul>
		</fieldset>
		<div class="btn-area">
			<input type="submit" value="작성">
			<input type="reset" value="초기화">
		</div>
	</form>
</body>
</html>