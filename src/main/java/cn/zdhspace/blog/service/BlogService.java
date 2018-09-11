package cn.zdhspace.blog.service;

import cn.zdhspace.blog.dto.BlogDto;
import cn.zdhspace.blog.entity.Blog;

import java.util.HashMap;
import java.util.List;


public interface BlogService {

    Blog getBlog(int blogId);

    Integer addBlog(Blog blog);

    void delBlog(int blogId);

    void updateBlog(Blog blog);

//    List<HashMap<String,String>> getAllBlogTitle();

    List<BlogDto> getAllTitleAndIdAndDate();

}
