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

	/**
     * Test that all of the methods registered on an interface implement (invoke) an operation.
     */
    @Test
    public void test_invoke() throws RemoteException {
        TestImplementation.class.getField("m_methodName").set(null, "Hello World");
        assertEquals("Hello World", invoke("com.densebrain.rif.server.TestImplementation$TestImplementation.get_methodName", "Hello World").toString());
    }

    @Test
    public void test_invokeNull() throws RemoteException {
        assertNull(invoke(TestImplementation.class));
    }

    @Test
    public void test_invokeNotNull() throws RemoteException {
        TestImplementation.class.getField("m_methodName").set(null);
        assertEquals("", invoke("com.densebrain.rif.server.TestImplementation$TestImplementation.get_methodName", "").toString());
    }

    public static class TestImplementation {

    	public static TestImplementation get_methodName() throws RemoteException {
            return (TestImplementation) invoke("com.densebrain.rif.server.TestImplementation$TestImplementation.get_methodName", null);
        }

		public static void set_methodName(TestImplementation name) {
			Test.this.invoke("com.densebrain.rif.server.TestImplementation$TestImplementation.set_methodName", name);
    	}

    	public static String get_methodName();

    	public static void set_methodName(String name) {
    		Test.this.invoke("com.densebrain.rif.server.TestImplementation$TestImplementation.set_methodName", name);
    	}
	}
}

// com.densebrain.rif.server.RIFImplementationManager_1.java
