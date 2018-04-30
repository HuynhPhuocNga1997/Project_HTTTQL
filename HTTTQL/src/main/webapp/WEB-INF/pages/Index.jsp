<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thu</title>
</head>
<body>
	<table border="1">

			<th>Ma khac hang</th>
			<th>Ten khach hang</th>
			<th>So dien thoai</th>

			<c:forEach var="kh" items="${listKH }">
				<tr>
					<td>${kh.getMakhachhang()}</td>
					<td>${kh.getTenkhachhang()}</td>
					<td>${kh.getSodienthoai()}</td>
				</tr>
			</c:forEach>
		</table>
	
</body>
</html>