package cn.zdhspace.blog.controller;

import cn.zdhspace.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class RootController {

    @Resource
    private BlogService blogService;

    @GetMapping(value = {"/","/index"})
    public String indexPage(){
        return "index";
    }

    @GetMapping(value = "/contact")
    public String toContactPage(){
        return "contact";
    }

    @GetMapping(value = "/edit")
    public String editTestPage(){
        return "edit";
    }
}
