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
		public String invoke(String interfaceName, String methodName, String serializedParams) throws RemoteException {
		
		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		if (serializedParams!= null) {
		baos = new ByteArrayOutputStream();
		
			try {
			byte[] paramBytes = serializedParams.getBytes("UTF-8");
			oos = new ObjectOutputStream(baos);
			oos.writeObject(paramBytes);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			finally {
				oos.close();
			}
		}
			
		
				try {
			bais = new ByteArrayInputStream(baos.toByteArray());
			
			ois = new ObjectInputStream(bais);
			return (String) ois.readObject();
			}
		catch (Exception exc) {
			exc.printStackTrace();
		}	
		finally {
			try {
				if (ois!= null) {
					ois.close();
				}
				bais.close();
			}
			catch (Exception cex) {
				cex.printStackTrace();
			}
		}
		
		return null;
		}
	
}