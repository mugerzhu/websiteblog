package cn.zdhspace.blog.mapper;

import cn.zdhspace.blog.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {

    List<Type> getTypes();

    int addType(Type type);

    int deleteTypeById(@Param("id") int id);

}
