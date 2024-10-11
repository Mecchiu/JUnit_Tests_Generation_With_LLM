// QuickServer_8Test.java
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
* It contains one unit test case for the {@link QuickServer#resumeService()} method.
*/
class QuickServer_8Test {
		/**
  * The {@link QuickServer} object.
  */
    final static QuickServer INSTANCE = new QuickServer();

		/**
  * The constructor
  *
  * @since 1.2
  * @author Akshathkumar Shetty
  */
	public QuickServer_8Test() {
	}

		/**
  * The method to resume the service.
  *
  * @return true if the service was successfully resumed.
  * @since 1.2
  * @author Akshathkumar Shetty
  */
		public boolean resumeService()
		{
			synchronized(QuickServer_8Test.class) {
				System.out.println("Test for "+INSTANCE.getName()+":");
				System.out.println("Trying to service from service");
				return INSTANCE.resumeService();
			}
		}

		/**
  * It is a unit test for {@link QuickServers#resumeService()}.
  *
  * @since 1.2
  */
	@Test
	public void test() throws IOException, FileNotFoundException {
		assertNotNull(INSTANCE);

      // System.out.println("######################################" );
      // System.out.println("Resuming service from local host: "+INSTANCE.getName()+" port:"+INSTANCE.getPort() );

}
}