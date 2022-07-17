<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile World supermarket</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div id="main_container">
	<jsp:include page="search.jsp" />  
  	<jsp:include page="header.jsp" />
  <div id="main_content">
    <jsp:include page="navbar.jsp" />
    <jsp:include page="leftcontent.jsp" />
    <jsp:include page="centercontent.jsp" />
    <jsp:include page="rightcontent.jsp" />
  </div> 
</div>  
  <jsp:include page="footer.jsp" />
</body>
</html>