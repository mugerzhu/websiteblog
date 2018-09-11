package cn.zdhspace.blog.service.impl;

import cn.zdhspace.blog.dto.BlogDto;
import cn.zdhspace.blog.entity.Blog;
import cn.zdhspace.blog.mapper.BlogMapper;
import cn.zdhspace.blog.service.BlogService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    Gson gson = new Gson();

    @Override
    public Blog getBlog(int blogId) {
        Blog blog;
        String blogJson = (String) redisTemplate.boundValueOps("blog"+blogId).get();
        if(blogJson==null) {
            blog = blogMapper.getBlogById(blogId);
            blogJson = gson.toJson(blog);
            redisTemplate.boundValueOps("blog"+blogId).set(blogJson);
        }
        return gson.fromJson(blogJson,Blog.class);
    }

    @Override
    public Integer addBlog(Blog blog) {
        blogMapper.addBlog(blog);
        redisTemplate.delete("indexObject");
        return blog.getB_id();
    }

    @Override
    public void delBlog(int blogId) {
        blogMapper.deleteBlogById(blogId);
        redisTemplate.delete("blog"+blogId);
        redisTemplate.delete("indexObject");
    }

    @Override
    public void updateBlog(Blog blog) {
        blogMapper.updateBlog(blog);
        redisTemplate.delete("blog"+blog.getB_id());
    }

//    @Override
//    public List<HashMap<String,String>> getAllBlogTitle() {
//
//        String json = (String) redisTemplate.boundValueOps("indexObject").get();
//        if(json==null){
//            List<HashMap<String,String>> idAndTitle = blogMapper.getAllBlogTitle();
//            json = gson.toJson(idAndTitle);
//            redisTemplate.boundValueOps("indexObject").set(json);
//        }
//        List<HashMap<String,String>> idAndTitleObject =  gson.fromJson(json,new TypeToken<List<HashMap<String,String>>>(){}.getType());
//        return idAndTitleObject;
//    }

    @Override
    public List<BlogDto> getAllTitleAndIdAndDate() {
        return blogMapper.getAllTitleAndIdAndDate();
    }
}
