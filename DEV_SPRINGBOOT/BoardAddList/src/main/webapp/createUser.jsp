<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ȸ������</title>
</head>
<body>
	<center>
		<h1>ȸ������</h1>
		<hr>
		<form action="createUser.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">���̵�</td>
					<td align="left"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ</td>
					<td align="left"><input type="password" name="pw"/></td>
				</tr>
					<tr>
					<td bgcolor="orange">�̸���</td>
					<td align="left"><input type="text" name="email"/></td>
				</tr>
					<tr>
					<td bgcolor="orange">�̹���</td>
					<td align="left"><input type="text" name="userImage"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">�̸�</td>
					<td align="left"><input type="text" name="name"/></td>
				</tr>
					<tr>
					<td bgcolor="orange">����</td>
					<td align="left"><input type="text" name="birth"/></td>
				</tr>
					<tr>
					<td bgcolor="orange">����</td>
					<td align="left"><input type="text" name="postNum"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">��ȣ</td>
						<td align="left"><select name="phoneCd">
						<option value="01">01</option>
						<option value="02">02</option>					
					</select></td>
					<td align="left"><input type="text" name="phoneNum"/></td>
				</tr>
					<tr>
					<td bgcolor="orange">�ּ�</td>
					<td align="left"><input type="text" name="address"/></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�����ϱ� " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">���� ȭ������</a>
	</center>
</body>
</html>