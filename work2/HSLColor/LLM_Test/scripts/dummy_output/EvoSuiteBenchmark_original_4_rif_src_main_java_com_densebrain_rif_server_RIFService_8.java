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
	 * Test methods for {@link RIFService#invoke(String, String, String)}.
	 * @throws Throwable
	 * @see <a href="http://www.javathout.us/rmi/remote-method-unmarshalling.html">RemoteMethodUnmarshalling</a>
	 */
	@Test
	void invokeRIF_RIF() throws Throwable {
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		try {
			byte[] serializedParams = new byte[32];
			String serializedParamsContent = Base64.encodeBase64String(serializedParams);
			out = new ObjectOutputStream(new ByteArrayOutputStream());
			out.writeObject(serializedParamsContent);
			out.flush();

			//Create a byte array directly to make sure the incoming stream is ready. 
			byte[] serializedParamsContent2 = Base64.encodeBase64String(serializedParams);
			ByteArrayOutputStream out2 = new ByteArrayOutputStream();
			out2.write(serializedParamsContent.getBytes());

			//Invoke RIF
			String expected = "InvokerRIF";
			assertEquals(expected, out2.toString());
		} catch (Throwable t) {
			fail("Error while testing invokeRIF service: %s", t.toString());
		} finally {
			try {
				if (in!= null){
					in.close();
				}
				out.close();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}
}