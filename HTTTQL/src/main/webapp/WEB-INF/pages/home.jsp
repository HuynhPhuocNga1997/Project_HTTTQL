<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
	<a href="<c:url value="/quanlynhacungcap"/>"><button type="button" class="btn btn-primary">Primary</button></a>
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
