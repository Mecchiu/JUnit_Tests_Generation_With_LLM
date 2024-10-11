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
	* Test of getInvoker method, of class RIFManager.
	*/
    @Test
    public void testgetInvoker() throws RemoteException {
        // Mock the RIFT service.
        doAnswer(invocation -> {
            // Create local service stub.
            RIFServiceStub rifServiceStub = new RIFServiceStub();

            // Retrieval of name- and version-code- information.
            String[] info = { "name", "version" };

            // Invoke the method.
            Object answer = invocation.callRealMethod(rifServiceStub, "getInvoker", info);

            // Return the RIFT method result.
            return answer;
            }).when(rifService).getRIFService();

            // Get a service reference for this test.
        Hashtable<String, Object> servRefs = new Hashtable<String, Object>();
        servRefs.put("name", "rif");
        servRefs.put("version", "1.0.0");
        ServantInterface rifService = new RIFServiceStub();
        // We have no expectation of failure!
        rifServiceStub.getRIFService = rifService.getRIFService;

        // Initialize the mapping for this test service.
        RIFService rifService = new RIFServiceStub(servRefs);
        // We have no expectation of failure!
        rifService.getInvoker = rifService.getInvoker;

        // Retrieve the RIFT invoker.
        RIFInvoker invoker = rifService.getInvoker(new Class[] { String.class });

        assertNotNull(invoker);

        //
        // Invoke the method. The argument of invoker can never be null.
        invoker.getServiceId();

    }


}