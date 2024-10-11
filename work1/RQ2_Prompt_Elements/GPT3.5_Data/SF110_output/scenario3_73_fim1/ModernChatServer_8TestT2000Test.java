// Test case 1: Test sending a secure text announcement with valid input
@Test
void testSendSecureTextAnnouncementValidInput() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "admin", "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertTrue(result);
}

// Test case 2: Test sending a secure text announcement with null message
@Test
void testSendSecureTextAnnouncementNullMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage(null, "admin", "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 3: Test sending a secure text announcement with null sender
@Test
void testSendSecureTextAnnouncementNullSender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", null, "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 4: Test sending a secure text announcement with null recipient
@Test
void testSendSecureTextAnnouncementNullRecipient() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "admin", null);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 5: Test sending a secure text announcement with empty message
@Test
void testSendSecureTextAnnouncementEmptyMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("", "admin", "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 6: Test sending a secure text announcement with empty sender
@Test
void testSendSecureTextAnnouncementEmptySender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "", "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 7: Test sending a secure text announcement with empty recipient
@Test
void testSendSecureTextAnnouncementEmptyRecipient() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "admin", "");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 8: Test sending a secure text announcement with invalid recipient
@Test
void testSendSecureTextAnnouncementInvalidRecipient() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "admin", "invalid");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 9: Test sending a secure text announcement with invalid sender
@Test
void testSendSecureTextAnnouncementInvalidSender() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "invalid", "all");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 10: Test sending a secure text announcement with invalid message format
@Test
void testSendSecureTextAnnouncementInvalidMessageFormat() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage("Hello World!", "admin", "all");
    msg.setMessageType("invalid");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}