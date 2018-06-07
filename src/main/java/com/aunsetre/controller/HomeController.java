package com.aunsetre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Aunsetre
 * @Date: 6/7/0007 15:57
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "/Console.html")
    public String console(){
        return "/home/Console";

    }
}
