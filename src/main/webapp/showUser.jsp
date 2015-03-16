<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>
<table border="1">
   <c:forEach items="${UserList}" var="p">
      <tr>
         <td>${p.login} ${p.password}</td>
      </tr>
</c:forEach>
</table>
</body>
</html>