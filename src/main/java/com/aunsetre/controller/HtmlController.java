package com.aunsetre.controller;

import com.aunsetre.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HtmlController {
    @GetMapping("login.html")
    public String login(){
        return "login";
    }

}
