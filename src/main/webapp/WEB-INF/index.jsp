<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Date</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1> Current count: ${countToShow}</h1>
	
	<a class="btn btn-dark" href="/addTwo">Add Two</a>
	<a class="btn btn-dark" href="/reset">reset</a>
	<div class="left">
		<a href="/dateTemplate">Date Template
		</a>
	</div>
	<div class="right">
		<a href="/timeTemplate">Time Template</a>
	</div>

</body>
</html>