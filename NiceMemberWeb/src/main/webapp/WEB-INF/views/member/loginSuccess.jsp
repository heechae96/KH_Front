<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<h1>로그인 성공했어요!!</h1>
	<h2>${memberId }님 환영합니다!</h2>
	
	<input type="hidden" id="member-id" value="${memberId }">
	<a href="/member/myInfo.kh?member-id=${memberId }">마이페이지</a>
	<!-- 페이지 이동을 막는다 -->
	<!-- a태그의 링크 기능을 무효화 -->
	<a href="javascript:void(0)" onclick="removeCheck()">회원탈퇴</a>
	<script>
		function removeCheck() {
			var check = confirm("회원탈퇴를 하시겠습니까?");
			if(check){
				location.href = "/member/remove.kh?member-id=${memberId}";
			}
		}
	</script>
</body>
</html>