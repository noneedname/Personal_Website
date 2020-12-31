package com.zekunli.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String showTodoList(ModelMap model) {
        String user = (String) model.get("name");
        model.addAttribute("name", user);
        model.addAttribute("todoList", todoService.getTodos(user));
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String addTodo(ModelMap model) {
        model.addAttribute("todo", new Todo(0, (String) model.get("name"), "d", new Date()));
        System.out.println(model);
        return "add-todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodoHandler(ModelMap model, @ModelAttribute("todo") Todo todo) {
        todoService.addTodo((String) model.get("name"), todo.getDesc(), new Date());
        System.out.println(model);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String updateTodo(ModelMap model, @RequestParam int id) {
        model.addAttribute("todo", todoService.getTodo(id));
        return "add-todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodoHandler(ModelMap model, Todo todo) {
        todoService.addTodo((String) model.get("name"), todo.getDesc(), todo.getDeadline());
        todo.setUser("Tester");
        todoService.updateTodo(todo);
        return "redirect:/todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodoHandler(ModelMap model, @RequestParam int id) {
        todoService.deleteTodo(id);
        return "redirect:/todo";
    }
}
