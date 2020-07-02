<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h3>Welcome to student portal</h3>
</head>
<body>
 <form method="get" action="/fetch"  commandName="studForm">

  <label for="id">Enter student Id:</label><br>
  <input type="text" id="idid" name="id"><br><br>
  <input type="submit" value="Submit">
  
  <br><br>
  <div>
  <table style="width:100%;color: blue;" border="1" >
  <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>CGPA</th>
    <th>LOCATION</th>
  </tr>
  <tr>
    <td>${id}</td>
    <td>${name}</td>
    <td>${cgpa}</td>
    <td>${location}</td>
  </tr>
</table>
  
  </div>
  
</form>


</body>
</html>