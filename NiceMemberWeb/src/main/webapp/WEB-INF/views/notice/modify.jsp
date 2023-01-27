<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
<link rel="stylesheet" href="/resources/css/notice.css">
</head>
<body>
    <form action="/notice/modify" method="post">
    	<!-- 쿼리스트링 값으로 넣을것 -->
    	<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
        <fieldset>
            <legend>공지사항 수정</legend>
            <ul>
                <li>
                    <label for="">제목</label>
                    <input type="text" name="subject" value="${notice.noticeSubject }">
                </li>
                <li>
                    <label for="">내용</label>
                    <textarea name="content" id="" cols="30" rows="40">${notice.noticeContent }</textarea>
                </li>
            </ul>
        </fieldset>
        <div class="btn-area">
            <input type="submit" value="수정">
            <input type="reset" value="초기화">
        </div>
    </form>
</body>
</html>