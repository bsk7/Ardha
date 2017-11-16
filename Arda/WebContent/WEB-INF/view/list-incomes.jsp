<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<title>Customers List</title>
	<!-- Reference to our sytle sheet -->
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"	/>
</head>

<body>

	<div id="wrapper">

		<div id="header">
			<h2> CRM - Customer Relationship Manager</h2>
		</div>
		
		<div id="container">
			<div id="content">
				
				<!-- put new button to add customer -->
				<input type="button" value="AddIncome" onclick="window.location.href='showFormForAdd';return false;" class="add-button"/> 
			
				<!-- Add out html table here -->
				<table>
					<tr>
						<th>DATE</th>
						<th>SOURCE</th>
						<th>AMOUNT</th>
						<th>DESC</th>
					</tr>
					<!-- Loop the content and print  Incomes -->
					<c:forEach var="tempIncome" items="${customers}">
						<tr>
							<td>${tempIncome.date}</td>
							<td>${tempIncome.source}</td>
							<td>${tempIncome.amount}</td>
							<td>${tempIncome.description}</td>
						</tr>
					
					
					</c:forEach>
					
					
				</table>
			
			</div>
		</div>

	</div>
</body>


</html>