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
		private final String newLine = getNewLine();
		private ThreadPool threadPool = new ThreadPool(5);

    /**
     * Test method for {@link QuickServer#QuickServer(int)}.
     * @throws InterruptedException 
     * 
     * @since 1.2
     */
    @Test
    public void testNewServer() throws InterruptedException {
				threadPool.execute(new NewServer());
				threadPool.awaitTermination(7, TimeUnit.DAYS);
				assertTrue(new String(clientHandlers.peek()));
				//assertArrayEquals("EchoServer",newLine, new String(clientHandlers.peek()).trim());
		}

    /**
     * Test method for {@link QuickServer#getNewLine()}.
     */
    @Test
    public void getNewLine_getNewLine() throws InterruptedException {
				threadPool.execute(new GetNewLine());
				threadPool.awaitTermination(7, TimeUnit.DAYS);
				//assertArrayEquals("EchoServer",newLine, new String(clientHandlers.peek()).trim());
    }

    /**
     * Test method for {@link QuickServer#getNewLine()}.
     */
    @Test
    public void getNewLine_getNewLine_getNewLine() throws InterruptedException {
				threadPool.execute(new GetNewLine());
				threadPool.awaitTermination(7, TimeUnit.DAYS);
				//assertNotNull(new String(clientHandlers.peek()).trim());
    }

}