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
			Nome: <h:inputText  value="#{providerController.name }"
					required="true"
					requiredMessage="Il nome è obbligatorio"
					id="name"/><h:message for="name"/>
		</div>
		<div>
			Numero di telefono: <h:inputText  value="#{providerController.phoneNumber }"
					required="true"
					requiredMessage="Il numero di telefono è obbligatorio"
					id="phone"/><h:message for="phone"/>
		</div>
		<div>
			Partita IVA: <h:inputText  value="#{providerController.vatin }"
					required="true"
					requiredMessage="La partita IVA è obbligatoria"
					id="vatin"/><h:message for="vatin"/>
		</div>
		<div>
			Email: <h:inputText  value="#{providerController.email }"
					required="true"
					requiredMessage="L'indirizzo email è obbligatorio"
					id="email"/><h:message for="email"/>
		</div>
		<div>
		Via: <h:inputText value="#{providerController.street}"
				required="true"
				requiredMessage="La via è obbligatoria"
				id="street"/> <h:message for="street"/>
	</div>
	<div>
		Città: <h:inputText value="#{providerController.city}"
				required="true"
				requiredMessage="La città è obbligatoria"
				id="city"/> <h:message for="city"/>
	</div>
	<div>
		Regione: <h:inputText value="#{providerController.country}"
				required="true"
				requiredMessage="La regione è obbligatoria"
				id="country"/> <h:message for="country"/>
	</div>
	<div>
		Nazione: <h:inputText value="#{providerController.state}"
				required="true"
				requiredMessage="La nazione è obbligatoria"
				id="state"/> <h:message for="state"/>
	</div>
	<div>
		CAP: <h:inputText value="#{providerController.zipcode}"
				required="true"
				requiredMessage="Il CAP è obbligatorio"
				id="zipcode"/> <h:message for="zipcode"/>
	</div>
	<div><h:commandButton value = "Conferma" action = "#{providerController.createProvider}"/></div>
	</h:form>

</f:view>
</body>
</html>