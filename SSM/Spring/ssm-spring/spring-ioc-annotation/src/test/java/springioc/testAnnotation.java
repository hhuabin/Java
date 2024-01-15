package springioc;

import com.springioc.bean.HelloBean;
import com.springioc.bean.JDBCBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bin
 * @date 2024-01-09 17:17
 */
public class testAnnotation {

    @Test
    public void testLifeCycle() {
        // 获取 IOC 容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        // 销毁
        applicationContext.close();
    }

    @Test
    public void testScope() {
        // 获取 IOC 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        // 获取 IOC 容器中的 bean
        HelloBean helloBean = (HelloBean) applicationContext.getBean(HelloBean.class);
        HelloBean helloBean2 = (HelloBean) applicationContext.getBean(HelloBean.class);
        System.out.println(helloBean == helloBean2);
    }

    @Test
    public void testBean() {
        // 获取 IOC 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        // 获取 IOC 容器中的 bean
        JDBCBean jdbcBean = applicationContext.getBean(JDBCBean.class);
        System.out.println(jdbcBean.toString());
    }
}
