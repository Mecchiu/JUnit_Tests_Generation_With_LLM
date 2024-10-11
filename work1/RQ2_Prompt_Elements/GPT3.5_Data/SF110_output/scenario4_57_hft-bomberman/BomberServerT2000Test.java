// BomberServerTest.java
package server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BomberServer}.
 * It contains ten unit test cases for the {@link BomberServer#getInstance()} method.
 */
class BomberServerTest {

    /**
     * Test case for checking if the getInstance method returns the same instance of BomberServer.
     */
    @Test
    void testGetInstance() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        assertSame(server1, server2);
    }

    /**
     * Test case for checking if the getInstance method returns a non-null instance of BomberServer.
     */
    @Test
    void testGetInstanceNotNull() {
        BomberServer server = BomberServer.getInstance();
        assertNotNull(server);
    }

    /**
     * Test case for checking if the getInstance method returns an instance of BomberServer.
     */
    @Test
    void testGetInstanceType() {
        BomberServer server = BomberServer.getInstance();
        assertTrue(server instanceof BomberServer);
    }

    /**
     * Test case for checking if the getInstance method returns the same instance of BomberServer after multiple calls.
     */
    @Test
    void testGetInstanceMultipleCalls() {
        BomberServer server1 = BomberServer.getInstance();
        BomberServer server2 = BomberServer.getInstance();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server1, server2);
        assertSame(server2, server3);
    }

    /**
     * Test case for checking if the getInstance method returns a new instance of BomberServer after the server has been stopped.
     */
    @Test
    void testGetInstanceAfterStop() {
        BomberServer server1 = BomberServer.getInstance();
        server1.stopServer();
        BomberServer server2 = BomberServer.getInstance();
        assertNotSame(server1, server2);
    }

    /**
     * Test case for checking if the getInstance method returns a new instance of BomberServer after the server has been stopped and started again.
     */
    @Test
    void testGetInstanceAfterStopAndStart() {
        BomberServer server1 = BomberServer.getInstance();
        server1.stopServer();
        BomberServer server2 = BomberServer.getInstance();
        assertNotSame(server1, server2);
        server2.startDB();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server2, server3);
    }

    /**
     * Test case for checking if the getInstance method returns a new instance of BomberServer after the server has been stopped and started again multiple times.
     */
    @Test
    void testGetInstanceAfterMultipleStopAndStart() {
        BomberServer server1 = BomberServer.getInstance();
        server1.stopServer();
        BomberServer server2 = BomberServer.getInstance();
        assertNotSame(server1, server2);
        server2.startDB();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server2, server3);
        server3.stopServer();
        BomberServer server4 = BomberServer.getInstance();
        assertNotSame(server3, server4);
        server4.startDB();
        BomberServer server5 = BomberServer.getInstance();
        assertSame(server4, server5);
    }

    /**
     * Test case for checking if the getInstance method returns the same instance of BomberServer after the server has been stopped and started again with the same port number.
     */
    @Test
    void testGetInstanceAfterStopAndStartWithSamePort() {
        BomberServer server1 = BomberServer.getInstance();
        server1.stopServer();
        BomberServer server2 = BomberServer.getInstance();
        assertNotSame(server1, server2);
        server2.startDB();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server2, server3);
        server3.stopServer();
        BomberServer server4 = BomberServer.getInstance();
        assertNotSame(server3, server4);
        server4.startDB();
        BomberServer server5 = BomberServer.getInstance();
        assertSame(server4, server5);
    }

    /**
     * Test case for checking if the getInstance method returns a new instance of BomberServer after the server has been stopped and started again with a different port number.
     */
    @Test
    void testGetInstanceAfterStopAndStartWithDifferentPort() {
        BomberServer server1 = BomberServer.getInstance();
        server1.stopServer();
        BomberServer server2 = BomberServer.getInstance();
        assertNotSame(server1, server2);
        server2.startDB();
        BomberServer server3 = BomberServer.getInstance();
        assertSame(server2, server3);
        server3.stopServer();
        BomberServer server4 = BomberServer.getInstance();
        assertNotSame(server3, server4);
        server4.startDB();
        BomberServer server5 = BomberServer.getInstance();
        assertSame(server4, server5);
        server5.stopServer();
        BomberServer server6 = BomberServer.getInstance();
        assertNotSame(server5, server6);
        server6.startDB();
        BomberServer server7 = BomberServer.getInstance();
        assertSame(server6, server7);
    }
}