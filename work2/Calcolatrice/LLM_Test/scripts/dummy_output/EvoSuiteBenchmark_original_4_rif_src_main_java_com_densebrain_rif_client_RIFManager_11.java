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
	 * Tests getInvoker(Class)
	 * @throws java.lang.Exception
	 */
	@Test
	public void testGetInvoker() throws Exception {
		RIFService v1 = null;
		try {
			classLoader = new RIFClassLoader(getClass().getClassLoader());
			v1 = classLoader.loadFactory(getClass().getName());
			assertNotNull("The invoker factory for getInvoker() should have been created", v1.getInvokerFactory());

			assertNotNull("No service implementation should have been created", v1.getInvokerFactory().getService());
		} finally {
			if (v1!= null && v1.isOpen()) {
				v1.close();
			}

		}

	}

	/**
	 * Tests getService()
	 * @throws java.lang.Exception
	 */
	@Test
	public void testGetService() throws Exception {
		Class serviceClass = null;
		try {
			RIFService v1 = classLoader.loadFactory(getClass().getName());
			serviceClass = v1.getInvokerFactory().getServiceClass();

			assertNotNull("No service implementation should have been created", v1.getInvokerFactory().getService());
		} finally {
			V1.close();
		}

		assertEquals("RIF service class not equal", serviceClass,"RIFInvoker");
	}

	/**
	 * Unit Test case for {@link RIFManager#getInvoker(Class)}
	 * 
	 * @throws RemoteException
	 * @throws java.lang.Exception
	 */
	@Test
	public void testInvokerGetInvoker() throws RemoteException, RemoteException {
		RIFInvoker invoker = null;
		try {
			classLoader = new RIFClassLoader(getClass().getClassLoader());
			invoker = classLoader.loadFactory(getClass().getName() + "RIFInvoker");
			assertNotNull("No service implementation should have been created", invoker.getInvokerFactory());
		} finally {
			if (invoker!= null && invoker.isOpen()) {
				logout();
			}

		}

	}

	private static void logout() throws RemoteException {

		RIFManager manager = null;

		try {
			Class c = RIFModule.class;
			RIFModule v1 = null;
			v1 = new RIFModule(null, null);
			ClassLoader cl = null;
			RIFInvoker m1 = null;
			manager = new RIFManager(null);
			v1.setRIFManager(manager);
			c.getMethod("logoutInvoker",Class.class);
			
		} catch (Exception  e) {
			throw new RemoteException(e);
		} catch (RemoteException e) {
			throw e;
		} catch (Throwable t) {
			e.printStackTrace();
		}
	}

}

class RIFInvoker {


	/**
	 * Constructor
	 */
	protected RIFInvoker () {
	}

	/* RIFInvoker.java end */

}