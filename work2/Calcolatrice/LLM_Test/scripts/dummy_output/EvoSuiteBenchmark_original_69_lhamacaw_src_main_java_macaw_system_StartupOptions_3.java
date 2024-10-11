// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		
	// =================
	// Test cases
	// =================

	/**
	 * Tests the constructor and processCommandLineArguments method.
	*/
    @Test
    public void testConstructor1() {
                
		StartupOptions opts = new StartupOptions();
		
		assertNotNull(opts);
        assertTrue(opts.getMaximumNumberOfConnections() > 0);
    }

	/**
	 * Tests the processCommandLineArguments method with databaseName set.
	*/	
    @Test
    public void testProcessCommandLineArguments() {

		
		StartupOptions opts = new StartupOptions();
		opts.setDatabaseURI("memory:");		
		
		assertEquals("memory", opts.getDatabaseURI());		
		
		// test if the default database was set
		assertEquals("default", opts.getDatabaseName());
		
		assertNull(opts.getServer());
		assertNull(opts.getPort());
		assertNotNull(opts.getMaximumNumberOfConnections());
	}

}
// End of ShutdownOptions.java