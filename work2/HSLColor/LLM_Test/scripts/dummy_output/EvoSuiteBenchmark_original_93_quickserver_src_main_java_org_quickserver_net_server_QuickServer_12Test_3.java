// QuickServer_12Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_12Test {
		QuickServer_10Test() {
		}

		@Test
		void run() throws Exception {
					SSLSocketFactory s = null;
			
		this.getSSLSocketFactory("TLS");
				assertTrue(s.getProtocol().toString().equals("TLS"));

			this.getSSLSocketFactory("TLS");
				assertTrue(s.getProtocol().toString().equals("TLS"));
		}
}

// Class "QuickServer_12Test" is a test for this unit.
// In class "QuickServer_10Test", you can get the test unit
// by this method:
//    QuickServer_10Test.quickServer.QuickServer_10Test.run;
class QuickServer_12Test {
	QuickServer_10Test() {
	}

	@Test
	void run() throws Exception {
		SSLSocketFactory s = null;
		
		String protocol = Security.getProperty("TLS");
		assertTrue(protocol.equals("TLS"));
		
		s = this.getSSLSocketFactory("TLS");
		assertTrue(s.getProtocol().equals("TLS"));
		
		s = this.getSSLSocketFactory("TLS");
		assertTrue(s.getProtocol().equals("TLS"));
	}
	
	private SSLSocketFactory getSSLSocketFactory(String proto) {
}
}