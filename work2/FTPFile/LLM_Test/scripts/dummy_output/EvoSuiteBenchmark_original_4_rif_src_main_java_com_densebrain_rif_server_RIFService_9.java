// RIFServiceTest.java
package com.densebrain.rif.server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import org.apache.axis2.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFService}.
* It contains one unit test case for the {@link RIFService#invoke(String, String, String)} method.
*/
class RIFServiceTest {
		
    /**
     * A Test for the invoke method of RIFService.
     * It contains one unit test case that calls the RIFClient and a
     * ClientRIFService.
     * 
     * @throws RemoteException
     */
    @Test
    public void clientinvoke() throws RemoteException {
        
        RIFData.invokeTest;
        RIFData.invokeTestByteArray = new ByteArrayInputStream("invokeTest".getBytes());
        
        String invokeResult = RIFData.invokeTest();
        
        assertNotNull(invokeResult);
    }

    /**
     * @param args
     * @throws RemoteException
     */
    public static void main(String[] args) throws RemoteException {
        RIFServiceTest test = new RIFServiceTest();
        
        test.invoke("com.densebrain.rif.client.RIFClient.type", "type", "type", "type");
        test.invoke("com.densebrain.rif.client.RIFClient.rifinvoker", "rifinvoker", "rifinvoker", "type");
        test.invoke("com.densebrain.rif.client.RIFClient.type", "type", "type", "type");
        test.invoke("com.densebrain.rif.client.RIFClient.type", "type", "type", "type");
        test.invoke("com.densebrain.rif.client.RIFClient.type", "type", "type", "type");
        test.invoke("com.densebrain.rif.client.ServerRIFClient.invoke", "invoke", "invoke", "type");
        test.invoke("com.densebrain.rif.client.ServerRIFClient.invoke", "invoke", "invoke", "type");
        test.invoke("com.densebrain.rif.client.ServerRIFClient.invoke", "invoke", "invoke", "type");
        test.invoke("com.densebrain.rif.client.RIFMessageReceiver.send", "send", "type");
        test.invoke("com.densebrain.rif.client.ServerRIFClient.invoke", "invoke", "type");
    	//test.invoke("java.net.URL.openConnection", "openConnection", "openConnection", "type");
    }
	
}