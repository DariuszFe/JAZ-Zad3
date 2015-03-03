<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>
<c:forEach var="conferenceRegistrationList" begin="1" end="5">
   <c:out value="${conferenceRegistrationList}"/><p>
</c:forEach>
</body>
</html>