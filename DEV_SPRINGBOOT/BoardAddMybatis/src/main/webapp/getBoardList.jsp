<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <style type="text/css">
			li {list-style: none; float: left; padding: 6px;}
		</style>
 
<title>�� ���</title>
</head>
<body>
	<center>
		<h1>�� ���</h1>
		<h3>
			${user.name}��! ȯ���մϴ�...<a href="logout.do">Log-out</a>
		</h3>
		<div class="container">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<thead>
					<tr>
						<th bgcolor="orange" width="100">��ȣ</th>
						<th bgcolor="orange" width="200">����</th>
						<th bgcolor="orange" width="150">�ۼ���</th>
						<th bgcolor="orange" width="150">�����</th>
						<th bgcolor="orange" width="150">��ȸ��</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${boardList}" var="board">
					0
					<tr>
						<td>${board.board_no}</td>
						<td align="left"><a href="getBoard.do?board_no=${board.board_no}">
								${board.board_title}</a></td>
						<td>${board.user_code}</td>
						<td>${board.board_date}</td>
						<td>${board.rating}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
		  <ul>
		    <c:if test="${pageMaker.prev}">
		    	<li><a href="getBoardList.do${pageMaker.makeQuery(pageMaker.startPage - 1)}">����</a></li>
		    </c:if> 
		
		    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
		    	<li><a href="getBoardList.do${pageMaker.makeQuery(idx)}">${idx}</a></li>
		    </c:forEach>
		
		    <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		    	<li><a href="getBoardList.do${pageMaker.makeQuery(pageMaker.endPage + 1)}">����</a></li>
		    </c:if> 
		  </ul>
		</div>
		
		<br> <a href="insertBoard.jsp">���� ���</a>
	</center>
</body>
</html>