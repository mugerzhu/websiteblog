import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.URLDecoder;
import java.net.URLEncoder;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JunitTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * successful do it
     *
     */

    @Test
    public void doTest(){
        redisTemplate.boundValueOps("why").set("zhi");
        String result = redisTemplate.boundValueOps("why").get();
        System.out.println(result);
    }
    @Test
    public void doEncodeTest(){
        System.out.println(URLDecoder.decode(URLEncoder.encode("你好")));
    }

}
