// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {
		
	Map<String,Object> map;
	Map<String, Map<String, Method>> mapMethod;
	

	static {
		System.setProperty("java.class.path", ".");
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		assertTrue("The instantiation or use of unimplemented interface is expected as an error.",
				    instance == null);

		Object result = instances("com.dummy.service");
		assertTrue("It is expected that an instance is returned.", result!= null);
		assertTrue("It is expected that the instantiation is successful.", result instanceof RIFImplementationManager);
		assertTrue("It is expected that the use of the implementation is successful.", result instanceof RIFImplementationManager);

		Object implementation = implementations(getInterface());

		assertTrue("The interface used as the implementation is returned.  Only 1 implementation.", implementation == getImplementation(RIFImplementationManager.class));
		assertTrue("The result obtained after instantiation is expected as an error.", result!= null);
        assertTrue("The instantiation failed as expected.",!(result instanceof RIFImplementationManager));
	}

	private Object getImp() {
}
}