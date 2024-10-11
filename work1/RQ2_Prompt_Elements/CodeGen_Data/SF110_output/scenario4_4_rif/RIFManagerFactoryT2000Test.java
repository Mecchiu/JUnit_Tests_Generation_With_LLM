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
	void getInstance() throws RemoteException {

		assertNotNull("No RIFManager set", RIFManagerFactory.getInstance());

		assertNotNull("No RIFManager set", RIFManagerFactory.getManager("http://rif-1-0-dynamic.dummyhost.com").getRIFManager());
	}
}
