I can help you write the test cases for the `DictionaryInfo` class. Here's an example of how you can test the `getMessage` method:

```
@Test
void testGetMessage() {
    DictionaryInfo dictionary = new DictionaryInfo();
    MessageInfo message1 = new MessageInfo(1, "TestMessage1");
    MessageInfo message2 = new MessageInfo(2, "TestMessage2");
    dictionary.addMessage(message1);
    dictionary.addMessage(message2);

    // Test getting an existing message
    MessageInfo result1 = dictionary.getMessage(1);
    assertEquals(message1, result1);

    // Test getting a non-existing message
    MessageInfo result2 = dictionary.getMessage(3);
    assertNull(result2);
}
```

You can add more test cases to cover different scenarios, such as adding and removing messages from the dictionary.