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
	<h3>添加页面</h3>
	<form>
		编号：<input type="text" name="id"><br><br>
		品牌：<select name="bid">
			<option>====请选择====</option>
		</select><br><br>
		分类：<select id="kid"><option>====请选择====</option></select><br><br>
		价格：<input type="text" name="price"><br><br>
		<input type="button" value="保存" onclick="bao">&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="glist"><input type="button" value="关闭"></a>
	</form>
</body>
<script type="text/javascript">
	for(var i in res){
		$("(name=bid)").append("<option value="+res[i].id+">"+res[i].bname+"</option>")
	}
	function bao(b){
	alert(1)
	$.ajax({
		url:"adds",
		data:$("form").serialize(),
		success:function(res){
			if(res!=null){
			alert("添加成功");
			location="glist.jsp";
			}else{
				alert("添加失败");
			}
		}
	})
	}
</script>
</html>