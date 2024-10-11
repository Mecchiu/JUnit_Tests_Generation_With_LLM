// RIFImplementationManager_0Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {
		@Test
		public void test() throws RemoteException {
			RIFImplementationManager provider = getInstance();
			provider.registerImplementation(RIFTest2.class, new TestImpl());
		}

		/**
         * Test the RIFImplementationManager.registerImplementation method.
         *
         * @throws RemoteException
         */
		private static Object testImpl() throws RemoteException {
			return ("testImpl()");
		}

		/**
         * Test the RIFImplementationManager.getInstance method.
         *
         * @throws RemoteException
         */
		@Test
		public void getInstance() throws RemoteException {
			RIFImplementationManager provider = getInstance();
			RIFService service = provider.getRifService();
			RIFServiceImpl impl = (RIFServiceImpl) service;
			assertNotNull("Instance of the service is null", impl);
			RIFImplementation rifImpl = impl.getImplementation(RIFTest2.class);
			assertNotNull("The implementation was not registered", rifImpl);
			assertTrue("The implementation does not contain method " + "testImpl", rifImpl.hasMethod(new String[]{"testImpl"}));
		}

		/**
         * Test the RIFImplementationManager.getImplementation method.
         *
         * @throws RemoteException
         */
		@Test
		public void getImplementation() throws RemoteException {
			RIFImplementationManager provider = getInstance();
			RIFService service = provider.getRifService();
			RIFServiceImpl impl = (RIFServiceImpl) service;
			assertNotNull("Instance of the service is null", impl);
			RIFImplementation rifImpl = impl.getImplementation(RIFTest2.class);
			assertNotNull("The implementation was not registered", rifImpl);
			assertTrue("The implementation does not contain method " + "testImpl", rifImpl.hasMethod(new String[]{"testImpl"}));
		}
}