// RIFManagerFactory_0Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactory_0Test {
		/// Method to be implemented by child class.
		protected void initialize(Hashtable<String, RIFManager> managerMap) throws RemoteException {
				assertNotNull(managerMap);
				assertTrue(managerMap.isEmpty());
				RIFManager manager = new RIFManager("manager/siri-test.xml") {}.createRIFManager();
		}

		@Test
        public void testInstance() throws RemoteException {
                // TODO
                assertNotNull(getInstance());
        }
}