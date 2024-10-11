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
	* It tests the case when the {@link RIFManagerFactory#getInstance()} method is called for the first time.
	* Expected result: the {@link RIFManagerFactory#getInstance()} method returns a new instance of {@link RIFManagerFactory} class.
	*/
	@Test
	void testGetInstance_1() {
		RIFManagerFactory result = RIFManagerFactory.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the case when the {@link RIFManagerFactory#getInstance()} method is called for the second time.
	* Expected result: the {@link RIFManagerFactory#getInstance()} method returns the same instance of {@link RIFManagerFactory} class.
	*/
	@Test
	void testGetInstance_2() {
		RIFManagerFactory result = RIFManagerFactory.getInstance();
		assertNotNull(result);
		RIFManagerFactory result2 = RIFManagerFactory.getInstance();
		assertNotNull(result2);
		assertEquals(result, result2);
	}
}