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
		public RIFImplementationManager clientRIFImplementationManager = null;
		public RIFService service = new RIFService();
		private ObjectInputStream ois = null;
		private ObjectOutputStream oos = null;
		private byte[] serializedParams = null;
		private String serializedParamsString = null;
		private String actualParameters = null;
		private String actualParametersString = null;

		@Test
		void testEncode() throws Exception
		{
				ois = new ObjectInputStream(new ByteArrayInputStream(
						service.serializeService()
					.getBytes("UTF-8")
					)
			);	

		}

		@Test
		void testUnmarshal() throws Exception {
			ois.close();
		}

		@Test
		void testInvoke() throws Exception{

					Serializable serial = null;
					String encodedParams = null;
					ObjectOutputStream oos = null;


					oos = null;
					oos = new ObjectOutputStream(new ByteArrayOutputStream());
					ois = new ObjectInputStream(new ByteArrayInputStream(
							oos.getBytes("UTF-8").getBytes("UTF-8")
					)
			);


					// get the deserialized object
					serial = ois.readObject();
					oos.writeObject(serial);
					ois.close();
					oos.close();

					ois = null;
					oos = null;
					ois = new ObjectInputStream(new ByteArrayInputStream((byte []) serial)) {
					};

			ois.close();

		}

}