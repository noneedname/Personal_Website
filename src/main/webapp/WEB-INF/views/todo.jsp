<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
    <head>
        <title>宝的TodoList</title>
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
                    <li><a href="/logout.do">Logout</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <H1>Welcome ${name}</H1>

            <table class="table table-striped">
                <caption>GET WORK DONE! 冲起来！Your Todo List: </caption>
                <thead>
                    <th>Description</th>
                    <th>Category</th>
                    <th>Action</th>
                </thead>
                <tbody>
                    <c:forEach items="${todoList}" var="todo">
                        <tr>
                            <td>${todo.name}</td>
                            <td>${todo.category}</td>
                            <td><a class="btn btn-danger" href="/delete-todo.do?deleteName=${todo.name}&deleteCategory=${todo.category}">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <br/><br/><br/>
            <H3>Add a new Item:</H3>
            <form method="post" action="/add-todo.do">
                <fieldset class="form-group">
                    <label>Description</label> <input type="text" name="newTodo" class="form-control"/> <br/>
                </fieldset>
                <fieldset class="form-group">
                    <label>Category</label> <input type="text" name="newTodoCat" class="form-control"/> <br/>
                </fieldset>
                <input name="add" type="submit" class="btn btn-success"/>
            </form>
        </div>

        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>