// QuickServer_3Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {
		/**
		* Run the service.
		* @see TestService#doRun()
		* @throws IOException
		* @since 1.4.8
		*/
    @Test
	public void test() throws IOException {

		boolean useX509 = true;//TODO - X509 - TLS - TlsProtocol
		String port = null;
		int maxConnection = 20;
		String domain = "*.foo.com";
		String user = "admin";
		String password = "admin";
		String dataMode = "String";
		//String password = "admin";
		String dataMode2 = "String";
		String dataMode3 = "String";
		int timeoutMillis = 300000;
		String sslMode = SSLProvider.ProviderType.SASL_DFL_RSA_AES_128_GCM_GMSA;
		int retry = 200;
		int connections = 20;
		Object[] param = {
			new Boolean(useX509),
				new String(port),
				new Integer(maxConnection),
				new String(domain),
				new String(user),
				new String(password),
				new Object[]{
					new String(dataMode),
					new Integer(timeoutMillis)
				},
				new Object[]{
					new Integer(retry),
				}, //no connection
				new Object[]{
					new Integer(connections),
				},
				new int[0]
			};
		Service service = new TestService(param);
		if(!service.initService(param)) {
			System.exit(1);
		}
		System.out.println("Service "+service.getServiceName());
		boolean done = false;
		while(!done){
			try {
			    Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
		
		DataMode mode = null;
		boolean resultFound = false;
		
		System.out.println("Running....");
		//int connection = service.connect(maxConnection);
		//System.err.println("Connected with " + connection + "...");
}
}