@Test
void testGetInstance() {
    // Test if the instance returned is not null
    assertNotNull(BomberServer.getInstance());
    
    // Test if the same instance is returned every time
    assertSame(BomberServer.getInstance(), BomberServer.getInstance());
    
    // Test if the instance is of type BomberServer
    assertTrue(BomberServer.getInstance() instanceof BomberServer);
    
    // Test if the instance has a non-null session list
    assertNotNull(BomberServer.getInstance().getSessionList());
    
    // Test if the instance has a non-null session details map
    assertNotNull(BomberServer.getInstance().getSessionDetailsMap());
    
    // Test if the instance has a non-null client list
    assertNotNull(BomberServer.getInstance().getClientList());
    
    // Test if the instance has a non-null logger
    assertNotNull(BomberServer.getInstance().getLogger());
    
    // Test if the instance has a non-null database connection
    assertNotNull(BomberServer.getInstance().getDatabaseConnection());
    
    // Test if the instance has a non-null server socket
    assertNotNull(BomberServer.getInstance().getServerSocket());
    
    // Test if the instance has a non-null game factory
    assertNotNull(BomberServer.getInstance().getGameFactory());
}