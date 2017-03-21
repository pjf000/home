package com.jeff.home.server;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created by daizhong on 16/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:config/mybatis-config.xml",
        "classpath:config/spring-mybatis.xml","classpath:config/spring-dao.xml","classpath:config/spring.xml"})
public class BaseJunitTest {

    @Before
    public void init(){
        String aa="";
        System.out.println("------------aa----------------");
    }

    @Test
    public void aa(){
        String bb="";
    }
}
