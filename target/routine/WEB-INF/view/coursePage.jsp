<%@ page import="com.ahmedrafayat.model.Course" %>
<%@ page import="java.util.List" %>
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
    <title>Course</title>
    <link href="<c:url value="/resources/css/font-awesome.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/select2.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/util.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/perfect-scrollbar.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap_all.min.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/style_all.css"/> " rel="stylesheet"><link href="<c:url value="/resources/css/bootstrap-dropdownhover.min.css"/> " rel="stylesheet">
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
<!-- Hero-area -->
<div class="hero-area section">

    <!-- Backgound Image -->
    <div class="bg-image bg-parallax overlay" style="background-image:url(<c:url value="/resources/images/iut.jpg"/>)"></div>
    <!-- /Backgound Image -->

    <div class="container">
        <div class="row">
            <div class="col-md-10 col-md-offset-1 text-center">
                <ul class="hero-area-tree">
                    <li><a href="home">Home</a></li>
                    <li>Courses</li>
                </ul>
                <h1 class="white-text">List of Courses</h1>

            </div>
        </div>
    </div>
</div>

<div class="container">
    <br>
    <form method="post" action="viewcoursewithparams">
        <div class="form-row">
            <div class="form-group col-lg-3">
                <label for="department">Department</label>
                <select name="department" class="form-control" id="department">
                    <option selected disabled>Select Department</option>
                    <option value="EEE">EEE</option>
                    <option value="CSE">CSE</option>
                    <option value="MCE">MCE</option>
                    <option value="CEE">CEE</option>
                </select>
                <br>
                <button type="submit" class="btn btn-primary form-group" name="button">Refine Search</button>
            </div>
        </div>
        <br>
    </form>
</div>

<div class="container-table100">
    <div class="wrap-table100">
        <div class="table100 ver1 m-b-110">
            <div class="table100-head">
                <table>
                    <thead>
                    <tr class="row100 head">
                        <th class="cell100 column1">Course ID</th>
                        <th class="cell100 column2">Course Name</th>
                        <th class="cell100 column3">Credits</th>
                        <th class="cell100 column4">Course Type</th>
                        <th class="cell100 column5">Semester</th>
                        <th class="cell100 column6">Department</th>

                    </tr>
                    </thead>
                </table>
            </div>
            <%
                List<Course> courseList = (List<Course>) request.getAttribute("courseList");
                for (int i=0; i<courseList.size();i++)
                {
            %>
            <div class="table100-body js-pscroll">
                <table>
                    <tbody>
                    <tr class="row100 body">
                        <td class="cell100 column1"><%=courseList.get(i).getId()%></td>
                        <td class="cell100 column2"><%=courseList.get(i).getName()%></td>
                        <td class="cell100 column3"><%=courseList.get(i).getCredits()%></td>
                        <td class="cell100 column4"><%=courseList.get(i).getCourse_type()%></td>
                        <td class="cell100 column5"><%=courseList.get(i).getSemester()%></td>
                        <td class="cell100 column5"><%=courseList.get(i).getDeptname()%></td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <%
                }
            %>
        </div>
    </div>
</div>

<%@include file="./footer.jsp"%>

<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>
<script src="<c:url value="/resources/js/popper.js"/> "></script>
<script src="<c:url value="/resources/js/perfect-scrollbar.min.js"/> "></script>
<script src="<c:url value="/resources/js/main_scrollbar.js"/> "></script>
<script>
    $('.js-pscroll').each(function(){
        var ps = new PerfectScrollbar(this);

        $(window).on('resize', function(){
            ps.update();
        })
    });


</script>

</body>
</html>
