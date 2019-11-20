<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/25/2018
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Faculty</title>
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

<div class="hero-area section">

    <!-- Backgound Image -->
    <div class="bg-image bg-parallax overlay" style="background-image:url(<c:url value="/resources/images/iut.jpg"/>)"></div>
    <!-- /Backgound Image -->

    <div class="container">
        <div class="row">
            <div class="col-md-10 col-md-offset-1 text-center">
                <ul class="hero-area-tree">
                    <li><a href="home">Home</a></li>
                    <li>Faculty</li>
                </ul>
                <h1 class="white-text">Add a Faculty</h1>
                <c:choose>
                    <c:when test="${requestScope.added eq 'okay'}">
                        <h3 class="white-text">Successfully Added Faculty</h3>
                    </c:when>
                    <c:when test="${requestScope.added eq 'violation'}">
                        <h3 class="white-text">Faculty already exists!</h3><br>
                        <h5 class="white-text">This name is not available :(</h5>
                    </c:when>
                    <c:otherwise>
                        <h3 class="white-text">gihdfgoud</h3>
                    </c:otherwise>
                </c:choose>

            </div>
        </div>
    </div>

</div>

<div class="container">
    <br>
    <form method="post" action="addfaculty">
        <div class="form-row">
            <div class="form-group col-lg-6">
                <label for="facultyname">Name</label>
                <input type="text" class="form-control" id="facultyname" placeholder="Enter name" name="facultyname">
                <br>
                <div class="form-row">
                    <div class="form-group col-lg-4">
                        <label for="priority">Priority</label>
                        <select name="priority" class="form-control" id="priority">
                            <option selected disabled>Select Priority</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                        </select>
                        <br>
                        <br>
                        <div class="form-group col-lg-3">
                            <button type="submit" class="btn btn-primary form-group" name="button">Apply</button>
                        </div>
                    </div>
                </div>

            </div>
            <div class="form-group col-lg-3">
                <label for="department">Department</label>
                <select name="department" class="form-control" id="department">
                    <option selected disabled>Select Department</option>
                    <option value="EEE">EEE</option>
                    <option value="CSE">CSE</option>
                    <option value="MCE">MCE</option>
                    <option value="CEE">CEE</option>
                </select>
            </div>
            <div class="form-group col-lg-3">
                <label for="designation">Designation</label>
                <select name="designation" class="form-control" id="designation">
                    <option selected disabled>Select Designation</option>
                    <option value="Professor">Professor</option>
                    <option value="Associate Professor">Associate Professor</option>
                    <option value="Assistant Professor">Assistant Professor</option>
                    <option value="Lecturer">Lecturer</option>
                </select>
            </div>
        </div>
        <br>
    </form>
</div>

<%@include file="./footer.jsp"%>
<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>
</body>
</html>
