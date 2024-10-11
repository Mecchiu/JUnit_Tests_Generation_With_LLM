// Here's an example of how you can write unit tests for the GetPage class:

@Test
void testHasMoreMessagesReturnsFalseWhenNoMessages() {
    // Arrange
    GetPage getPage = new GetPage();

    // Act
    boolean result = getPage.hasMoreMessages();

    // Assert
    assertFalse(result);
}

@Test
void testHasMoreMessagesReturnsTrueWhenMessages() {
    // Arrange
    GetPage getPage = new GetPage();

    // Act
    // Simulate receiving messages
    // ...

    boolean result = getPage.hasMoreMessages();

    // Assert
    assertTrue(result);
}

@Test
void testHasMoreMessagesReturnsFalseWhenAllMessagesProcessed() {
    // Arrange
    GetPage getPage = new GetPage();

    // Act
    // Simulate receiving and processing messages
    // ...

    boolean result = getPage.hasMoreMessages();

    // Assert
    assertFalse(result);
}

// Add more test cases as needed. Remember to test edge cases and invalid inputs.