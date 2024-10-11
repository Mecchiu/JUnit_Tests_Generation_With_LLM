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
* It contains ten unit test cases for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {

	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testInvoke_1() throws Exception {
		try {
			RIFImplementationManager.getInstance().invoke(null, "methodName", new Object[] {});
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("interfaceName cannot be null", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testInvoke_2() throws Exception {
		try {
			RIFImplementationManager.getInstance().invoke("", "methodName", new Object[] {});
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("interfaceName cannot be empty", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testInvoke_3() throws Exception {
		try {
			RIFImplementationManager.getInstance().invoke("interfaceName", null, new Object[] {});
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("methodName cannot be null", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testInvoke_4() throws Exception {
		try {
			RIFImplementationManager.getInstance().invoke("interfaceName", "", new Object[] {});
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("methodName cannot be empty", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface is not registered.
	* Expected result: {@link RemoteException} is thrown.
	*/
	@Test
	public void testInvoke_5() throws Exception {
		try {
			RIFImplementationManager.getInstance().invoke("interfaceName", "methodName", new Object[] {});
			fail("Expected RemoteException to be thrown");
		} catch (RemoteException e) {
			assertEquals("Not registered: interfaceName", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is not found.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testInvoke_6() throws Exception {
		try {
			RIFImplementationManager.getInstance().registerImplementation(TestInterface.class, new TestInterfaceImpl());
			RIFImplementationManager.getInstance().invoke("com.densebrain.rif.server.TestInterface", "methodName", new Object[] {});
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Unknown method methodName on com.densebrain.rif.server.TestInterface", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is found and the parameters are null.
	* Expected result: the method is invoked.
	*/
	@Test
	public void testInvoke_7() throws Exception {
		RIFImplementationManager.getInstance().registerImplementation(TestInterface.class, new TestInterfaceImpl());
		Object result = RIFImplementationManager.getInstance().invoke("com.densebrain.rif.server.TestInterface", "method1", null);
		assertEquals("method1", result);
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is found and the parameters are empty.
	* Expected result: the method is invoked.
	*/
	@Test
	public void testInvoke_8() throws Exception {
		RIFImplementationManager.getInstance().registerImplementation(TestInterface.class, new TestInterfaceImpl());
		Object result = RIFImplementationManager.getInstance().invoke("com.densebrain.rif.server.TestInterface", "method1", new Object[] {});
		assertEquals("method1", result);
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is found and the parameters are not empty.
	* Expected result: the method is invoked.
	*/
	@Test
	public void testInvoke_9() throws Exception {
		RIFImplementationManager.getInstance().registerImplementation(TestInterface.class, new TestInterfaceImpl());
		Object result = RIFImplementationManager.getInstance().invoke("com.densebrain.rif.server.TestInterface", "method2", new Object[] { "param1" });
		assertEquals("method2: param1", result);
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is found and the parameters are not empty and the method throws an exception.
	* Expected result: {@link RemoteException} is thrown.
	*/
	@Test
	public void testInvoke_10() throws Exception {
		try {
			RIFImplementationManager.getInstance().registerImplementation(TestInterface.class, new TestInterfaceImpl());
			RIFImplementationManager.getInstance().invoke("com.densebrain.rif.server.TestInterface", "method3", new Object[] { "param1" });
			fail("Expected RemoteException to be thrown");
		} catch (RemoteException e) {
			assertEquals("Error occured while invoking com.densebrain.rif.server.TestInterface.method3: method3", e.getMessage());
		}
	}
	
	/**
	* Test interface.
	*/
	public static interface TestInterface {
		
		public String method1();
		
		public String method2(String param1);
		
		public String method3(String param1) throws Exception;
	}
	
	/**
	* Test interface implementation.
	*/
	public static class TestInterfaceImpl implements TestInterface {
		
		public String method1() {
			return "method1";
		}
		
		public String method2(String param1) {
			return "method2: " + param1;
		}
		
		public String method3(String param1) throws Exception {
			throw new Exception("method3");
		}
	}
}

// RIFService.java
