<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/header.jspf"%>
<%@include file="common/nav_bar.jspf"%>

    <div class="container">
        <H1>Welcome ${name}</H1>
        <table class="table table-striped">
            <caption>GET WORK DONE! 冲起来！Your Todo List: </caption>
            <thead>
                <th>User</th>
                <th>Description</th>
                <th>Deadline</th>
                <th>Action</th>
            </thead>
            <tbody>
                <c:forEach items="${todoList}" var="todo">
                    <tr>
                        <td>${todo.user}</td>
                        <td>${todo.desc}</td>
                        <td><fmt:formatDate pattern="yyyy-MM-dd" value="${todo.deadline}"/></td>
                        <td><a class="btn btn-danger"
                               href="${pageContext.request.contextPath}/delete-todo?id=${todo.id}">Delete</a>
                            <a class="btn btn-info"
                               href="${pageContext.request.contextPath}/update-todo?id=${todo.id}">Update</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div>
            <a type="button" class="btn btn-success" href="${pageContext.request.contextPath}/add-todo">Add</a>
        </div>
    </div>

<%@include file="common/footer.jspf"%>
