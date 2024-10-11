// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {

	/**
	 * @throws Exception thrown if anything goes wrong
	*/
	@Test
	public void testConstructorWithRequiredParameters() throws Exception {

		StartupOptions options = new StartupOptions();
		
		assertTrue("Expected " + STARTUP_OPTIONS + " to be initialized, but " + options + " was not initialized", options!= null);
		
		assertTrue("Expected " + "startup options class path to contain the absolute path to StartupOptions.class", options instanceof StartupOptions);

		assertTrue("Expected no database parameters", options.getDatabaseName() == null || options.getDatabaseName().endsWith("database"));
		assertTrue("Expected no server parameters", options.getServer() == null || options.getServer().endsWith("/"));
		assertTrue("Expected no database parameters", options.getPort() == null || options.getPort().length() == 0);
		assertTrue("Expected no maximumConnection value", options.getMaximumNumberOfConnections() == -1 || options.getMaximumNumberOfConnections() >= 0);

		assertTrue("Expected the \"useDemo\" parameter to be set to " + STARTUP_OPTIONS, options.getUseDemo());
	}
	@Test
	public void testConstructorWithOptionalParameters(String databaseName, String dbDriverName, String dbUser, String dbPassword, String server, String port, int maximumConnection) throws Exception {

		StartupOptions options = new StartupOptions();
		
		assertTrue("Expected " + "startup options class path to contain the absolute path to StartupOptions.class", options!= null);

		assertTrue("Expected no database parameters", options.getDatabaseName() == databaseName);
		assertTrue("Expected no server parameters", options.getServer() == null || server.endsWith("/"));
		assertTrue("Expected no database parameters", options.getPort() == null || port.length() == 0);
		assertTrue("Expected no maximumConnection value", options.getMaximumNumberOfConnections() == maximumConnection);

		assertTrue("Expected the \"useDemo\" parameter to be set to " + STARTUP_OPTIONS, options.getUseDemo());
		assertTrue("Expected " + "param 'useDemo' to contain " + STARTUP_OPTIONS_USE_DEMO + "=" + "true", options.useDemo() == true);
		assertTrue("Expected the \"databaseName' parameter to be set to " + STARTUP_OPTIONS_DATABASE_NAME, options.getDatabaseName()!= null);
		assertTrue("Expected " + "param 'databaseName' to contain " + STARTUP_OPTIONS_DATABASE_NAME + "=" + databaseName + ".database", options.databaseName.endsWith(databaseName + ".database"));
		assertTrue("Expected " + "param 'databaseName' to contain " + STARTUP_OPTIONS_DATABASE_NAME + "=" + databaseName + ".database", options.databaseName.endsWith(databaseName.substring(0, databaseName.length() - databaseName.charAt(databaseName.length() - 1))));
		assertTrue("Expected " + "param 'port' to contain " + STARTUP_OPTIONS_PORT + "=" + databaseName + ".database", options.port.startsWith("port."));
		assertTrue("Expected " + "param 'port' to contain " + STARTUP_OPTIONS_PORT + "=" + databaseName + ".database", options.port.startsWith("hostname."));
		assertTrue("Expected " + "param'server' to contain " + STARTUP_OPTIONS_SERVER + "=" + databaseName + ".database", options.server.endsWith("/"));
		assertTrue("Expected " + "param'server' to contain " + STARTUP_OPTIONS_SERVER + "=" + databaseName + ".database", options.server.endsWith(databaseName.substring(0, databaseName.length() - databaseName.charAt(databaseName.length() - 1))));
		assertTrue("Expected " + "param'maximumConnection' to contain " + STARTUP_OPTIONS_MAXIMUM_CONNECTION + "=" + databaseName + ".database", options.maximumConnection >= databaseName.length());
	}
	@Test
	public void testProcessCommandLineArgumentsWithEmptyString() throws Exception {
		
		StartupOptions options = new StartupOptions();
		
		assertTrue("Expected " + STARTUP_OPTIONS + " to be initialized, but " + options + " was not initialized", options!= null);

		assertTrue("Expected " + "database name to end with 'database'.", options.getDatabaseName().endsWith("database"));
	}
	
}