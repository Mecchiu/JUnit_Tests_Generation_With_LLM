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
		/**
         * Retrieve a static proxy of the RIFManager created with its init() method.
         * @throws RemoteException if cannot create instance.
         */
		@Test
        public void createManager_0Test() throws RemoteException {
            // Set environment.
            RIFManager manager = RIFManagerFactory_0.createManager();
            System.out.println(manager);
            assertNotNull(manager);
        }

}