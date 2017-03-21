package com.jeff.home.server;

import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
import com.jeff.home.data.service.impl.TUserServiceImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseJunitTest
{

    @Autowired
    TUserService tUserService;

    @org.junit.Test
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















    public void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://10.1.16.201:3306/jeff_db?useUnicode=true&characterEncoding=utf8","root","123456");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(con);
    }
}
