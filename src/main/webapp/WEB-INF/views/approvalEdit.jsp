<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Create a new fixed deposit</title>
<style type="text/css">
.td {
	font-family: 'arial';
	font-size: 12px;
	vertical-align: top;
}
</style>
</head>
<body>
	<form name="appprovalEdit" method="POST"
		action="${pageContext.request.contextPath}/approval?apAction=edit">
		<table align="left" style="padding-left: 300px;">
			<tr>
				<td
					style="font-family: 'arial'; font-size: 16px; font-weight: bold;"
					align="left">Open Fixed deposit</td>
			</tr>
			<tr align="left">
				<td>
					<table class="border" cellpadding="10">
						<tr>
							<td class="td"><b>rowId</b></td>
							<td class="td"><input type="text" name="rowId" value="${requestScope.approval.rowId}" readOnly/></td>
						</tr>
						<tr>
							<td class="td"><b>approvalId</b></td>
							<td class="td"><input type="text" name="approvalId" value="${requestScope.approval.approvalId}" readOnly/></td>
						</tr>
						<tr>
							<td class="td"><b>subject</b></td>
							<td class="td"><input type="text" name="subject" value="${requestScope.approval.subject}"/></td>
						</tr>
						<tr>
							<td class="td"><b>content</b></td>
							<td class="td"><input type="text" name="content" value="${requestScope.approval.content}"/><font
								style="color: #C11B17;"><c:out value="${requestScope['error.content']}"/></font></td>
						</tr>
						<tr>
							<td class="td"><b>createdBy</b></td>
							<td class="td"><input type="text" name="createdBy" value="${requestScope.approval.createdBy}"/><font
								style="color: #C11B17;"><c:out value="${requestScope['error.createdBy']}"/></font></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr align="left">
				<td>
					<table style="padding-left: 100px;">
						<tr align="center">
							<td class="td"><input type="submit" value="Save" /> &nbsp;
								&nbsp;<a
								href="${pageContext.request.contextPath}/approval/approvalList"
								style="color: green"><b>Go Back</b></a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

