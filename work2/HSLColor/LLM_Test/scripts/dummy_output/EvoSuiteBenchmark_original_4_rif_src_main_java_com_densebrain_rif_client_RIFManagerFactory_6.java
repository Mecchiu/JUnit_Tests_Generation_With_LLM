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
		static RIFManagerFactory instance = new RIFManagerFactory();
       
    @Test
    public void noUrl() {
        assertNull(instance.getManager(null));
    }

    @Test
    public void setHttpProxyInUrl() throws RemoteException {
        String testUrl = "http://dummyhostname:1234/dummyProxy";

        RIFManager manager = instance.getManager(testUrl);
        
        assertNotNull(manager);
    }
}