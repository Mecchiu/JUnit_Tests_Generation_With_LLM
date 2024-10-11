@Test
void testGetInstance() {
    // Test if getInstance() returns the same instance every time
    BomberServer server1 = BomberServer.getInstance();
    BomberServer server2 = BomberServer.getInstance();
    assertEquals(server1, server2);
    
    // Test if getInstance() returns a non-null instance
    assertNotNull(server1);
    
    // Test if the returned instance is of type BomberServer
    assertTrue(server1 instanceof BomberServer);
} 

@Test
void testMultiThreadedGetInstance() {
    // Test if getInstance() returns the same instance when called from multiple threads
    BomberServerThread thread1 = new BomberServerThread();
    BomberServerThread thread2 = new BomberServerThread();
    thread1.start();
    thread2.start();
    try {
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    assertEquals(thread1.getServer(), thread2.getServer());
}

private class BomberServerThread extends Thread {
    private BomberServer server;
    
    public BomberServer getServer() {
        return server;
    }
    
    @Override
    public void run() {
        server = BomberServer.getInstance();
    }
} 

@Test
void testNullInstanceAfterReset() {
    // Test if getInstance() returns null after calling reset()
    BomberServer server = BomberServer.getInstance();
    assertNotNull(server);
    BomberServer.reset();
    assertNull(BomberServer.getInstance());
}

@Test
void testNewInstanceAfterReset() {
    // Test if getInstance() returns a new instance after calling reset()
    BomberServer server1 = BomberServer.getInstance();
    assertNotNull(server1);
    BomberServer.reset();
    BomberServer server2 = BomberServer.getInstance();
    assertNotNull(server2);
    assertNotEquals(server1, server2);
}

@Test
void testSessionListMsg() {
    // Test if getInstance() returns a BomberServer instance that can send a SessionListMsg
    BomberServer server = BomberServer.getInstance();
    SessionListMsg msg = new SessionListMsg(new HashMap<Integer, String>());
    server.sendGlobalMessage(msg);
    assertTrue(true); // No exception was thrown
}

@Test
void testSessionDetailsMsg() {
    // Test if getInstance() returns a BomberServer instance that can send a SessionDetailsMsg
    BomberServer server = BomberServer.getInstance();
    SessionDetailsMsg msg = new SessionDetailsMsg(1, "Test Session", new Vector<String>(), new ImageIcon());
    server.sendGlobalMessage(msg);
    assertTrue(true); // No exception was thrown
}

@Test
void testGlobalServerMsg() {
    // Test if getInstance() returns a BomberServer instance that can send a GlobalServerMsg
    BomberServer server = BomberServer.getInstance();
    GlobalServerMsg msg = new GlobalServerMsg("Test message");
    server.sendGlobalMessage(msg);
    assertTrue(true); // No exception was thrown
}

@Test
void testSendToSession() {
    // Test if getInstance() returns a BomberServer instance that can send a message to a session
    BomberServer server = BomberServer.getInstance();
    Message msg = new Message(1, "Test message");
    server.sendToSession(1, msg);
    assertTrue(true); // No exception was thrown
}

@Test
void testStartSession() {
    // Test if getInstance() returns a BomberServer instance that can start a new session
    BomberServer server = BomberServer.getInstance();
    int sessionId = server.startSession("Test Session", new Vector<String>(), new ImageIcon());
    assertTrue(sessionId > 0);
}

@Test
void testGetSession() {
    // Test if getInstance() returns a BomberServer instance that can retrieve a session by ID
    BomberServer server = BomberServer.getInstance();
    int sessionId = server.startSession("Test Session", new Vector<String>(), new ImageIcon());
    Session session = server.getSession(sessionId);
    assertNotNull(session);
    assertEquals(sessionId, session.getId());
}

}