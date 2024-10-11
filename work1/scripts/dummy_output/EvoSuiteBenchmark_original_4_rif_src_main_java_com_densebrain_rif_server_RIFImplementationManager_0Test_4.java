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
		
	@Test
	public void rifImplsTest() {
		// RIFImplementationManager_1Impl_Test.java
		RIFImplementationManager impl = RIFImplementationManager.getInstance();
		// A method which can be called by implementation
		assertTrue(impl instanceof RIFImplementationManager);
		RIFImplementationManager rifImpl = ((RIFImplementationManager)impl);
		
		// Method which can be called by a class that implements the implemented implementation with the name of the interface implemented
		
		Class[] interfaces = { MyInterface.class };
		try {
			methodsMap.put("rifImplementationsListTest",
					  new Hashtable<String, Object>());
			methodsMap.put("rifImplListTest",
					  new Hashtable<Object, Map<String, Method>>());
			
			// Test a method
			methodsMap.put("rifImplementationsListTest",
					  new Hashtable<String, Object>());
			Object[] args = new Object[];
			try {
				methodsMap.get("rifImplementationsListTest");
			}
			catch (Exception e) {
				// It should not be thrown
			}
			methodsMap.remove("rifImplementationsListTest");
			methodsMap.remove("rifImplListTest");
			
			args = new Object[1];
			args[0] = interfaces;
			assertMethodExists(methodsMap, "rifImplementationsListTest",
					   "test", args, 3);
			methodsMap.get("rifImplementationsListTest").remove("test");
			
			args = new Object[1];
			args[0] = interfaces[0];
			assertMethodExists(methodsMap, "rifImplListTest",
					   "test", args, 0);
			methodsMap.remove("rifImplListTest");
			methodsMap.remove("rifImplementationsListTest");
			assertNull(methodsMap.get("rifImplementationsListTest"));
		}
		catch(Exception e) {
			fail("Method rifImplsTest() has an exception " + e.getMessage());
		}
	}
	
	public void assertMethodExists(Map<String, Method> methodMap,
			String methodName,
			String expectedName, Object[] params,
			int expectedParams) {
		Method method = null;
		Map<String, Method> expectedMethods = null;
		for (Map.Entry<String, Method> entry : methodMap.entrySet()) {
			method = entry.getValue();
			String parameterList = method.getParameterAnnotation(expectedParams).value();
			assertEquals("Method rif" + methodName + "() has " + parameterList +
					  " for parameter number " + params.length +
					  ", but there is one expected, " + expectedName + ".",
					  expectedName, entry.getKey());
			expectedMethods = new Hashtable<String, Method>();
			methodsMap.put(method.getName(), expectedMethods);
			if (parameters.length!= expectedParams) {
				System.out.println("Expected size " + expectedParams + " for " +
						  expectedName + 
						  entry.getKey() + " but the actual parameters are " + parameters.length + ". " +  methodName + "() ");
			}
		}
	}
}