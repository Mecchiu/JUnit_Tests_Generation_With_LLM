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
		
	/**
	 * Test the getInstance method for calling the RIF implementation.
	 * <code>
	 * void invoke(String, String, Object[] )</code>
	 *
	 * @throws RemoteException
	 */
	@Test
	void invoke_01_successfulRequest() throws RemoteException {
		
		String operationName = "operationName";
		Object rifImplementation = null;
		
		try {
			//create an instance of RIF
			rifImplementation = RIFImplementationManager_0.getInstance().registerImplementation(RIFClass.class, new MyRIFImpl());
			
			/* now invoke the implementation */
			assertEquals("There should be an instance of RIF implementation.", RIFClass.class, rIFImplementation.getClass());
			//TODO: what is this used to? is it a method call or a simple "invoke"?
			Object [] parameters = {operationName, new Integer(200) };
			
			Method method = rIFImplementation.getClass().getMethod("invoke", Parameter.class,
																												 Parameter.class,
																												 Parameters.class);
			//TODO: this should be null to test if an instance of RIF implementation method is invoked by
			// a registered service
			//method.invoke(null, operationParameter, operationParameter, map);
			method.invoke(null, operationName, operationName, parameters);
		}
		catch (RemoteException rxe) {
			if (rxe.getCause()!= null && rxe.getCause() instanceof NullPointerException) {
				//there was a Null pointer exception, this means there is likely a JVM bug
				//this error should not be thrown as a failure of testing
				//(although there is a bug if the error occurs before an implementation is
				//registered and an exception occurs after)
				methodsMap.remove(method); //remove the method
				methodsMap.remove(rIFImplementation); //remove the method if it is registered
				methodsMap.remove(rIFImplementation);
				throw rxe;
			} else {
				//this is a failure with the jvm side because the provider failed to register the operation
				throw rxe;
			}
		}
		
		
		//verify that the implementation is registered on the class level, methods and values
		assertTrue("The implementation should not be null.", rIFImplementation!= null);
		assertTrue("The implementation is set on the class level.", rIFImplementation instanceof RIFClass);
		assertEquals("There should only be a number of methods registered.", 1, methodsMap.size());
		
		//verify that the implementation is registered on the map level
		assertTrue("The implementation should not be null.", methodsMap.get(methodsMap.get("invoke"))!= null);
		assertTrue("The implementation should be registered in the map level.", methodsMap.get("invoke") instanceof Map.Entry);
		
	}

}