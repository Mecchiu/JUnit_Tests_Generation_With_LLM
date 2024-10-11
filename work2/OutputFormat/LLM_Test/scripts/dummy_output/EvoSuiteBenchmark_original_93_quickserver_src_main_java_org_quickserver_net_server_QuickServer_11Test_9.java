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
     * Initializes QuickServer and returns its value as result.
     * <p>When {@link #shutdown()} is called QuickServer can't be stopped, so
     * calling {@link QuickServer#shutdown()} would throw an Exception.</p>
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {    
        QuickServer_11Test test = new QuickServer_11Test();
        test.setUp();
        test.shutdown();
    }


    private void testConnectionException() throws Exception {
        
        System.err.println("");
        System.err.println("Start Test");
        System.err.println("Test is currently disabled");
        
        //Test Server
        QuickServer_11Test server=new QuickServer_11Test();
        server.setName("tst11"); //Test Server Name
        server.setPort(1099);
        server.setDataMode(DataMode.String);
        server.setMaxPool(5); //Maximum number of pooled connections set to 5
        server.setMaxClient(10); //Maximum number of Client connections set to 10
        //Not all clients will be able to connect, so for maximum pool of 3:
        server.setMaxConnections(3);
        //You must set at least 2 connections to be able to create ConnectionHandler
        //@see #createHandler(String)
        server.setServerDataMode(DataMode.String, 0);
        //@see #createHandler(String)
        server.startServer();
        // Wait for the Server to be ready (1s)
        long start=System.currentTimeMillis();
        long t=start+10;
        int c=0;
        while(t==System.currentTimeMillis() && c<3) {
            Thread.sleep(50);
            c++;
        }
}
}