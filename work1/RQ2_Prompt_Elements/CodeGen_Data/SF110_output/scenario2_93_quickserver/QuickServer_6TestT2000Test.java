// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {

    /**
     * Test case for {@link QuickServer#stopService()}, which calls
     * {@link #stopServer()} and deletes all the
     * {@link QuickServer#clientPool}s contained within QuickServer.
     */
    @Test
    public void testStopService() {
        
        try (ServerSocket ss = new ServerSocket(0)) {
            ss.setReuseAddress(true);
            assertTrue(ss.isBound());
            
            quickserver = new QuickServer(ss.getLocalPort());
            assertTrue(!ss.isBound());
            assertTrue(quickserver.socket!= ss.getLocalPort());
            
            final SimpleServer ssImpl = new SimpleServer();
            ssImpl.onError = e -> {};
            ssImpl.bindAndStart();
            
            readyServer = ssImpl.getServer();
            
            try {
                clearAllPools();
                ssImpl.stopServer();
                assertTrue("Failed to stop", ssImpl.socket.isBound());
                
            } catch (AppException e) {
                e.printStackTrace();
                fail("Cannot stop server.");
            }
            
            assertTrue((readyServer!= null));
            
            readyServer.stop();
            ssImpl.stopServer();
            assertTrue("server has been stopped", ssImpl.socket.isBound());
            
        }  catch (Throwable e) {
            e.printStackTrace();
            fail("Exception running tests", e);
        }
        
    }
    
    /*
     * This tests the client handling.
     */
    @Test
	public void testClientHandling() throws IOException, InterruptedException, ClassNotFoundException {
		
        try (ServerSocket ss = new ServerSocket(0)) {
			ss.setReuseAddress(true);
			assertTrue(!ss.isBound());
			
			clientServer = new ClientServer();
			