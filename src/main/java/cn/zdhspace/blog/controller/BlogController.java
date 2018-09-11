package cn.zdhspace.blog.controller;

import cn.zdhspace.blog.entity.Blog;
import cn.zdhspace.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Resource
    private BlogService blogService;

    @GetMapping("")
    public ModelAndView toBlogPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("blog");
        modelAndView.addObject("indexObject",blogService.getAllTitleAndIdAndDate());
        return modelAndView;
    }

    @PostMapping("")
    public String addBlog(@RequestParam("title") String title, @RequestParam("content") String content){
        Blog blog = new Blog();
        blog.setB_title(title);
        blog.setB_content(content);
        System.out.println(blog);
        int blogId = blogService.addBlog(blog);
        return "redirect:/blog/"+blogId;
    }

    @RequestMapping("/{id}")
    public ModelAndView getBlog(@PathVariable(value = "id",required = true) int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("blogView");
        modelAndView.addObject("blog",blogService.getBlog(id));
        return modelAndView;
    }


}
