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
    void sendSecureBinaryMessage_shouldReturnOfflineStatus_whenClientIsNotConnected() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessStatus_whenRequestIsSent() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(1);
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessStatus_whenBinaryMessageIsSent() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnExceptionStatus_whenRemoteExceptionIsThrown() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        client.setThrowRemoteException(true);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("exception", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldRemoveClientFromConnectedClients_whenRemoteExceptionIsThrown() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        client.setThrowRemoteException(true);
        server.sendSecureBinaryMessage(msg);
        assertFalse(server.connectedClients.containsKey("user1"));
    }

    @Test
    void sendSecureBinaryMessage_shouldRemoveClientFromConnectedClientsIPs_whenRemoteExceptionIsThrown() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        server.connectedClientsIPs.put("user1", "127.0.0.1");
        client.setThrowRemoteException(true);
        server.sendSecureBinaryMessage(msg);
        assertFalse(server.connectedClientsIPs.containsKey("user1"));
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnExceptionStatus_whenExceptionIsThrown() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client = new ModernChatClient();
        server.connectedClients.put("user1", client);
        client.setThrowException(true);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("exception", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessStatus_whenBinaryMessageIsSentToMultipleClients() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1,user2,user3");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client1 = new ModernChatClient();
        ModernChatClient client2 = new ModernChatClient();
        ModernChatClient client3 = new ModernChatClient();
        server.connectedClients.put("user1", client1);
        server.connectedClients.put("user2", client2);
        server.connectedClients.put("user3", client3);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnOfflineStatus_whenOneOfTheClientsIsNotConnected() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("user1,user2,user3");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        ModernChatClient client1 = new ModernChatClient();
        ModernChatClient client2 = new ModernChatClient();
        server.connectedClients.put("user1", client1);
        server.connectedClients.put("user2", client2);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertFalse(result.isSuccess());
        assertEquals("offline", result.getMessage());
    }

    @Test
    void sendSecureBinaryMessage_shouldReturnSuccessStatus_whenBinaryMessageIsSentToGroup() throws RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setToUserId("group1");
        msg.setAction(2);
        msg.setData(new byte[]{1, 2, 3});
        Group group = new Group();
        group.setGroupId("group1");
        group.setGroupMembers("user1,user2,user3");
        server.groups.put("group1", group);
        ModernChatClient client1 = new ModernChatClient();
        ModernChatClient client2 = new ModernChatClient();
        ModernChatClient client3 = new ModernChatClient();
        server.connectedClients.put("user1", client1);
        server.connectedClients.put("user2", client2);
        server.connectedClients.put("user3", client3);
        ResultBean result = server.sendSecureBinaryMessage(msg);
        assertTrue(result.isSuccess());
        assertEquals("success", result.getMessage());
    }
}