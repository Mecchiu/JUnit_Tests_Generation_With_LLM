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
		public RIFManagerFactory_0Test() {
	}

	@Test
    public void testGetManager()  {
        assertNotNull(getManager()); // check that we have the right factory
        assertEquals(1, managerMap.size());
    }

    @Test
    public void testGetManager_NullInterface() {
        try {
            getManager(null);
            fail("Null interface was not expected");
        } catch (RemoteException ignore) {}
    }

    @Test
    public void testGetManager_NullProvider() throws RemoteException {
        try {
            getManager("http://xxx.xxx.xxx.xxx:9999");
            fail("null provider was expected");
        } catch (RemoteException ignore) {}
    }

    @Test
    public void testGetManager_NullConnection() {
        try {
            getManager("xxx://xxx.xxx.xxx.xxx:9999/RIF/Services/RIFService");
        } catch (RemoteException ignore) {}
    }

    @Test
    public void testGetManager_RIFService() throws RemoteException {
        assertNotNull(getManager("xxx://xxx.xxx.xxx.xxx:9999/RIF/Services/RIF.JAVA"));
    }
}