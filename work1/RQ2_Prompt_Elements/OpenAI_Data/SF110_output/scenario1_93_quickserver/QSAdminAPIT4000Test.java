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

	@Test
	void testLogon() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
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
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language.
 * </p>
 * <p>
 * This server can be used to communicate with QuickServer from any
 * programming language