<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/24/2018
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header id="header" class="transparent-nav">
    <div class="container">

        <div class="navbar-header">
            <!-- Logo -->

            <div class="navbar-brand">

                <a class="logo" href="home">
                    <img src="<c:url value="/resources/images/iutlogo.png"/>">
                    <span>IUT Routine Management System</span>
                </a>

            </div>
            <!-- /Logo -->

            <!-- Mobile toggle -->
            <button class="navbar-toggle">
                <span></span>
            </button>
            <!-- /Mobile toggle -->
        </div>

        <!-- Navigation -->
        <nav id="nav">
            <ul class="main-menu nav navbar-nav navbar-right">
                <li><a href="home" class="drop">Home</a></li>
                <li class="dropdown">
                    <a href="faculty" class="dropdown-toggle" data-toggle="dropdown">Faculties</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="viewfacultydropdown" style="color:black">View Faculties</a></li>
                        <li><a class="dropdown-item" href="addfacultydropdown" style="color:black">Add Faculties</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Courses</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="viewcoursedropdown" style="color:black">View Courses</a></li>
                        <li><a class="dropdown-item" href="addcoursedropdown" style="color:black">Add Courses</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="routinee" class="dropdown-toggle" data-toggle="dropdown">Routine</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="viewroutinedropdown" style="color:black">View Routine</a></li>
                        <li><a class="dropdown-item" href="addroutinedropdown" style="color:black">Add a routine entry</a></li>
                    </ul>
                </li>
                <li><a href="#">Users</a></li>
            </ul>
        </nav>
        <!-- /Navigation -->

    </div>
</header>

