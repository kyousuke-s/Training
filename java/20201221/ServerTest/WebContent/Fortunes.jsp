<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%
    String[] fortunes={"大吉","中吉","吉","凶"};
    String[] cSelects={"cs1","cs2","cs3","cs4"};
    int rand=new Random().nextInt(4);
    String fortune=fortunes[rand];
    String classSelect=cSelects[rand];
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Insert title here</title>
</head>
<body>
<p>今日の運勢は<strong class="<%=classSelect %>"><%=fortune %></strong>です</p>
</body>
</html>