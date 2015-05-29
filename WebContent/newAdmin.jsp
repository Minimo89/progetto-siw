<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:form>
	<div>
		Username: <h:inputText value="#{adminController.username}"
				required="true"
				requiredMessage="Lo username è obbligatorio"
				id="username"/><h:message for="username"/>
	</div>
	<div>
		Password: <h:inputSecret value="#{adminController.password}"
				required="true"
				requiredMessage="La password è obbligatoria"
				id="password"/><h:message for="password"/>
	</div>
	<div><h:commandButton value="Conferma" action="#{adminController.createAdmin }"/></div>
</h:form>

</f:view>
</body>
</html>