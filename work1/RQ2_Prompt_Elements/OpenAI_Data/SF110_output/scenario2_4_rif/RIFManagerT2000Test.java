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
	* It tests the case when the interfaceClazz is an interface and the invokerMap is empty.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsEmpty() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmpty() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, null);
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	*