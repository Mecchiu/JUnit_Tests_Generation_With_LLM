// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
/**
		* Initializes the factory, and then starts the test case
		*/
		@Test
		void setup() throws RemoteException {
			RIFManagerFactory.instance = RIFManagerFactory.getInstance();
		}

		/**
		* The test case.
		*
		* @throws RemoteException for failures
		*/
		@Test
		void testCase() throws RemoteException {
			checkInit();
		}
}