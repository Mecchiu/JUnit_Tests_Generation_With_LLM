// QuickServer_1Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {
		/**
		* Constructor of {@link QuickServer_1Test}.
		* @param inputString contains a version string which will be
		* tested.
		*/
		public QuickServer_1Test(String inputString)  {
    		// Check for proper version number string value
    		String str = quickServer.getVersionNo();
    		if (str.length() < 4) {
    			throw new RuntimeException("Invalid version string : " + str);
    		}
    		if (str.length() > 4) {
    			throw new RuntimeException("Invalid version string : " + str);
    		}
			
			
			
			System.out.println("Version string = "+inputString);
			// Check for proper version number string value
			if (inputString.substring("1".length()).equals("1")) {
				System.out.println("Quick Server Version is 1");
				quickServer = new QuickServer();
			} else {
				System.out.println("Quick Server Version is 2");
				quickServer = new QuickServer();
			}
			
		}
}