<%--
  Created by IntelliJ IDEA.
  User: serel
  Date: 8/1/2021
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    101<br>
    Kuraido<br>
    88<br>
<%
    String url = "jdbc:postgresql://localhost:5432/database";
    String username = "postgres";
    String password = "password";
    String sql = "SELECT * FROM demo_table WHERE name='Kuraido'";
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url,username,password);
    Statement st = con.createStatement();
    ResultSet resultSet = st.executeQuery(sql);
    resultSet.next();

%>
name: <%=resultSet.getString(3)%> mark: <%=resultSet.getString(2)%>
</body>
</html>
