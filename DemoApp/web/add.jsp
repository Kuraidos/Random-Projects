<%--
  Created by IntelliJ IDEA.
  User: serel
  Date: 7/31/2021
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Here
<%
    int num1=Integer.parseInt(request.getParameter("num1"));
    int num2=Integer.parseInt(request.getParameter("num2"));
    int k=num1+num2;
%>
<%="Result= "+k%>
</body>
</html>
