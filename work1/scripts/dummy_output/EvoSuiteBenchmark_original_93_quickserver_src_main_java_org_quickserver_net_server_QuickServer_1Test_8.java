// QuickServer_1Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {
		/**
		* The VersionNumber of library.
		*
		* This version number should be updated as soon as the
		* QuickServer library has been updated.
		*/
	static final float VERSION = 1.3f;

    /**
     * Constructor of Test class.
     *
     * @throws Exception is thrown if any constructor of class
     * {@link QuickServer_1Test} could not be initialized
     */
	public QuickServer_1Test() throws Exception
	{
		initializeQuickServer();
	}

	/**
	* Initializes the QuickServer.
	*
	* It contains one unit test case for the QuickServer's
	* constructor.
	*
	* @throws Exception should all of the initialization failed
	*/
	private void initializeQuickServer() throws Exception
	{
	    assertNotNull("QuickServer_1Test.initializeQuickServer() - QuickServer is null", QuickServer.class.getConstructor());
	}

	private void configureConnection() throws Exception {
		URL url = new URL("qss://localhost:8080/qss");
		URLConnection netConnection = url.openConnection();
		netConnection.connect();

	    File certFile = new File("../../../../certs/qss/certificate");
	    KeyStore store = KeyStore.getInstance(KeyStore.getDefaultType());
	    KeyStore.load(new FileInputStream(certFile), null, null);
	    store.load(new FileInputStream(certFile), "password".toCharArray(), "public".toCharArray());
		String certificateAlias = store.getCertificateAlias(0);
	    KeyStore store2 = KeyStore.getInstance(KeyStore.getDefaultType());
	    store2.load(new FileInputStream(certFile), "password".toCharArray(), "public".toCharArray());

	    CertificateFactory cf = CertificateFactory.getInstance("X.509");
	    InputStream in = new ByteArrayInputStream(store.getCertificateChain(certificateAlias));
	    trustingIn = cf.generateCertificatePair(in);

	    CertificatePool pool = CertificatePools.newInstance();
	    pool.addCertificateEntry("", new Certificate[] { trustingIn });

	    TrustManagerFactory tmf = TrustManagerFactory
	   .getInstance("SunX509");
}
}