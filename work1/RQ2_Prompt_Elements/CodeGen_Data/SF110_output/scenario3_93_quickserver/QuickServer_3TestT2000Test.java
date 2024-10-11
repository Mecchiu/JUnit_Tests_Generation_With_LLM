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

    @SuppressWarnings("empty")
	public QuickServer_3Test() {
	}
	
	@SuppressWarnings("empty")
	@Test
	public void test() {
        String param1 = "quickServer.initService(new Object[][]{[new Object[]{}], [new Object[]{}});";
        String[] params = prepareXMLConfig("initService(new Object[]{"+param1+"})");
		String param1_2 = "quickServer.initService(new Object[]{"+params[1]+"}){};";
        String[] params_2 = prepareXMLConfig("initService(new Object[]{\"quickServer.initService(new Object[]{\""+params[0]+"})\",\"\"})");
		assertEquals(prepareXMLConfig("initService(new Object[]{}),\"com.quickserver.initService(new Object[][]{}),\"jdbc:some_db_url\""))
			+ ";"+param1_2+"\\}";
		assertEquals(prepareXMLConfig("initService(new Object[]{\"quickserver.initService(new Object[]{\""+params[0]+"})\",\"quickserver.initService(new Object[][]{}\",\"jdbc:some_db_url\""))
			+ "\\},\"quickServer.initService(new Object[][]})")))
			+ ";jdbc:some_db_url";
		assertEquals(param1_2, prepareXMLConfig("initService(new Object[]{\"quickserver.initService(new Object[]{\""+params[0]+"})\"}")));
		assertEquals(param1, prepareXMLConfig("initService(new Object[]{\"quickserver.initService(new Object[]{\"quickserver.initService(new Object[]{}\"})\"}"))));
		try {
			assertEquals(param1_2, prepareXMLConfig("initService(new Object[]{\"quickserver.initService(new Object[]{\"quickserver.initService(new Object[]{\"\"}},\""+params[0]+"\")})")));
			fail("Init Server should fail when initializing the server with non-string url");
		} catch (AppException ex)