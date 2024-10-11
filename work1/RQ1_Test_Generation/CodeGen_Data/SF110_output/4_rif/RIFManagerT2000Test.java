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
		* @throws RemoteException
		*/
		@Test
		public void invokeTest() throws RemoteException {

			RIFService service = new RIFServiceStub("192.168.32.100:1936");
			RIFInvoker invoker = RIFManager.getInvoker(RIFInvoker.class);
			Hashtable<String, Object> parameters = new Hashtable<String, Object>();
			
			parameters.put("interface", new Integer(3));

			RIFInvoker.invoke(invoker, service, parameters);
		}

		/**
		* test invoke method with a remote object with an empty request
		*
		* @throws RemoteException
		*/
		@Test
		public void emptyRemoteInvokeTest() throws RemoteException {
			
			RIFService service = new RIFServiceStub("192.168.32.100:1936");
			RIFInvoker invoker = RIFManager.getInvoker(RIFInvoker.class);

			try {
				RIFInvoker.invoke(invoker, service, new Hashtable<String, Object>());
				fail("No exception thrown trying to invoke an RIFInvoker remotely with an empty request");
			} catch (RemoteException remoteException) {
				assertEquals("Failed invoking an RIFInvoker remotely: " + remoteException.getMessage(),
						remoteException.getMessage(),
					"Remote invocation with an empty request");
			}
		}
	}
