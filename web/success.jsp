<%@ page import="quote.Quote" %><%--
  Created by IntelliJ IDEA.
  User: 152658F
  Date: 12/1/2016
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Quote quote = (Quote) request.getAttribute("quoteobj");


%>
<body>
Thank you <%=quote.getAuthor()%> for contributing the quote <%=quote.getQuote()%> <a href="index.html">Back to Home</a>

</body>
</html>
