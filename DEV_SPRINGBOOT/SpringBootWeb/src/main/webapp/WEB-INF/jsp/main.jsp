<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head><title>1-10까지의 합</title></head>
<body>
<%
	int sum = 0;
	for (int i = 1 ; i <= 5 ; i++) {
		sum = sum + i;
	}
%>

<%
	int testValue = 62;	
%>
1 부터 5까지의 합은 <%= sum %> 입니다.<br>
<%= testValue %>


</body>
</html>