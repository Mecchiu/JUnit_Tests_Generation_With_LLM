package server;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;

class StopServerTest {

    @Test
    void testConnectToSrv_SuccessfulConnection() {
        StopServer stopServer = new StopServer();
        assertTrue(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_FailedConnection() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName("invalid.server.com");
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullServerName() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName(null);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_ZeroPort() {
        StopServer stopServer = new StopServer();
        stopServer.setServerPort(0);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_NegativePort() {
        StopServer stopServer = new StopServer();
        stopServer.setServerPort(-1);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullSocket() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName(null);
        stopServer.setServerPort(0);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullOutputStream() {
        StopServer stopServer = new StopServer();
        stopServer.setServerName(null);
        stopServer.setServerPort(0);
        stopServer.setOut(null);
        assertFalse(stopServer.connectToSrv());
    }

    @Test
    void testConnectToSrv_SendMsg() {
        StopServer stopServer = new StopServer();
        StopServerMsg msg = new StopServerMsg();
        stopServer.sendMsg(msg);
        // Add assertion for successful message sending
    }

    @Test
    void testCallingStopServer() {
        StopServer stopServer = new StopServer();
        stopServer.callingStopServer(stopServer);
        // Add assertion for successful server stopping
    }
}
