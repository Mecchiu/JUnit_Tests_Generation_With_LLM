// Test case 1: Test sending a text message with null message
@Test
void testSendSecureTextMessage_NullMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = null;
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 2: Test sending a text message with null sender
@Test
void testSendSecureTextMessage_NullSender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage(null, "receiver", "message");
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 3: Test sending a text message with null receiver
@Test
void testSendSecureTextMessage_NullReceiver() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("sender", null, "message");
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 4: Test sending a text message with null message content
@Test
void testSendSecureTextMessage_NullMessageContent() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("sender", "receiver", null);
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 5: Test sending a text message with empty sender
@Test
void testSendSecureTextMessage_EmptySender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("", "receiver", "message");
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 6: Test sending a text message with empty receiver
@Test
void testSendSecureTextMessage_EmptyReceiver() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("sender", "", "message");
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 7: Test sending a text message with empty message content
@Test
void testSendSecureTextMessage_EmptyMessageContent() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("sender", "receiver", "");
    assertFalse(server.sendSecureTextMessage(msg));
}

// Test case 8: Test sending a valid text message
@Test
void testSendSecureTextMessage_ValidMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("sender", "receiver", "message");
    assertTrue(server.sendSecureTextMessage(msg));
}

// Test case 9: Test sending a text message with long message content
@Test
void testSendSecureTextMessage_LongMessageContent() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    String longMessage = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi.";
    TextMessage msg = new TextMessage("sender", "receiver", longMessage);
    assertTrue(server.sendSecureTextMessage(msg));
}

// Test case 10: Test sending a text message with special characters in message content
@Test
void testSendSecureTextMessage_SpecialCharacters() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    String message = "Hello! This message contains special characters: !@#$%^&*()_+{}:\"<>?,./;'[]\\=-`~";
    TextMessage msg = new TextMessage("sender", "receiver", message);
    assertTrue(server.sendSecureTextMessage(msg));
}