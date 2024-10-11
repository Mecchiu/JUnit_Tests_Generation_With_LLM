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
private final int PORT = 12345;
		private final String PORT_STR = "12345";
	public QuickServer() throws IOException {
		// Get a String that represents the given port number.
		String PORT_NUMBR = "" + PORT;
		String[] PORT_NUMBR_ARRAY = PORT_NUMBR.split(",");
		PORT = Integer.parseInt(PORT_NUMBR_ARRAY[0]);

//		File file = new File("/home/anker/Dropbox/Quick Server/QuickServer.jar");

        if (!(file.exists() && file.isFile()) ) {
            throw new FileNotFoundException("/home/anker/Dropbox/Quick"
            		+ "Server/QuickServer.jar file does not exist!");
        }

		URL url = this.getClass().getResource("QuickServer.jar");
    
        ServerSocketChannel channel = null;
        try {
        	channel = ServerSocketChannel.open();
        	ServerSocket serverSocket = channel.socket();
        	serverSocket.bind(new InetSocketAddress(PORT));

//        	for (SocketConnection conn : Poolable.getInstance().getPool(url, 1000)) {
//        		SocketChannel client = conn.channel();
//        		while (! conn.expirationManager.expired(client)) {
//        			// client = client.accept();
//                                
//        		}
//        	}
        } catch (SocketException se) {
            throw se;
        } catch (IOException ioe) {
            throw ioe;
        }

        try {
    		PortNumberNumberFactoryPair portNumFp = new PortNumberNumberFactoryPair(
 			new Integer(PORT));

    		this.clientNumFp = new ClientNumNumberFactoryPair(portNumFp);

    		this.clientChNumFp = new ClientChNumFactoryPair(portNumFp);
    		
    		this.clientKeyPair = new ClientKeyPairPair(null);

        } catch (NumberFormatException nfe) {
        	  throw nfe;
        } catch (Exception e) {
        	  throw new IOException(e);
        }  
    }

        public String getName() {
            