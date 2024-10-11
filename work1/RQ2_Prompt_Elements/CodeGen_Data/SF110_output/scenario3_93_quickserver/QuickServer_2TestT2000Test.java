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
private static String defaultDataMode=null;

    /**
     * Test method for
     * {@link QuickServer#getNewLine()}.
     *
     * @throws Throwable any exception.
     */
    @Test
    public void testGetNewLine() throws Throwable {
        if (defaultDataMode == null) {
            defaultDataMode = getNewLine();
        }
        QuickServer.getNewLine();
    }

    private String getNewLine() throws Throwable {
        return null; // This method will be abstract.
    }

    /**
     * Test method for {@link QuickServer#QuickServer(int)}.
     */
    @Test
    public void testQuickServerInt() {
        QuickServer o = new QuickServer();
        try {
            o.startServer();
            return;
        } catch (Exception e) {
            assertException("Must start()", e);
        }
    }

    /**
     * Test method for {@link QuickServer#QuickServer(int,int)}.
     */
    @Test
    public void testQuickServerIntAndPort() {
        QuickServer o = new QuickServer(1234, 5080);
        try {
            o.startServer();
            return;
        } catch (Exception e) {
            assertException("Must start() with port", e);
        }
    }

    /**
     * Test method for {@link QuickServer#QSAdmin()}.
     */
     @Test
     public void testQSAdmin() throws Exception {

        // Try to start again with default data mode
        QuickServer o = new QuickServer();
        try {
            o.startServer();
            return;
        } catch (AppException e) {
            assertException("Must start(default) before QSAdmin", e);
        }

        try {
            o.startServer();
        } catch (AppException e) {
            assertException("Server not started. Did you check it", e);
        }

        try {
            o.startServer();
        } catch (AppException e) {
            assertException("Server not started. Did you check it", e);
        }

        try {
            o.startServer(1234, 25, 5080);
        } catch (AppException e) {
            assertException("Server not started", e);
        }
    }
}
