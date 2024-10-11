// Here's an example implementation of the DictionaryInfo_4Test class with ten unit test cases for the getMessage(int) method:

class DictionaryInfo_4Test {

    @Test
    void testGetMessageWithValidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message = new MessageInfo(35, "D", "NewOrderSingle");
        dictionary.addMessage(message);
        assertEquals(message, dictionary.getMessage(35));
    }

    @Test
    void testGetMessageWithInvalidId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(35));
    }

    @Test
    void testGetMessageWithNegativeId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(-35));
    }

    @Test
    void testGetMessageWithZeroId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(0));
    }

    @Test
    void testGetMessageWithMultipleMessages() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(35, "D", "NewOrderSingle");
        MessageInfo message2 = new MessageInfo(36, "E", "NewOrderList");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message1, dictionary.getMessage(35));
        assertEquals(message2, dictionary.getMessage(36));
    }

    @Test
    void testGetMessageWithNullMessages() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(35));
    }

    @Test
    void testGetMessageWithDuplicateIds() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message1 = new MessageInfo(35, "D", "NewOrderSingle");
        MessageInfo message2 = new MessageInfo(35, "E", "NewOrderList");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message1, dictionary.getMessage(35));
    }

    @Test
    void testGetMessageWithLargeId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(1000000));
    }

    @Test
    void testGetMessageWithNegativeLargeId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        assertNull(dictionary.getMessage(-1000000));
    }

    @Test
    void testGetMessageWithMaxIntId() {
        DictionaryInfo dictionary = new DictionaryInfo("FIX.4.4");
        MessageInfo message = new MessageInfo(Integer.MAX_VALUE, "D", "NewOrderSingle");
        dictionary.addMessage(message);
        assertEquals(message, dictionary.getMessage(Integer.MAX_VALUE));
    }
}