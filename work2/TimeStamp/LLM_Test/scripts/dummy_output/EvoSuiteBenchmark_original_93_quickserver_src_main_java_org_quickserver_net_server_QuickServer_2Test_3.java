// QuickServer_2Test.java
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
* It contains one unit test case for the {@link QuickServer#getNewLine()} method.
*/
class QuickServer_2Test {
		static String clientName;
		static String msg;

		public static void main(String args[]) {
			clientName = new String(args[0]);
			msg = new String(args[1]);
		}
						
        /**
         * Returns the new line used by QuickServer.
         *
         * @since 1.2
         */
        public static String getNewLine() {
            return "\r\n";
        }

        /**
         * Creates {@link QuickServer} instance.
         *
         * @param port port number
         * @param name name of the server
         * @param formatter formatter
         * @throws Exception error
         * @since 1.0
         */
        public QuickServer(int port, String formatter) throws Exception {
            super();
            this.port = 10000;
            if (formatter == null) {
                throw new IllegalArgumentException("Formatter must be not null!");
            }
            this.thread= new Thread(new Runnable() {
                @Override
                public void run() {
                   quickServer(port, clientName, msg);
                }
            }, "Server-Test:" + port);
        }

        /**
         * Creates {@link QuickServer} instance.
         *
         * @param port port number
         * @param name name of the server
         * @param formatter formatter
         * @throws Exception error
         * @since 1.6
         */
        public QuickServer(int port, String formatter, int timeout) throws Exception {
            String threadName = ManagementFactory.getRuntimeMXBean().getName();
            super();
            this.port = port;
            this.thread = new Thread(new Runnable() {
                @Override
                public void run() {
                   quickServer(port, clientName, formatter, timeout);
                }
            }, threadName);
        }

        /**
         * Executes the {@link QuickServer} as a {@link Runnable}
         * that does nothing, just to make sure.
         * It is used for unit tests.
         *
         * @param port port number
         * @param clientName client name
         * @param msg message
         * @param timeout number of seconds to wait before terminating 
         * @throws Exception error
         * @since 1.6
         */
}