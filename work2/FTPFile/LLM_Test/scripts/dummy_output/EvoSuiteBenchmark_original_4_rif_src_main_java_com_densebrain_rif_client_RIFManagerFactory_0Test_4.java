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
		private RIFManagerFactory _instance = RIFManagerFactory.getInstance();

		@Test
    public void testGetManager() throws RemoteException {
        synchronized ( RIFManagerFactory.class ) {
            RIFManager manager = _instance.getManager( "http://dynamicproxyhost:1234" );
            assertNotNull("RIFManager", manager);
        }
    }
}