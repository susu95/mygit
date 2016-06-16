package service.demo;


import org.apache.thrift.TException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

    private static Hello.Iface client;

    public static void main(String[] args) throws InterruptedException {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("client.xml");
        client = (Hello.Iface) beanFactory.getBean("clientProxy");

        Thread.sleep(3000);

        //***************************
        //此处实现你的方法调用


        //***************************

        System.exit(0);
    }
}

