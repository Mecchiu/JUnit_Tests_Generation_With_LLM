package macaw.system;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartupOptionsTest {

    @Test
    void testUseDemoTrue() {
        StartupOptions options = new StartupOptions();
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        assertFalse(options.useDemo());
    }

    @Test
    void testDbUser() {
        StartupOptions options = new StartupOptions();
        options.setDbUser("testUser");
        assertEquals("testUser", options.getDbUser());
    }

    @Test
    void testDbPassword() {
        StartupOptions options = new StartupOptions();
        options.setDbPassword("testPassword");
        assertEquals("testPassword", options.getDbPassword());
    }

    @Test
    void testServer() {
        StartupOptions options = new StartupOptions();
        options.setServer("testServer");
        assertEquals("testServer", options.getServer());
    }

    @Test
    void testPort() {
        StartupOptions options = new StartupOptions();
        options.setPort("8080");
        assertEquals("8080", options.getPort());
    }

    @Test
    void testDatabaseName() {
        StartupOptions options = new StartupOptions();
        options.setDatabaseName("testDB");
        assertEquals("testDB", options.getDatabaseName());
    }

    @Test
    void testDbDriverName() {
        StartupOptions options = new StartupOptions();
        options.setDbDriverName("com.test.Driver");
        assertEquals("com.test.Driver", options.getDbDriverName());
    }

    @Test
    void testMaximumNumberOfConnections() {
        StartupOptions options = new StartupOptions();
        options.setMaximumNumberOfConnections(30);
        assertEquals(30, options.getMaximumNumberOfConnections());
    }

    @Test
    void testDatabaseURI() {
        StartupOptions options = new StartupOptions();
        options.setServer("testServer");
        options.setPort("8080");
        options.setDatabaseName("testDB");
        assertEquals("jdbc:mysql://testServer:8080/testDB", options.getDatabaseURI());
    }
}
