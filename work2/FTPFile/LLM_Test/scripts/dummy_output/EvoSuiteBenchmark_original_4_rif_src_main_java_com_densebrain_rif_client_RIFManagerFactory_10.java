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
		RIFManagerFactory factory = new RIFManagerFactory();
        /**
         * RIFManager with a singleton but multiple implementations.
         *
         * @throws  RemoteException
         */
        @Test
        public void testRIFManager_instance() throws RemoteException {
                RIFManager managerTest = factory.getManager("http://localhost:8080/rif");
                assertNotNull("manager returned null.", managerTest);
        }

        /**
         * Some number of managers with different implementations.
         *
         * @throws  RemoteException
         */
        @Test
        public void testRIFManager_multipleInstances() throws RemoteException {
                // create many managers and inject the ones we want to test
                for (int n = 0; n < 20; n++) {
                        RIFManager managerTest0 = factory.getManager("http://localhost:8080/rif");
                        assertNotNull(String.format("Failed to initialize manager instance %s ", managerTest0),managerTest0);
                        RIFManager managerTest1 = factory.getManager("http://localhost:8081/rif");
                        assertNotNull(String.format("Failed to initialize manager instance %s ", managerTest0),managerTest1);
                }

                // some test cases for the RIFManagerFactory
        }

				// testRIFRIFInvoker.setURL("http://localhost:8080/rif");
        // testRIFGreeting.setURL("http://localhost:8080/rif");
        // testRIFServer.setURL("http://localhost:8081/rif");



		@org.junit.jupiter.api.Assumptions.Assume( false )
        // We have one test case for the RIFInvoker
		protected void verifyRIFInvoker() {

                RIFManager managerTest0 = factory.getManager("http://localhost:8080/rif");

                // This is the test case of RIFInvoker.
                // It verifies that its proxy factory for the specific interface is
                // properly set up.  That the proxy factory also performs some functional
                // checks when the ProxyFactory is initialized.

                assertNotNull("The RIFInvoker proxy does not have a manager.",managerTest0.getManagedProxy(RIFInvoker.class,RIFManager.class));

                // A singleton of the manager
                assertNotEquals("The RIFInvoker proxy still has no RIFManager object.",managerTest0.getManagedProxy(RIFInvoker.class),null);

                // A multi-cast proxy
                assertEquals("The RIFInvoker proxy doesn't cast to a proxy of the
                    same type which is registered in the RIFManager.",
                    RIFManager.getManagerOfType(RIFManager.class),managerTest0.getManagedProxy(RIFInvoker.class));

                // Check if the proxy of the RIFInvoker is properly set up
                RIFManager managerTest1 = factory
                       .getManager("http://localhost:8081/rif")
                       .getManagedProxy(RIFGreeting.class,RIFManager.class);
                assertNotNull("The RIFInvoker proxy is null.",managerTest1.getManagedProxy(RIFGreeting.class));

                // A singleton of the manager
                assertEquals("The RIFInvoker proxy now casts to the proxy of the proxy of
                                the RIFManager.",RIFManager.getManagerOfType(RIFManager.class),managerTest1.getManagedProxy(RIFGreeting.class));

                // A multi-cast proxy
                assertEquals("The two proxy objects cast to an proxy of the proxy of
                    the second proxy types of which is registered in the RIFManager. ",
                    managerTest0.getManagedProxy(RIFGreeting.class),
                    managerTest1.getManagedProxy(RIFGreeting.class));
        }
	
        

}