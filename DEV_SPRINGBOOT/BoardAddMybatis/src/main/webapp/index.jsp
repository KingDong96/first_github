<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css">

<title>Main Page</title>
</head>
<body>
	<center>
	<div class = "page">
		<h1 class = "index">�Խ��� ���α׷�</h1>
		<h3 class = "index">${user.id}</h3>
		<a class = "index" href="login.jsp">�α���</a>
		<a class = "index" href="logout.do">�α׾ƿ�</a>
		<a class = "index" href="createUser.jsp">ȸ������</a>
		<a class = "index" href="changePwdForm.jsp">��ȣ����</a>
	</div>
		
	</center>
</body>
</html>