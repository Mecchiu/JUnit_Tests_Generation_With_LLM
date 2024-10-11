// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		
	/** unit test case of StartupOptions. */
	@Test
	void testUseDemo() {
		
		StartupOptions options = StartupOptions.startupOptions("database uri");
		
		assertEquals(options.useDemo(), new StartupOptions().useDemo());
	}
	
	/** unit test case of StartupOptions. */
	@Test
	void testDatabaseNameAndUsername() {
		
		String databaseNameAndUser = "dbname;dbuser@host.com";
		
		StartupOptions options = StartupOptions.startupOptions(databaseNameAndUser);
		
		assertEquals(options.getDatabaseURI(), databaseNameAndUser);
		assertEquals(options.getDbUser(), new String("dbuser"));
		assertEquals(options.getDbPassword(), new String(""));

		assertFalse(options.useDemo());
	}
	
	/** unit test case of StartupOptions. */
	@Test
	void testPort() {
		
		String port = "port";
		
		StartupOptions options = StartupOptions.startupOptions(port);
		
		assertEquals(options.getPort(), port);
	}
	
	/** unit test case of StartupOptions. */
	@Test
	void testMaximumNumberOfConnections() {
		
		String port = "port";
		
		int maximumNumberOfConnections = 40;
		
		StartupOptions options = StartupOptions.startupOptions(port, maximumNumberOfConnections);
		
		assertEquals(options.getMaximumNumberOfConnections(), maximumNumberOfConnections);
	}
}