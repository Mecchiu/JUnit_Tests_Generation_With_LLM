// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains one unit test case for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {
		
    public RIFManagerTest() {
    }

    protected RIFManager getManager() {
        return RIFManager.class;
    }

    private class MgrInvoker extends RIFInvoker {
        HndProxyImpl hd;
        public Hashtable<Class, RIFInvoker> invokerMap; //the table that maps to the
        }


    @Test
    public void test1(){
        RIFManager manager = getManager();
        MgrInvoker mgr = new MgrInvoker();
        RIFServiceStub stub = null;
}
}