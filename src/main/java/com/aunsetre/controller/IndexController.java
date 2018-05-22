package com.aunsetre.controller;

import com.aunsetre.mapping.UserMapper;
import com.aunsetre.pojo.User;
import com.aunsetre.service.UserService;
import com.google.gson.Gson;
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
public class IndexController {
    private Gson gson=new Gson();
    @Resource
    private UserService userService;
    @GetMapping(value = "index",produces="text/plain;charset=UTF-8")
    public String test(Model map){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("hashMapKey", new String("张三"));
        map.addAttribute("name",hashMap);

        return "index";
    }
    @GetMapping("index.html")
    public String index(Model map){
        List<User> userList=userService.selectAll();
        map.addAttribute("userinfo",userList);
        return "index";
    }
    @PostMapping("dologin")
    public String dologin(Model model,@ModelAttribute User user) {
        if (userService.login(user.getName(), user.getPwd()) != null) {
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
