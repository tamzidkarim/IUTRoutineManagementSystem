<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/20/2018
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Routine</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="<c:url value="/resources/css/font-awesome.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/select2.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/util.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/perfect-scrollbar.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/nice-select.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap_all.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/style_all.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-dropdownhover.min.css"/> " rel="stylesheet">
    <style type="text/css">
        .dropdown:hover > .dropdown-menu {
            display: block;
        }

        .dropdown > .dropdown-toggle:active {
            /*Without this, clicking will make it sticky*/
            pointer-events: none;
        }
    </style>
</head>
<body>
<%@include file="./header.jsp" %>
<!-- Hero-area -->
<div class="hero-area section">

    <!-- Backgound Image -->
    <div class="bg-image bg-parallax overlay"
         style="background-image:url(<c:url value="/resources/images/iut.jpg"/>)"></div>
    <!-- /Backgound Image -->

    <div class="container">
        <div class="row">
            <div class="col-md-10 col-md-offset-1 text-center">
                <ul class="hero-area-tree">
                    <li><a href="home">Home</a></li>
                    <li>Routine</li>
                </ul>
                <h1 class="white-text">Create Routine</h1>

            </div>
        </div>
    </div>

</div>
<!-- /Hero-area -->
<div class="container">
    <br>
    <c:choose>
        <c:when test="${not empty requestScope.day}">
            Day selected is : <c:out value="${requestScope.day}"/><br>
            Slot selected is : <c:out value="${requestScope.slot_number}"/><br><br>
        </c:when>
        <c:otherwise>

        </c:otherwise>
    </c:choose>
    <form method="post" action="apply">
        <div class="form-group col-lg-2">
            <c:choose>
                <c:when test="${not empty requestScope.day}">
                    <input type="hidden" name="day" value="${requestScope.day}">
                    <input type="hidden" name="slot_number" value="${requestScope.slot_number}">
                </c:when>
                <c:otherwise>

                </c:otherwise>
            </c:choose>
            <select name="semester" class="form-group form-control">
                <option selected disabled>Semester</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="31">31</option>
                <option value="32">32</option>
                <option value="41">41</option>
                <option value="42">42</option>
            </select>
        </div>
        <div class="form-group col-lg-2">
            <select name="department" class="form-group form-control">
                <option selected disabled>Select Department</option>
                <option value="EEE">EEE</option>
                <option value="CSE">CSE</option>
                <option value="MCE">MCE</option>
                <option value="CEE">CEE</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary form-group" name="button" value="apply">Apply</button>
    </form>
</div>
<%@include file="./footer.jsp" %>
<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/jquery.nice-select.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>
</body>
</html>
