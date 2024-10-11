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
	* Getter for test testService.
	*
	*/
	RIFService getTestService() {
		return RIFServiceTest.this;
	}
	
	/**
	* Test method for {@link com.densebrain.rif.server.RIFService#invoke(String, String, String)}.
	* Tests the invoke ws method, which marshals the call to the RIFImplementationManager.
	*
	*/
	@Test
	void testInvokeWSS() throws RemoteException {
		String serviceUrl = "http://densebrain.com/rif/client/service";
		String serviceType = TYPES_NAMESPACE + "/" + "TestImplService";
		String serviceName = "TestImplService";
		byte[] serviceSerializedParams = Base64
		.encode((new ObjectInputStream(new ByteArrayInputStream("densebrain test invoke params".getBytes()))).readObject());
		String serializedParams = Base64.encode(serviceSerializedParams);

		assertNotNull("Unable to get parameters for ws service for serviceType '" + serviceType + "'",
							serviceSerializedParams);
		assertNotNull("Unable to get parameters for ws service for serviceName '" + serviceName
				+ "' for serviceType '" + serviceType + "'", serviceSerializedParams);
		
		String returnedReturn = "";
		try {
			returnedReturn = getTestService().invoke(serviceUrl, serviceName, serializedParams);
		} catch (Exception e) {
			fail("Unable to invoke ws invoke method, Exception thrown : " + e.getLocalizedMessage());
			e.printStackTrace();
			return;
		}
		assertNotNull("Unable to get return value for ws invoke method", returnedReturn);
		
		assertEquals("Return value of WebService is correct", serializedParams, returnedReturn);

		/*
        try {
            getTestService().invoke("http://localhost:8085/densebrain/rif/client/service/invoke", serviceUrl, serviceName, serializedParams);
        } catch (Exception e) {
            fail("Unable to invoke ws invoke method, Exception thrown : " + e.getLocalizedMessage());
            e.printStackTrace();
            return;
        }
        assertEquals("Return value of WebService is correct", null, returnedReturn);
		 *
		 */
	}
}
// Class of Service.java