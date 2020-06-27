package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //have it map to the login.jsp html page
public class LoginController {

    @GetMapping("/login") //map with the login.jsp path
    public String login(){
        return "login";
    }
    // this controller will listen to the /login.jsp and will redirect us the login.jsp html page
}
