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
		Class c; // the object that implements the object whose methods will be invoked
		Object impl;
		/**
		 * Installs a dummy implementation object into a hashtable
		 */
		Map<String, Method> methodMap = new Hashtable<String, Method>();
		/**
		 * Initializes the map with dummy implementations.  It maps object implementations of interface
		 * classes in the given hashtable into a key that identifies the implementation class in that
		 * hashtable.  A value of the map defines the methods that are exposed for that implementation.
		 */
		void initMap(Hashtable<Object, Map<String, Method>> methodMap) {
			c = Class.forName("com.densebrain.rif.server.DummyImplementationsService");
			initMethodMap(methodMap);
		}
		/**
		 * Initializes the map with all implementations.  The implementation map represents all implementations
		 * of object classes that are understood by RIF.
		 */
		void initMethodMap(Hashtable<Object, Map<String, Method>> MethodMap) {
			MethodMap.put(c, null);
			for(Object object:c.getDeclaredMethods()) {
				Method realMethod = Method.getMethod(c.getName(), new Class[]{Object.class});
				MethodImpl method = new MethodImpl(realMethod, object);
				MethodImpl newMethod = new MethodImpl(null, object);
				methodMap.put(object.toString(), newMethod);
				MethodImplMap.put(newMethod, realMethod);
			}
		}
		/**
		 * Get a value from the map.  If the value is not available for the given object, it will
		 * simply return null.
		 */
		Object getImplementation(String name) {
			if (MethodImplMap.get(name)!= null) {
				return MethodImplMap.get(name);
			}
			return null;
		}
		/**
		 * Get the set of methods exposed by the passed impl object.
		 */
		void getMethodInvocationMap(Object impl)
		{
			methodMap.get(impl.toString());
		}

		/** The set of methods that are exposed for the implementation identified by an Object object */
		Map<String, Method> getMethodInvocationMap() {
			return methodMap;
		}

		@Test
		void test()  {
		
			C c1 = new C();
			assertNotNull("Error in c1 null", c1);
			assertEquals("Error in c1 number", 1, c1.getInt());
			assertNull("Error in c1 null", c1.getStr());
			C c2 = ((C)c1);

			assertNotNull("Error in c2 null", c2);
			assertEquals("Error in c2 number", 2, c2.getStr().length());
			assertEquals("Error in c2 object null", "str1", c2.getStr());
			assertEquals("Error in c2 number null", 2, c2.getInt().length());
			assertEquals("Error in c2 object number null", 3, c2.getInt());
			assertNotNull("Error in c2 null", c2.getStr());
			assertNotNull("Error in c2 number null", c2.getInt());	
		}
}