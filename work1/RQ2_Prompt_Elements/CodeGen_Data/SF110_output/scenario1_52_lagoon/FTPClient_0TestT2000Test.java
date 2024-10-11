// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
//--------------------------------------------------------- Constructor:
		/** Constructor for <code>FTPClient_0Test</code> and it's test clients. */
		public FTPClient_0Test(boolean clearPassword) throws Exception {
			super(FTPClient.class, clearPassword);
			// test clients
			sendString("getnewlsafull");
		}

		//-------------------------------------------------------- Tests:
		private static void testStore(String pathname) throws Exception {
			FTPClient client = new FTPClient_0();
			assertTrue("store() not successful!", client.store(pathname));
		}

		@Test
		void testStore_1() throws Exception {
			testStore("/");
		}
    
		@Test
		void testStore_2() throws Exception {
			testStore("/123");
		}
    
		@Test
		void testStore_3() throws Exception {
			testStore("/1234");
		}
    }
