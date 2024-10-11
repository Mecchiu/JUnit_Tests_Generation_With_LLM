// Test case 1: Test getMessage with a valid message name
@Test
void testGetMessage_validName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertEquals(message, dictionary.getMessage("ExecutionReport"));
}

// Test case 2: Test getMessage with an invalid message name
@Test
void testGetMessage_invalidName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage("InvalidMessage"));
}

// Test case 3: Test getMessage with a null message name
@Test
void testGetMessage_nullName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage(null));
}

// Test case 4: Test getMessage with an empty message name
@Test
void testGetMessage_emptyName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage(""));
}

// Test case 5: Test getMessage with multiple messages added
@Test
void testGetMessage_multipleMessages() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message1 = new MessageInfo("ExecutionReport", "8");
    MessageInfo message2 = new MessageInfo("OrderCancelReject", "9");
    dictionary.addMessage(message1);
    dictionary.addMessage(message2);
    assertEquals(message1, dictionary.getMessage("ExecutionReport"));
    assertEquals(message2, dictionary.getMessage("OrderCancelReject"));
}

// Test case 6: Test getMessage with case sensitivity
@Test
void testGetMessage_caseSensitivity() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage("executionreport"));
}

// Test case 7: Test getMessage with leading/trailing spaces
@Test
void testGetMessage_leadingTrailingSpaces() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage(" ExecutionReport"));
    assertNull(dictionary.getMessage("ExecutionReport "));
    assertNull(dictionary.getMessage(" ExecutionReport "));
}

// Test case 8: Test getMessage with special characters
@Test
void testGetMessage_specialCharacters() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage("ExecutionReport#"));
    assertNull(dictionary.getMessage("ExecutionReport&"));
    assertNull(dictionary.getMessage("ExecutionReport@"));
}

// Test case 9: Test getMessage with message name containing numbers
@Test
void testGetMessage_numbersInName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("ExecutionReport2", "8");
    dictionary.addMessage(message);
    assertEquals(message, dictionary.getMessage("ExecutionReport2"));
}

// Test case 10: Test getMessage with message name containing spaces
@Test
void testGetMessage_spacesInName() {
    DictionaryInfo dictionary = new DictionaryInfo("FIX.5.0SP2");
    MessageInfo message = new MessageInfo("Execution Report", "8");
    dictionary.addMessage(message);
    assertNull(dictionary.getMessage("Execution Report"));
}