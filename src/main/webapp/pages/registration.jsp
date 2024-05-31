<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="userDetails" method="post">
  <div class="form-group">
    <label for="userName">User Name</label>
    <input type="text" class="form-control" id="userName" name="name" placeholder="Enter user name">
  </div>
  
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="text" class="form-control" id="email" aria-describedby="emailHelp" name="email" placeholder="Enter email">
  </div>
  
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>
  
  <div class="form-group">
    <label for="gender">Gender</label>
    <select class="form-control" id="gender" name="gender">
      <option value="">Select gender</option>
      <option value="male">Male</option>
      <option value="female">Female</option>
    </select>
  </div>
  
  <div class="form-group">
    <label for="hobby">Hobby</label>
    <input type="text" class="form-control" id="hobby" name="hobby" placeholder="Enter hobby">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>