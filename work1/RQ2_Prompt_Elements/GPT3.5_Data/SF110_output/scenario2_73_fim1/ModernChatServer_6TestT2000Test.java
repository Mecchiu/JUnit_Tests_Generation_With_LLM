// Test case 1: Test sending binary message to offline user
@Test
void testSendBinaryMessageToOfflineUser() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is offline
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.REQUEST);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.OFFLINE, result.getMessage());
}

// Test case 2: Test sending binary message request to online user
@Test
void testSendBinaryMessageRequestToOnlineUser() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a request action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.REQUEST);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    when(client.receiveBinaryMessageRequest(msg)).thenReturn(new ResultBean(true, IConstant.SUCCESS, null));
    // Add the mock client to the connectedClients map
    server.connectedClients.put("user2", client);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertTrue(result.isSuccess());
    assertEquals(IConstant.SUCCESS, result.getMessage());
    // Verify that the receiveBinaryMessageRequest method was called on the mock client
    verify(client).receiveBinaryMessageRequest(msg);
}

// Test case 3: Test sending binary message load to online user
@Test
void testSendBinaryMessageLoadToOnlineUser() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    // Add the mock client to the connectedClients map
    server.connectedClients.put("user2", client);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertTrue(result.isSuccess());
    assertEquals(IConstant.SUCCESS, result.getMessage());
    // Verify that the receiveBinaryMessageLoad method was called on the mock client
    verify(client).receiveBinaryMessageLoad(msg);
}

// Test case 4: Test sending binary message to online user with RemoteException
@Test
void testSendBinaryMessageToOnlineUserWithRemoteException() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user that throws a RemoteException
    ClientInterface client = mock(ClientInterface.class);
    when(client.receiveBinaryMessageLoad(msg)).thenThrow(new RemoteException());
    // Add the mock client to the connectedClients map
    server.connectedClients.put("user2", client);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.EXCEPTION, result.getMessage());
    // Verify that the receiveBinaryMessageLoad method was called on the mock client
    verify(client).receiveBinaryMessageLoad(msg);
    // Verify that the user was removed from the connectedClients map and set to offline status
    verify(server).offlineStatus("user2");
}

// Test case 5: Test sending binary message to online user with null client
@Test
void testSendBinaryMessageToOnlineUserWithNullClient() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.OFFLINE, result.getMessage());
}

// Test case 6: Test sending binary message to online user with null client IP
@Test
void testSendBinaryMessageToOnlineUserWithNullClientIP() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    // Add the mock client to the connectedClients map with a null IP address
    server.connectedClients.put("user2", client);
    server.connectedClientsIPs.put("user2", null);
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.OFFLINE, result.getMessage());
}

// Test case 7: Test sending binary message to online user with empty client IP
@Test
void testSendBinaryMessageToOnlineUserWithEmptyClientIP() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    // Add the mock client to the connectedClients map with an empty IP address
    server.connectedClients.put("user2", client);
    server.connectedClientsIPs.put("user2", "");
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.OFFLINE, result.getMessage());
}

// Test case 8: Test sending binary message to online user with invalid client IP
@Test
void testSendBinaryMessageToOnlineUserWithInvalidClientIP() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    // Add the mock client to the connectedClients map with an invalid IP address
    server.connectedClients.put("user2", client);
    server.connectedClientsIPs.put("user2", "invalid IP");
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.OFFLINE, result.getMessage());
}

// Test case 9: Test sending binary message to online user with valid client IP
@Test
void testSendBinaryMessageToOnlineUserWithValidClientIP() throws RemoteException {
    // Create a mock BinaryMessage object with a user who is online and a load action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", IConstant.LOAD);
    // Create a mock ClientInterface object for the recipient user
    ClientInterface client = mock(ClientInterface.class);
    // Add the mock client to the connectedClients map with a valid IP address
    server.connectedClients.put("user2", client);
    server.connectedClientsIPs.put("user2", "127.0.0.1");
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertTrue(result.isSuccess());
    assertEquals(IConstant.SUCCESS, result.getMessage());
    // Verify that the receiveBinaryMessageLoad method was called on the mock client
    verify(client).receiveBinaryMessageLoad(msg);
}

// Test case 10: Test sending binary message with invalid action
@Test
void testSendBinaryMessageWithInvalidAction() throws RemoteException {
    // Create a mock BinaryMessage object with an invalid action
    BinaryMessage msg = new BinaryMessage("test".getBytes(), "user1", "user2", "invalid action");
    // Call the sendBinaryMessage method and check the result
    ResultBean result = server.sendBinaryMessage(msg);
    assertFalse(result.isSuccess());
    assertEquals(IConstant.INVALID_ACTION, result.getMessage());
}
}