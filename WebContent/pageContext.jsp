<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String name = request.getParameter("name");
if(name!=null){
	pageContext.setAttribute("PCname", name);
	session.setAttribute("Sname", name);
	application.setAttribute("Aname", name);
	//pageContext.setAttribute("Aname", name, PageContext.APPLICATION_SCOPE);
}
%>
<br/>
Request Object <%= name %>
<br/>
Session Object <%= session.getAttribute("Sname") %>
<br/>
Application Object <%= application.getAttribute("Aname") %>
<br/>
PageContext Object <%= pageContext.getAttribute("PCname") %>
</body>
</html>