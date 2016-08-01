<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var="order" items="${listOrder}">
		<tr><td>Order Id</td>
			<td>${order.oId }</td></tr>
			
				<tr><c:forEach var="cart" items="${order.cart }">
				
				<tr><td>Client Id</td>
			<td>${cart.cId }</td></tr>
				<tr><td>Client dishes</td>
			<td>${cart.dishes }</td></tr>
				
				</c:forEach></tr>
			
				<tr><td>Order date</td>
			<td>${order.date }</td>
			
			</tr>
			
			
		<!-- 	<td>${c.cname }</td>
			<td><fmt:formatNumber value="${c.price }" pattern="$##,###.00"></fmt:formatNumber></td>
			<td>${c.backGround }</td>
			<td>${c.count }</td>
			<td></td> 
			<td><a href="delete?id=${c.id }">delete</a></td>-->
		</tr>
	</c:forEach>
</table>
			<a href=index.html>return</a>
</body>
</html>