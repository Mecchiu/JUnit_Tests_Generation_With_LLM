// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		
	/**
	     * @throws IOException
	     */
	public void checkSSLContext() throws IOException {
		
    String url = "https://www.example.com/";
		SSLContext sslContext = getSSLContext("TLS/SSL");

		SSLSocket socket = (SSLSocket)urlToSocket.get(url);

		assertTrue("Failed to connect.", socket.isConnected() );

		SSLSession session = socket.getSession();

		assertTrue( "SSLSession is not empty.", session!= null );

		String sslPasswd = null;

        if (session.getPeerCertificates()!= null) {
        	sslPasswd = session.getPeerCertificates()[0].getPrivateKey().getCertificatePacket().getData();

        }

        assertTrue( "No valid server password set. Use ClientAuth to make it.",!sslPasswd.isEmpty() );

 		KeyManagerFactory factory = KeyManagerFactory.getInstance("TLS");
    	String pwd = sslPasswd;
	    factory.init( null, new String[] { sslPwd }, null );
	    TrustManagerFactory tmf = TrustManagerFactory.getInstance("TLS");
	    tmf.init( factory.getKeyManagers() );

	    X509TrustManager tm = (X509TrustManager) tmf.getTrustManagers()[0];

	    assertTrue( "Got an incorrect SSL context type.", typeof session == X509TrustingX509TrustManager.class );

	    assertTrue( "Should have succeeded with the TLS context.", tm == sslContext );

}
}