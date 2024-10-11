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
public static void main(String args[]) throws AppException {
	quickServer("", 8888);
	}

        @Test
        public void testEcho() throws Exception {
                ThreadGroup g = new ThreadGroup("Server Test Group");
                Runnable thread = new Echo(g);

                String name = System.getProperty("os.name");

                if (name.startsWith("Mac OS X")) {
                  g.setPriority(Thread.MAX_PRIORITY);
              } else if (name.startsWith("Windows")) {
                  g.setPriority(Thread.MIN_PRIORITY);
              }

                /*
                 * test the basic functionality of the {@link QuickServer} class
                 * by starting a server in one thread.
                 *
                 * TODO - how do I set up a client, whether the data should be sent
                 *             or should be sent over the wire? This is a bit tricky.
                 *
                 * - set up several clients and then use {@link QuickServer#startService()} method
                 * - to wait for each client to receive the data,
                 *     {@link QuickServer#run()}
                 *     will start receiving from all clients and
                 *     send their output to the server.
                 *
                 * - if more clients are expected, the clients won't stay blocked and the service will exit
                 * - if more clients are expected and the service is interrupted by the client, the service will exit
                 * - if more clients are expected and none of them are expected to execute, the service terminates.
                 */
                Thread myThread = new Thread(null, thread, "EchoClient");
                myThread.setDaemon(false);
                myThread.start();
                System.in.read();
                Thread.sleep(10);
        }
}
