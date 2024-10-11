// ModernChatServer_6Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.ResultBean;
import java.rmi.RemoteException;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
    
    /**
     * Test of sendBinaryMessage method, when the recipient is offline.
     */
    @Test
    void testSendBinaryMessageRecipientOffline() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("offlineUser");
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is a request.
     */
    @Test
    void testSendBinaryMessageRequest() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(1);
        ClientInterfaceMock client = new ClientInterfaceMock();
        server.connectedClients.put("onlineUser", client);
        ResultBean result = server.sendBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
        assertNull(result.getObject());
        assertTrue(client.receiveBinaryMessageRequestCalled);
        assertEquals(msg, client.receiveBinaryMessageRequestMsg);
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is not a request.
     */
    @Test
    void testSendBinaryMessageNotRequest() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(0);
        ClientInterfaceMock client = new ClientInterfaceMock();
        server.connectedClients.put("onlineUser", client);
        ResultBean result = server.sendBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
        assertNull(result.getObject());
        assertTrue(client.receiveBinaryMessageLoadCalled);
        assertEquals(msg, client.receiveBinaryMessageLoadMsg);
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is not a request, but the client throws a RemoteException.
     */
    @Test
    void testSendBinaryMessageNotRequestRemoteException() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(0);
        ClientInterfaceMock client = new ClientInterfaceMock();
        client.receiveBinaryMessageLoadThrows = true;
        server.connectedClients.put("onlineUser", client);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("exception", result.getMessage());
        assertEquals("test exception", result.getObject());
        assertFalse(server.connectedClients.containsKey("onlineUser"));
        assertFalse(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is a request, but the client throws a RemoteException.
     */
    @Test
    void testSendBinaryMessageRequestRemoteException() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(1);
        ClientInterfaceMock client = new ClientInterfaceMock();
        client.receiveBinaryMessageRequestThrows = true;
        server.connectedClients.put("onlineUser", client);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("exception", result.getMessage());
        assertEquals("test exception", result.getObject());
        assertFalse(server.connectedClients.containsKey("onlineUser"));
        assertFalse(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is not a request, and the client is null.
     */
    @Test
    void testSendBinaryMessageNotRequestClientNull() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(0);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is a request, and the client is null.
     */
    @Test
    void testSendBinaryMessageRequestClientNull() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(1);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is not a request, and the client is null, but the recipient is still marked as online.
     */
    @Test
    void testSendBinaryMessageNotRequestClientNullRecipientStillOnline() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(0);
        server.connectedClients.put("onlineUser", null);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
        assertTrue(server.connectedClients.containsKey("onlineUser"));
        assertTrue(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is a request, and the client is null, but the recipient is still marked as online.
     */
    @Test
    void testSendBinaryMessageRequestClientNullRecipientStillOnline() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(1);
        server.connectedClients.put("onlineUser", null);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
        assertTrue(server.connectedClients.containsKey("onlineUser"));
        assertTrue(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is not a request, and the client is null, and the recipient is not marked as online.
     */
    @Test
    void testSendBinaryMessageNotRequestClientNullRecipientNotOnline() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(0);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
        assertFalse(server.connectedClients.containsKey("onlineUser"));
        assertFalse(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Test of sendBinaryMessage method, when the recipient is online and the message is a request, and the client is null, and the recipient is not marked as online.
     */
    @Test
    void testSendBinaryMessageRequestClientNullRecipientNotOnline() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("onlineUser");
        msg.setAction(1);
        ResultBean result = server.sendBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
        assertFalse(server.connectedClients.containsKey("onlineUser"));
        assertFalse(server.connectedClientsIPs.containsKey("onlineUser"));
    }
    
    /**
     * Mock class for the ClientInterface interface.
     */
    private class ClientInterfaceMock implements ClientInterface {
        public boolean receiveBinaryMessageRequestCalled = false;
        public BinaryMessage receiveBinaryMessageRequestMsg = null;
        public boolean receiveBinaryMessageLoadCalled = false;
        public BinaryMessage receiveBinaryMessageLoadMsg = null;
        public boolean receiveBinaryMessageRequestThrows = false;
        public boolean receiveBinaryMessageLoadThrows = false;
        
        @Override
        public ResultBean receiveBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
            receiveBinaryMessageRequestCalled = true;
            receiveBinaryMessageRequestMsg = msg;
            if (receiveBinaryMessageRequestThrows) {
                throw new RemoteException("test exception");
            }
            return new ResultBean(true, "success", null);
        }

        @Override
        public void receiveBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            receiveBinaryMessageLoadCalled = true;
            receiveBinaryMessageLoadMsg = msg;
            if (receiveBinaryMessageLoadThrows) {
                throw new RemoteException("test exception");
            }
        }

        @Override
        public void receiveTextMessage(TextMessage msg) throws RemoteException {
        }

        @Override
        public void receiveUserUpdatedStatus(User user) throws RemoteException {
        }

        @Override
        public void receiveRefreshContact(Vector<User> users, Vector<Group> groups, Vector<Room> rooms) throws RemoteException {
        }

        @Override
        public void receiveKickOff() throws RemoteException {
        }

        @Override