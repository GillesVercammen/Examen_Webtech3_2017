<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="quote" class="edu.ap.quote.Quote" scope="session"/>
<jsp:setProperty property="*" name="quote"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title here</title>
</head>
<body>


Alle quotes: <br>
<%= Quote.getAllQuotes %>

gezochte quite: <br>
<%= Quote.zoekQuote %>
</body>
</html>