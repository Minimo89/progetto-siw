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
		Nome: <h:inputText value="#{customerController.firstName}"
				required="true"
				requiredMessage="Il nome è obbligatorio"
				id="firstName"/> <h:message for="firstName"/>
	</div>
	<div>
		Cognome: <h:inputText value="#{customerController.lastName}"
				required="true"
				requiredMessage="Il cognome è obbligatorio"
				id="lastName"/> <h:message for="lastName"/>
	</div>
	<div>
		Numero di telefono: <h:inputText value="#{customerController.phoneNumber}"/>
	</div>
	<div>
		Email: <h:inputText value="#{customerController.email}"
				required="true"
				requiredMessage="L' indirizzo email è obbligatorio"
				id="email"/> <h:message for="email"/>
	</div>
	<div>
		Password: <h:inputText value="#{customerController.password}"
				required="true"
				requiredMessage="La paswword è obbligatoria"
				id="pass"/> <h:message for="pass"/>
	</div>
	<div>
		Data di nascita (gg-mm-aaaa): <h:inputText value="#{customerController.dateOfBirth}"
				required="true"
				requiredMessage="La data di nascita è obbligatoria"
				id="date"/> <h:message for="date"/>
	</div>
	<div>
		Via: <h:inputText value="#{customerController.street}"
				required="true"
				requiredMessage="La via è obbligatoria"
				id="street"/> <h:message for="street"/>
	</div>
	<div>
		Città: <h:inputText value="#{customerController.city}"
				required="true"
				requiredMessage="La città è obbligatoria"
				id="city"/> <h:message for="city"/>
	</div>
	<div>
		Regione: <h:inputText value="#{customerController.country}"
				required="true"
				requiredMessage="La regione è obbligatoria"
				id="country"/> <h:message for="country"/>
	</div>
	<div>
		Nazione: <h:inputText value="#{customerController.state}"
				required="true"
				requiredMessage="La nazione è obbligatoria"
				id="state"/> <h:message for="state"/>
	</div>
	<div>
		CAP: <h:inputText value="#{customerController.zipcode}"
				required="true"
				requiredMessage="Il CAP è obbligatorio"
				id="zipcode"/> <h:message for="zipcode"/>
	</div>
	<div><h:commandButton value = "Conferma" action = "#{customerController.createCustomer}"/></div>
</h:form>

</f:view>
</body>
</html>