<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>List of departments</h2>
<table>
    <tr>
        <th>Departments</th>
    </tr>
    <c:forEach items="${departments}" var="department">
        <tr>
            <td>${department.toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>