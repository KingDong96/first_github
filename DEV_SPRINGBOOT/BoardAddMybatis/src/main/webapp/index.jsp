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
		<h1 class = "index">게시판 프로그램</h1>
		<h3 class = "index">${user.id}</h3>
		<a class = "index" href="login.jsp">로그인</a>
		<a class = "index" href="logout.do">로그아웃</a>
		<a class = "index" href="createUser.jsp">회원가입</a>
		<a class = "index" href="changePwdForm.jsp">암호변경</a>
	</div>
		
	</center>
</body>
</html>