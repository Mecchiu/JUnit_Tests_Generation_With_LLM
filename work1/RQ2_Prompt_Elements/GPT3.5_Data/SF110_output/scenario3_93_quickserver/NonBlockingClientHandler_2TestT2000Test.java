@Test
void testGetMaxThreadAccessCount() {
    // Test case 1: Default value should be 0
    assertEquals(0, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 2: Set value to 5 and check if it returns 5
    NonBlockingClientHandler.setMaxThreadAccessCount(5);
    assertEquals(5, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 3: Set value to -1 and check if it returns 0
    NonBlockingClientHandler.setMaxThreadAccessCount(-1);
    assertEquals(0, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 4: Set value to Integer.MAX_VALUE and check if it returns Integer.MAX_VALUE
    NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 5: Set value to Integer.MIN_VALUE and check if it returns 0
    NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MIN_VALUE);
    assertEquals(0, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 6: Set value to 0 and check if it returns 0
    NonBlockingClientHandler.setMaxThreadAccessCount(0);
    assertEquals(0, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 7: Set value to 1 and check if it returns 1
    NonBlockingClientHandler.setMaxThreadAccessCount(1);
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 8: Set value to 10 and check if it returns 10
    NonBlockingClientHandler.setMaxThreadAccessCount(10);
    assertEquals(10, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 9: Set value to 100 and check if it returns 100
    NonBlockingClientHandler.setMaxThreadAccessCount(100);
    assertEquals(100, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 10: Set value to 1000 and check if it returns 1000
    NonBlockingClientHandler.setMaxThreadAccessCount(1000);
    assertEquals(1000, NonBlockingClientHandler.getMaxThreadAccessCount());
}
}