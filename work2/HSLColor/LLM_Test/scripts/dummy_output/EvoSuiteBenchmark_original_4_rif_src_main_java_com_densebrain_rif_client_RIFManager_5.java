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
* It contains one unit test case for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {
		
	/**
	 * Test Constructor for RIFManagerTest with an existing RIFServiceStub.
	 * This should initialize the RIFManager once the service has been instantiated into the context.
	 * @throws RemoteException
	 */
	@Test
	public void testService() throws RemoteException {
		RIFManager manager = new RIFManager("rif.test");
		assertFalse(manager.service!= null);
		ManagerWrapper cache = manager.getService();
		System.out.println(ToString.method);
		ManagerWrapper cache2 = manager.getService();
		assertTrue(cache2!= null);
		assertEquals(cache, cache2);
	}

	/**
	 * Test Constructor for RIFManager with a specified RIFServiceStub.
	 * This should instantiate the RIFManager and initialize its internal services to use the
	 * given stub.
	 * @param serviceStub - RIFServiceStub to use
	 */
	@Test
	public void testServiceConstruction(RIFServiceStub serviceStub) {
		RIFManager manager = new RIFManager(serviceStub.getURL());
		ManagerWrapper cache = manager.getService();
		ManagerWrapper cache2 = manager.getService();
		assertSame(cacheStub, cache);
		assertSame(cacheStub, cache2);
	}

  	/**
	 * Tests the retrieval of the RIFServiceStub based on the interface and method names.
	 */
		@Test
		public void testStubRetrieval()  throws RemoteException {
		RIFManager manager = new RIFManager("rif.test");
		final Hashtable<String,Object> serviceStub = new Hashtable<String,Object>();
		final Hashtable<String, Object> methodStub = new Hashtable<String, Object>();
		Hashtable<String,Object> serviceMethods = new Hashtable<String, Object>();

		//test method retrieval (from the stub)
		serviceMethod("getServiceStub", serviceStub);
		serviceMethod("getConfig", methodStub);
		

		String[] methodNames = { "getServiceStub()" };
		methodNames = serviceMethod.getMethodsFor("getServiceStub");
		assertTrue(methodNames.length == 1);
		String serviceStubName = String.valueOf(serviceStub);
		String methodStubName = String.valueOf(methodStub);

		serviceMethods.put("serviceStub", serviceStubName);
		serviceMethods.put("methodStub", methodStubName);
		
		assertEquals(methodNames.length, serviceMethods.keySet().size());
	}

	 /**
	 * test method that should return a stub based on the given name.
	 * @param methodName - name used in the stub
	 * @param methodStub - stub
	 */
	private  static  void  methodStub(String methodName,  Hashtable<String,Object> methodStub) 
	throws RemoteException {

		String methodStubName = String.valueOf(methodStub);

		Object resultMethod = getObject(methodName);
		assertTrue(resultMethod instanceof Hashtable);
		Hashtable resultHashTable = (Hashtable)resultMethod;
		String stubName = String.valueOf(methodStub);

		System.out.println("Stub:" + stubName + " Method:" + methodStubName + " Result:" + resultHashTable.get(stubName));
	}

	/**
	 * Tests the retrieval of the ManagerWrapper based on the serviceStub.
	 * This method is an empty helper class intended for implementations.
	 */
	class ManagerWrapper extends RIFManager  {

		public ManagerWrapper(){
			super("rif.test");
		}
	}

}