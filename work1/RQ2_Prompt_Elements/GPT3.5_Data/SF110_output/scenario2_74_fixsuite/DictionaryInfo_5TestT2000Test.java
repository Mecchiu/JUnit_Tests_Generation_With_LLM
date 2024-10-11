// Here's an example of how you can test the getMessage() method of DictionaryInfo class:

@Test
void testGetMessage() {
    DictionaryInfo dictionary = new DictionaryInfo();
    MessageInfo message1 = new MessageInfo("Message1", "Description1");
    MessageInfo message2 = new MessageInfo("Message2", "Description2");
    dictionary.messagesByName = new TreeMap<>();
    dictionary.messagesByName.put("Message1", message1);
    dictionary.messagesByName.put("Message2", message2);

    // Test case 1: Get existing message
    assertEquals(message1, dictionary.getMessage("Message1"));

    // Test case 2: Get non-existing message
    assertNull(dictionary.getMessage("Message3"));

    // Test case 3: Get message with null name
    assertNull(dictionary.getMessage(null));

    // Test case 4: Get message with empty name
    assertNull(dictionary.getMessage(""));

    // Test case 5: Get message with whitespace name
    assertNull(dictionary.getMessage("   "));

    // Test case 6: Get message with case-insensitive name
    assertEquals(message1, dictionary.getMessage("message1"));

    // Test case 7: Get message with leading/trailing whitespace in name
    assertEquals(message1, dictionary.getMessage("  Message1  "));

    // Test case 8: Get message with special characters in name
    assertNull(dictionary.getMessage("Message@"));

    // Test case 9: Get message with special characters in name
    assertNull(dictionary.getMessage("Message#"));

    // Test case 10: Get message with special characters in name
    assertNull(dictionary.getMessage("Message$"));
}