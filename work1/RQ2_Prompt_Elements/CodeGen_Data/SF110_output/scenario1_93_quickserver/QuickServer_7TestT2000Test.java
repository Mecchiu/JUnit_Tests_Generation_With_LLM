// QuickServer_7Test.java
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
* It contains one unit test case for the {@link QuickServer#suspendService()} method.
*/
class QuickServer_7Test {

   private static final short MAX_CONNECTION = 32;
    private static final String CHARSET_ENCODING = "ISO-8859-1";

    private static ClientHandler client;
    private static String clientLogin = null;
    private static String clientLoginMsg = null;
    private static int clientSuspendedCount = 0;
    private static int timeOut;
    protected volatile boolean suspendServer = false;
    protected Object suspendContextObj = null;
    protected Object suspendContext = null;

	 /**
     * Test case where {@link #clientSuspendedCount} is incremented with each suspend.
     */
    //@Test
    public void testSuspendClientSuspendedCount() {
        for (int id=0; suspendServer && (!id % 10 == 0); id++) {
            clientSuspendedCount++;
        }
    }

    public static void main(String args[]) {
        new QuickServer_7Test();
    }

    public synchronized void setSuspendClientSuspendedCount(int cnt) {
        clientSuspendedCount = cnt;
    }

    public synchronized void setSuspendContext(Object a) {
        suspendContext = a;
    }

    public synchronized void addSuspendContext(Object a) {
        suspendContextObj = a;
    }

	/**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        // Create client handler and send the command string for the connection.
        try { 
            client = new ClientHandler();
            client.run(clientLoginMsg.getBytes(CHARSET_ENCODING),
                    SystemProxyConstant.MAX_CONNECTION);
            // Time out by the server. The time out is reset when the connection is made.
            timeOut = 9999;

            while ((timeOut == 0) || ((suspendServer && (!clientSuspendedCount % 10 == 0))) && (!client.isClosed())) {
                client.send(clientLoginMsg.getBytes());
