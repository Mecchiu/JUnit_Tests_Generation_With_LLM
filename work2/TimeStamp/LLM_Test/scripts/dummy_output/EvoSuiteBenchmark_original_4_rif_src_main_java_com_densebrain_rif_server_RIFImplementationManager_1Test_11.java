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
		private RIFImplementationManagerImpl impl = new RIFImplementationManagerImpl();

	@Test
	void test0() {
		assertNotNull(impl.invoke(null, "Hello!"));
		assertNotNull(impl.invoke(null, "Hello!"));

		assertNotNull(impl.invoke(null, "Hello!"));

		assertNotNull(impl.invoke(null, "Hello!"));
		assertNotNull(impl.invoke(null, "Hello!"));

		assertNotNull(impl.invoke(null, "Hello!"));
	}

// This is a dummy method that just returns null.
	@Test
	void test1() {
		// Nothing to test
	}


}