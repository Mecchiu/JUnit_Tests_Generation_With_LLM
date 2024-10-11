// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		
	/**
	 * Simple unit test. First creates a new instance and then gets a value for a field.
	 */
	@Test
	void testGetField() {
        final DictionaryInfo dictionaryInfo1 = new DictionaryInfo("FIX.4.20");
        final String tagNumber = "1";
        final String tagName = "TAGN";
        final Number tagNumberToUse = new Integer(1);
        dictionaryInfo1.setTagNumber(tagNumber);
        dictionaryInfo1.setTagNumberToUse(tagNumberToUse);
        final FieldInfo field = dictionaryInfo1.getField("FIELD_1");
        final Object value1 = dictionaryInfo1.getValue(field);
		dictionaryInfo1.setTagNumber(tagNumber);
        dictionaryInfo1.setTagNumberToUse(tagNumberToUse);
        dictionaryInfo1.setField(field, "FIELD_VALUE_1");
        final Object value2 = dictionaryInfo1.getValue(field);
        assertEquals("FIELD_VALUE_1", value1, value2);
	}

	/**
	 * Fails the test if the method returns a String representing an empty collection.
	 */
	@Test
	void testGetMessages() {
		final DictionaryInfo dictionaryInfo1 = new DictionaryInfo("FIX.4.20");
		final List<MessageInfo> messages = new ArrayList<MessageInfo>();
		dictionaryInfo1.setMessages(messages);
		assertEquals(null, dictionaryInfo1.getMessages("FIX.4.20"));
		MessageInfo message1 = new MessageInfo();
		assertNull(dictionaryInfo1.getMessage(message1));
	}
}