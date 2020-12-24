<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>宝的秘密空间</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
              rel="stylesheet">
    </head>

    <body>
        <nav role="navigation" class="navbar navbar-default">

            <div class="">
                <a href="/" class="navbar-brand">Brand</a>
            </div>

            <div class="navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="/todo.do">Todos</a></li>
                    <li><a href="http://www.github.com/noneedname">Github</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/login.do">Login</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <H1>Welcome</H1>
            <p><font color="red">${errorMessage}</font></p>
            Please Login:
            <form action="/login.do" method="POST">
                Name: <input name="name" type="text" />
                Password: <input name="password" type="password"/> <input type="submit" value="login"/>
            </form>
        </div>

    </body>
</html>
