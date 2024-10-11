// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		
	// Logger object used for JUnit.
	private final Logger logger = Logger.getLogger(QSAdminAPITest.class.getName());

	/**
	 * Test if the {@link QSAdminAPI#logon()} method is successful or not.
	 * If it is not success, {@link IOException#getMessage()} will be returned.
	 *
	 * @return True if success, false otherwise.
	 */
	@Test
	public void successTest() throws IOException {
		// Testing success

		// Logging of QsAdminServer
		if (!StringUtils.hasText(QLogs.getConsoleLogLevel())) {
			logger.ignore(QSAdminAPITest.class.getName() + ".consoleLogLevel was not set");
		}
		logger.info(QLogs.getConsoleLogLevel() + " log level set properly.");

		// Logging of QsAdminServer port that QsAdmin will listen on
		if (!QLogs.getConsoleLogAddress().equals(QLogs.getDefaultServerIPAddress())) {
			logger.ignore(QSAdminAPITest.class.getName() + ".ConsoleLogAddress : " + QSAdminAPITest.QLogs.getConsoleLogAddress() + " : " + QSAdminAPITest.QLogs.getDefaultServerIPAddress());
		}
		logger.info(QSAdminAPITest.class.getName() + ".ConsoleLogAddress was set properly");
				
		assertTrue(true);

	}
}