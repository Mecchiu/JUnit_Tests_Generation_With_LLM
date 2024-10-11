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
		public static final int NUMBER_OF_TASKS_TEST = 3;

    /**
     * @see QuickServer#TestUtils#
     * @throws Exception
     * @since 1.4.0
     */
    @Test
    @TestLogging
    public void test() throws Exception {
		assertNotEquals(QuickServer_9Test.class,"");
		assertNotNull(QuickServer_9Test.info());
		
		quickServerTest("Basic");
		quickServerTest("Binary");
        quickServerTest("Binary", new BinaryType(QuickServer_9Test.class));
        quickServerTest("Closed-Connection Test");
    }

}