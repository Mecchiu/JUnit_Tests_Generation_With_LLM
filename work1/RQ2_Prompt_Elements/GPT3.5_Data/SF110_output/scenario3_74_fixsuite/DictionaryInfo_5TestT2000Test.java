// Here's an example implementation of the DictionaryInfo class and a test class for it:

// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    private Map<String, MessageInfo> messages;

    public DictionaryInfo() {
        messages = new HashMap<>();
    }

    /**
     * Adds a message to the dictionary
     *
     * @param message - a message
     */
    public void addMessage(MessageInfo message) {
        messages.put(message.getName(), message);
    }

    /**
     * Returns a message given a name
     *
     * @param name - a name
     * @return a message given a name
     */
    public MessageInfo getMessage(String name) {
        return messages.get(name);
    }
}

// DictionaryInfoTest.java
package org.fixsuite.message.info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link DictionaryInfo}.
 * It contains ten unit test cases for the {@link DictionaryInfo#getMessage(String)} method.
 */
class DictionaryInfoTest {

    @Test
    void testGetMessageReturnsNullWhenDictionaryIsEmpty() {
        DictionaryInfo dictionary = new DictionaryInfo();
        assertNull(dictionary.getMessage("TestMessage"));
    }

    @Test
    void testGetMessageReturnsNullWhenMessageDoesNotExist() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message = new MessageInfo("TestMessage", "TestMessageDesc");
        dictionary.addMessage(message);
        assertNull(dictionary.getMessage("NonExistentMessage"));
    }

    @Test
    void testGetMessageReturnsCorrectMessage() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message = new MessageInfo("TestMessage", "TestMessageDesc");
        dictionary.addMessage(message);
        assertEquals(message, dictionary.getMessage("TestMessage"));
    }

    @Test
    void testGetMessageIsCaseSensitive() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message = new MessageInfo("TestMessage", "TestMessageDesc");
        dictionary.addMessage(message);
        assertNull(dictionary.getMessage("testmessage"));
    }

    @Test
    void testGetMessageReturnsCorrectMessageWhenMultipleMessagesExist() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message1 = new MessageInfo("TestMessage1", "TestMessageDesc1");
        MessageInfo message2 = new MessageInfo("TestMessage2", "TestMessageDesc2");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message1, dictionary.getMessage("TestMessage1"));
    }

    @Test
    void testGetMessageReturnsCorrectMessageWhenMultipleMessagesExist2() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message1 = new MessageInfo("TestMessage1", "TestMessageDesc1");
        MessageInfo message2 = new MessageInfo("TestMessage2", "TestMessageDesc2");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertEquals(message2, dictionary.getMessage("TestMessage2"));
    }

    @Test
    void testGetMessageReturnsCorrectMessageWhenMultipleMessagesExist3() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message1 = new MessageInfo("TestMessage1", "TestMessageDesc1");
        MessageInfo message2 = new MessageInfo("TestMessage2", "TestMessageDesc2");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertNull(dictionary.getMessage("TestMessage3"));
    }

    @Test
    void testGetMessageReturnsCorrectMessageWhenMultipleMessagesExist4() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message1 = new MessageInfo("TestMessage1", "TestMessageDesc1");
        MessageInfo message2 = new MessageInfo("TestMessage2", "TestMessageDesc2");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertNull(dictionary.getMessage(""));
    }

    @Test
    void testGetMessageReturnsCorrectMessageWhenMultipleMessagesExist5() {
        DictionaryInfo dictionary = new DictionaryInfo();
        MessageInfo message1 = new MessageInfo("TestMessage1", "TestMessageDesc1");
        MessageInfo message2 = new MessageInfo("TestMessage2", "TestMessageDesc2");
        dictionary.addMessage(message1);
        dictionary.addMessage(message2);
        assertNull(dictionary.getMessage(null));
    }
}