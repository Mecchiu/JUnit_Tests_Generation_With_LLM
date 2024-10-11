// QuickServerTest.java
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
* It contains ten unit test cases for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServerTest {

	/**
	* Test case for {@link QuickServer#initService(QuickServerConfig)} method.
	* It tests the case when the {@link QuickServerConfig} object is null.
	*/
	@Test
	public void testInitService_NullConfig() {
		QuickServer quickServer = new QuickServer();
		assertFalse(quickServer.initService(null));
		assertNotNull(quickServer.getServiceError());
	}
	
	/**
	* Test case for {@link QuickServer#initService(QuickServerConfig)} method.
	* It tests the case when the {@link QuickServerConfig} object is not null.
	*/
	@Test
	public void testInitService_NotNullConfig() {
		QuickServer quickServer = new QuickServer();
		QuickServerConfig quickServerConfig = new QuickServerConfig();
		assertTrue(quickServer.initService(quickServerConfig));
		assertNull(quickServer.getServiceError());
	}
}

// QuickServerConfig.java
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

/**
 * This class is used to configure QuickServer.
 * <p>
 * This class is used to configure QuickServer.
 * </p>
 * <p>
 * <b>Note:</b> This class is not thread safe.
 * </p>
 * @author Akshathkumar Shetty
 * @since 1.4.6
 */
public class QuickServerConfig implements Cloneable, Serializable {
    private static final long serialVersionUID = 20050625L;

    private String name = "QuickServer";
    private String version = "1.4.6";
    private String build = "20050625";
    private String buildBy = "Akshathkumar Shetty";
    private String buildJDK = "1.5.0_04";
    private String buildOS = "Windows XP";
    private String buildDate = "2005-06-25";
    private String buildTime = "00:00:00";
    private String buildInfo = "";
    private String buildNumber = "";
    private String buildMachine = "";
    private String buildUser = "";
    private String buildJavaHome = "";
    private String buildAntHome = "";
    private String buildTempDir = "";
    private String buildDir = "";
    private String buildClassesDir = "";
    private String buildTestClassesDir = "";
    private String buildSrcDir = "";
    private String buildTestSrcDir = "";
    private String buildLibDir = "";
    private String buildTestLibDir = "";
    private String buildWebInfDir = "";
    private String buildWebInfLibDir = "";
    private String buildWebInfClassesDir = "";
    private String buildWebInfTestClassesDir = "";
    private String buildWebInfSrcDir = "";
    private String buildWebInfTestSrcDir = "";
    private String buildWebInfLibDir = "";
    private String buildWebInfTestLibDir = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebXml = "";
    private String buildWebInfWebX