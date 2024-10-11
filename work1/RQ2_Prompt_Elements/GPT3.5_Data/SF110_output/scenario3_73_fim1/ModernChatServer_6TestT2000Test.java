// Test case 1: Test sending a binary message with null message object
@Test
void testSendBinaryMessageWithNullMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    ResultBean result = server.sendBinaryMessage(null);
    assertFalse(result.isSuccess());
}

// Test case 2: Test sending a binary message with null sender
@Test
void testSendBinaryMessageWithNullSender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage(null, "receiver", "message", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 3: Test sending a binary message with null receiver
@Test
void testSendBinaryMessageWithNullReceiver() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", null, "message", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 4: Test sending a binary message with null message content
@Test
void testSendBinaryMessageWithNullMessageContent() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "receiver", null, "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 5: Test sending a binary message with null file name
@Test
void testSendBinaryMessageWithNullFileName() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "receiver", "message", null);
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 6: Test sending a binary message with empty sender
@Test
void testSendBinaryMessageWithEmptySender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("", "receiver", "message", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 7: Test sending a binary message with empty receiver
@Test
void testSendBinaryMessageWithEmptyReceiver() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "", "message", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 8: Test sending a binary message with empty message content
@Test
void testSendBinaryMessageWithEmptyMessageContent() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "receiver", "", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 9: Test sending a binary message with empty file name
@Test
void testSendBinaryMessageWithEmptyFileName() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "receiver", "message", "");
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 10: Test sending a valid binary message
@Test
void testSendValidBinaryMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage("sender", "receiver", "message", "file");
    ResultBean result = server.sendBinaryMessage(msg);
    assertTrue(result.isSuccess());
}
}