package service.demo;

import org.apache.thrift.TException;

public class HelloImpl implements Hello.Iface {

    public String helloString(String para) throws TException {
        System.out.println("this is a string return");
        return para + "THRIFT.SLF";
    }

    public int helloInt(int para) throws TException {
        System.out.println("this is a int return");
        System.out.println("这里修改代码了");
        return para + 10;
    }

    public boolean helloBoolean(boolean para) throws TException {

        System.out.println("this is a boolean return");
        System.out.println("这里是br2修改的代码");

        return !para;
    }

    public void helloVoid() throws TException {
        System.out.println("this is a void return");
    }

    public String helloNull() throws TException {
        System.out.println("this is a null return");
        return null;
    }


}
