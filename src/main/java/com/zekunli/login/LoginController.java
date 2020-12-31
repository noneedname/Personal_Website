package com.zekunli.login;

import com.zekunli.todo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;


@Controller
@SessionAttributes("name")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginHandler(ModelMap model, @RequestParam String name, @RequestParam String password) {
        System.out.println(name + password);
        if (!loginService.validateUser(name, password)) {
            model.addAttribute("errorMessage", "Invalid user info!");
            return "login";
        }
        model.addAttribute("name", name);
        return "welcome";
    }
}
