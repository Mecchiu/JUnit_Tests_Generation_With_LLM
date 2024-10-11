// QuickServer_9Test.java
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
* It contains one unit test case for the {@link QuickServer#info()} method.
*/
class QuickServer_9Test {
		private final static Logger LOG = LoggerFactory.getLogger(QuickServer_9Test.class);
		private final static String className = "echo_9Client_EchoObject";
        private volatile Connection con;
		private volatile ServerSocket serv;
		private QuickserverApplication qsa;

        private final static String port = "4444";

        public void setClassName(String className) {
            this.className = className;
        }

        static {
            try {
                ServerSocketConnector ssc = new ServerSocketConnector();
                String port1 = qsa_test_data.getProperty("dummy1", String.class),
                        port2 = qsa_test_data.getProperty("dummy2", String.class);
                ssc.setPort(Integer.valueOf(port1));
                ssc.setPort(Integer.valueOf(port2));
                ServerSocket sss = ssc.getServerSocket();
                int port = sss.getLocalPort();

//                    port = -1;
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            } catch (Exception e) {
                LOG.log(Level.WARNING, null, e);
            }
        }

		private void setUp() {
}
}