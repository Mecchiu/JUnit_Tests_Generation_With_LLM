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
	void testGetInvoker_NullInterfaceClazz() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			rifManager.getInvoker(null);
			fail("IllegalArgumentException should be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("interfaceClazz cannot be null", e.getMessage());
		} catch (RemoteException e) {
			fail("IllegalArgumentException should be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is not an interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_NotInterface() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			rifManager.getInvoker(String.class);
			fail("IllegalArgumentException should be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("interfaceClazz must be an interface", e.getMessage());
		} catch (RemoteException e) {
			fail("IllegalArgumentException should be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker);
		} catch (RemoteException e) {
			fail("RemoteException should not be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_Cached() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker);
			RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker2);
			assertEquals(rifInvoker, rifInvoker2);
		} catch (RemoteException e) {
			fail("RemoteException should not be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_Cached_Different() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker);
			RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface2.class);
			assertNotNull(rifInvoker2);
			assertNotEquals(rifInvoker, rifInvoker2);
		} catch (RemoteException e) {
			fail("RemoteException should not be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_Cached_Different_Same() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker);
			RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface2.class);
			assertNotNull(rifInvoker2);
			assertNotEquals(rifInvoker, rifInvoker2);
			RIFInvoker rifInvoker3 = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker3);
			assertEquals(rifInvoker, rifInvoker3);
		} catch (RemoteException e) {
			fail("RemoteException should not be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_Cached_Different_Same_Different() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker);
			RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface2.class);
			assertNotNull(rifInvoker2);
			assertNotEquals(rifInvoker, rifInvoker2);
			RIFInvoker rifInvoker3 = rifManager.getInvoker(TestInterface.class);
			assertNotNull(rifInvoker3);
			assertEquals(rifInvoker, rifInvoker3);
			RIFInvoker rifInvoker4 = rifManager.getInvoker(TestInterface2.class);
			assertNotNull(rifInvoker4);
			assertEquals(rifInvoker2, rifInvoker4);
		} catch (RemoteException e) {
			fail("RemoteException should not be thrown");
		}
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already cached.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_Cached_Different_Same_Different_Same() {
		try {
			RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
			RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class