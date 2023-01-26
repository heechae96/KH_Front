<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세조회</title>
<link rel="stylesheet" href="/resources/css/notice.css">
</head>
<body>
	<h1>공지사항 상세 조회</h1>
	<ul>
		<li>
			<label>글번호</label>
			<span class="border-remove">${notice.noticeNo }</span>
			<%-- <input type="text" value="${notice.noticeNo }"  class="border-remove" readonly> --%>
		</li>
		<li>
			<label>작성일</label>
			<span class="border-remove">${notice.noticeDate }</span>
			<%-- <input type="text" value="${notice.noticeDate }" class="border-remove" readonly> --%>
		</li>
		<li>
			<label>글쓴이</label>
			<span class="border-remove">${notice.noticeWriter }</span>
		</li>
				<li>
			<label>제목</label>
			<span class="border-remove">${notice.noticeSubject }</span>
		</li>
		<li>
			<label>내용</label>
			<p class="border-remove">${notice.noticeContent }</p>
		</li>
	</ul>
	<a href="/notice/list">목록으로 이동</a>
	<a href="#">수정하기</a>
	<a href="javascript:void(0)" onclick="deleteCheck();">삭제하기</a>
	<script>
		const deleteCheck = function(){
			const noticeNo = "${notice.noticeNo }";
			const check = confirm("정말로 삭제하시겠습니까?");
			if(check){
				location.href = "/notice/remove?notice-no=" + noticeNo;
			}
		}
	</script>
</body>
</html>