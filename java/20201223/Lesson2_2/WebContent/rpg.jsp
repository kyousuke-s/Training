<%@page contentType="text/html; charset=utf8" pageEncoding="UTF-8"
import="rpg.*;"%>

<%
Monster[] mos={new Slime("すらきち"),new DeathBat("ゴメス"),new Slime("すらっち")};
%>

<!doctype html>
<html>
<body>
<%for(Monster m:mos){ %>
<p><%=m.run() %></p>
<%} %>
</body>
</html>