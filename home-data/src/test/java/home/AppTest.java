package home;

import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
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
public class AppTest extends TestCase
{

    @Autowired
    TUserService tUserService;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://192.168.1.106:3306/jeff_db?useUnicode=true&characterEncoding=utf8","root","123456");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(con);
    }
    public void testInsert(){
        TUser tUser = new TUser();
        tUser.setEmail("liuyun@addcn.com");
        tUser.setRealname("zly");
        tUser.setPassword("123456");
        tUser.setUsername("zhangly");
        int res = tUserService.insertSelective(tUser);
        System.out.println("~~~~~~~~~~~~~~~~结果是："+res);
    }
}
