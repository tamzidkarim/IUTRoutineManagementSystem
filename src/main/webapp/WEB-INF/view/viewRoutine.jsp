<%@ page import="java.util.List" %>
<%@ page import="com.ahmedrafayat.model.Routine" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.Collections" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/23/2018
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>View Routine</title>
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
<div class="container">
    <form id="selection" method="post" action="showRoutine">
        <select name="semester" class="form-group" id="semester">
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
        <select name="department" class="form-group" id="department">
            <option selected disabled>Select Department</option>
            <option value="EEE">EEE</option>
            <option value="CSE">CSE</option>
            <option value="MCE">MCE</option>
            <option value="CEE">CEE</option>
        </select>
        <button type="submit" class="btn btn-primary form-group" name="button" value="view">View Routine</button>
    </form>
</div>
<%
    List<String> mlist = (List<String>) request.getAttribute("monList");
    List<String> mlist1 = (List<String>) request.getAttribute("monList1");
    List<String> mlist2 = (List<String>) request.getAttribute("monList2");
    List<String> tlist = (List<String>) request.getAttribute("tueList");
    List<String> tlist1 = (List<String>) request.getAttribute("tueList1");
    List<String> tlist2 = (List<String>) request.getAttribute("tueList2");
    List<String> wlist = (List<String>) request.getAttribute("wedList");
    List<String> wlist1 = (List<String>) request.getAttribute("wedList1");
    List<String> wlist2 = (List<String>) request.getAttribute("wedList2");
    List<String> thlist = (List<String>) request.getAttribute("thuList");
    List<String> thlist1 = (List<String>) request.getAttribute("thuList1");
    List<String> thlist2 = (List<String>) request.getAttribute("thuList2");
    List<String> flist = (List<String>) request.getAttribute("friList");
    List<String> flist1 = (List<String>) request.getAttribute("friList1");
    List<String> flist2 = (List<String>) request.getAttribute("friList2");

%>
<div class="hero-area section container">
    <table class="table" border="2" align="center">
        <tr>
            <th align="center">Day/Period
            <th align="center">08:00-09:15
            <th align="center">09:15-10:30
            <th align="center">10:30-11:45
            <th align="center">11:45-01:00
            <th align="center">01:00-02:30
            <th align="center">02:30-03:45
            <th align="center">03:45-05:00
        </tr>
        <tbody>
        <tr>
            <th align="center">MONDAY
            <td align="center"><%if(!mlist.get(1).equals(""))out.print(mlist.get(1));%><br><%=mlist1.get(1)%><br><%=mlist2.get(1)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="1">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!mlist.get(2).equals(""))out.print(mlist.get(2));%><br><%=mlist1.get(2)%><br><%=mlist2.get(2)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!mlist.get(3).equals(""))out.print(mlist.get(3));%><br><%=mlist1.get(3)%><br><%=mlist2.get(3)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="3">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!mlist.get(4).equals(""))out.print(mlist.get(4));%><br><%=mlist1.get(4)%><br><%=mlist2.get(4)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="4">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td rowspan="5" align="center"><br><br>L<br>U<br>N<br>C<br>H
            <td align="center"><%if(!mlist.get(5).equals(""))out.print("sadgjhbf");%><br><%=mlist1.get(5)%><br><%=mlist2.get(5)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="5">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!mlist.get(6).equals(""))out.print("sadgjhbf");%><br><%=mlist1.get(6)%><br><%=mlist2.get(6)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Monday">
                    <input type="hidden" name="slot_number" value="6">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
        </tr>
        <tr>
            <th align="center">TUESDAY
            <td align="center"><%if(!tlist.get(1).equals(""))out.print(tlist.get(1));%><br><%=tlist1.get(1)%><br><%=tlist2.get(1)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="1">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!tlist.get(2).equals(""))out.print(tlist.get(2));%><br><%=tlist1.get(2)%><br><%=tlist2.get(2)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!tlist.get(3).equals(""))out.print(tlist.get(3));%><br><%=tlist1.get(3)%><br><%=tlist2.get(3)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="3">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!tlist.get(4).equals(""))out.print(tlist.get(4));%><br><%=tlist1.get(4)%><br><%=tlist2.get(4)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="4">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!tlist.get(5).equals(""))out.print(tlist.get(5));%><br><%=tlist1.get(5)%><br><%=tlist2.get(5)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="5">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!tlist.get(6).equals(""))out.print(tlist.get(6));%><br><%=tlist1.get(6)%><br><%=tlist2.get(6)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Tuesday">
                    <input type="hidden" name="slot_number" value="6">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
        </tr>
        <tr>
            <th align="center">WEDNESDAY
            <td align="center"><%if(!wlist.get(1).equals(""))out.print(wlist.get(1));%><br><%=wlist1.get(1)%><br><%=wlist2.get(1)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>

            <td align="center"><%if(!wlist.get(2).equals(""))out.print(wlist.get(2));%><br><%=wlist1.get(2)%><br><%=wlist2.get(2)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!wlist.get(3).equals(""))out.print(wlist.get(3));%><br><%=wlist1.get(3)%><br><%=wlist2.get(3)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="3">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!wlist.get(4).equals(""))out.print(wlist.get(4));%><br><%=wlist1.get(4)%><br><%=wlist2.get(4)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="4">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!wlist.get(5).equals(""))out.print(wlist.get(5));%><br><%=wlist1.get(5)%><br><%=wlist2.get(5)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="5">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!wlist.get(6).equals(""))out.print(wlist.get(6));%><br><%=wlist1.get(6)%><br><%=wlist2.get(6)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Wednesday">
                    <input type="hidden" name="slot_number" value="6">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
        </tr>
        <tr>
            <th align="center">THURSDAY
            <td align="center"><%if(!thlist.get(1).equals(""))out.print(thlist.get(1));%><br><%=thlist1.get(1)%><br><%=thlist2.get(1)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="1">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!thlist.get(2).equals(""))out.print(thlist.get(2));%><br><%=thlist1.get(2)%><br><%=thlist2.get(2)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!thlist.get(3).equals(""))out.print(thlist.get(3));%><br><%=thlist1.get(3)%><br><%=thlist2.get(3)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="3">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!thlist.get(4).equals(""))out.print(thlist.get(4));%><br><%=thlist1.get(4)%><br><%=thlist2.get(4)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="4">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!thlist.get(5).equals(""))out.print(thlist.get(5));%><br><%=thlist1.get(5)%><br><%=thlist2.get(5)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="5">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!thlist.get(6).equals(""))out.print(thlist.get(6));%><br><%=thlist1.get(6)%><br><%=thlist2.get(6)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Thursday">
                    <input type="hidden" name="slot_number" value="6">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>

        </tr>
        <tr>
            <th align="center">FRIDAY
            <td align="center"><%if(!flist.get(1).equals(""))out.print(flist.get(1));%><br><%=flist1.get(1)%><br><%=flist2.get(1)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="1">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!flist.get(2).equals(""))out.print(flist.get(2));%><br><%=flist1.get(2)%><br><%=flist2.get(2)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="2">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!flist.get(3).equals(""))out.print(flist.get(3));%><br><%=flist1.get(3)%><br><%=flist2.get(3)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="3">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!flist.get(4).equals(""))out.print(flist.get(4));%><br><%=flist1.get(4)%><br><%=flist2.get(4)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="4">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!flist.get(5).equals(""))out.print(flist.get(5));%><br><%=flist1.get(5)%><br><%=flist2.get(5)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="5">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
            <td align="center"><%if(!flist.get(6).equals(""))out.print(flist.get(6));%><br><%=flist1.get(6)%><br><%=flist2.get(6)%><br>
                <form id="edit_selection" method="post" action="editRoutineDeptSelect">
                    <input type="hidden" name="day" value="Friday">
                    <input type="hidden" name="slot_number" value="6">
                    <button type="submit" class="btn btn-default form-group" name="button" value="view">Edit</button>
                </form>
        </tr>
        </tbody>
    </table>
</div>
<%@include file="./footer.jsp" %>

<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/> "></script>
<script src="<c:url value="/resources/js/jquery.nice-select.js"/> "></script>
<script src="<c:url value="/resources/js/main_all.js"/> "></script>

</body>
</html>
