<%@ page import="com.ahmedrafayat.model.Faculty" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/25/2018
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Routine</title>
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
<%@include file="./header.jsp" %>

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
                    <li>Edit</li>
                </ul>
                <h1 class="white-text">Edit Routine</h1>

            </div>
        </div>
    </div>
</div>

<div class="container">
    <input type="hidden" value="<%=request.getParameter("day")%>" name="day">
    <input type="hidden" value="<%=request.getParameter("slot_number")%>" name="slot_number">
    Day selected is : <c:out value="${requestScope.day}"/><br>
    Slot selected is : <c:out value="${requestScope.slot_number}"/><br>
    Department selected is : <c:out value="${requestScope.department}"/><br>
    Semester selected is : <c:out value="${requestScope.semester}"/><br><br>
    <form action="editRoutine" method="post">
        <%
            System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
        %>
        <input type="hidden" value="<%=request.getAttribute("department")%>" name="department">
        <input type="hidden" value="<%=request.getAttribute("semester")%>" name="semester">
        <input type="hidden" value="<%=request.getAttribute("day")%>" name="day">
        <input type="hidden" value="<%=request.getAttribute("slot_number")%>" name="slot_number">
        <%
            System.out.println("-------------------------------------ksdljvfjlkgn---------------------");
        %>
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
        <button type="submit" class="btn btn-primary form-group">Edit entry</button>
    </form>
</div>


<%@include file="./footer.jsp" %>

<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/jquery.nice-select.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>

</body>
</html>
