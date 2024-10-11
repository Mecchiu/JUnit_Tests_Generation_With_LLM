// QuickServer_5Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {
		
	private static class SimpleClientHandler extends ClientHandler {
	
		public SimpleClientHandler (Pool pool) {
			super (pool);
		}

		@Override
		public synchronized ClientHandler process (Object obj) throws AppException {
			if (obj instanceof Object) {
				writeResult(obj);
				writeResult(obj);
			}
			return this;
		}
	}
	
	/**	
     * testClient
     *
	 */

	@Test
    public void testClient() throws AppException {

		System.out.println("Starting Test.  Check the'startService' method");
		PoolFactory factory = DefaultPoolFactory.getFactory();

		Pool<ClientException> pool = factory.getPool(ClientException.class);

		/*
		 * start the service in a thread pool.
		 */
		ClientFactory factory1 = new MyClientFactory(3, 2);
		Thread thread = new Thread (factory1);
		
		try {
			thread.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * start the process in main thread
		 */
		ClientFactory factory2 = new MyClientFactory(3, 2);

		try {
			ClientHandler handler2 = new SimpleClientHandler (pool);
			ClientException ch2 = factory2.getFactory().createClient(handler2);

			/*
			 * verify the returned data is not the same object
			 */
			assertNotSame(ch2.getCause(), ch2.getException());

			writeResult(ch2.getCause());
			writeResult(ch2.getException());
		} catch (AppException e) {
			e.printStackTrace();
		}

		try {
			ClientException ch3 = (TestClient) factory.getFactory().createClient(new TestClient());

			/*
			 * verify the returned data is not the same object
			 */
			assertNotSame(ch3.getCause(), ch3.getException());

			writeResult(ch3.getCause());
			writeResult(ch3.getException());
		} catch (AppException e) {
			e.printStackTrace();
		}

}
}