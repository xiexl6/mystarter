package com.xiexl.sp.test;

import com.xiexl.sp.App.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class TestStarter {

    @Resource
    private Jedis jedis;

    @Test
    public void test(){
        jedis.set("test", "test myStarter");
        String val = jedis.get("test");
        System.out.println(val);
    }

}
