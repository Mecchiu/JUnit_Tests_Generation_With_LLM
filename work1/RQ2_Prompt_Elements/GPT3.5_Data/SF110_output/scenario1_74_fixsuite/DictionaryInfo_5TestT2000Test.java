// Here's an example of how you can test the getMessage() method of DictionaryInfo class:

@Test
void testGetMessage() {
    DictionaryInfo dictionary = new DictionaryInfo();
    MessageInfo message1 = new MessageInfo("Msg1", "Description1");
    MessageInfo message2 = new MessageInfo("Msg2", "Description2");
    dictionary.addMessage(message1);
    dictionary.addMessage(message2);

    // Test case 1: Get an existing message
    MessageInfo result = dictionary.getMessage("Msg1");
    assertEquals(message1, result);

    // Test case 2: Get a non-existing message
    result = dictionary.getMessage("Msg3");
    assertNull(result);

    // Test case 3: Get a message with null name
    result = dictionary.getMessage(null);
    assertNull(result);

    // Test case 4: Get a message with empty name
    result = dictionary.getMessage("");
    assertNull(result);

    // Test case 5: Get a message with whitespace name
    result = dictionary.getMessage("   ");
    assertNull(result);

    // Test case 6: Get a message with case-insensitive name
    result = dictionary.getMessage("msg1");
    assertEquals(message1, result);

    // Test case 7: Get a message with leading/trailing whitespace in name
    result = dictionary.getMessage("  Msg1  ");
    assertEquals(message1, result);

    // Test case 8: Get a message with special characters in name
    MessageInfo message3 = new MessageInfo("Msg#3", "Description3");
    dictionary.addMessage(message3);
    result = dictionary.getMessage("Msg#3");
    assertEquals(message3, result);

    // Test case 9: Get a message with null description
    MessageInfo message4 = new MessageInfo("Msg4", null);
    dictionary.addMessage(message4);
    result = dictionary.getMessage("Msg4");
    assertEquals(message4, result);

    // Test case 10: Get a message with empty description
    MessageInfo message5 = new MessageInfo("Msg5", "");
    dictionary.addMessage(message5);
    result = dictionary.getMessage("Msg5");
    assertEquals(message5, result);
}