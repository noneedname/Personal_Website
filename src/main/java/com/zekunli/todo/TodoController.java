package com.zekunli.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String showTodoList(ModelMap model) {
        String name = (String) model.get("name");
        model.addAttribute("name", name);
        model.addAttribute("todoList", todoService.getTodos());
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodoHandler(ModelMap model, @RequestParam String newTodo, @RequestParam String newTodoCat) {
        todoService.addTodo(new Todo(newTodo, newTodoCat));
        model.clear();
        return "redirect:/todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodoHandler(ModelMap model, @RequestParam String deleteName, @RequestParam String deleteCategory) {
        todoService.deleteTodo(new Todo(deleteName, deleteCategory));
        model.clear();
        return "redirect:/todo";
    }
}
