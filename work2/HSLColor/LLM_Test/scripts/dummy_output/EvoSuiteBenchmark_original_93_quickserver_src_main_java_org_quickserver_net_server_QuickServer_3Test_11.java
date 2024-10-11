// QuickServer_3Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {
		{ QuickServer.initService(null);
		assertEquals("Echo Server initService(): Server should be running", 1, 1);
		}
	      {	QuickServer.initService(null, "test", null);
	          assertEquals("Echo Server initService(): Server should be running", 1, 1);
	          assertEquals("Echo Server: Server should be running", 1, 2);
	          assertEquals("Echo Server: Server version should be 4.7", Version.VERSION_NUMBER, 4, 7);
	          assertEquals("Echo Server: Server name should not be used.", "Echo Server", "Echo Server");
	        }
		         { synchronized(QuickServer_8Test.MyThread) {
		          QuickServer.initService(null);
		          assertEquals("QuickServer(MyThread): Server should be running", 1, 1);
		          assertEquals("QuickServer(MyThread): Server version should be 4.9", Version.VERSION_NUMBER, 4, 9);
		          assertEquals("QuickServer(MyThread) : Server name should not be used.", "QuickServer(MyThread)", "QuickServer(MyThread)");
		          }
}
}