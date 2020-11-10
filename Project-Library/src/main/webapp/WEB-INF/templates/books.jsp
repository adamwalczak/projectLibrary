<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="UTF-8">
<title>Katalog książek</title>
<link rel="stylesheet" type="text/css" href="/styl.css"/> -->


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
            <li><a href="index.html" class="current">Home</a></li>
            <li><a href="subpage.html">Search</a></li>
            <li><a href="subpage.html">Books</a></li>            
            <li><a href="subpage.html">New Releases</a></li>  
            <li><a href="#">Company</a></li> 
            <li><a href="#">Contact</a></li>
    	</ul>
    </div>

<h1>Wszystkie książki</h1>

<c:forEach var="book" items="${books}">
<div class="book">
<p><span class="book-name">${book.title}</span></p>
<p>Autor: <span class="book-author">${book.authorBean.name}</span></p>
<p>Gatunek: <span class="book-category">${book.category}</span></p>
<p>Opis: <span class="book-description">${book.description}</span></p>
<p>Dostępność: <span class="book-available">${book.available}</span></p>
</div>
</c:forEach>


</body>
</html>