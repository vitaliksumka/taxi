<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 38096
  Date: 10.12.2021
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
</head>
<body>

<h2>All Users</h2>


<table>

    <tr>
        <th><pre>  Id </pre></th>

        <th><pre>Name  </pre></th>
        <th><pre>Surname  </pre></th>
        <th><pre>  Books readed  </pre></th>
        <th><pre>  Reading now  </pre></th>
        <th><pre>  Role id  </pre></th>
        <th><pre>  Started reading recently  </pre></th>
        <th><pre>  Ended reading  </pre></th>
    </tr>

    <c:forEach var="users" items="${modelAllUsers}">

    <tr>
        <td><pre>  ${users.id}  </pre></td>
        <td><pre>  ${users.name}  </pre></td>
        <td><pre>  ${users.surname}  </pre></td>
        <td><pre>  ${users.books_readed}  </pre></td>
        <td><pre>  ${users.reading_now}  </pre></td>
        <td><pre>  ${users.role_id}  </pre></td>
        <td><pre>  ${users.started_reading_recently}  </pre></td>
        <td><pre>  ${users.ended_reading}  </pre></td>
    </tr>

    </c:forEach>
</table>



</body>
</html>
