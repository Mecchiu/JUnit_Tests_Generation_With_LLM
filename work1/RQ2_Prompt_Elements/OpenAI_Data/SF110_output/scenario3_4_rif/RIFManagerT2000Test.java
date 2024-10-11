// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {

	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsNull() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(null));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is not an interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsNotAnInterface() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(RIFManager.class));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterface() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsAlreadyCached() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker2);
		assertEquals(rifInvoker, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsNotAlreadyCached() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker2);
		assertNotEquals(rifInvoker, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsNotAlreadyCached2() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker2);
		assertNotEquals(rifInvoker, rifInvoker2);
		RIFInvoker rifInvoker3 = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker3);
		assertEquals(rifInvoker, rifInvoker3);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsNotAlreadyCached3() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker2);
		assertNotEquals(rifInvoker, rifInvoker2);
		RIFInvoker rifInvoker3 = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker3);
		assertEquals(rifInvoker, rifInvoker3);
		RIFInvoker rifInvoker4 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker4);
		assertEquals(rifInvoker2, rifInvoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsNotAlreadyCached4() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker2);
		assertNotEquals(rifInvoker, rifInvoker2);
		RIFInvoker rifInvoker3 = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker3);
		assertEquals(rifInvoker, rifInvoker3);
		RIFInvoker rifInvoker4 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotNull(rifInvoker4);
		assertEquals(rifInvoker2, rifInvoker4);
		RIFInvoker rifInvoker5 = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker5);
		assertEquals(rifInvoker, rifInvoker5);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndRIFInvokerIsNotAlreadyCached5() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull