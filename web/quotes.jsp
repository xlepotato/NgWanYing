<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections.*"
<%@ page import="quote.Quote" %><%--
  Created by IntelliJ IDEA.
  User: 152658F
  Date: 12/1/2016
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<Quote>quote = new ArrayList<Quote>();
    for(int i=0; i<quote.size(); i++ ) {


%> <%=quote.get(i).getQuote() + quote.get(i).getAuthor()%>
<%
    }
%>


</body>
</html>
