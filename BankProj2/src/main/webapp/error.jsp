<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 h2{ text-align: center;}
</style>
</head>
<body>
<% pageContext.include("header.jsp"); %>
<h2><%=request.getAttribute("err") %></h2>
</body>
</html>