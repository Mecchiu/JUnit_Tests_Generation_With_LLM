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

	/**
	 * Read the string into memory.
	 *
	 * @since 1.4.8
	 */
	private static int READ_BUFFER_SIZE = 1<<24;
	
	/**
	 * Generate test data.
	 *
	 * @param serverName Name of the server.
	 * @param port Port of the server.
	 * @return
	 */
	private static String [] generateTestData(String serverName,
			int port) {
		
		ArrayList testRecords = new ArrayList();
		String testStr = "";
		//generate a string generated from a class-defined test data
		
		for(int i = 0; i < 10; i++) {
			testStr += (String)testData.get(i);
		}
		for(int j = 0; j < 1; j++) {
			String data = testStr.substring(0, 20);
			String xml = "<TestResult>\n<TotalCalls>" + i + "\n</TotalCalls>\
					<TotalErrors>" + j + "\n</TotalErrors>\
					<TotalTime>" + testStr.substring(
						testStr.length()-10, testStr.length()) + "\n</TotalTime>\
					</TestResult>\n";
			testRecords.add(xml);
		}
		
		return new String [testRecords.size()];
	}
	
	/**
	 * Generate test data.
	 *
	 * @since 1.4.8
	 */
	private static String [] testData = generateTestData("DockerDBTest", 11211);
}

// echoserver --EchoCommandHandler.xml
