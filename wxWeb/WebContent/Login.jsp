<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登录</title>
</head>
<body>
<form action="backdenglu" method="post">
     <table>
         <tr>
         	<td><label>登录名: </label></td>
             <td><input type="text" id="name" name="name" ></td>
         </tr>
         <tr>
         	<td><label>密   码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="登录"></td>
         </tr>
     </table>
     <font color="red">${requestScope.message }</font>
</form>
</body>
</html>