<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] replaces = (String[])request.getAttribute("places");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관광지 선택 결과</title>
</head>
<body>
	<h1>관광지 선택 결과</h1>
	<%
		for(String value : replaces){
	%>
		<span>선택한 장소는 <%=value %></span>
	<%
		}
	%>
</body>
</html>