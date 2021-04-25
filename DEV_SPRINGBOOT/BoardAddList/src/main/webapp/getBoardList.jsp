<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/commons.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<title>�� ���</title>
</head>
<body>
	<center>
		<h1 class = "index">�� ���</h1>
		<h3 class = "index">
			${user.name}��! ȯ���մϴ�.<a href="logout.do">Log-out</a>
		</h3>
		<div class="container">
			<table border="1" cellpadding="0" cellspacing="0" width="700" class="table table-hover fw-bold">
				<thead class="table-dark">
					<tr>
						<th width="100">��ȣ</th>
						<th width="200">����</th>
						<th width="150">�����</th>
					</tr>
				</thead>
				<tbody class="table-dark">
					<c:forEach items="${boardList}" var="board">
					
					<tr>
						<td>${board.boardNo}</td>
						<td align="left"><a href="getBoard.do?boardNo=${board.boardNo}">
								${board.boardTitle}</a></td>
						<td>${board.boardDate}</td>
					</tr>
					</c:forEach>
				</tbody>
				<tfoot>
				<tr>
					<td></td>
					<td align="center"><a href="insertBoard.jsp">���� ���</a></td>
					<td></td>
				</tr>
				</tfoot>
			</table>
		</div>
		<br>
		
	</center>
</body>
</html>