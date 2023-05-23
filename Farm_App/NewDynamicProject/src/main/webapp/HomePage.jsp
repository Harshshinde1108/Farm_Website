<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<%
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farm_App", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from Customer_details where contact=?");
		Cookie[] cookies = request.getCookies();
		String contact = cookies[0].getValue();
		String pass = cookies[1].getValue();
		long mobile = Long.parseLong(contact);
		PrintWriter pw = response.getWriter();
		
		ps.setLong(1, mobile);
		ResultSet rs = ps.executeQuery();
		rs.next(); %>
		<h3>Welcome : <%= rs.getString(1)%></h3>
		
		<%// pw.println("Password: "+pass);
		if (rs.getLong(2) == mobile && rs.getString(4).equals(pass)) 
		{
	%>
	<form action="Sell.jsp">
		<button type="submit">Sell</button>
	</form>
	<form action="Buy.jsp">
		<button type="submit">Buy</button>
	</form>

	<%
		} 
		else 
		{
	%>
	<h2>incorrect password</h2>
	<%
		}
	} 
	catch (ClassNotFoundException e)
	{
		e.getStackTrace();
	%>
	<h1>something went wrong please try after sometime.class not found
	</h1>
	<%
	}
	catch (SQLException e)
	{
	%>
	<h2>user not fount</h2>
	<%
	}
	%>
</body>
</html>