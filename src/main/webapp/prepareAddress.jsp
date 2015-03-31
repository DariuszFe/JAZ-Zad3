<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="address" class="com.example.servletjspdemo.domain.UserAddress" scope="session" />
<jsp:setProperty name="address" property="*" />

<%
		address.setUsername((String) session.getAttribute("nickname"));
		address.setAddressType(request.getParameter("addresstype"));
		address.setProvince(request.getParameter("province"));
	
 		RequestDispatcher dispatcher = request.getRequestDispatcher("addNewAddress.jsp");
		dispatcher.forward(request, response);
%>

</body>
</html>