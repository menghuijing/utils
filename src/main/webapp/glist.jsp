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
<a href="add.jsp">添加</a>
<input type="button" class="del" value="批删">
<form action="glist" method="post">
	<select name="bname"></select>
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>全选</td>
		<td>编号</td>
		<td>品牌</td>
		<td>分类</td>
		<td>发布时间</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${pi.list}" var="l">
	<tr>
		<td><input type="checkbox" name="box" value="${l.id}"></td>
		<td>${l.id}</td>
		<td>${l.bname}</td>
		<td>${l.kname}</td>
		<td>${l.datea}</td>
		<td>
			<a href="byid">详情</a>
			<a href="update.jsp">编辑</a>
		</td>
	</tr>
	</c:forEach>
	<tr>
			<td colspan="8">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${pi.pageNum<1?pi.pageNum:pi.pageNum-1}">上一页</a>
				<a href="?pageNum=${pi.pageNum>pi.pages?pi.pageNum:pi.pageNum+1}">下一页</a>
				<a href="?pageNum=${pi.pages}">尾页</a>
			</td>
		</tr>
</table>
</body>
<script type="text/javascript">
	$(".del").click(function(){
		var id=$("[name=box]").click(function(){
			return $(this).val();
		}).get().join(",");
		$.ajax({
			url:"delete",
			data:{id:ids},
			success:function(){
				alert("删除成功")
				location="glist";
			}
		})
	})
	
</script>
</html>