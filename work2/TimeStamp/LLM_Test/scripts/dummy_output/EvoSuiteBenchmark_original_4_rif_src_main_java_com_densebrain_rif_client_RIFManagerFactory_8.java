// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
		
    @Test
    void getManager() {

        System.out.println("RIFManagerFactoryTest.getManager: ");

        RIFManagerManager fm = RIFManagerFactory.getInstance();

        RIFManager m = fm.getManager();

        System.out.println(m);

        assertTrue(m instanceof RIFManagerImpl);

    }

    @Test
    void getInvoker() {

        System.out.println("RIFManagerFactoryTest.getInvoker: ");

        RIFManagerFactory.getInstance();

        Hashtable<String, RIFInvoker> invokers = RIFManagerFactory.getInstance().getInvokers();

        for (RIFInvoker inv: invokers.values()) {
            System.out.println("  - " + inv);
        }

        assertTrue(1 == invokers.size());
    }
    
    @Test
    void getImpl() {
    	System.out.println("RIFManagerFactoryTest.getImpl: ");

    	RIFManagerFactory.getInstance();

    	Object rmi = RIFManagerFactory.getInstance().getImpl("", Object.class);

        assertTrue(rmi instanceof RIFInvoker);

    }
    
    @Test
    void getImplHierarchy() {

        RIFManagerFactory.getInstance();

        Object impl = RIFManagerFactory.getInstance().getImpl("java.rmi.Remote", Object.class);

        assertTrue(impl instanceof RIFInvoker);

    }
}