package cn.zdhspace.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/jedis")
public class JedisTestController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping(value = "/set")
    public void todoSetTest(){
        redisTemplate.boundValueOps("username").set("root");
    }


}
