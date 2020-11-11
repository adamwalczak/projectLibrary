<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Biblioteka internetowa</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

</head>
<body>

<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="/" class="current">Strona główna</a></li>
            <li><a href="/books">Katalog książek</a></li>
			<li><a href="/books">Logowanie</a></li>
    	</ul>
    </div>
<!-- end of menu -->

<div id="templatemo_header">
    	<div id="templatemo_special_offers">
        </div>

        <div id="templatemo_new_books">

        </div>
    </div>
<!-- end of header -->

    <div id="templatemo_content">
    	
        <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">

            </div>
			<div class="templatemo_content_left_section">

            </div>
            
            <div class="templatemo_content_left_section">                

			</div>
        </div>
 <!-- end of content left -->       
 
<f:form id="author-form" method="post" modelAttribute="author">
	<table class="form-auth">
		<tr>
			<td><f:label path="name">Imię i nazwisko:</f:label></td>
			<td><f:input path="name" placeholder="brak" type="text" /></td>
		</tr>
		<tr>
			<td><f:label path="country">Kraj:</f:label></td>
			<td><f:input path="country" placeholder="..." type="text"/></td>
			
		</tr>
		<tr>
			<td><f:button>Wyślij</f:button></td>
		</tr>
	</table>
</f:form> 

        <!-- end of content right -->
    

    <!-- end of content -->
    
    <div id="templatemo_footer">
    
	       <a href="subpage.html">Home</a> | <a href="subpage.html">Search</a> | <a href="subpage.html">Books</a> | <a href="#">New Releases</a> | <a href="#">FAQs</a> | <a href="#">Contact Us</a><br />
        Copyright © 2024 <a href="#"><strong>Your Company Name</strong></a> 
	</div> 
    <!-- end of footer -->

</div> 
<!-- end of container -->	
	

</body>
</html>