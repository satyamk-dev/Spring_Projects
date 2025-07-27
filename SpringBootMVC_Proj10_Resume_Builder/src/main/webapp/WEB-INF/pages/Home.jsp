<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="fm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<style>
*{
padding:0px;
margin:0px;
}
  #main {
      display: flex;
      align-items: center;
      flex-direction: column;
      height: 100vh; /* Full viewport height */
      background-color: #121212;
    }

 #btn {
    border: 2px solid yellow;
    border-radius: 4px;
    font-weight: bold;
    background-color: black;
    color: yellow;
    padding: 10px 20px;
    cursor: pointer;
    transition: all 0.3s ease;
  }

  #btn:hover {
    background-color: yellow;
    color: black;
    transform: scale(1.05);
    box-shadow: 0 0 10px yellow;
  }

</style>
<body>
<div id="main">
<h1 style="font-size:80px; text-align:center; color:purple">Welcome To Resume Builder Web Page</h1>
<hr>
<br>
<br>
<a href="resume"><button id="btn">Create Resume</button></a>

</div>
</body>
</html>