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
	 * The test method that is executed when a client invokes an RIF service call.
	 * 
	 * @param serverEndPoint - the value which specifies the remote interface that is used when
	 * connecting to the server
	 * @param port - the value which specifies the remote port that is used when connecting to the server
	 * @param endpoint - the value of the serialized remote interface to invoke
	 * @param serializedParams - serialized parameters to construct and pass to the RIF implementation manager
	 * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/rmi/RemoteException.html">Remote Exception</a>
	 * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/rmi/RemoteException.html#getExtendedMessage()">RemoteException<a>
	 * @throws RemoteException
	 */
	public <T> T invoke(String serverEndPoint, final int port, final String endpoint, final String serializedParams) throws RemoteException {
		return ((T)invoke(serverEndPoint, "" + endpoint, Base64.decode(serializedParams)));
	}

	/**
	 * The test method that is executed when a client invokes an RIF service call.
	 * 
	 * @param serverEndPoint - the value which specifies the remote interface that is used when
	 * connecting to the server
	 * @param port - the port to connect to the server on
	 * @param endpoint - the value of the serialized remote interface to invoke
	 * @throws RemoteException
	 */
	public <T> T invokeWithException(String serverEndPoint, final int port, final String endpoint) throws RemoteException {
		Object result = invoke(serverEndPoint, "" + endpoint);
		Object ex = ((RemoteException)result);
		System.out.println("RIFWebService: EXCEPTION: " + ex);
		return (T)ex;
	}

	/**
	 * Test method for {@link RIFService#invoke(String, String, String)} with the serialized remote interface.
	 * 
	 * @throws RemoteException
	 */
	@Test
	public void invokeWithExceptionSerializedParamsTest() throws RemoteException {
		runTest(null, null, null, null, null, null);
	}

	/**
	 * Test method for {@link RIFService#invoke(String, String, String)} with the serialized remote interface.
	 * 
	 * @throws RemoteException
	 */
	@Test
	public void invokeWithExceptionSerializedParamsDeserializedTest() throws RemoteException {
		runTest(null, null, null, "", null, null);
	}

	private <T> T runTest(final String serverEndPoint, String methodName, String serializedParams, final String remoteEndPoint, final int port,final String remoteInterface) throws RemoteException {
		String invokeMessage = invoke(serverEndPoint, port, remoteEndPoint, binaryParams(serializedParams));
		if(methodName == null)
			methodName = "invoke";
		String result = Base64.decode(invokeMessage);
        String response = Base64.encode(result.getBytes());
		ByteArrayOutputStream