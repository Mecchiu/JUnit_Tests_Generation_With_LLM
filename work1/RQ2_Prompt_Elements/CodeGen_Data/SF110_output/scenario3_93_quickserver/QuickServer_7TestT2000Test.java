// QuickServer_7Test.java
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
* It contains one unit test case for the {@link QuickServer#suspendService()} method.
*/
class QuickServer_7Test {

	/** Contains a set of test classes defined by QTest_Helper.java. */
	private final static Map<String, Class<? extends TestSuite>> testClassMap = 
		new HashMap<String, Class<? extends TestSuite>>();
	

	/**
	 * Constructor.
	 *
	 * @param s A QTestSuite object to be stored
	 */
	private static void initTestSuite( final TestSuite s ) {
		testClassMap.put( s.getClass().getCanonicalName(), s );
	}
	

	/**
	 * Returns a specific test suite object stored by name.
	 *
	 * @param s  A QTestSuite object, which contains some
	 * 			specific tests (example is EchoCommandHandler).
	 *
	 * @return TestSuite object stored in the given name.
	 *          Returns null if the name is not found
	 */
	private static TestSuite getTestSuite( final String s ) {
		final Class<? extends TestSuite> c = testClassMap.get( s );
		return c == null? null : c.newInstance();
	}
            

	/**
	 * Calls the method to create server.
	 */
	@Test void createServer_01() {
		new QuickServer();
	}
	

	/**
	 * Checks that QDB_Server has server port and a valid name.
	 *
	 * @since 1.3.5
	 */
	@Test void validateQueryServer_01() {
		//Create server
		final Server s = ClientFactoryPipe.createServer();

		//Check the server
		assertNotNull( s.factory().addServer( new Port( -1 ) ) );
		assertNotNull( s.factory().addServer( new LocalPort( -1, 1 ) ) );
		assertNotNull( s.factory().addServer( new Port( -1, 123 ) ) );
		assertNotNull( s.factory().addServer( new Port( -1, 456 ) ) );

		//Check the ports
		assertEquals( 123, s.factory().getQueryPorts().size() );
		assertEquals( 456, s.factory().getServerPorts().size() );
		assertEquals( 1, s.factory().getNClientHandles() );
		
		//Validate that Q