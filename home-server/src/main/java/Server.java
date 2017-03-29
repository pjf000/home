import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by JeffPeng on 2017/3/29.
 */


public class Server {

    private final static Logger logger = LoggerFactory.getLogger(Server.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:config/dubbo.xml","classpath:config/mybatis-config.xml","classpath:config/spring-dao.xml","classpath:config/spring-mybatis.xml");
        context.start();

        logger.info("----------------------dubbo service begin to start------------------------------------");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
