java
package client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BomberClient_1Test {

    @Test
    void testConnectToSrv_SuccessfulConnection() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(6666);

        assertTrue(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_FailedConnection() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("invalidhost");
        bomberClient.setServerPort(1234);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullServerName() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName(null);
        bomberClient.setServerPort(6666);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_NegativeServerPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(-1);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_ZeroServerPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(0);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_EmptyServerName() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("");
        bomberClient.setServerPort(6666);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullServerPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(null);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullServerNameAndPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName(null);
        bomberClient.setServerPort(null);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_EmptyServerNameAndNullPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName("");
        bomberClient.setServerPort(null);

        assertFalse(bomberClient.connectToSrv());
    }

    @Test
    void testConnectToSrv_NullServerNameAndEmptyPort() {
        BomberClient bomberClient = BomberClient.getInstance();
        bomberClient.setServerName(null);
        bomberClient.setServerPort(0);

        assertFalse(bomberClient.connectToSrv());
    }
}
