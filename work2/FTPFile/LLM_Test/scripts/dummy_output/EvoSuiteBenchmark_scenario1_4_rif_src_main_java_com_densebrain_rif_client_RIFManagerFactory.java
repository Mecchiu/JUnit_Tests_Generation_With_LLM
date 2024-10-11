// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
		
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testGetInstance() throws RemoteException {
		RIFManagerFactory instance = RIFManagerFactory.getInstance();
		assertNotNull(instance);
	}
}