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
		
        Map<String,String> props;	// HTTP and HTTPS properties
	private static final String _log_file = "log/quickserver-test.log";
	public QuickServer_11Test() {this.props = new HashMap<String,String>();}
	public QuickServer_11Test(Map<String,String> props) { this.props = new HashMap<String,String>(props);}
	
        /**
         * Main program for QuickServer.
         * This Program should launch the clients in the order specified.
         *
         * @param args the command line arguments
         */
                @Test
        public void runAsyncServer_01(Object[] args) throws IOException {
                
                // Test for the default data mode of the server
                DataMode dataMode = new DataMode(DataMode.Client, DefaultDataMode.Client);
    
                // Set the timeout to 4 seconds
    
                int timeout = Constants.TIMEOUT;
    
                // Test for non-blocking mode of the servers.
                ServerThread thread = new ThreadServer();
    
                // Starts the threads
                thread.start();
    
                // Sleep 10 seconds between threads
                Thread.sleep(Constants.TIMEOUT_SLEEP_DELAY);
                
                // Check the connection status
                checkStatus(thread, "Connected");
                
                // Wait for all connections to finish
                thread.join();
                
                // Check the connection status
                checkStatus(thread, "Disconnected");
                
                // Now the server is ready to close if a fatal error occurred
                checkFatalError();
                
                // Clean up
                cleanup();
                
                // The server is now dead.
                failConnection();
                
                // Wait for the server to be shutdown
                waitForShutdown();
                
                // Clean up data. This should have no problems except for a hard time.
                cleanup();
                
        }
}