package com.aunsetre.controller;

import com.aunsetre.mapping.UserMapper;
import com.aunsetre.pojo.User;
import com.aunsetre.service.UserService;
import com.google.gson.Gson;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController extends BaseController {
    private static Gson gson=new Gson();
    @Resource
    private UserService userService;
    @RequestMapping(value = {"/","index.html"},produces="text/plain;charset=UTF-8")
    public String test(Model map){
        List<User> userList=userService.selectAll();
        map.addAttribute("userinfo",userList);
        return "index";
    }


    @PostMapping("dologin")
    public String dologin(Model model,@ModelAttribute User user) {
        if (userService.login(user.getName(), user.getPwd()) != null) {
            super.session.setAttribute("user",user);
            return "index";
        } else {
            return "redirect:error";
        }
    }
    @ResponseBody
    @GetMapping("GetUserAll")
    public String getUserAll(){
        List<User>userList=userService.selectAll();
        return gson.toJson(userList);
    }
}
