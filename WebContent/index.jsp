<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
	<div><a href="<c:url value="/faces/newCustomer.jsp" />">Registrazione cliente</a></div>
	<div><a href="<c:url value="/faces/customerLogin.jsp" />">Login cliente</a></div>
	<div><a href="<c:url value="/faces/newAdmin.jsp" />">Registrazione admin</a></div>
	<div><a href="<c:url value="/faces/adminLogin.jsp" />">Login admin</a></div>
</f:view>
</body>
</html>