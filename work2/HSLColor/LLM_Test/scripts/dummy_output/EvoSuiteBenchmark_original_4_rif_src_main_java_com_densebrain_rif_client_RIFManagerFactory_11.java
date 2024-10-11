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
		
	private static RIFManagerFactory getInstance() throws RemoteException {
		return RIFManagerFactoryTest.class.getDeclaredConstructor().newInstance();
	}

	/**
	 * The static method that is used to get the instance.
	 */
	@Test
	void getInstance() throws RemoteException {
		RIFManagerFactory instance = RIFManagerFactoryTest.getInstance();
		Object instance2 = instance.getManager("test", TestInterface.class);
		assertTrue("Should be instance of " + TestInterface.class.getName(), instance == instance2);
	}
}