@Test
void testGetMaxThreadAccessCount() {
    // Test case 1: Default value should be 1
    assertEquals(1, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 2: Set value to 0 should throw IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(0);
    });

    // Test case 3: Set value to negative number should throw IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(-1);
    });

    // Test case 4: Set value to positive number should not throw exception
    NonBlockingClientHandler.setMaxThreadAccessCount(5);

    // Test case 5: Get value should return the set value
    assertEquals(5, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 6: Set value to Integer.MAX_VALUE should not throw exception
    NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MAX_VALUE);

    // Test case 7: Get value should return the set value
    assertEquals(Integer.MAX_VALUE, NonBlockingClientHandler.getMaxThreadAccessCount());

    // Test case 8: Set value to Integer.MIN_VALUE should throw IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        NonBlockingClientHandler.setMaxThreadAccessCount(Integer.MIN_VALUE);
    });

    // Test case 9: Set value to a large number should not throw exception
    NonBlockingClientHandler.setMaxThreadAccessCount(1000000);

    // Test case 10: Get value should return the set value
    assertEquals(1000000, NonBlockingClientHandler.getMaxThreadAccessCount());
}
}