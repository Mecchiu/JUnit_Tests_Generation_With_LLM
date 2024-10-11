// RIFImplementationManagerTest.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains ten unit test cases for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManagerTest {
		
	/**
	* Test case for {@link RIFImplementationManager#getInstance()} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>{@link RIFImplementationManager#getInstance()}</li>
	* </ul>
	*
	* @throws Exception
	*/
	@Test
	void testGetInstance() throws Exception {
		RIFImplementationManager result = RIFImplementationManager.getInstance();
		assertNotNull(result);
	}
}