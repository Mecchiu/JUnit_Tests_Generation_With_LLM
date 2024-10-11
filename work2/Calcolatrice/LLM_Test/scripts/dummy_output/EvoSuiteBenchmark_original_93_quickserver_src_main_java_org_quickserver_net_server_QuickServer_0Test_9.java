// QuickServer_0Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
		/**
		 * Gets the version of the library.
		 * @return version value of the library.
		 * @exception NoSuchFieldException exception thrown in
		 *  case of no version method set in the super class.
		*  @exception SecurityException exception thrown in case of
		 *  a failure in the version method.
		 *  @exception NoSuchMethodException exception thrown in case of
		 *  failure to invoke the version method.
		 */
		public static String getVersion() throws NoSuchFieldException,
        SecurityException, ClassNotFoundException, IOException {
			try	{
				return quickServer_0.version();
			}	catch (Throwable e)	{
				//This causes the tests to fail at runtime
			}
			return null;
		}

		private static quickServer_0 quickServer_0 = new quickServer_0();
}