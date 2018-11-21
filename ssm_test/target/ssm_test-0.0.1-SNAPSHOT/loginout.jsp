<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="com.Hong.ssm.utils.ConstantUtil" %>
<%
		if(session.getAttribute(ConstantUtil.SESSION_KEY)!=null){
			session.removeAttribute(ConstantUtil.SESSION_KEY);
			session.invalidate();
		}

			out.print("<script type='text/javascript'>");
			out.print("window.top.location='index.jsp';");
			out.print("</script>");
		

%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>