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
     * Test method for {@link StartupOptions#useDemo()}.
     */
    @Test
    public void testUseDemo() {
        StartupOptions options = new StartupOptions();
        assertTrue("Wrong state", options.useDemo());
    }

    /**
     * Test method for {@link StartupOptions#setDatabaseURI(String)}.
     */
    @Test
    public void testSetDatabaseURI() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabaseURI("myDbURIs"));
    }

    /**
     * Test method for {@link StartupOptions#setDatabaseURI(String)}.
     */
    @Test
    public void testSetDatabaseURIWithNull() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", null, options.setDatabaseURI("myDbURIs"));
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseURI()}.
     */
    @Test
    public void testGetDatabaseURI() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", "myDbURIs", options.getDatabaseURI());
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseURI(String)}.
     */
    @Test
    public void testGetDatabaseURIWithNull() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", null, options.getDatabaseURI(""));
    }

    /**
     * Test method for {@link StartupOptions#setDatabaseDriverName(String)}.
     */
    @Test
    public void testSetDatabaseDriverName() {
      StartupOptions options = new StartupOptions();
      assertNull("Wrong state", options.setDatabaseDriverName("myDriver"));
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseDriverName(String)}.
     */
    @Test
    public void testGetDatabaseDriverName() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", "myDriver", options.getDatabaseDriverName("")) ;
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseDriverName(String)}.
     */
    @Test
    public void testGetDatabaseDriverNameWithNull() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", "mysql", options.getDatabaseDriverName(""));
    }

    /**
     * Test method for {@link StartupOptions#setDatabaseUser(String)}.
     */
    @Test
    public void testSetDatabaseUser() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabaseUser("null"));
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseUser(String)}.
     */
    @Test
    public void testGetDatabaseUserNull() {
        StartupOptions options = new StartupOptions();
        assertEquals("Wrong state", "null", options.setDatabaseUser(null));
    }

    /**
     * Test method for {@link StartupOptions#getDatabaseUser(String)}.
     */
    @Test
    public void testGetDatabaseUserWithNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabaseUser(null));
    }

    /**
     * Test method for {@link StartupOptions#setDatabasePassword(String)}.
     */
    @Test
    public void testSetDatabasePassword() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabasePassword("null"));
    }

    /**
     * Test method for {@link StartupOptions#getDatabasePassword(String)}.
     */
    @Test
    public void testGetDatabasePasswordNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabasePassword("null"));
    }

    /**
     * Test method for {@link StartupOptions#getDatabasePassword(String)}.
     */
    @Test
    public void testGetDatabasePasswordWithNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setDatabasePassword(null));
    }

    /**
     * Test method for {@link StartupOptions#setServer(String)}.
     */
    @Test
    public void testSetServer() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setServer(null));
    }

    /**
     * Test method for {@link StartupOptions#getServer(String)}.
     */
    @Test
    public void testGetServerNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setServer(null));
    }

    /**
     * Test method for {@link StartupOptions#getServer(String)}.
     */
    @Test
    public void testGetServerWithNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setServer(null));
    }

    /**
     * Test method for {@link StartupOptions#setPort(String)}.
     */
    @Test
    public void testSetPort() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setPort(null));
    }

    /**
     * Test method for {@link StartupOptions#getPort(String)}.
     */
    @Test
    public void testGetPortNull() {
        StartupOptions options = new StartupOptions();
        assertNull("Wrong state", options.setPort(null));
    }

}