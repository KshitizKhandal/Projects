<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is a search page</title>
</head>
<body>
<h1>display result</h1>

<c:out value="${product.productbrand}" />
<c:out value="${product.productname}" />
<c:out value="${product.productcode}" />
</body>
</body>
</html>