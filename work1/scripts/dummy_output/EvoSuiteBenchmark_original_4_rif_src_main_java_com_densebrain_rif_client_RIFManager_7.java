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
     * The interface is the server's primary interface, and not the RIFInvoker.
     *
     * @param clazz - The interface for which we have the RIFInvoker
     * @return - {@link RIFInvoker} ready to execute the method on the named interface
     * @throws RemoteException
     * @throws RemoteException 
     */
    RIFInvoker getInvoker(Class clazz) throws RemoteException, RemoteException;

    @Test
    void getInvoker_serviceStub() throws RemoteException, RemoteException;

}