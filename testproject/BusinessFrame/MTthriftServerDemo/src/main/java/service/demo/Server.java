package  service.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Server {

    public static void main(String[] args)
    {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("server.xml");
    }
}
