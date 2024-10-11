// Test case 1: Test sending announcement to a user
@Test
void testSendSecureTextAnnouncementToUser() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.USER_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello User");
    ClientInterface client = new ClientInterfaceImpl();
    server.connectedClients.put(1, client);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertTrue(result);
}

// Test case 2: Test sending announcement to a group
@Test
void testSendSecureTextAnnouncementToGroup() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.GROUP_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello Group");
    Group group = new Group();
    group.setId(1);
    Vector<User> users = new Vector<>();
    User user1 = new User();
    user1.setId(1);
    User user2 = new User();
    user2.setId(2);
    users.add(user1);
    users.add(user2);
    group.setUsers(users);
    server.groups.add(group);
    ClientInterface client1 = new ClientInterfaceImpl();
    ClientInterface client2 = new ClientInterfaceImpl();
    server.connectedClients.put(1, client1);
    server.connectedClients.put(2, client2);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertTrue(result);
}

// Test case 3: Test sending announcement to a room
@Test
void testSendSecureTextAnnouncementToRoom() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.ROOM_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello Room");
    Room room = new Room();
    room.setId(1);
    int[] userIds = {1, 2};
    room.setUserId(userIds);
    server.rooms.add(room);
    ClientInterface client1 = new ClientInterfaceImpl();
    ClientInterface client2 = new ClientInterfaceImpl();
    server.connectedClients.put(1, client1);
    server.connectedClients.put(2, client2);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertTrue(result);
}

// Test case 4: Test sending announcement to a non-existing user
@Test
void testSendSecureTextAnnouncementToNonExistingUser() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.USER_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello User");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 5: Test sending announcement to a non-existing group
@Test
void testSendSecureTextAnnouncementToNonExistingGroup() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.GROUP_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello Group");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 6: Test sending announcement to a non-existing room
@Test
void testSendSecureTextAnnouncementToNonExistingRoom() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.ROOM_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello Room");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 7: Test sending announcement with empty message
@Test
void testSendSecureTextAnnouncementWithEmptyMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.USER_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("");
    ClientInterface client = new ClientInterfaceImpl();
    server.connectedClients.put(1, client);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 8: Test sending announcement with null message
@Test
void testSendSecureTextAnnouncementWithNullMessage() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.USER_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage(null);
    ClientInterface client = new ClientInterfaceImpl();
    server.connectedClients.put(1, client);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 9: Test sending announcement to a user with no client connected
@Test
void testSendSecureTextAnnouncementToUserWithNoClientConnected() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.USER_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello User");
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}

// Test case 10: Test sending announcement to a group with no clients connected
@Test
void testSendSecureTextAnnouncementToGroupWithNoClientsConnected() throws RemoteException {
    ModernChatServer server = new ModernChatServer();
    TextMessage msg = new TextMessage();
    msg.setTargetType(IConstant.GROUP_CHAT);
    msg.setToUserId(1);
    msg.setFromUserId(2);
    msg.setMessage("Hello Group");
    Group group = new Group();
    group.setId(1);
    Vector<User> users = new Vector<>();
    User user1 = new User();
    user1.setId(1);
    User user2 = new User();
    user2.setId(2);
    users.add(user1);
    users.add(user2);
    group.setUsers(users);
    server.groups.add(group);
    boolean result = server.sendSecureTextAnnouncement(msg);
    assertFalse(result);
}