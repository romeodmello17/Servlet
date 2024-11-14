<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Declaration  -->
	<h1>Declaration tag</h1>
	<%!
	int a = 10;
	
	public int test(){
		return 100;
	}
	%>
	
	<!-- Expression --> 
	
	<h1>Expression tag</h1>
	<h2> <%= a %> </h2>

	<!-- Scriptlet tag -->
	<% 
	
int b= 100;
	out.println("Hello");
	%>

	<h2><%= b %></h2>
</body>
</html>