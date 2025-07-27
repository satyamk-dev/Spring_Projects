<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resume Form</title>
<style>
  #main {
      display: flex;
      align-items: center;
      flex-direction: column;
      
  }
  
  table, td, th {
      border: 2px solid white;
      padding: 10px;
      background-color: cyan;
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
    box-shadow: 0 0 10px red;
  }
</style>
</head>
<body>

<div id="main">
  <h1 style="font-size:80px; text-align:center; color:red">Let's Create Resume</h1>

  <fm:form action="report" method="post" modelAttribute="rusm">
    <table>
      <tr class="fream">
        <td>Enter Full Name</td>
        <td><fm:input path="name" placeholder="E.g: SATYAM KUMAR" required="true"/></td>

        <td>Specialize</td>
        <td><fm:input path="title" placeholder="E.g: Java Developer" required="true"/></td>
      </tr>

      <tr class="fream">
        <td>Enter Mobile</td>
        <td><fm:input path="mobile" placeholder="E.g: 9955334422" required="true"/></td>

        <td>Enter Email</td>
        <td><fm:input path="mail" placeholder="E.g: abc123@gmail.com"  required="true"/></td>
      </tr>

      <tr class="fream">
        <td>Enter Location</td>
        <td><fm:input path="address" placeholder="E.g: Ameerpet, Hyderabad"  required="true"/></td>

        <td>Nationality</td>
        <td><fm:input path="nationality" placeholder="E.g: INDIAN"/></td>
      </tr>

      <tr class="fream">
        <td>Objective</td>
        <td colspan="3"><fm:textarea path="objective" rows="4" cols="80" required="true"/></td>
      </tr>

      <tr class="fream">
        <td>College</td>
        <td><fm:input path="college" placeholder="E.g: Aravali Institute of Technical Studies,Udaipur" required="true"/></td>

        <td>University/Board</td>
        <td><fm:input path="university" placeholder="E.g: Rajasthan Technical Unversity " required="true"/></td>
      </tr>
      <tr class="fream">
      
        <td>Major/Stream</td>
        <td><fm:input path="stream" placeholder="E.g: Computer Science Eng."  required="true"/></td>

        <td>Percentage/CGPA</td>
        <td><fm:input path="division" placeholder="E.g: 75% or 8.5 CGPA" required="true"/></td>
      </tr>
      <tr>
       <td>Course</td>
        <td><fm:input path="course" placeholder="E.g: B.Tech" required="true"/></td>
        
        <td>PastOut</td>
        <td><fm:input path="past_date" type="date" required="true"/></td>
      
      </tr>

      <tr class="fream">
        <td>Skills</td>
        <td colspan="3"><fm:textarea path="skills" rows="4" cols="80" placeholder="E.g: Core JAVA, Spring, ReactJS" required="true"/></td>
      </tr>

      <tr class="fream">
        <td>Projects Title</td>
        <td colspan="3"><fm:input path="project_title" rows="4" cols="80" placeholder="E.g: Project Title" required="true"/></td>
      </tr>
      
        <tr class="fream">
        <td>Projects Details</td>
        <td colspan="3"><fm:textarea path="project" rows="4" cols="80" placeholder="E.g: Project Details" required="true"/></td>
      </tr>

      <tr class="fream">
        <td>Hobbies</td>
        <td colspan="3"><fm:textarea path="hobbies" rows="4" cols="80" placeholder="E.g: Hiking, Cooking, Traveling" required="true"/></td>
      </tr>

    </table>
    <br/>
    <a href="report"><button id="btn" type="submit" >GO Download Resume </button></a>
    
  </fm:form>
</div>

</body>
</html>
