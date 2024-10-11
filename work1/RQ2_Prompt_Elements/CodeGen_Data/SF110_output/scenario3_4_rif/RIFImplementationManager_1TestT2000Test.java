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
// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_object() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation without arguments
		// ------------------------------------------------------------------------------------------------

		Object obj = new RIFImplementationManager();
		return obj.invoke("SomeInterface", "Invoke", new Object[0]);
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method with one argument
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_return() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation with a single argument
		// ------------------------------------------------------------------------------------------------

		Object obj = new RIFImplementationManager();
		return obj.invoke("SomeInterface", "InvokeReturn", new Object[] { 1 });
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method with several arguments AND return values
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_return_array_obj() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation with a single argument AND return values
		// ------------------------------------------------------------------------------------------------

		Object obj = new RIFImplementationManager();
		return obj.invoke("SomeInterface", "InvokeReturnArray", new Object[] { 1, 2 });
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method WITH one argument AND return values
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_set_iterface_obj() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation with a single argument AND return values
		// ------------------------------------------------------------------------------------------------

		Method method = RIFImplementationManager.class.getMethod("invoke", new Class[0], new Class[0]);

		Object object = new RIFImplementationManager();
		Map<String, Object> map = new Hashtable<>();
		map.put("iterface1", object);
		return method.invoke(object, map);
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method WITH one argument AND return values
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_iterator_iterface_obj() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation with a single argument AND return values
		// ------------------------------------------------------------------------------------------------

		Method method = RIFImplementationManager.class.getMethod("invoke", new Class[0], new Class[0]);

		Object object = new RIFImplementationManager();
		Map<String, Object> map = new Hashtable<>();
		Object[] o = (Object[])method.invoke(object, map);
		assertEquals("Error calling invoke() in test", o.length, 1);
		assertEquals("Error calling invoke() in test", o[0], object);
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method WITH multiple arguments AND return values
		// ------------------------------------------------------------------------------------------------

	@Test
	public void invoke_return_iterface_list() throws RemoteException {
		// ------------------------------------------------------------------------------------------------
		// Testing the method invocation with a single argument AND return values
		// ------------------------------------------------------------------------------------------------

        Method method = RIFImplementationManager.class.getMethod("invoke", new Class[0]);

			Object object = new RIFImplementationManager();
			Map<String, Object> map = new Hashtable<>();
			Object[] o = (Object[])method.invoke(object, map);
			assertEquals("Error calling invoke() in test", o.length, 1);
			assertEquals("Error calling invoke() in test", o[0], object);
	}

		// ------------------------------------------------------------------------------------------------
		// Unit test cases for the RIFImplementationManager.invoke method with one argument AND return values and one argument
		// ------------------------------------------------------------------------------------------------

}