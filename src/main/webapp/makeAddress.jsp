<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nowy adres</title>
</head>
<body>

<jsp:useBean id="address" class="com.example.servletjspdemo.domain.UserAddress" scope="session" />

<h3>Dodaj nowy adres</h3>

<form action="prepareAddress.jsp" method="get">
	Typ adresu: <select name="addresstype">
		<option value="Zameldowania">Zameldowania</option>
		<option value="Korespondencyjny">Korespondencyjny</option>
		<option value="Pracy">Pracy</option>
	</select><br>
	Województwo: <select name="province">
		<option value="Dolnośląskie">Dolnośląskie</option>
		<option value="Kujawsko-pomorskie">Kujawsko-pomorskie</option>
		<option value="Lubelskie">Lubelskie</option>
		<option value="Lubuskie">Lubuskie</option>
		<option value="Łódzkie">Łódzkie</option>
		<option value="Małopolskie">Małopolskie</option>
		<option value="Mazowieckie">Mazowieckie</option>
		<option value="Opolskie">Opolskie</option>
		<option value="Podkarpackie">Podkarpackie</option>
		<option value="Podlaskie">Podlaskie</option>
		<option value="Pomorskie">Pomorskie</option>
		<option value="Śląskie">Śląskie</option>
		<option value="Świętokrzyskie">Świętokrzyskie</option>
		<option value="Warmińsko-mazurskie">Warmińsko-mazurskie</option>
		<option value="Wielkopolskie">Wielkopolskie</option>
		<option value="Zachodniopomorskie">Zachodniopomorskie</option>
	</select><br>
	Miasto: <input type="text" name="city" value="${address.city}"><br>
	Kod pocztowy: <input type="text" name="postcode" value="${address.postcode}"><br>
	Ulica: <input type="text" name="street" value="${address.street}"><br>
	Numer domu/mieszkania: <input type="text" name="housenr" value="${address.housenr}"><br><br>
	<input type="submit" value="Dodaj adres"><br>
</form>

</body>
</html>