// RIFImplementationManager_0Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {
Map<Object, Map<String, Method>> implementationMap = new Hashtable<Object,Map<String,Method>>();
		Map<Object, Map<String, Method>> methodMap = new Hashtable<Object, Map<String,Method>>();

		@Test
		public void testGetInstance()
		{
			RIFImplementationManager manager = RIFImplementationManager.getInstance();
			assertNotNull(manager);
		}

		@Test
		public void testEmpty()
		{
			RIFImplementationManager manager = RIFImplementationManager.getInstance();
			assertNotNull(manager);
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			assertTrue(manager.isEmpty(new Object[]{"getInstance", manager.getClass().getName()}));
			assertTrue(manager.isEmpty(new Object[]{"getInstance", manager.getClass().getName()}));
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			manager.registerImplementation(new Hashtable<String, Object>(), "getInstance");
			assertTrue(manager.isEmpty(new Object[]{"getInstance", manager.getClass().getName()}));
			assertTrue(manager.isEmpty(new Object[]{"getInstance", manager.getClass().getName()}));
		}
}
