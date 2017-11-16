<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<title>expense details</title>
	<!-- Reference to our sytle sheet -->
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"	/>
</head>

<body>

	<div id="wrapper">

		<div id="header">
			<h2>EXPENSES</h2>
		</div>
		
		<div id="container">
			<div id="content">
				
				<!-- put new button to add customer -->
				<input type="button" value="AddExpense" onclick="window.location.href='showFormForAddExpense';return false;" class="add-button"/> 
				
				<!-- Add out html table here -->
				<table>
					<tr>
						<th>YEAR</th>
						<th>MONTH</th>
						<th>PERSONAL</th>
						<th>HOME</th>
						<th>OTHERS</th>
						<th>TOTAL</th>
					</tr>
					<!-- Loop the content and print  Incomes -->
					<c:forEach var="tempExpense" items="${expenses}">
						<tr>
							<td>${tempExpense.year}</td>
							<td>${tempExpense.month}</td>
							<td>${tempExpense.personal}</td>
							<td>${tempExpense.home}</td>
							<td>${tempExpense.other}</td>
							<td>${tempExpense.personal+tempExpense.home+tempExpense.other}</td>
							
						</tr>
					
					
					</c:forEach>
					<%-- <tr >
					<td> <font size="100" color="green">Total :</font><td>
					<td><font size="100" color="green">${total}</font></td> --%>
					
					</tr>
					
				</table>
			
			</div>
		</div>

	</div>
	<div style="clear;both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}">Back to Menu</a>
			</p>
	
 

</body>


</html>