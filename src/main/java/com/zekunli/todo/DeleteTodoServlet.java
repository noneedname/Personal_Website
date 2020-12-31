package com.zekunli.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/delete-todo.do")
//public class DeleteTodoServlet extends HttpServlet {
//    private TodoService todoService = new TodoService();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws IOException, ServletException {
//        String rawName = request.getParameter("deleteName");
//        String rawCat = request.getParameter("deleteCategory");
//        System.out.println("name is: " + rawName + " and cat is: " + rawCat);
//        todoService.deleteTodo(new Todo(rawName, rawCat));
//        response.sendRedirect("/todo/todo.do");
//    }
//}
