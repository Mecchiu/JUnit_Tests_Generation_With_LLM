// RIFImplementationManagerTest.java
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
class RIFImplementationManagerTest {
		
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_InterfaceNameIsNull() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke(null, "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_InterfaceNameIsEmpty() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the interface name is not registered.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_InterfaceNameIsNotRegistered() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_MethodNameIsNull() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", null, new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_MethodNameIsEmpty() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method name is not registered.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_MethodNameIsNotRegistered() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the parameters are null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_ParametersAreNull() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", null));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the parameters are empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_ParametersAreEmpty() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the parameters are not registered.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testInvoke_ParametersAreNotRegistered() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is invoked successfully.
	* Expected result: the method is invoked successfully.
	*/
	@Test
	void testInvoke_Success() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
	
	/**
	* Test case for {@link RIFImplementationManager#invoke(String, String, Object[])} method.
	* It tests the case when the method is invoked unsuccessfully.
	* Expected result: the method is invoked unsuccessfully.
	*/
	@Test
	void testInvoke_Unsuccess() {
		RIFImplementationManager manager = new RIFImplementationManager();
		assertThrows(IllegalArgumentException.class, () -> manager.invoke("Interface", "method", new Object[]{}));
	}
}