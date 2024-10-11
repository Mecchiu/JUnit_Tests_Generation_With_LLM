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
		

    @Test
    	void invoke() throws RemoteException, RemoteException {
    		// Test the invocation of invoke() method on the RIFInvoker.
    		String rifInvokerRpName = "rif-invoker-rif-api";
    		String rifInvokerRpUri = "/rp/" + rifInvokerRpName + "/service/invoke";
    		String rifInvokerRpParams = "param";
			String rifResult = RIFService.invoke("rif-invoker-rif-api", rifInvokerRpName + " " + rifInvokerRpParams,
					            Base64.encodeBase64(serializedParams.getBytes(java.nio.charset.CharsetUtil.UTF8)));
    		assertEquals(rifResult, serializedParams);

    		// Test the invocation of invoke() method on the RIFImplementationManager.
    		System.err.println("-------------------------------------\nInvoked RIF:\nInvoking...");
    		String rifResult = RIFService.invoke(rifInvokerRpUri, "method", Base64.encodeBase64(
    						"serialzemmh".getBytes()));
    		assertEquals(rifResult, "Invoked Method");

    		// Test the invocation of invoke() method on the RIFImplementationManager.
    		System.err.println("-------------------------------------\nInvoked RIF:\nInvoking RemoteInvocationMethod:\nRIFInvoker: "
    				+ "http://densebrain.com/rif\nRIFInvoker.doEndpointInvocation(string param)\n\n\n\n\n");
    		String rifResult = RIFService.invoke(
    				rifInvokerRpUri, "method",
					        RIFInvoker.EndpointInvocationMethod.RIF_SERVER_RIF_TO_RIF_INVOKER.value());
    		System.err.println("Invoked end-point invocation method\nParam: " + serializedParams);
    		assertEquals(rifResult, "Invoked Endpoint");

			System.err.println("-------------------------------------\nInvoked RIF:\nInvoking RemoteInvocationMethod:\nRIFInvoker.doEndpointInvocation(string param)\n\n\n\n\n");
			String rifResult = RIFService.invoke(
					rifInvokerRpUri, "method",
							RIFInvoker.EndpointInvocationMethod.RIF_SERVER_RIF_TO_RIF_INVOKER.value());
			System.err.println("Invoked end-point invocation method\nParam: " + serializedParams);
			assertEquals(rifResult, "Invoked Endpoint");
    		System.err.println("-------------------------------------\nUnmarshalled:");
    		rifResult =
    				RIFService.invoke(
							"some-remote-endpoint-name",
							"method",
							"",
							serializedParams);

    			System.err.println("Unmarshalled:\n" + rifResult);

    		// Test the invocation of invoke() method on the RIFImplementationManager.
    		System.err.println("-------------------------------------\nInvoke call:\nInvoking...");
    		String rifResult =
    		RIFService.invoke(rifInvokerRpUri,
				"method", "param",
				serializedParams);

    		System.err.println("Invoked call.");
    		assertEquals(rifResult, "InvokedMethod");

    		// Test the invocation of invoke() method on the RIFImplementationManager.
    		System.err.println("-------------------------------------\nInvoke call, which unmarshall:\nUnmarshalled:\n" + rifResult);
    		byte[] unmarshalledBytes =
    		Base64.decodeBase64WithUtcEncoding(serializedParams);
    		Object unmarshalled = new ObjectInputStream(new ByteArrayInputStream(unmarshalledBytes)).readObject();
    		assertEquals(unmarshalled, rifResult);

    		// Test the invocation of invoke() method on the RIFImplementationManager.
    		System.err.println("-------------------------------------\nInvoke call, which unwraps the byte:\nUnwrapped:\n" + serializedParams + "\n");
    		ObjectInputStream unInputStream = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes()));
    		Object convertedObject =
    		unInputStream.readObject();
    		System.err.println("Unmarshalled:");
    		System.err.println(serializedParams.toString());
    		assertEquals(convertedObject, rifResult);
    		
    		String rifResult2 =
            	RIFService.invoke(
                    rifInvokerRpUri,
                    "method",
                    "",
                    Base64.encodeBase64WithUtcEncoding(new byte[] {0x00, 0x01}));
    		assertEquals(rifResult2, "Unmarshalled");
    		String rifResult3 =
            	RIFService.invoke(
                    rifInvokerRpUri,
                    "post",
                    new byte[] {0x00, 0x02},
                    serializedParams);
    		assertEquals(
            	rifResult3, serializedParams);

			System.err.println("-------------------------------------\nUnmarshalled:");
			unInputStream = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes()));
			unmarshalled =
					unInputStream.readObject();
			System.err.println(unmarshalled.toString());
			System.err.println("-------------------------------------\nUnmarshalled:");
		}
}