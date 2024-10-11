// QuickServer_4Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServer_4Test {
		
	private final int port = 4123;
	private String user;
	private int retryCount = 5;

    /**
     * Creates a new instance of the {@link QuickServer} class.
     */
    public QuickServer_4Test() {
        this(new String("myuser", "mypassword"));
    }
    
    /**
     * Creates a new instance of the {@link QuickServer} class with the client credentials.
     * @param user credentials for client.
     */
    public QuickServer_4Test(String user) {
        this.user = user;
    }

    /**
     * Get the test port number for this test case.
     * @return The test port number.
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the client credentials.
     * The port number is only a hint which is used by the QuickServer as the
     * port number for the listening port of the QuickServer.
     * @param user credentials for client.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Sets the test cases retry count. 
     * @param retryCount number of test cases to retry.
    */
    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * Construct the QuickServer's XML configuration.
     *
     * @return The QuickServer configuration XML string.
     */
    public String constructConfig() {
        return QuickServerConfig.createXML().toString();
    }

    /**
     * Executes a test case.
     */
    @Test
    public void getPort() throws Exception {
        System.out.println("Starting" + port);
        String config = constructConfig();
        PortConfig clientConfig = new PortConfig(Port.of(port));

        String ret = QuickServer.findServicePort(XMLParser.toXML(clientConfig), config, new Object());
        System.err.println(config);
        System.err.println("Got it : " + ret);
        assertEquals(port, Integer.toString(ret.getBytes().length));
        System.out.println("Stopping" + port);
}
}