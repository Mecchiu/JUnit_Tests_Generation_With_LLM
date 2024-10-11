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
     * Test case for sending InfoRequestMsg after successful connection.
     */
    @Test
    void testConnectToSrvInfoRequestMsg() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertNotNull(bomberClient.getMsgSender());
        assertNotNull(bomberClient.getMsgReceiver());
        assertTrue(bomberClient.getMsgSender().isAlive());
        assertTrue(bomberClient.getMsgReceiver().isAlive());
        assertTrue(bomberClient.getMsgSender().sendMsg(new InfoRequestMsg(InfoRequestMsg.GET_SESSION_LIST)));
    }
    
    /**
     * Test case for setting server name.
     */
    @Test
    void testSetServerName() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        assertEquals("localhost", bomberClient.getServerName());
    }
    
    /**
     * Test case for setting server port.
     */
    @Test
    void testSetServerPort() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerPort(8080);
        assertEquals(8080, bomberClient.getServerPort());
    }
    
    /**
     * Test case for getting message sender.
     */
    @Test
    void testGetMsgSender() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertNotNull(bomberClient.getMsgSender());
    }
    
    /**
     * Test case for getting message receiver.
     */
    @Test
    void testGetMsgReceiver() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertNotNull(bomberClient.getMsgReceiver());
    }
    
    /**
     * Test case for getting session list.
     */
    @Test
    void testGetSessionList() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertNotNull(bomberClient.getSessionList());
    }
    
    /**
     * Test case for getting session details.
     */
    @Test
    void testGetSessionDetails() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertNotNull(bomberClient.getSessionDetails(1));
    }
    
    /**
     * Test case for joining a session.
     */
    @Test
    void testJoinSession() {
        BomberClient bomberClient = new BomberClient();
        bomberClient.setServerName("localhost");
        bomberClient.setServerPort(8080);
        assertTrue(bomberClient.connectToSrv());
        assertTrue(bomberClient.joinSession(1));
    }
}