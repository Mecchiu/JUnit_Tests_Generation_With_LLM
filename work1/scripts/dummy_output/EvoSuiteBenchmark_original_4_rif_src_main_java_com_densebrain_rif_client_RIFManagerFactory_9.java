// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
		/**
		 * @throws RemoteException
		 */
	@Test
	void testGetManagerWithWrongInterface() throws RemoteException {
		FACTORY.getManager(RIFManagerFactory.class.toString(),
						   "unsupportedInterfaceClass");
	}

		/**
		 * @throws RemoteException
		 */
	@Test
	void testManagerFactory() throws RemoteException {
		RIFManagerFactory.getInstance();
	}

		/**
		 * Test if all the RIF services for the current jvm are active, this should only be
		 * called after the init method.
		 * @throws RemoteException
		 */
	@Test
	void testInit() throws RemoteException {
		FACTORY.init();
		assertFalse(FACTORY.isInitialized());
	}

		/**
		 * Test if the RIF manager is ready.
		 * @throws RemoteException
		 */
	@Test
	void testManagerIsReady() throws RemoteException {
		assertTrue(FACTORY.isManagerReady());
		Hashtable<String, RIFManager> tempManagerMap = FACTORY.getManagerMap();
		assertNotNull(tempManagerMap);
	}

		Hashtable<String, RIFManager> map = new Hashtable<String, RIFManager>();

		/**
		 * Test to see if all the RIF services for the current jvm are loaded and ready. This
		 * is done as separate test before all the rf.properties have been loaded but the actual
		 * RIF services are loaded by the manager instance, this should only be called after the
		 * init method.
		 *
		 * @throws RemoteException
		 */
		@Test
		void testGetManagerMap() throws RemoteException {
			map = FACTORY.getManagerMap();
		}

		/**
		 * Test if the manager Map is properly set.
		 * @throws RemoteException
		 */
		@Test
		void testManagerMapSet() throws RemoteException {
			map.clear();
			map.put(FACTORY.getJVM().toString(), FACTORY.getManager());
			Hashtable<String, RIFManager> tempManagerMap = FACTORY.getManagerMap();
		}

		/**
		 * Test if the manager is set properly
		 *
		 * @throws RemoteException
		 */
	@Test
	void initManagerFactory() throws RemoteException {
		assertNotNull(FACTORY.getJvm());
		map.clear();
		map = FACTORY.getManagerMap();
		assertNull(map.remove(FACTORY.getManager().toString()));
		assertNotNull(FACTORY.getManager());
	}

		/**
		 * Test if RIF manager still needs to be initialized.
		 *
		 * @throws RemoteException
		 */
	@Test
	void rifManagerShouldBeInitialized() throws RemoteException {
		FACTORY.init();
	}

	/**
	 * Get a RIFInvoker for a specific interface that has a matching dynamic proxy.
	 *
	 * @param interfaceClazz
	 * @return RIFInvoker
	 * @throws RemoteException
	 */
	RIFInvoker getInvoker(String url, Class interfaceClazz) throws RemoteException;

	Hashtable<String, RIFInvoker> managerMap = new Hashtable<>();

}