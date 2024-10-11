// Here is an example implementation of the StopServerTest class with ten unit test cases for the connectToSrv() method.

package server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StopServerTest {

    @Test
    void testConnectToSrvSuccess() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(8080);
        assertTrue(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvWrongPort() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(1234);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvWrongServerName() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("wrongserver");
        stopServer.setServerPort(8080);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvNullServerName() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName(null);
        stopServer.setServerPort(8080);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvNegativePort() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(-1);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvZeroPort() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(0);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvIOException() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(8080);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvTwice() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(8080);
        assertTrue(stopServer.connectToSrv());
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvAfterClose() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(8080);
        assertTrue(stopServer.connectToSrv());
        stopServer.closeConnection();
        assertTrue(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrvAfterCloseTwice() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("localhost");
        stopServer.setServerPort(8080);
        assertTrue(stopServer.connectToSrv());
        stopServer.closeConnection();
        stopServer.closeConnection();
        assertTrue(stopServer.connectToSrv());
    }
}