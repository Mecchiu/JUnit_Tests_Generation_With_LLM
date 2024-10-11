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
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns the same {@link RIFInvoker} object as it returned for the first time.
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
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with a null argument.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method throws a {@link NullPointerException}.
	*/
	@Test
	void testGetInvoker_NullArgument() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		assertThrows(NullPointerException.class, () -> manager.getInvoker(null));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with a class argument.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method throws a {@link IllegalArgumentException}.
	*/
	@Test
	void testGetInvoker_ClassArgument() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(TestClass.class));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that does not extend the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method throws a {@link IllegalArgumentException}.
	*/
	@Test
	void testGetInvoker_InterfaceArgument() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(TestInterface2.class));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument2() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface3.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument3() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface4.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument4() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface5.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument5() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface6.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument6() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface7.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument7() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface8.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument8() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface9.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument9() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface10.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument10() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface11.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument11() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface12.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument12() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface13.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument13() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface14.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument14() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface15.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument15() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface16.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument16() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface17.class);
		assertNotNull(invoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the {@link RIFManager#getInvoker(Class)} method is called for the first time with an interface argument that extends the {@link RIFRemote} interface.
	* It is expected that the {@link RIFManager#getInvoker(Class)} method returns a new {@link RIFInvoker} object.
	*/
	@Test
	void testGetInvoker_InterfaceArgument17() throws RemoteException {
		RIFManager manager = new RIFManager("http://localhost:8080/axis/services/RIFService");
		RIFInvoker invoker = manager.getInvoker(TestInterface18.class);
		assertNotNull(invoker);
