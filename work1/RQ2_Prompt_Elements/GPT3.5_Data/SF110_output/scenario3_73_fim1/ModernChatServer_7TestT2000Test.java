// Test case 1: Test sending a binary message with null data
@Test
void testSendSecureBinaryMessage_NullData() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(null);
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 2: Test sending a binary message with empty data
@Test
void testSendSecureBinaryMessage_EmptyData() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[0]);
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 3: Test sending a binary message with valid data
@Test
void testSendSecureBinaryMessage_ValidData() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertTrue(result.isSuccess());
}

// Test case 4: Test sending a binary message with invalid file extension
@Test
void testSendSecureBinaryMessage_InvalidExtension() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    msg.setFileName("test.txt");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 5: Test sending a binary message with valid file extension
@Test
void testSendSecureBinaryMessage_ValidExtension() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    msg.setFileName("test.png");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertTrue(result.isSuccess());
}

// Test case 6: Test sending a binary message with invalid file size
@Test
void testSendSecureBinaryMessage_InvalidSize() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[1024 * 1024 * 11]); // 11 MB
    msg.setFileName("test.png");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 7: Test sending a binary message with valid file size
@Test
void testSendSecureBinaryMessage_ValidSize() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[1024 * 1024 * 10]); // 10 MB
    msg.setFileName("test.png");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertTrue(result.isSuccess());
}

// Test case 8: Test sending a binary message with invalid encryption key
@Test
void testSendSecureBinaryMessage_InvalidKey() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    msg.setEncryptionKey("invalid_key");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}

// Test case 9: Test sending a binary message with valid encryption key
@Test
void testSendSecureBinaryMessage_ValidKey() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    msg.setEncryptionKey("valid_key");
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertTrue(result.isSuccess());
}

// Test case 10: Test sending a binary message with null encryption key
@Test
void testSendSecureBinaryMessage_NullKey() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    BinaryMessage msg = new BinaryMessage();
    msg.setData(new byte[]{1, 2, 3});
    msg.setEncryptionKey(null);
    ResultBean result = server.sendSecureBinaryMessage(msg);
    assertFalse(result.isSuccess());
}