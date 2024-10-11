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
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface.class);
		assertSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentInterface() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface2.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentInterface() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager.getInvoker(TestInterface2.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_FirstTime_DifferentManager_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		assertNotSame(invoker1, invoker2);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the second time.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_SecondTime_DifferentManager_DifferentInterface() throws RemoteException {
		RIFManager manager1 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFManager manager2 = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker1 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker2 = manager2.getInvoker(TestInterface2.class);
		RIFInvoker invoker3 = manager1.getInvoker(TestInterface.class);
		RIFInvoker invoker4 = manager2.getInvoker(TestInterface2.class);
		assertSame(invoker1, invoker3);
		assertSame(invoker2, invoker4);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time.
	* It is expected that the {@link RIFManager#getInvoker