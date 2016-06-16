package service.demo;

import com.meituan.service.mobile.mtthrift.server.MTIface;
import org.apache.thrift.TException;

public class HelloImpl extends MTIface implements Hello.Iface {

        public String helloString(String para)  throws TException { return null; }
    public int helloInt(int para)  throws TException { return null; }
    public boolean helloBoolean(boolean para)  throws TException { return null; }
    public void helloVoid()  throws TException { return null; }
    public String helloNull()  throws TException { return null; }


}
