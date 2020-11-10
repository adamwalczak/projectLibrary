<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Katalog książek</title>
<link rel="stylesheet" type="text/css" href="/styl.css"/>
</head>
<body>

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