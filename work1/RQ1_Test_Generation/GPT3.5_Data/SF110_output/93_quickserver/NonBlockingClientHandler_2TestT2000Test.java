@Test
void testGetMaxThreadAccessCount() {
    NonBlockingClientHandler handler = new NonBlockingClientHandler();
    
    // Test case 1: Default value
    assertEquals(5, handler.getMaxThreadAccessCount());
    
    // Test case 2: Set to a specific value
    NonBlockingClientHandler.setMaxThreadAccessCount(10);
    assertEquals(10, handler.getMaxThreadAccessCount());
    
    // Test case 3: Set to a negative value
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(-1);
    });
    
    // Test case 4: Set to a value less than 3
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(2);
    });
    
    // Test case 5: Set back to default value
    NonBlockingClientHandler.setMaxThreadAccessCount(5);
    assertEquals(5, handler.getMaxThreadAccessCount());
}