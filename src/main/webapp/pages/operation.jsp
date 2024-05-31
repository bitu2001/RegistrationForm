<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="operation">

User By ID: <input id="uid" name="UId" /><br>

<select name="ddString">

<option value="select">Select Records</option>

 <option value="update">Update Records</option>

<option value="delete">Delete Records</option>

</select>

<input type="submit" value="Click Now"/>

</form>
<h4>User Name: ${userobj.name }</h4><br>
<h4>User Email: ${userobj.email }</h4><br>
<h4>User Gender: ${userobj.gender }</h4><br>
<h4>User Hobby ${userobj.hobby }</h4>
</body>
</html>