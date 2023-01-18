<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 스크립틀릿 코드 (JSP에서 Java를 쓸 수 있게 해줌)
	String name = (String)request.getAttribute("name");
	String[] foods = (String[])request.getAttribute("foods");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름: <%=name %> <br>
	좋아하는 색: ${requestScope.color} <br>
	좋아하는 동물: ${requestScope.animal} <br>
	좋아하는 음식: 
	<%
		for(String food : foods){
	%>
		<span><%=food %></span>
	<%
		}
	%> 
</body>
</html>