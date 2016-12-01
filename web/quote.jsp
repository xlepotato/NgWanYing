<%@ page import="quote.QuoteDAO" %>
<%@ page import="quote.Quote" %><%--
  Created by IntelliJ IDEA.
  User: 152658F
  Date: 12/1/2016
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    QuoteDAO db = new QuoteDAO();
    Quote wquote = (Quote)session.getAttribute("rdmquote");
    String author = wquote.getAuthor();
    String quote = wquote.getQuote();

%>
<body>
Hi <%=session.getAttribute("name") %>! <br>
Your daily quote is <%=quote%> by <%=author%> <br>
<a href="index.html"> Back to Home</a> <a href="add.jsp">Add Quote</a>

</body>
</html>
