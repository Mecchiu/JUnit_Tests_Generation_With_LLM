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
		
	@Test
	public void test1() throws Exception {
		// Invoke a method
		Class clazz = RIFImplementationManager.class;
		Method sm;
		{
			sm = clazz.getDeclaredMethod("invoke", String.class, Object[].class);
			assertNotNull(sm);
		}
	}
}