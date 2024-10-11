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
    public void testGetInvoker() throws RemoteException {
        
        RIFManager manager = new RIFManager();
        manager.getClassLoader();
        
        /** Check this is an instantiation */
        RIFServiceStub stub = (RIFServiceStub)manager.getInvoker(RIFService.class);
        
        assertNotNull(stub);
        
        /** Call an invoke with a dummy object */
        String dummyValue= "dummy";
        stub.invoke(dummyValue);
        
        /** Retrieve the dummy value as a RIFInvoker */
        RIFInvoker rifInvoker = manager.getInvoker(RIFService.class); 
        assertNotNull(rifInvoker);
    }
	
    /**
    * Test the RIF service.
    */
    @Test
    public void testGetService() throws RemoteException,  Exception {
       
        RIFManager manager = new RIFManager();
        manager.getClassLoader();
        
        manager.getService();

        /** Check this is an instantiation */
        RIFServiceStub stub = (RIFServiceStub)manager.getInvoker(RIFService.class);
        
        assertNotNull(stub);
        
        /** Call an invoke with a dummy object */
        String dummyValue= "dummy";
        stub.invoke(dummyValue);
        
        /** Retrieve the dummy value as a RIFInvoker */
        RIFInvoker rifInvoker = manager.getInvoker(RIFService.class);  
        assertNotNull(rifInvoker);
    }
}