// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {
    
    /**
     * Test case for successful connection to server.
     * Expected result: true
     */
    @Test
    void testConnectToSrvSuccess() {
        BomberClient client = BomberClient.getInstance();
        boolean result = client.connectToSrv();
        assertTrue(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to wrong server name.
     * Expected result: false
     */
    @Test
    void testConnectToSrvWrongServerName() {
        BomberClient client = BomberClient.getInstance();
        client.setServerName("wrongServerName");
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to wrong server port.
     * Expected result: false
     */
    @Test
    void testConnectToSrvWrongServerPort() {
        BomberClient client = BomberClient.getInstance();
        client.setServerPort(1234);
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to IOException.
     * Expected result: false
     */
    @Test
    void testConnectToSrvIOException() {
        BomberClient client = BomberClient.getInstance();
        client.setServerPort(1234);
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to null socket.
     * Expected result: false
     */
    @Test
    void testConnectToSrvNullSocket() {
        BomberClient client = BomberClient.getInstance();
        client.server = null;
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to socket already connected.
     * Expected result: false
     */
    @Test
    void testConnectToSrvAlreadyConnected() {
        BomberClient client = BomberClient.getInstance();
        client.connectToSrv();
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to socket already closed.
     * Expected result: false
     */
    @Test
    void testConnectToSrvSocketClosed() {
        BomberClient client = BomberClient.getInstance();
        client.connectToSrv();
        try {
            client.server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to null input stream.
     * Expected result: false
     */
    @Test
    void testConnectToSrvNullInputStream() {
        BomberClient client = BomberClient.getInstance();
        client.msgReceiver = new ClientMsgReceiver(client.server);
        client.msgReceiver.in = null;
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to null output stream.
     * Expected result: false
     */
    @Test
    void testConnectToSrvNullOutputStream() {
        BomberClient client = BomberClient.getInstance();
        client.msgSender = new ClientMsgSender(client.server);
        client.msgSender.out = null;
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
    
    /**
     * Test case for unsuccessful connection to server due to null message receiver.
     * Expected result: false
     */
    @Test
    void testConnectToSrvNullMsgReceiver() {
        BomberClient client = BomberClient.getInstance();
        client.msgReceiver = null;
        boolean result = client.connectToSrv();
        assertFalse(result);
    }
}