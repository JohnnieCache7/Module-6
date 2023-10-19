<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping List</title>
</head>
<body>
	<form method ="post"action ="listNavigationServlet">
	<table>
	<c:forEach items = "${requestScope.allLists}" var="currtlist">
		<tr>
			<td><input type="radio" name="id" value="${currlist.id}"></td>
			<td><h2>${currlist.listName}</h2></td></tr>
			<tr><td colspan="3">Trip Date: ${currlist.tripDate}</td></tr>
			<tr><td colspan="3">Shopper: ${currlist.shopper.shopperName}</td></tr>
			<c:forEach var ="listVal" items = "${currlist.listOfItems}">
				<tr><td></td><td colspan="3">
					${listVal.store}, ${listVal.item}
					</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
	<input type ="submit"value ="edit"name="doThisToList">
	<input type ="submit"value ="delete"name="doThisToList">
	<input type="submit"value ="add"name ="doThisToList">
	</form>
	<a href="addSnacksForListServlet">Create a new List</a>
	<a href="index.html">Insert a new item</a>

</body>
</html>