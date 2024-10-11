// RIFManagerFactory_0Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactory_0Test {
		
	@Test
    void initializeAndGetManagerSucceedsWithManager() throws RemoteException {
        String url = "http://localhost:7000";
        RIFManagerManager manager = getManager(url);
        Object impl = getInvoker(url, RIFInvoker.class).getImpl();
        Object obj = getInvoker(url, RIFInvoker.class).getObject();
        assertNotNull("Failed to obtain RIFManagerImpl from implementation", impl);
        assertEquals("Created manager has the wrong value", impl, manager);
        Object impl1;
        try {
            impl1 = manager.getImpl(impl, null);
        } catch (RemoteException re) {
            re.printStackTrace();
            fail("Failed to obtain manager implementation");
        }
        String text = String.format("Created manager has the wrong value : %s",impl1);
       	assertTrue("Failed to find the static methods in manager", manager.hasMethods(impl1));
	}
	
	@Test
    void initializeManagerSucceedsWithManagerAndGetInvokerSucceeds() throws RemoteException {
        String url = "http://localhost:7000";
        RIFManagerManager manager = getManager(url);
        manager.getInvoker(url, RIFInvoker.class);
    }
}