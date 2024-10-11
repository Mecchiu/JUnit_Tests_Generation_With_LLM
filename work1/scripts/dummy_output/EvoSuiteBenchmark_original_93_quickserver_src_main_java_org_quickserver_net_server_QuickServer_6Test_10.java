// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {
		/**
		 * Test method for {@link QuickServer#stopService()}.
		 */
		@Test
		public void isStopService() {
				boolean result = false;
				Service service = null;

			try {
				service = new FastOpenStringData(String.valueOf(true), null) {
					public DataMode getDataMode() {
						return DataMode.DATA;
					}
				};

				QuickServer qs = new QuickServer();
				qs.setService(service);
				qs.stopService();

				service = new FastOpenStringData(String.valueOf(false), null) {
					public DataMode getDataMode() {
						return DataMode.XML;
					}
				};

				qs = new QuickServer();
				qs.setService(service);
				qs.stopService();
			} catch (Throwable ex) {
					fail(ex.getMessage());
			}
			result = service!= null;
			assertTrue(result);
		}

		/**
		 * Test method for {@link QuickServer#setService(Service)}.
		 */
		@Test
		public void setService() {

				FastOpenStringData service = new FastOpenStringData(String.valueOf(true), null) {

					public DataMode getDataMode() {
						return DataMode.DATA;
					}
				};

			QuickServer qs = new QuickServer();

			qs.setService(service);
		}

		/**
		 * Test method for {@link QuickServer#setPort(int)}.
		 */
		@Test
		public void setPort() {

				int port = 4123;

				FastOpenStringData service = new FastOpenStringData(String.valueOf(true), null) {

					public DataMode getDataMode() {
						return DataMode.DATA;
					}
				};

				QuickServer qs = new QuickServer();
				qs.setService(service);
				qs.setPort(port);
		}

		/**
		 * Test method for {@link QuickServer#setName(String)}.
		 */
		@Test
		public void setName() {

				FastOpenStringData commandHandler = new FastOpenStringData(String.valueOf(false), null) {

					public DataMode getDataMode() {
						return DataMode.XML;
					}
				};

}
}