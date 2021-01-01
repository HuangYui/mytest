package com.hy;

import com.hy.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HY
 * @ClassName SpringTest
 * @Description TODE
 * @DateTime 2020/12/24 17:28
 * Version 1.0
 */
public class SpringTest {



    @Test
    public void testSpringIOC() {
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService1 = (UserService) applicationContext.getBean("userService");
        userService1=null;
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
