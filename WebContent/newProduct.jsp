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
		Nome: <h:inputText value="#{productController.name }"
				required="true"
				requiredMessage="Il nome è obbligatorio"
				id="name"/><h:message for="name"/>
	</div>
	<div>
		Codice: <h:inputText value="#{productController.code }"
				required="true"
				requiredMessage="Il codice è obbligatorio"
				id="code"/><h:message for="code"/>
	</div>
	<div>
		Prezzo: <h:inputText value="#{productController.price }"
				required="true"
				requiredMessage="Il prezzo è obbligatorio"
				id="price"/><h:message for="price"/>
	</div>
	<div>
		Quantità: <h:inputText value="#{productController.quantity }"
				required="true"
				requiredMessage="La quantità è obbligatoria"
				id="quantity"/><h:message for="quantity"/>
	</div>
	<div>
		Descrizione: <h:inputTextarea value="#{productController.description }"
				cols="20"
				rows="5"/>
	</div>
	<div><h:commandButton value="Conferma" action="#{productController.createProduct}"/></div>
</h:form>

</f:view>
</body>
</html>