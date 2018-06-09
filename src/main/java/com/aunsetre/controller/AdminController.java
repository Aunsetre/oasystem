package com.aunsetre.controller;

import com.aunsetre.pojo.User;
import com.aunsetre.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Aunsetre
 * @Date: 6/9/0009 17:13
 */
@Controller
@RequestMapping("UserMange")
public class AdminController {
    @Resource
    private UserService userService;
    @GetMapping("/UserList.html")
    public String userList(Model model){
        List<User> userList=userService.selectAll();
        model.addAttribute("userinfo",userList);
        return "/UserMange/UserList";
    }


}
