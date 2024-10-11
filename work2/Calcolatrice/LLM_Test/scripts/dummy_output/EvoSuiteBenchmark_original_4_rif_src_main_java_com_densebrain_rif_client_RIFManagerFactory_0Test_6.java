// RIFManagerFactory_0Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactory_0Test {
		 /**
		  * Basic unit test for
		  * {@link com.densebrain.rif.client.RIFManagerFactory#getManager(String)}
		  *
	  * This test checks for the return value of this function 
		  * @throws RemoteException
		  */
		@Test
		 public void checkManager() throws RemoteException {
		  Hashtable<String, RIFManager> rifManagerManagerMap=getManager("http://www.myrivelive.com/rif/services/RIFService");
			assertTrue("checkManager returned null hash table", rifManagerManagerMap!=null);
			assertTrue("checkManager is not null for this hash table", rifManagerManagerMap.containsValue(getManager("http://www.myrivelive.com/rif/services/RIFService")));
			assertFalse("checkManager is not null for another hash table", rifManagerManagerMap.containsValue(getManager("http://www.myrivelive.com/rif/services/anotherRIFService")));
		 }
}