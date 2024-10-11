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
		
	// Invoke a static method with null iterfaceName
	@Test
	public void invokeNullIterfaceNameTest() throws RemoteException {
		RIFImplementationManager mgr = new RIFImplementationManager();
		
		mgr.registerImplementation(null, instance);
		
		Map<String, Object> result = mgr.invoke(null, "staticMethod", new Object[]{null});
		assertEquals("This must fail with a null parameter!",
				new Integer(1), result.get("code")
		);
		assertEquals("The invoker must return a value of type Integer", result.get("type"),
				new Integer(1)
		);
		assertEquals("The object invoked is of type Integer!", mapToStringObject(result.get("object")));
		assertNotNull("The argument is null!", result.get("parameters"));
		assertEquals("The method executed is of type Integer!", mapToStringMethod(result.get("method")));
	}
	
	// Invoke a static method with an empty map and return a return value from the method.
	@Test
	public void invokeStaticMissingMethodReturn() throws RemoteException {
		RIFImplementationManager mgr = new RIFImplementationManager();
		
		mgr.registerImplementation(null, instance);
		
}
}