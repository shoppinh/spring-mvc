<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chu</title>
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700"
	rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.0.9/css/all.css"
	rel="stylesheet">
<link href="<c:url value='/template/web/css/aos.css'/>" rel="stylesheet">
<link href="<c:url value='/template/web/css/ekko-lightbox.css'/>" rel="stylesheet">
<link href="<c:url value='/template/web/styles/bootstrap.css'/>" rel="stylesheet">
<link href="<c:url value='/template/web/styles/main.css'/>" rel="stylesheet">
</head>
  <body id="top">
  <!-- header -->
  	<%@include file="/common/web/header.jsp" %>
  	<!-- Body -->
	<dec:body/>
	<!-- Footer -->
  	<%@include file="/common/web/footer.jsp" %>
	
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script src="<c:url value='/template/web/js/aos.js'/>"></script>
    <script src="<c:url value='/template/web/js/ekko-lightbox.min.js'/>"></script>
    <script src="<c:url value='/template/web/scripts/main.js'/>"></script>
  </body>
</html>