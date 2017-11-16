<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<title>Income details</title>
	<!-- Reference to our sytle sheet -->
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"	/>
</head>

<body>

	<div id="wrapper">

		<div id="header">
			<h2>INCOME</h2>
		</div>
		
		<div id="container">
			<div id="content">
				
				<!-- put new button to add customer -->
				<input type="button" value="AddIncome" onclick="window.location.href='showFormForAddIncome';return false;" class="add-button"/> 
			
				<!-- Add out html table here -->
				<table>
					<tr>
						<th>DATE</th>
						<th>SOURCE</th>
						<th>AMOUNT</th>
						<th>DESC</th>
					</tr>
					<!-- Loop the content and print  Incomes -->
					<c:forEach var="tempIncome" items="${incomes}">
						<tr>
							<td>${tempIncome.date}</td>
							<td>${tempIncome.source}</td>
							<td>${tempIncome.amount}</td>
							<td>${tempIncome.description}</td>
						</tr>
					
					
					</c:forEach>
					<tr >
					<td> <font size="100" color="green">Total :</font><td>
					<td><font size="100" color="green">${total}</font></td>
					
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