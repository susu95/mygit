package service.demo;

import org.apache.thrift.TException;
import org.junit.*;

public class HelloImplTest {

    HelloImpl hello;


    @Before
    public void initClient() {
        Client.initClient();
        hello = new HelloImpl();

    }

    @After
    public void destroyClient() {
        Client.destroyClient();
    }

    @Test
    public void testHelloString() throws TException {
        System.out.println(Client.client.helloBoolean(true));
        //System.out.println(hello.helloBoolean(true));

    }

    @Test
    public void testHelloInt() throws TException {
        System.out.println(Client.client.helloInt(2));
    }

    @Test
    public void testHelloBoolean() throws TException {
        System.out.println(Client.client.helloBoolean(true));

    }

    @Test
    public void testHelloVoid() throws TException {
       Client.client.helloVoid();
    }

    @Test
    public void testHelloNull() throws TException {
       try
       {
           Client.client.helloNull();
       }
       catch (Exception e)
       {
           System.out.println("返回结果为null");
       }
    }


}
