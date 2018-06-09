package com.aunsetre.controller;

import com.aunsetre.utils.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Aunsetre
 * @Date: 6/8/0008 20:47
 */
@Controller
@RequestMapping("/log")
public class LogController {
    @RequestMapping("/logPage.html")
    public String getLogPage(Model model){
        //model.addAttribute(CommonUtils.iframeURL,"log/logPage.html");

        return "/log/logPage";
    }
}
