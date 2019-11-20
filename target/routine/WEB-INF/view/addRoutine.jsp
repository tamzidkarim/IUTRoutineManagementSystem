<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ahmedrafayat.model.Faculty" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/23/2018
  Time: 4:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add routine entries</title>

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
                    <li>Routine</li>
                </ul>
                <h1 class="white-text">Create Routine</h1><br>
                <c:choose>
                    <c:when test="${requestScope.added eq 'okay'}">
                       <h3 class="white-text">Successfully Added</h3>
                    </c:when>
                    <c:when test="${requestScope.added eq 'violation'}">
                        <h3 class="white-text">Entry already exists!</h3><br>
                        <h5 class="white-text">This slot is not available :(</h5>
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
    <form action="addRoutine" method="post">
        <%
            System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
        %>
        <input type="hidden" value="<%=request.getParameter("department")%>" name="department">
        <input type="hidden" value="<%=request.getParameter("semester")%>" name="semester">
        Department Selected : <%=request.getParameter("department")%><br>
        Semester Selected : <%=request.getParameter("semester")%><br>
        <%
        System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
        %>
        <select name="day" class="form-group">
            <option selected disabled>Select Day</option>
            <option value="Monday">Monday</option>
            <option value="Tuesday">Tuesday</option>
            <option value="Wednesday">Wednesday</option>
            <option value="Thursday">Thursday</option>
            <option value="Friday">Friday</option>
        </select>
        <select name="slot" class="form-group">
            <option selected disabled>Select Day</option>
            <option value="1">08:00 - 09:15</option>
            <option value="2">09:15 - 10:30</option>
            <option value="3">10:30 - 11:45</option>
            <option value="4">11:45 - 01:00</option>
            <option value="5">02:30 - 03:45</option>
            <option value="6">03:45 - 05:00</option>
        </select>
        <select name="course" class="form-group">
            <option selected disabled>Select Course</option>
            <%
                List<Integer> idlist = (List<Integer>) request.getAttribute("courseid_list");
                for(int i=0;i<idlist.size();i++){
            %>
            <option value="<%=idlist.get(i).toString()%>"><%=idlist.get(i).toString()%></option>
            <%
                System.out.println(idlist.get(i).toString());}
            %>
        </select>
        <select name="room" class="form-group">
            <option selected disabled>Select Room</option>
            <option value="A101">A101</option>
            <option value="A102">A102</option>
            <option value="B101">B101</option>
            <option value="B102">B102</option>
        </select>
        <select name="faculty" class="form-group">
            <option selected disabled>Select Teacher</option>
            <%
                List<Faculty> flist = (List<Faculty>) request.getAttribute("faculty_name");
                for(int i=0;i<flist.size();i++){
            %>
            <option value="<%=flist.get(i).getName()%>"><%=flist.get(i).getName()%></option>
            <%
                }
            %>
        </select>
        <button type="submit" class="btn btn-primary form-group">Add entry</button>
    </form>
    <%
        System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
    %>
</div>
<%@include file="./footer.jsp"%>
<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/jquery.nice-select.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>
<%
    System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
%>
</body>
</html>
