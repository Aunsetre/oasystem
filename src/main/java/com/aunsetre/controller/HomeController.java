package com.aunsetre.controller;

import com.aunsetre.service.CommonService;
import com.aunsetre.utils.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * @Author: Aunsetre
 * @Date: 6/7/0007 15:57
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {
    @Resource
    public CommonService commonService;
    @RequestMapping(value = "/Console.html")
    public String console(Model model){
        Properties props = System.getProperties();
        //java版本
        String javaVersion = props.getProperty("java.version");
        //操作系统名称
        String osName = props.getProperty("os.name") + props.getProperty("os.version");
        //用户的主目录
        String userHome = props.getProperty("user.home");
        //用户的当前工作目录
        String userDir = props.getProperty("user.dir");
        //服务器IP
        String serverIP = request.getLocalAddr();
        //客户端IP
        String clientIP = request.getRemoteHost();
        //WEB服务器
        String webVersion = request.getServletContext().getServerInfo();
        //CPU个数
        String cpu = Runtime.getRuntime().availableProcessors() + "核";
        //虚拟机内存总量
        String totalMemory = (Runtime.getRuntime().totalMemory()/1024/1024) + "M";
        //虚拟机空闲内存量
        String freeMemory = (Runtime.getRuntime().freeMemory()/1024/1024) + "M";
        //虚拟机使用的最大内存量
        String maxMemory = (Runtime.getRuntime().maxMemory()/1024/1024) + "M";
        //MYSQL版本
        String mysqlVersion = commonService.getMysqlVersion();
        //网站根目录
        String webRootPath = request.getSession().getServletContext().getRealPath("");
        model.addAttribute("javaVersion",javaVersion);
        model.addAttribute("osName",osName);
        model.addAttribute("userHome",userHome);
        model.addAttribute("userDir",userDir);
        model.addAttribute("clientIP",clientIP);
        model.addAttribute("serverIP",serverIP);
        model.addAttribute("cpu",cpu);
        model.addAttribute("totalMemory",totalMemory);
        model.addAttribute("freeMemory",freeMemory);
        model.addAttribute("maxMemory",maxMemory);
        model.addAttribute("webVersion",webVersion);
        model.addAttribute("mysqlVersion",mysqlVersion);
        model.addAttribute("webRootPath",webRootPath);
        return "/home/Console";

    }
}
