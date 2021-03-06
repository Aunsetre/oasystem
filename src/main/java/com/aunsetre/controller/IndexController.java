package com.aunsetre.controller;

import com.aunsetre.pojo.User;
import com.aunsetre.service.UserService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController extends BaseController {
    private static Gson gson=new Gson();
    @Resource
    private UserService userService;
    @RequestMapping(value = {"/","index.html"},produces="text/plain;charset=UTF-8")
    public String indexUrl(Model map){

        return "index";
    }



    @ResponseBody
    @GetMapping("GetUserAll1")
    public String getUserAll(){
        List<User>userList=userService.selectAll();
        return gson.toJson(userList);
    }
}
