<%@page contentType="text/html; charset=EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 상세</title>
</head>
<body>
	<center>
		<h1>글 상세</h1>
		<a href="logout.do">Log-out</a>
		
			<form action="updateBoard.do" method="post">
			<input type="text" name="boardNo" style="display: none" value="${board.boardNo}"/>
				<table border="1" cellpadding="0" cellspacing="0">
					<tr>
						<td bgcolor="orange">제목</td>
						<td align="left"><input type="text" name="boardTitle" value="${board.boardTitle }"/></td>
						<td align="left"></td>
					</tr>
					<tr>
						<td bgcolor="orange">내용</td>
						<td align="left"><textarea name="boardContents" cols="40" rows="10">${board.boardContents}</textarea></td>
					</tr>
					<tr>
						<td bgcolor="orange">등록일</td>
						<td align="left">${board.boardDate }</td>
					</tr>
					<tr>
						<td bgcolor="orange">조회수</td>
						<td align="left">${board.boardHits }</td>
					</tr>
						<tr>
						<td bgcolor="orange">좋아요</td>
						<td align="left">${board.boardRating }</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="글 수정" /></td>
					</tr>
				</table>
			</form>
		
		<hr>
		<a href="insertBoard.jsp">글등록</a>
		<a href="deleteBoard.do?boardNo=${board.boardNo }">글삭제</a>
		<a href="getBoardList.do">글목록</a>
	</center>
</body>
</html>
