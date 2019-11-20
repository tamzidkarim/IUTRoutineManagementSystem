<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rafayat
  Date: 11/12/2018
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Welcome</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/images/favicon_login.ico"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <<link href="<c:url value="/resources/css/font-awesome.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/icon-font.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/animate.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/hamburgers.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/animsition.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/select2.min.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/daterangepicker.css"/> " rel="stylesheet">
    <!--===============================================================================================-->
    <link href="<c:url value="/resources/css/util_login.css"/> " rel="stylesheet">
    <link href="<c:url value="/resources/css/main_login.css"/> " rel="stylesheet">

</head>
<body>
<!--
<form action="add" method="post">
    <input type="text" name="username"><br>
    <input type="password" name="password"><br>
    <input type="submit">
</form>
<br>
-->
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Account Login
				</span>
            <form class="login100-form validate-form p-b-33 p-t-5" method="post" action="add">

                <div class="wrap-input100 validate-input" data-validate = "Enter username">
                    <input class="input100" type="text" name="username" placeholder="User name">
                    <span class="focus-input100" data-placeholder="&#xe82a;"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="Enter password">
                    <input class="input100" type="password" name="password" placeholder="Password">
                    <span class="focus-input100" data-placeholder="&#xe80f;"></span>
                </div>

                <div class="container-login100-form-btn m-t-32">
                    <button class="login100-form-btn" type="submit">
                        Login
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>


<div id="dropDownSelect1"></div>

<script src="<c:url value="/resources/jquery/jquery.min.js"/> "></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/animsition.min.js"/>"></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/popper.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/select2.min.js"/>"></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/moment.min.js"/>"></script>
<script src="<c:url value="/resources/js/daterangepicker.js"/>"></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/countdowntime.js"/>"></script>
<!--===============================================================================================-->
<script src="<c:url value="/resources/js/main_login.js"/>"></script>

</body>
</html>
