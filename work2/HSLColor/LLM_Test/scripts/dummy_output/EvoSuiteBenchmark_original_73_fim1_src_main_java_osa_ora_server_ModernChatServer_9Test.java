package osa.ora.server;
java
class ModernChatServer_9Test {

    @Test
    void testSendSecureBinaryMessage_UserChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureBinaryMessage_GroupChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.GROUP_CHAT);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureBinaryMessage_RoomChat_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.ROOM_CHAT);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertTrue(result);
    }

    @Test
    void testSendSecureBinaryMessage_UserChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureBinaryMessage_GroupChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.GROUP_CHAT);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureBinaryMessage_RoomChat_Failure() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.ROOM_CHAT);

        boolean result = modernChatServer.sendSecureBinaryMessage(binaryMessage);

        assertFalse(result);
    }

    @Test
    void testSendSecureBinaryMessage_NullMessage() {
        ModernChatServer modernChatServer = new ModernChatServer();

        assertThrows(RemoteException.class, () -> modernChatServer.sendSecureBinaryMessage(null));
    }

    @Test
    void testSendSecureBinaryMessage_Exception() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setFromUserId(2);
        binaryMessage.setAction(IConstant.REQUEST);

        assertThrows(RemoteException.class, () -> modernChatServer.sendSecureBinaryMessage(binaryMessage));
    }
}
