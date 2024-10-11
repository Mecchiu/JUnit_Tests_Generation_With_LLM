@Test
void testGetInstance() {
    // Test if the instance returned is not null
    assertNotNull(BomberServer.getInstance());
    
    // Test if the same instance is returned every time
    assertSame(BomberServer.getInstance(), BomberServer.getInstance());
    
    // Test if the instance is of type BomberServer
    assertTrue(BomberServer.getInstance() instanceof BomberServer);
    
    // Test if the instance has a non-null sessionMap
    assertNotNull(BomberServer.getInstance().getSessionMap());
    
    // Test if the instance has a non-null serverSocket
    assertNotNull(BomberServer.getInstance().getServerSocket());
    
    // Test if the instance has a non-null logger
    assertNotNull(BomberServer.getInstance().getLogger());
    
    // Test if the instance has a non-null hsqlServer
    assertNotNull(BomberServer.getInstance().getHsqlServer());
    
    // Test if the instance has a non-null dataSource
    assertNotNull(BomberServer.getInstance().getDataSource());
    
    // Test if the instance has a non-null connection
    assertNotNull(BomberServer.getInstance().getConnection());
    
    // Test if the instance has a non-null statement
    assertNotNull(BomberServer.getInstance().getStatement());
}