<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="quote" class="edu.ap.quote.Quote" scope="session"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QUOTES OSCAR WILDE</title>
</head>
<body>

<form method="POST" action="QuoteResult.jsp">

<label>woord:</label> <input type ="text" name = "text"><br>
<input type ="submit" value = "zoeken">

</form>

</body>
</html>