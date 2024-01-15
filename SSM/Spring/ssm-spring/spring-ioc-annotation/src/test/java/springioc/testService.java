package springioc;

import com.springioc.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bin
 * @date 2024-01-01 0:46
 */
public class testService {

    @Test
    public  void testController(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);

        System.out.println(userController);
        userController.getMessage();
    }

    @Test
    public  void testRun(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.findAll();
    }

}
