<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Biblioteka internetowa</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="/templatemo_style.css" rel="stylesheet" type="text/css" />

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
        	<p>
                <span>JUŻ TERAZ!</span> Załóż konto w naszej bibliotece
        	</p>
			<a href="/new_account" style="margin-left: 50px;">Załóż konto...</a>
        </div>
        
        
        <div id="templatemo_new_books">
        	<p>
                Tylko zarejestrowani użytkownicy mogą rezerwować książki
        	</p>
        </div>
    </div>
<!-- end of header -->

    <div id="templatemo_content">
    	
        <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">
            	<h1>Categories</h1>
                <ul>
                    <li><a href="subpage.html">Donec accumsan urna</a></li>
                    <li><a href="subpage.html">Proin vulputate justo</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="#">Aliquam tristique dolor</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">Sed pellentesque placerat</a></li>
                    <li><a href="#">Suspen disse</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
            	</ul>
            </div>
			<div class="templatemo_content_left_section">
            	<h1>Bestsellers</h1>
                <ul>
                    <li><a href="#">Vestibulum ullamcorper</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="#">Praesent mattis varius</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="#">Flash Templates</a></li>
                    <li><a href="#">CSS Templates</a></li>
                    <li><a href="#">Web Design</a></li>
                    <li><a href="http://www.photovaco.com" target="_parent">Free Photos</a></li>
            	</ul>
            </div>
            
            <div class="templatemo_content_left_section">                
                <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
			</div>
        </div>
 <!-- end of content left -->       
 
 
         <div id="templatemo_content_right">
         
<c:forEach var="book" items="${books}">
<div class="templatemo_product_box">
<h1>${book.title}</h1>
<h3>${book.authorBean.name}</h3>
<p>Gatunek: <span class="book-category">${book.category}</span></p>
<div class="detail_button"><a href="/books/${book.bookId }">Czytaj więcej..</a></div>
          <c:choose>
			<c:when test="${book.available == true}">
			<div class="available_button"><span>Dostępny</span></div>
			<div class="buy_now_button"><a href="subpage.html">Zarezerwuj</a></div>
			</c:when>
			<c:otherwise>
			<div class="nonavailable_button"><span>Niedostępny</span></div>
			</c:otherwise>
			</c:choose>
</div>
</c:forEach>

		<p><a href="/books/page/0">Pierwsza strona    |</a>
		<c:if test="${pages.number != 0 }"><a href="/books/page/${pages.number-1 }"> Poprzednia strona    |</a></c:if>
		<c:if test="${pages.number != pages.totalPages -1}"><a href="/books/page/${pages.number+1 }">Następna strona</a></c:if>
		</p>
		
		
        <a href="subpage.html"><img src="templatemo_ads.jpg" alt="ads" /></a>
        </div>
        <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> 
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