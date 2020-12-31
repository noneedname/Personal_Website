<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/header.jspf"%>
<%@include file="common/nav_bar.jspf"%>

    <div class="container">
        <form:form method="post" modelAttribute="todo">
            <fieldset class="form-group">
                <form:label path="desc">Description</form:label>
                <form:input path="desc" class="form-control" required="required" />
                <form:errors path="desc" cssClass="text-warning" /> <br/>
            </fieldset>
            <fieldset class="form-group">
                <form:label path="deadline">Target Date</form:label>
                <form:input path="deadline" type="text" class="form-control"
                            required="required" />
                <form:errors path="deadline" cssClass="text-warning" />
            </fieldset>
            <input name="add" type="submit" class="btn btn-success"/>
        </form:form>
    </div>

<%@include file="common/footer.jspf"%>
