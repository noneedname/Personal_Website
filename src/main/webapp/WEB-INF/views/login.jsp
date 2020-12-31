<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/nav_bar.jspf"%>

    <div class="container">
        <H1>Welcome</H1>
        <p><font color="red">${errorMessage}</font></p>
        Please Login:
        <form action="${pageContext.request.contextPath}/login" method="POST">
            Name: <input name="name" type="text" />
            Password: <input name="password" type="password"/> <input type="submit" value="login"/>
        </form>
    </div>

<%@include file="common/footer.jspf"%>

