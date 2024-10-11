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
	* It tests the case when the interface class is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_NullInterfaceClass() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> {
			rifManager.getInvoker(null);
		});
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is not an interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_NotInterfaceClass() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> {
			rifManager.getInvoker(RIFManager.class);
		});
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is not a remote interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_NotRemoteInterfaceClass() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> {
			rifManager.getInvoker(Hashtable.class);
		});
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_SameInstance() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFService.class);
		assertSame(rifInvoker1, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotSame(rifInvoker1, rifInvoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_SameInterface() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertSame(rifInvoker1.getInterfaceClass(), rifInvoker2.getInterfaceClass());
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_DifferentInterface() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotSame(rifInvoker1.getInterfaceClass(), rifInvoker2.getInterfaceClass());
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_DifferentInterface_SameName() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertEquals(rifInvoker1.getInterfaceClass().getName(), rifInvoker2.getInterfaceClass().getName());
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_DifferentInterface_DifferentName() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotEquals(rifInvoker1.getInterfaceClass().getName(), rifInvoker2.getInterfaceClass().getName());
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_DifferentInterface_SameName_DifferentPackage() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker1 = rifManager.getInvoker(RIFService.class);
		RIFInvoker rifInvoker2 = rifManager.getInvoker(RIFServiceStub.class);
		assertNotEquals(rifInvoker1.getInterfaceClass().getPackage(), rifInvoker2.getInterfaceClass().getPackage());
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interface class is a remote interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_RemoteInterfaceClass_DifferentInstance_DifferentInterface_SameName_SamePackage() throws RemoteException {
		RIFManager rifManager = new RIFManager();
		RIFInvoker r