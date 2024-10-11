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
     * Test with a valid serialized {@link Object} with the remote implementation.
     * @throws RemoteException
    * @throws RemoteException
     */
    @Test 
    public void testSerializeObject() throws RemoteException, RemoteException {
  	
  	   //Test without a classpath
    assertNotNull(RIFService.class.getClassLoader());
    
    Object serializedParams = new Object();
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    String serialized = new Object().toString();
    try {
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(serializedParams);
        oos.close();
        oos.getByteArray(); //read object and get the serialized string

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Boolean serializedParamsRetrieved = ois.readObject();
        ois.close();
        ois.getByteArray(); //read object and get the serialized string  
        ois.close();

    } catch (Exception e) {
    	e.printStackTrace();
    }
        
        //Serialized parameters are already serialized as object
	assertEquals("Params value not correctly serialized.", serialized, serializedParamsRetrieved.toString());
  
    }
}
