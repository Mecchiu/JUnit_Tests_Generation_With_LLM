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
    public void testClassMethod_getManager() throws RemoteException {
		
        try {
            assertNotNull(getManager("testUrl"));
        } catch (RemoteException e) {
            assertTrue(false);
        }
    }

	@Test
    public void testClassMethod_getImpl() throws RemoteException {
        assertNotNull(getImpl("testUrl"));
    }
	
	@Test
	public void testMethod_getInvoker() throws RemoteException {
		RIFManager manager = getManager("testUrl");
		assertEquals("testId", manager.getId());
		assertEquals("testJVM", manager.getJVMName());
	}
}