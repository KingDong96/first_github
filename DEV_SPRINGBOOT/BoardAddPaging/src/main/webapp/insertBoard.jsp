<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>���۵��</title>
</head>
<body>
	<center>
		<h1>�� ���</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertBoard.do" method="post">
		<input type="text" name="userCode" style="display: none" value="${user.userCode}"/>
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">����</td>
					<td align="left"><input type="text" name="boardTitle" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">�۵�ϳ�¥</td>
					<td align="left"><input type="text" name="boardDate" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">��ȸ��</td>
					<td align="left"><input type="text" name="boardHits" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">���ƿ�</td>
					<td align="left"><input type="text" name="boardRating" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">����</td>
					<td align="left"><textarea name="boardContents" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" ���� ��� " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">�� ��� ����</a>
	</center>
</body>
</html>