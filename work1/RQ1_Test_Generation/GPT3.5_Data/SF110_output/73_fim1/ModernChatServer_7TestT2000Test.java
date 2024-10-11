```java
class ModernChatServer_7Test {

    @Test
    void testSendSecureTextMessage_UserChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.USER_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureTextMessage_GroupChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.GROUP_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureTextMessage_RoomChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.ROOM_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureTextMessage_UserChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.USER_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureTextMessage_GroupChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.GROUP_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureTextMessage_RoomChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.ROOM_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessage(textMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureTextMessage_NullMessage() {
        ModernChatServer modernChatServer = new ModernChatServer();

        boolean result = modernChatServer.sendSecureTextMessage(null);

        assertFalse(result);
    }

    @Test
    void testSendSecureTextMessage_NullClientInterface() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.USER_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessageToUser(textMessage, null);

        assertFalse(result);
    }

    @Test
    void testSendSecureTextMessageToUser_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.USER_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessageToUser(textMessage, new ClientInterface() {
            @Override
            public boolean receiveSecureTextMessage(TextMessage msg) {
                return true;
            }
        });

        assertTrue(result);
    }

    @Test
    void testSendSecureTextMessageToUser_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        TextMessage textMessage = new TextMessage();
        textMessage.setTargetType(IConstant.USER_CHAT);
        textMessage.setToUserId(1);
        textMessage.setFromUserId(2);
        textMessage.setMessage("Test message");

        boolean result = modernChatServer.sendSecureTextMessageToUser(textMessage, new ClientInterface() {
            @Override
            public boolean receiveSecureTextMessage(TextMessage msg) {
                return false;
            }
        });

        assertFalse(result);
    }
}
```