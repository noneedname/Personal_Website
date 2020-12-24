package webapp.todo;

import java.util.ArrayList;
import java.util.List;


public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(new Todo("Learn Web Application", "Study"));
        todoList.add(new Todo("Learn Spring", "Study"));
        todoList.add(new Todo("Learn Spring MVC", "Study"));
    }

    public List<Todo> getTodos() {
        return todoList;
    }

    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    public void deleteTodo(Todo todo) {
        for (int i = 0; i < todoList.size(); ++i) {
            if (todoList.get(i).equals(todo)) {
                todoList.remove(i);
                break;
            }
        }
    }
}
