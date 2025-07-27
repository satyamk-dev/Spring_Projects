<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resume Report</title>
<style>
*{
padding:0px;
margin:0px;
}

body{
display:flex;
justify-content:center;
flex-direction:column;
align-items:center;
}

#pdfSize{
width:794px;
height:100%;
display:flex;
 justify-content: center;

border:1px solid black;

}


  #resume {
  width:760px;
  height:fit-content;
  padding:30px;
    background-color: #fff;
    box-sizing: border-box;
  }

  hr {
    border: none;
    border-top: 1px solid #ccc;
    margin: 2px 0;
  }

  .header {
    text-align: center;
    
  }

  .header h2 {
    font-size: 32px;
    margin-bottom: 5px;
  }

  .contact {
    text-align: center;
    font-size: 14px;
    margin-bottom: 10px;
  }

  .section-title {
    background-color: #f4f4f4;
    padding: 5px;
    font-size: 18px;
    font-weight: bold;
    border-left: 4px solid #000;
  }

  .section-content {
    margin: 5px 0 10px 10px;
    font-size: 15px;
  }

  #btn {
    margin-top: 20px;
    border: 2px solid red;
    border-radius: 4px;
    font-weight: bold;
    background-color: black;
    color: red;
    padding: 10px 20px;
    cursor: pointer;
    transition: all 0.3s ease;
  }

  #btn:hover {
    background-color: blue;
    color: white;
    transform: scale(1.05);
    box-shadow: 0 0 10px red;
  }
</style>
</head>
<body>

<h1 style="color:#99FF33; font-size:35px;">Download Your Resume 😎</h1>
<br>

<div id="pdfSize">


<div id="resume">
  <div class="header">
    <h2>${name}</h2>
    <p style="font-size: 16px;">${title} | Fresher</p>
  </div>

  <div class="contact">
    <p>📞 +91 ${mobile} | 📧 ${email}</p>
    <p>📍 ${location},${nationality}</p>
  </div>

  <hr>

  <div>
    <div class="section-title">Objective</div>
    <div class="section-content">
      ${objective}
    </div>
  </div>

  <div>
    <div class="section-title">Education</div>
    <div class="section-content">
    
    <table border="1">
    <thead>
    <tr>
    <th>Course</th>
    <th>Stream</th>
    <th>College</th>
    <th>University</th>
    <th> PERFORMANCE (%)</th>
    <th>YEAR OF PASSING</th>
    </tr>
    </thead>
    	<tbody>
    	<tr>
    	<td style="text-align:center; padding:3px;">${course}</td>
    	<td style="text-align:center; padding:3px;">${stream}</td>
    	<td style="text-align:center; padding:3px;">${college}</td>
    	<td style="text-align:center; padding:3px;">${unversity }</td>
    	<td style="text-align:center; padding:3px;">${grade}</td>
    	<td style="text-align:center; padding:3px;">${pastDate}</td>
    	</tr>
    	</tbody>
    </table>
    </div>
  </div>

  <div>
    <div class="section-title">Skills</div>
    <div class="section-content">
     ${skills}
    </div>
  </div>

  <div>
    <div class="section-title">Projects</div>
    <div class="section-content">
		<p><b>${ptitle}: </b>${project }</p>
    </div>
  </div>

  <div>
    <div class="section-title">Hobbies</div>
    <div class="section-content">
     ${hobbies}
    </div>
  </div>

  <div style="text-align:right; font-size:12px;">
    <b>Last Updated:</b> ${date}
  </div>
</div>


<!-- This end of pdfSize -->
</div>

<button id="btn" onclick="Download()">Download</button>

<script type="text/javascript">

const Download=()=>{
	const file = document.getElementById("resume");
	
	html2pdf().from(file).save("Your_Resume.pdf");
}
</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>
</body>
</html>
