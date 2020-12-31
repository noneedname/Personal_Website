package com.zekunli.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    private static int count = 3;
    static {
        todoList.add(new Todo(1,"Tester", "Learn Web Application", new Date()));
        todoList.add(new Todo(2,"Tester", "Learn Spring", new Date()));
        todoList.add(new Todo(3,"Tester", "Learn Spring MVC", new Date()));
    }

    public List<Todo> getTodos(String user) {
        List<Todo> todos = new ArrayList<Todo>();
        for (Todo todo : todoList) {
            if (todo.getUser().equals(user)) {
                todos.add(todo);
            }
        }
        return todos;
    }

    public Todo getTodo(int id) {
        for (Todo todo : todoList) {
            if (todo.getId() == id)
                return todo;
        }
        return null;
    }

    public void updateTodo(Todo todo) {
        todoList.remove(todo);
    }

    public void addTodo(String user, String desc, Date date) {
        todoList.add(new Todo(++count, user, desc, date));
    }

    public void deleteTodo(int id) {
        for (int i = 0; i < todoList.size(); ++i) {
            if (todoList.get(i).getId() == id) {
                todoList.remove(i);
                break;
            }
        }
    }
}
