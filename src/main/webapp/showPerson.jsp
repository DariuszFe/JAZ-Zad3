<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>
<table border="1">
   <c:forEach items="${conferenceRegistrationList}" var="p">
      <tr>
         <td>${p.name} ${p.lastName}</td>
         <td>${p.email}</td>
         <td>${p.prac}</td>
         <td>${p.zaj}</td>
      </tr>
</c:forEach>
</table>
</body>
</html>