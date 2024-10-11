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
	 * Test of set method, of class RIFService.
	 */
	@Test
	void testSet() throws RemoteException {
		System.out.println("set");
	}
	
	/**
	 * Test of invoke method, of class RIFService.
	 */
	@Test
	void testInvoke() throws RemoteException {
		System.out.println("invoke");
	}

}