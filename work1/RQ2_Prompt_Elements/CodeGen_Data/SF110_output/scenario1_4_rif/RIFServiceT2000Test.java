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
public static final int TEST_PORT = 10000;
		
		@Test
		void testInvoke() throws Exception {
	        byte[] serializedParams = Base64.decode("TestServerTest");
	        String interfaceName = "TestService";
	        String methodName = "invocationTest";
	        String serializedParamsCopy = Base64.encode(serializedParams);
	        System.out.println("-------------------------------------------");
	        System.out.println("testInvoke");
	        System.out.println("-------------------------------------------");
	        System.out.println("Invocation:");
	        System.out.println("-------------------------------------------");
	        System.out.println("  input: "+ serializedParams);
	        System.out.println("-------------------------------------------");
	        System.out.println("  output: "+ serializedParamsCopy);
	        System.out.println("-------------------------------------------");
	        Object result = invoke(interfaceName, methodName, serializedParamsCopy);
	        System.out.println("-------------------------------------------");
	        System.out.println("Result:");
	        System.out.println("-------------------------------------------");
	        System.out.println(result);
	    }
		
		@Test
		void testInvokeWithMock() throws Exception {
	        RIFService rifService = new RIFService();
	        rifService.mockMethodInvocationRemote(TEST_PORT);
	        
	        byte[] serializedParams = Base64.decode("TestServerTest");
	        String interfaceName = "TestService";
	        String methodName = "invocationTest";
	        String serializedParamsCopy = Base64.encode(serializedParams);
	        System.out.println("-------------------------------------------");
	        System.out.println("testInvokeWithMock");
	        System.out.println("-------------------------------------------");
	        System.out.println("Invocation:");
	        System.out.println("-------------------------------------------");
	        System.out.println("  input: "+ serializedParams);
	        System.out.println("-------------------------------------------");
	        System.out.println("  output: "+ serializedParamsCopy);
	        System.out.println("-------------------------------------------");
	        Object result = rifService.invoke(interfaceName, methodName, serializedParamsCopy);
	        System.out.println("-------------------------------------------");
	        System.out.println(result);
	    }
		
		@Test
		void testInvokeWithLocalRIF() throws Exception {
	        RIFService rifService = new RIFService();
	        rifService.invoke("java:global:rifService", "invocationTest");
	    }
}