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
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"	/>
</head>


<body>

	<div id="wrapper">
	
		<div id="header">
			<h2>$$$ RICH - DAD $ POOR - DAD $$$</h2>
		</div>
		
		<div id="container">
			<h3>Save Income</h3>
			
			<form:form action="saveIncome" modelAttribute="income" method="POST">
				
				<table>
					<tbody>
						<tr>
							<td><label>DATE</label></td>
							<td><form:input path="date"/></td>
											
						</tr>
						
						<tr>
							<td><label>SOURCE</label></td>
							<td><form:input path="source"/></td>
											
						</tr>
						
						<tr>
							<td><label>AMOUNT</label></td>
							<td><form:input path="amount"/></td>
		
						</tr>
						
						<tr>
							<td><label>Description</label></td>
							<td><form:input path="description"/></td>
		
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
				<a href="${pageContext.request.contextPath}/rdpd/list">Back to List</a>
			</p>
		</div>
				
	
	
	</div>

</body>

</html>