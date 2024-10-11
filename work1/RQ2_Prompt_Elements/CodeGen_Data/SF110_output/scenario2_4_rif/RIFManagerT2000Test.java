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

    
    @Test
	public final void testGetInvoker() throws RIFException {
        // Create the RIFServiceStub (for test purposes) as described in server
        // @see RIFServiceStub
        final RIFServiceStub rifService = new RIFServiceStub();

        // Create the RIFInvoker object for the service
        final RIFInvoker rifInvoker = new RIFInvoker(rifService);

		synchronized (this) {
			assertEquals(rifInvoker, RIFManager.getInvoker(rifInvoker.getInterface()));

			// Get the cachedRIFInvoker by interface
			RIFServiceStub rIFStub = rifService.getServiceStub();
			boolean hasInterfaces = ((boolean)rIFStub.invoke("getInterfaces"));
			assertTrue("Annotation has interfaces " + hasInterfaces, hasInterfaces);

			// Get the cachedRIFInvoker by clazz (no dynamic Runtime proxy for now)
			RIFServiceStub rIFStub2 = rIFStub.getClazzStub();
			boolean hasClazz = ((boolean)rIFStub2.invoke("getInterfaces"));
			assertFalse("Aclent has interfaces " + hasClazz, hasClazz);

		}

    //    public void setDataSource(DataSource dataSource,DataSource queryDataSource) {
    //      super.setDataSource(dataSource, queryDataSource);
    //    }

}