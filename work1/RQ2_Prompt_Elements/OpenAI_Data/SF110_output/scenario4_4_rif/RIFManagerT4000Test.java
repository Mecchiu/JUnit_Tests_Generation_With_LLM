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
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(null));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is not an interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_NotInterface() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(String.class));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is already in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerInMap() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker2);
		assertEquals(rifInvoker, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(TestInterface2.class);
		assertNotNull(rifInvoker2);
		assertNotEquals(rifInvoker, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = null;
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapEmpty() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, null);
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerNotEquals() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface2.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		rifManager.invokerMap = null;
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapEmpty() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapNotEmpty() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapNotEmpty_InvokerNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, null);
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapNotEmpty_InvokerNotNull() {
		RIFManager rifManager = new RIFManager("http://localhost:8080/rif/services/RIFService");
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(TestInterface.class, new RIFInvoker(rifManager, TestInterface.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(TestInterface.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the RIFInvoker is not in the invokerMap.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_Interface_InvokerNotInMap_InvokerMapNotEmpty_InvokerNotNull_InvokerEquals_InvokerMapNotEmpty_InvokerNotNull_InvokerNotEquals() {
		RIFManager rifManager =