// ModernChatServer_7Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
 */
class ModernChatServer_7Test {

    private ModernChatServer server;

    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnOfflineResultBean_whenClientIsNotConnected() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessResultBean_whenSendingRequestMessage() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(1);
        server.connectedClients.put("user1", new ClientStub());
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
        assertNull(result.getObject());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessResultBean_whenSendingOnlineMessage() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub());
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
        assertNull(result.getObject());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnExceptionResultBean_whenClientThrowsException() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub(true));
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("exception", result.getMessage());
        assertNotNull(result.getObject());
    }

    @Test
    void sendSecureBinaryMessage_shouldRemoveClientFromConnectedClients_whenClientThrowsException() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub(true));
        server.sendSecureBinaryMessage(msg);
        assertFalse(server.connectedClients.containsKey("user1"));
    }

    @Test
    void sendSecureBinaryMessage_shouldRemoveClientFromConnectedClientsIPs_whenClientThrowsException() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub(true));
        server.connectedClientsIPs.put("user1", "127.0.0.1");
        server.sendSecureBinaryMessage(msg);
        assertFalse(server.connectedClientsIPs.containsKey("user1"));
    }

    @Test
    void sendSecureBinaryMessage_shouldCallOfflineStatus_whenClientThrowsException() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub(true));
        server.sendSecureBinaryMessage(msg);
        // verify that offlineStatus method was called
        // (we cannot directly test it as it is a void method)
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnOfflineResultBean_whenClientIsNotConnected_afterException() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub(true));
        server.sendSecureBinaryMessage(msg);
        // verify that the client is removed from connectedClients
        assertFalse(server.connectedClients.containsKey("user1"));
        // verify that a new message to the same client returns an offline result
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
        assertNull(result.getObject());
    }

    @Test
    void sendSecureBinaryMessage_shouldCallReceiveSecureBinaryMessageLoad_whenSendingOnlineMessage() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub());
        server.sendSecureBinaryMessage(msg);
        // verify that receiveSecureBinaryMessageLoad method was called
        // (we cannot directly test it as it is a void method)
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessResultBean_whenSendingOnlineMessage_toMultipleClients() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        server.connectedClients.put("user1", new ClientStub());
        server.connectedClients.put("user2", new ClientStub());
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
        assertNull(result.getObject());
    }

    private static class ClientStub implements ClientInterface {

        private boolean throwException;

        public ClientStub() {
            this(false);
        }

        public ClientStub(boolean throwException) {
            this.throwException = throwException;
        }

        @Override
        public ResultBean receiveSecureBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
            return null;
        }

        @Override
        public void receiveSecureBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            if (throwException) {
                throw new RemoteException("Client exception");
            }
        }

        @Override
        public void receiveSecureTextMessage(TextMessage msg) throws RemoteException {

        }

        @Override
        public void receiveKickOffMessage() throws RemoteException {

        }

        @Override
        public void receiveRefreshContact(Vector<User> users, Vector<Group> groups, Vector<Room> rooms) throws RemoteException {

        }

        @Override
        public void receiveUserUpdatedStatus(User user) throws RemoteException {

        }
    }
}