package com.jeff.home.server;

import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseJunitTest
{

    @Autowired
    private TUserService tUserService;

    @Test
    public void testInsert(){
//        TUserServiceImpl tUserService = new TUserServiceImpl();
        TUser tUser = new TUser();
        tUser.setEmail("0000@aaaaa.com");
        tUser.setRealname("xxxxx");
        tUser.setPassword("123456");
        tUser.setUsername("wwwwsss");
        int res = tUserService.insertSelective(tUser);
        System.out.println("~~~~~~~~~~~~~~~~结果是："+res);
    }
    @Test
    public void testSelect(){
        int id = 2;
        TUser tUser = tUserService.selectByPrimaryKey(id);
        System.out.println("______________________________________________");
        System.out.println(tUser);
    }













    public void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://10.1.16.201:3306/jeff_db?useUnicode=true&characterEncoding=utf8","root","123456");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(con);
    }
}
