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
	    public void invoke_correctNumberOfParameters() {
	        Class[] interfaces = new Class[]{String.class, String.class};
	        Object[] parameters = new Object[]{"test", "string"};
	        Object obj = RIFServer.createObject("com.densebrain.rif.server.RIFImplementationManager_1Test");
	        Method method = RIFImplementationManager.class.getMethod("invoke", interfaces, parameters);
	        assertEquals(3, method.getParameterTypes().length);
			assertTrue(RIFImplementationManager.class.isAssignableFrom(method.getDeclaringClass()));
            assertEquals("test", method.invoke(obj, parameters));
	    }
}

