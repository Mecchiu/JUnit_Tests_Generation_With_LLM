```java
class ModernChatServer_11Test {

    @Test
    void testSendSecureTextAnnouncementToUser_WhenClientInterfaceIsNull_ExpectFalse() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setToUserId(1);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncementToUser(msg, null);
        
        // Assert
        assertFalse(result);
    }

    @Test
    void testSendSecureTextAnnouncementToUser_WhenClientInterfaceThrowsRemoteException_ExpectFalse() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setToUserId(1);
        ClientInterface cf = new ClientInterface() {
            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                throw new RemoteException("Test Exception");
            }
        };
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncementToUser(msg, cf);
        
        // Assert
        assertFalse(result);
    }

    @Test
    void testSendSecureTextAnnouncementToUser_WhenClientInterfaceReceivesMessage_ExpectTrue() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setToUserId(1);
        ClientInterface cf = new ClientInterface() {
            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncementToUser(msg, cf);
        
        // Assert
        assertTrue(result);
    }

    @Test
    void testSendSecureTextAnnouncement_WhenMessageTypeIsUserChat_ExpectTrue() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setTargetType(IConstant.USER_CHAT);
        msg.setToUserId(1);
        ClientInterface cf = new ClientInterface() {
            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        modernChatServer.getConnectedClients().put(1, cf);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncement(msg);
        
        // Assert
        assertTrue(result);
    }

    @Test
    void testSendSecureTextAnnouncement_WhenMessageTypeIsGroupChat_ExpectTrue() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setTargetType(IConstant.GROUP_CHAT);
        msg.setToUserId(1);
        ClientInterface cf = new ClientInterface() {
            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        modernChatServer.getConnectedClients().put(1, cf);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncement(msg);
        
        // Assert
        assertTrue(result);
    }

    @Test
    void testSendSecureTextAnnouncement_WhenMessageTypeIsRoomChat_ExpectTrue() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setTargetType(IConstant.ROOM_CHAT);
        msg.setToUserId(1);
        ClientInterface cf = new ClientInterface() {
            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        modernChatServer.getConnectedClients().put(1, cf);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncement(msg);
        
        // Assert
        assertTrue(result);
    }

    @Test
    void testSendSecureTextAnnouncement_WhenMessageTypeIsInvalid_ExpectFalse() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setTargetType(100);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncement(msg);
        
        // Assert
        assertFalse(result);
    }

    @Test
    void testSendSecureTextAnnouncement_WhenUserNotConnected_ExpectFalse() {
        // Arrange
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage msg = new TextMessage();
        msg.setTargetType(IConstant.USER_CHAT);
        msg.setToUserId(1);
        
        // Act
        boolean result = modernChatServer.sendSecureTextAnnouncement(msg);
        
        // Assert
        assertFalse(result);
    }
}
```