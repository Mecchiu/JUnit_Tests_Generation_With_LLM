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
		/**
		* Constructor for {@link QuickServer_5Test}.
		*/
		public QuickServer_5Test() throws java.io.IOException, java.lang.SecurityException {
                 java.security.Security.addProvider(new org.apache.commons.ssl.SSLSocketFactory());
            }

	/**
	 * Executes {@link QuickServer#startService()} and it will be tested
	 * (if configured) to verify the outcome of this method.
	 */
	@Test
	public void test_startService_Ok() throws java.io.IOException, java.lang.SecurityException, AppException {
		System.out.println("Starting JVM");
		Runtime.getRuntime().addShutdownHook(ShutdownHook);

		if (QuickServer.PORT!= 0) {
            		System.out.println("Quickserver started at port" + QuickServer.PORT + "!");

            		QuickServer.stopServer();
            }
        }
//end
public class ClientCommandHandler 
        extends ClientEventHandler 
        	implements ClientCommandHandler {
      public ClientCommandHandler() {
    	super();
      }
      
	public ClientCommandHandler( String name ) {
		super(name);
	}
		
	public void handleStringCommand( Connection connection, String command ) 
		throws AppException
	{                	
            try {
				connection.setRequestProperty("Content-Length", connection.receive(String.valueOf(connection.receiveQueueSize())));
			String data = connection.receive(String.class);
			System.out.println("Received content = "+data);
				connection.setResponseHeader("Content-Length","1");
				connection.write( data );
			} catch( IOException e ) {
				e.printStackTrace();
			} catch( ConnectionClosedException e ) {
				e.printStackTrace();
			} catch( Throwable e ) {
				e.printStackTrace();
			}
        }
}

/**
 * An abstract base class representing <i>event</i> handler.
 * @author Akshathkumar Shetty
 */
abstract class ClientEventHandler
		implements ClientCommandHandler {
        /**
         * Set handler name
         */
        protected String name;

}
}