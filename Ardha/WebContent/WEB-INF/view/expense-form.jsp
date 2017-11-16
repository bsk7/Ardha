<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>
	
	<!-- Reference to our sytle sheet -->
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css"	/>
		  
		  <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-income-style.css"	/>
		  
		 
</head>


<body>

	<div id="wrapper">
	
		<div id="header">
			<h2>ADD-EXPENSE</h2>
		</div>
		
		<div id="container">
			<h3>Save Expense</h3>
			
			<form:form action="saveExpense" modelAttribute="expense" method="POST">
				
				<table>
					<tbody>
						<tr>
							<td><label>YEAR</label></td>
							<td><form:input path="year" placeholder="YYYY" /></td>
											
						</tr>
						
						<tr>
							<td><label>MONTH<label></td>
							<td><form:input path="month"  placeholder="NOVEMBER" /></td>
											
						</tr>
						
						<tr>
							<td><label>PESONAL</label></td>
							<td><form:input path="personal"/></td>
		
						</tr>
						
						<tr>
							<td><label>HOME</label></td>
							<td><form:input path="home"/></td>
		
						</tr>
						
						<tr>
							<td><label>OTHER</label></td>
							<td><form:input path="other"/></td>
		
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save"/></td>
											
						</tr>
					</tbody>
					
				</table>
			
			
			</form:form>
			
			<div style="clear;both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}/expense/showExpenses">Back to List</a>
			</p>
		</div>
				
	
	
	</div>

</body>

</html>