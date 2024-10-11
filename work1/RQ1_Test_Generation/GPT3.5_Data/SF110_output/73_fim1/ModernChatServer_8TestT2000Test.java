```java
class ModernChatServer_8Test {

    @Test
    void testSendBinaryMessage_WhenTargetTypeIsUserChat_ThenReturnTrue() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        boolean result = modernChatServer.sendBinaryMessage(binaryMessage);
        assertTrue(result);
    }

    @Test
    void testSendBinaryMessage_WhenTargetTypeIsGroupChat_ThenReturnTrue() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.GROUP_CHAT);
        boolean result = modernChatServer.sendBinaryMessage(binaryMessage);
        assertTrue(result);
    }

    @Test
    void testSendBinaryMessage_WhenTargetTypeIsRoomChat_ThenReturnTrue() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(IConstant.ROOM_CHAT);
        boolean result = modernChatServer.sendBinaryMessage(binaryMessage);
        assertTrue(result);
    }

    @Test
    void testSendBinaryMessage_WhenTargetTypeIsInvalid_ThenReturnFalse() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        binaryMessage.setTargetType(100);
        boolean result = modernChatServer.sendBinaryMessage(binaryMessage);
        assertFalse(result);
    }

    @Test
    void testSendBinaryMessage_WhenClientInterfaceIsNull_ThenReturnFalse() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        assertFalse(modernChatServer.sendBinaryMessage(binaryMessage));
    }

    @Test
    void testSendBinaryMessage_WhenClientInterfaceThrowsRemoteException_ThenReturnFalse() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        ClientInterface clientInterface = new ClientInterface() {
            @Override
            public boolean ping() throws RemoteException {
                throw new RemoteException("Test Exception");
            }

            @Override
            public boolean receiveBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public void receiveBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveSecureBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public void receiveSecureBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public void receiveTextAnnouncement(TextMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveTextMessage(TextMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public boolean receiveSecureTextMessage(TextMessage msg) throws RemoteException {
                return false;
            }
        };
        modernChatServer.connectedClients.put(1, clientInterface);
        assertFalse(modernChatServer.sendBinaryMessage(binaryMessage));
    }

    @Test
    void testSendBinaryMessage_WhenActionIsNotRequest_ThenReturnFalse() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(0);
        assertFalse(modernChatServer.sendBinaryMessage(binaryMessage));
    }

    @Test
    void testSendBinaryMessage_WhenActionIsRequestAndClientInterfaceReceivesRequest_ThenReturnTrue() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        ClientInterface clientInterface = new ClientInterface() {
            @Override
            public boolean ping() throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public void receiveBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveSecureBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public void receiveSecureBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public void receiveTextAnnouncement(TextMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveTextMessage(TextMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveSecureTextMessage(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        modernChatServer.connectedClients.put(1, clientInterface);
        assertTrue(modernChatServer.sendBinaryMessage(binaryMessage));
    }

    @Test
    void testSendBinaryMessage_WhenActionIsRequestAndClientInterfaceReceivesRequestReturnsFalse_ThenReturnFalse() {
        ModernChatServer modernChatServer = new ModernChatServer();
        BinaryMessage binaryMessage = new BinaryMessage();
        binaryMessage.setToUserId(1);
        binaryMessage.setAction(IConstant.REQUEST);
        ClientInterface clientInterface = new ClientInterface() {
            @Override
            public boolean ping() throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public void receiveBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveSecureBinaryMessageRequest(BinaryMessage msg) throws RemoteException {
                return false;
            }

            @Override
            public void receiveSecureBinaryMessageLoad(BinaryMessage msg) throws RemoteException {
            }

            @Override
            public void receiveTextAnnouncement(TextMessage msg) throws RemoteException {
            }

            @Override
            public boolean receiveTextMessage(TextMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveSecureTextAnnouncement(TextMessage msg) throws RemoteException {
                return true;
            }

            @Override
            public boolean receiveSecureTextMessage(TextMessage msg) throws RemoteException {
                return true;
            }
        };
        modernChatServer.connectedClients.put(1, clientInterface);
        assertFalse(modernChatServer.sendBinaryMessage(binaryMessage));
    }
}
```