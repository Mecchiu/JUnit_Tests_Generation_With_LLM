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
private QuickServer quickServer;
		private static SimpleSslContextFactory factory = new SimpleSslContextFactory(null, "password");
		public static int sslPort = 0;
		@Test
	    public void test() throws IOException, NoSuchAlgorithmException, KeyManagementException{
	        factory.setProvider(SSLFactory.PROVIDER_DESERIALIZED_SAME_DATA);
            factory.setKeyManagerProperties(KeyManagerFactory.getDefaultAlgorithm(), "password");
	    final String protocol = "SSLv3";
	        SSLContext configContext = SSLContext.getInstance(protocol);
	        configContext.start();
			String protocolName = SSLSocketFactory.getSocketFactory().getDefaultProtocol();
	        String protocolNameFinal = protocol;
	        System.out.println("Running protocol:" + protocolName);
			factory.setProtocols(Collections.singletonList(protocolName));
			
			// SSL parameters
			System.out.println("TLS enabled:"+getSSLContext(protocolName).getProperty("sslContext.protocol" ));
	    
			SSLContext sc = SSLContext.getDefault();
			sc.init(null, null, null);

			ClientChannel serverChannel = new DefaultSSLServerChannel();
	        SecureChannelSelector channelSelector = new SecureChannelSelector() {
	            public boolean accept(SocketChannel inboundChannel) {
	                return inboundChannel.isConnected();
	            }

	        };

	        ClientChannelListener clientListener = new ClientChannelListener();
	        ServerChannel serverChannel2 = null;
	        String hostname = "localhost";
			try {
				InetAddress[] addresses = InetAddress.getAllByName(hostname);
				InetAddress addr = addresses[0];
				String address = addr.getHostAddress();
				if (AddressUtil.reverseIpPort(address)!= null) {
					hostname = Address