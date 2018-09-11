package cn.zdhspace.blog.mapper;

import cn.zdhspace.blog.dto.BlogDto;
import cn.zdhspace.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface BlogMapper {

    Integer addBlog(Blog blog);

    int updateBlog(Blog blog);

    Blog getBlogById(@Param("id") Integer id);

    int deleteBlogById(@Param("id") Integer id);

    List<HashMap<String,String>> getAllBlogTitle();

    List<BlogDto> getAllTitleAndIdAndDate();
}
