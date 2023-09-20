<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String name = "";
	String age ="";
	String cookie = request.getHeader("Cookie");
	if(cookie!=null){
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			if(c.getName().equals("name")){
				name = c.getName();
			}else if(c.getName().equals("age")){
				age = c.getValue();
			}
		}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쿠키 이름 = <%=name %></h2>
<h2>쿠키 값 = <%=age %></h2>
</body>
</html>