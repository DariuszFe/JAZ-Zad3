<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<form action="addPerson.jsp">

  First name :<input type="text" name="firstName" value="${person.firstName}" /><br />
  Last name :<input type="text" name="lastName" value="${person.lastName}" /><br />
  Email name :<input type="text" name="emailName" value="${person.emailName}" /><br />
  Email2 name :<input type="text" name="email2Name" value="${person.email2Name}" /><br />
  Employer name :<input type="text" name="employerName" value="${person.employerName}" /><br />
  Occupation name :<input type="text" name="occupation" value="${person.occupation}" /><br />
  Year of birth :<input type="text"  name="yob" value="${person.yob}" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>