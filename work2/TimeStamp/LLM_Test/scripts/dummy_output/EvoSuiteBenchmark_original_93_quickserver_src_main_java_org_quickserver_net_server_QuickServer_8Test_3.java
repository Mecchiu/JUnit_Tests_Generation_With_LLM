// QuickServer_8Test.java
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
* It contains one unit test case for the {@link QuickServer#resumeService()} method.
*/
class QuickServer_8Test {
		//#if EACH_SERVICE_CONTEXT_CLASSES == 1
		//#define TestQuickServer1 QuickServerTest
			//#elif EACH_SERVICE_CONTEXT_CLASSES == 1
			//#define TestQuickServer2 QuickServerTest
			//#elif EACH_SERVICE_CONTEXT_CLASSES == 2
			//#define TestQuickServer3 QuickServerTest
			 //#else

			//TestQuickServerClass1(...);
			//TestQuickServerClass1(...); //TODO: need to implement this

			//#else
				private static class TestQuickServerClass1 implements ServiceContext {
				int id;

				/**
			* Creates a new class.
			* 
				* @throws java.lang.ClassNotFoundException
			*/
					public TestQuickServerClass1(String pkg) throws ClassNotFoundException {
				super();
				id=pkg.hashCode();
			}

		}

//#endif
//#if EACH_SERVICE_CONTEXT_CLASSES == 1
}