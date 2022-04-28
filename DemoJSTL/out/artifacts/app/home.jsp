<%--
  Created by IntelliJ IDEA.
  User: serel
  Date: 8/2/2021
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<head>
    <title>Title</title>
</head>
<body>
<sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/database" user="postgres" password="password"></sql:setDataSource>
<sql:query var="rs" dataSource="${db}" >SELECT * FROM demo_table</sql:query>
<c:forEach items="${rs.rows}" var="row">
<c:out value="${fn:length(row.name)}"/><br>
</c:forEach>
</body>
</html>
