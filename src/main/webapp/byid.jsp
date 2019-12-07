<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form>
		编号：<input type="text" name="id" value="${param.id}"><br><br>
		品牌:<input type="text" name="name"><br><br>
		分类：<select id="kid" name="kid"><option>====请选择====</option></select><br><br>
		价格：<input type="text" name="price"><br><br>
	</form>
</body>
<script type="text/javascript">
	var id=${param.id}
	$.ajax({
		url:"byid",
		data:{id:id},
		success:function(list){
			$("[name=name]").val(res.name);
			$("[name=kid]").val(res.kid);
			$("[name=price]").val(res.price);
		}
	})
</script>
</html>