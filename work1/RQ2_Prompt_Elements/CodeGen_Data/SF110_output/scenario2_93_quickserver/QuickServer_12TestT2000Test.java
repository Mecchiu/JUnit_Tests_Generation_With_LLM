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

    private static int PORT = 5343;
	  private static SSLContext ctx;
	  private static boolean secure;

	  /**
	  * @see #QuickServer_12Test()
	  */
	  public static void main(String args[]) {
	    String protocol = "SSLv3", sslprotocol = "SSLv3", sniHost = "127.0.0.1", sniPort = 443, sniProtocols = "ALL", keyprotocol = "ALL", keyprotocols = "ALL", cipherSuites = "ALL", cipherSuites = "ALL",
                        keyStoreLocation = null, keyStorePass = null, truststoreLocation = null, trustStorePass = null,

			    certAlias = null, csrAlias = null, dnsAlias = null, ipAlias = null, uidAlias = null,
			    portStart = null, portEnd = null, portString = null;
	
		
		try {
			Class.forName("com.sun.net.ssl.internal.ssl");
			
			if (null!=(SSLContext ctx = SSLContext.getInstance("SSL"))){
				ctx.init(null, null, null);
				secure = true;
			}

			if (!secure){
				System.out.println("No Server SSL is enabled");
				return;
			}
			else
				System.out.println("SSLEnabled ");
					
		}
		catch(Throwable e) {
			e.printStackTrace();
			return;
		}
				
	  try {
             String certAliasOrNull = null;
			
			if (null!= certAlias || null == sslProtocol)
				certAliasOrNull = caCertAlias;
                  
            if (null!= csrAlias