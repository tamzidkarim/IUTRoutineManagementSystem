<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/15/2018
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link href="<c:url value="/resources/css/bootstrap_all.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/style_all.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-dropdownhover.min.css"/> " rel="stylesheet">
    <style type="text/css">
        .dropdown:hover>.dropdown-menu {
            display: block;
        }

        .dropdown>.dropdown-toggle:active {
            /*Without this, clicking will make it sticky*/
            pointer-events: none;
        }
    </style>
</head>
<body>
<%@include file="./header.jsp"%>
<!-- Home -->
<div id="home" class="hero-area">

    <!-- Backgound Image -->
    <div class="bg-image bg-parallax overlay"
         style="background-image:url(<c:url value="/resources/images/iut.jpg"/>)"></div>
    <!-- /Backgound Image -->

    <div class="home-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <h1 class="white-text">Automated way to generate class routine</h1>
                    <p class="lead white-text">Easy and efficient way to make class rourine and keeping Information.</p>
                </div>
            </div>
        </div>
    </div>

</div>
<%@include file="./footer.jsp"%>
<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap-dropdownhover.min.js"/> "></script>
</body>
</html>
