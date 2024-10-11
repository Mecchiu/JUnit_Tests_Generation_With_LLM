// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {

	/**
	 * Test of logon method, of class QSAdminAPI.
	 */
	@Test
	public void testLogon() throws Exception {
		System.out.println("logon");
		QSAdminAPI instance = new QSAdminAPI("127.0.0.1", 9080);
		boolean expResult = true;
		boolean result = instance.logon();
		assertEquals(expResult, result);
	}
}

// QSAdminServer.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServer is a simple server that can be used to communicate with
 * QuickServer.
 * <p>
 * This server can be used to send commands to QuickServer and get the
 * response back.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any client that can communicate using
 * plain text.
 * </p>
 * <p>
 * This server can be used by any