// BomberClient_1Test.java
package client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BomberClient}.
 * It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
 */
class BomberClient_1Test {

    /**
     * Test case for successful connection to server.
     */
    @Test
    void testConnectToSrvSuccess() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
    }

    /**
     * Test case for unsuccessful connection to server.
     */
    @Test
    void testConnectToSrvFailure() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("invalid");
        bomberClient.setServerPort(8080);
        assertFalse(bomberClient.connectToSrv());
    }

    /**
     * Test case for null server name.
     */
    @Test
    void testConnectToSrvNullServerName() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName(null);
        bomberClient.setServerPort(8080);
        assertFalse(bomberClient.connectToSrv());
    }

    /**
     * Test case for invalid server port.
     */
    @Test
    void testConnectToSrvInvalidPort() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(-1);
        assertFalse(bomberClient.connectToSrv());
    }

    /**
     * Test case for zero server port.
     */
    @Test
    void testConnectToSrvZeroPort() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(0);
        assertFalse(bomberClient.connectToSrv());
    }

    /**
     * Test case for successful connection to server with default port.
     */
    @Test
    void testConnectToSrvDefaultPort() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        assertTrue(bomberClient.connectToSrv());
    }

    /**
     * Test case for successful connection to server with default name and port.
     */
    @Test
    void testConnectToSrvDefaultNameAndPort() {
        BomberClient bomberClient = new BomberClient();
        assertTrue(bomberClient.connectToSrv());
    }

    /**
     * Test case for successful connection to server with IP address.
     */
    @Test
    void testConnectToSrvIpAddress() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("127.0.0.1");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
    }

    /**
     * Test case for successful connection to server with fully qualified domain name.
     */
    @Test
    void testConnectToSrvFQDN() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost.localdomain");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
    }

    /**
     * Test case for successful connection to server with non-standard port.
     */
    @Test
    void testConnectToSrvNonStandardPort() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(1234);
        assertTrue(bomberClient.connectToSrv());
    }
}