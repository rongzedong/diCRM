<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Approval List</title>
<style type="text/css">
.border {
	border-width: 1px;
	border-style: solid;
	border-collapse: collapse;
}

.td,.th {
	border: 1px solid;
	font-family: 'arial';
	font-size: 12px;
}

.a {
	font-family: 'arial';
	font-size: 12px;
}
</style>
</head>
<body>
	<form name="approvalList" method="POST"
		action="${pageContext.request.contextPath}/approval?apAction=createApForm">
		<table align="left" style="padding-left: 300px;">
			<tr>
				<td
					style="font-family: 'arial'; font-size: 16px; font-weight: bold;">Fixed
					Approval List</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					<table class="border" cellpadding="10">
						<tr bgcolor="#99CCFF">
						  	<th class="th">RowId</th>
						  	<th class="th">Approval Id</th>
							<th class="th">Subject</th>
							<th class="th">Content</th>
							<th class="th">Created By</th>
							<th class="th">Action</th>
						</tr>
						<c:forEach items="${appList}" var="approval">
							<tr>
								<td class="td"><c:out value="${approval.rowId}" /></td>
								<td class="td"><c:out value="${approval.approvalId}" /></td>
								<td class="td"><c:out value="${approval.subject}" /></td>
								<td class="td"><c:out value="${approval.content}" /></td>
								<td class="td"><c:out value="${approval.createdBy}" /></td>
								<td class="td"><a
									href="${pageContext.request.contextPath}/approval?fdAction=del&rowId=${approval.rowId}&approvalId=${approval.approvalId}"
									style="color: green">Delete</a> <a
									href="${pageContext.request.contextPath}/approval?apAction=view&rowId=${approval.rowId}&approvalId=${approval.approvalId}"
									style="color: green">Edit</a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>