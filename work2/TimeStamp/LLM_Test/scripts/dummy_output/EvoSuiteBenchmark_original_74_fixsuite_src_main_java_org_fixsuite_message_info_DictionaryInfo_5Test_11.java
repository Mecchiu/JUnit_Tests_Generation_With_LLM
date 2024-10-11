// DictionaryInfo_5Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfo_5Test {
		static {
				System.out.println("Fix-Suite: Loading dictionaries of version 5 of message info.");
				System.out.println("Fix-Suite: FIX version 5 has been loaded.");
				new org.fixsuite.utils.FixSuite.ClassLoader("FIX-Suite", false, false);
		}

    @Test
    void getMessage_String() {
        System.out.println("FIX-Suite: DictionaryInfo_5Test testing: getMessage");
        DictionaryInfo dict = new DictionaryInfo("5.7");
        List<MessageInfo> messages = dict.getMessages();
        assertNotNull(messages);
        assertEquals(2, messages.size());
        MessageInfo m1 = messages.get(0);
        assertNotNull(m1);
        System.out.println("FIX-Suite: DictionaryInfo_5Test testing: getMessage - MessageInfo");
        assertEquals(0, m1.getMessageID());
        assertEquals(2, m1.getFieldID());
        assertEquals(4, m1.getFieldNumber());
        assertEquals("test_field-5", m1.getId());
        assertEquals("test", m1.getName());

        MessageInfo m2 = messages.get(1);
        assertNotNull(m2);
        System.out.println("FIX-Suite: DictionaryInfo_5Test testing: getMessage - MessageInfo");
        assertEquals(1, m2.getMessageID());
        assertEquals(1, m2.getFieldID());
        assertEquals(0, m2.getFieldNumber());
        System.out.println("FIX-Suite: DictionaryInfo_5Test testing: getMessage - MessageInfo");
    }

	@Test
	void getMessagesByName() {
		System.out.println("FIX-Suite: DictionaryInfo_5Test testing: getMessagesByName");
		DictionaryInfo dict = new DictionaryInfo("5.7");
		List<MessageInfo> messages = dict.getMessagesByName();
        assertNotNull(messages);
        assertEquals(2, messages.size());
        assertEquals("test", ((MessageInfo) messages.get(0)).getName());
        assertEquals("test message", ((MessageInfo) messages.get(1)).getName());

        assertEquals("10.9", dict.getMessage("10.9").getVersion());
        assertNull(dict.getMessage("10.8"));
        assertNull(dict.getMessage("10.8"), "The message 10.8 could not be found");

        assertEquals("12.1", dict.getPartByPosition("10.9").getVersion());
        assertEquals("12.1", dict.getPartByPosition("10.8"), "The field 5.8 is missing in the part");


		 // FIX Fix-Suite: This test case is for testing the order of messages defined in MessageInfo.
		 // It just tests that the first message's order is found before the second, where there are two messages.

        List<MessageInfo> messages4 = dict.getMessagesByName();
        assertEquals(2, messages4.size());
        assertEquals("test", ((MessageInfo) messages4.get(0)).getName());
        assertEquals("test message", ((MessageInfo) messages4.get(1)).getName());

        List<MessageInfo> messages5 = dict.getMessagesByName();
        assertEquals(1, messages5.size());
        assertEquals("test", ((MessageInfo) messages5.get(0)).getName());

    }

	@Test
	void createMessage_String() {
		System.out.println("FIX-Suite: DictionaryInfo_5Test testing: createMessage");
		DictionaryInfo dict = new DictionaryInfo("5.7");

		// FIX FIX-Suite: This test case is for testing the order of messages defined in MessageInfo.

        assertEquals(1, dict.createMessage("test").getFieldNumber());
		List<MessageInfo> messages = dict.createMessage("test", 1);
        assertEquals("test message", ((MessageInfo) messages.get(0)).getName(), "The message was created");
}
}