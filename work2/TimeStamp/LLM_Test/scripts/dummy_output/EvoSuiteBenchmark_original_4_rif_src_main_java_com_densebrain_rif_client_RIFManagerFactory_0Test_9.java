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
		
	@Test
	void getManager_nullUrl() throws RemoteException {
		assertThrows(NullPointerException.class, () -> {
			RIFManagerFactory.getInstance();
		});
	}
	
	@Test
	void getManager_invalidUrl() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			new RIFManagerFactory();
		});
	}

}