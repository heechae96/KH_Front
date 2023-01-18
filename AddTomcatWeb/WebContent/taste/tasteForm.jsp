<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 취향 테스트(GET)</title>
</head>
<body>
	<!-- 이 페이지(.jsp)는 vsCode의 라이브서버에서 열리지 않는 -->
	<h1>개인 취향 테스트</h1>
	<p>
		당신의 취향을 테스트합니다. <br> 데이터 입력 후 확인 버튼을 누르세요
	</p>
	<form action="/AddTomcatWeb/tasteResult.do" method="get">
		<label for="part1"> 이름은? <input type="text" name="name"
			id="part1">
		</label> <br> <br> 좋아하는 색? <label for="red"> 빨강 <input
			type="radio" name="color" id="red" value="빨강">
		</label> <label for="blue"> 파랑 <input type="radio" name="color"
			id="blue" value="파랑">
		</label> <label for="yellow"> 노랑 <input type="radio" name="color"
			id="yellow" value="노랑">
		</label> <label for="green"> 초록 <input type="radio" name="color"
			id="green" value="초록">
		</label> <br> <br> 좋아하는 동물은? <select name="animal">
			<option value="강아지">강아지</option>
			<option value="고양이">고양이</option>
			<option value="돼지">돼지</option>
			<option value="새">새</option>
			<option value="뱀">뱀</option>
		</select> <br> <br> 좋아하는 음식은? (모두 고르세요) <label for="f1"> 짜장면
			<input type="checkbox" name="food" id="f1" value="짜장면">
		</label> <label for="f2"> 짬뽕 <input type="checkbox" name="food"
			id="f2" value="짬뽕">
		</label> <label for="f3"> 탕수육 <input type="checkbox" name="food"
			id="f3" value="탕수육">
		</label> <label for="f4"> 양장피 <input type="checkbox" name="food"
			id="f4" value="양장피">
		</label> <label for="f5"> 팔보채 <input type="checkbox" name="food"
			id="f5" value="팔보채">
		</label> <br> <br> <input type="submit" value="전송"> <input
			type="reset" value="취소">
	</form>

</body>
</html>