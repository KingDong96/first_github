<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ��</title>
</head>
<body>
	<center>
		<h1>�� ��</h1>
		<a href="logout.do">Log-out</a>
		
			<form action="updateBoard.do" method="post">
				<table border="1" cellpadding="0" cellspacing="0">
					<tr>
						<td bgcolor="orange">��ȣ<td>
						<td align="left">${board.boardNo }</td>
					</tr>
					<tr>
						<td bgcolor="orange">�����ڵ�<td>
						<td align="left">${board.userCode }</td>
					</tr>
					<tr>
						<td bgcolor="orange">����(����) ���<td>
						<td align="left">${board.grade }</td>
					</tr>
					<tr>
						<td bgcolor="orange">����</td>
						<td align="left">${board.boardTitle }</td>
					</tr>
					<tr>
						<td bgcolor="orange">����</td>
						<td align="left"><textarea name="boardContents" cols="40" rows="10">${board.boardContents}</textarea></td>
					</tr>
					<tr>
						<td bgcolor="orange">�����</td>
						<td align="left">${board.boardDate }</td>
					</tr>
					<tr>
						<td bgcolor="orange">��ȸ��</td>
						<td align="left">${board.boardHits }</td>
					</tr>
						<tr>
						<td bgcolor="orange">���ƿ�</td>
						<td align="left">${board.boardRating }</td>
					</tr>
					<c:if test="${(sessionScope.user.grade eq 'ADMIN') || (sessionScope.user.grade eq 'USER' && sessionScope.board.grade eq 'USER')}">
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="�� ����" /></td>
					</tr>
					</c:if>
				</table>
			</form>
		
		<hr>
		<c:if test="${(sessionScope.user.grade eq 'ADMIN') || (sessionScope.user.grade eq 'USER' && sessionScope.board.grade eq 'USER')}">
		<a href="deleteBoard.do?boardNo=${board.boardNo }">�ۻ���</a>&nbsp;&nbsp;&nbsp; 
		</c:if>
		<a href="insertBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp; 
		<a href="getBoardList.do">�۸��</a>
	</center>
</body>
</html>
