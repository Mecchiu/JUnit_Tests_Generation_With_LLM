// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		
	/**
	 * Tests {@link DictionaryInfo#getComponent(String)}
	 */
	@Test
    void testGetComponent() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		assertNotNull(dictionaryInfo.getComponent(new String[] {"tag1"}));
		assertNotNull(dictionaryInfo.getComponent(new String[] {"tag2", "tag3", "tag4"}));
		assertNull(dictionaryInfo.getComponent(new String[] {"tag2"}));

		assertEquals(0, dictionaryInfo.getComponent(null).size());
		assertEquals(10, dictionaryInfo.getComponent(null).size());
	}

	/**
	 * Tests an empty dictionary
	 */
	@Test
	void testEmpty() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		assertNull(dictionaryInfo.getElement(null));
		assertEquals(0, dictionaryInfo.getFieldCount());
		assertEquals(0, dictionaryInfo.getComponentsCount());
		assertEquals(0, dictionaryInfo.getMessagesCount());
	}

	/**
	 * Tests a message
	 */
	@Test
    void testMessage() {
		String[] value = new String[] {"tag1", "tag2", "tag3", "tag4"};
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		assertNotNull(dictionaryInfo.getElement(value));
		assertEquals(1, dictionaryInfo.getFieldCount());
		assertEquals(value.length, dictionaryInfo.getFieldCount(value));
		assertEquals(value.length, dictionaryInfo.getComponents(value).size());
		assertEquals(value.length, dictionaryInfo.getMessages(value).size());
	}
	
	/**
	 * Tests an empty dictionary with empty message
	 */
	@Test
    void testEmptyMessage() {
		String[] value = new String[] {"tag2", "tag3", "tag4"};
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		assertNull(dictionaryInfo.getElement(value));
		assertEquals(0, dictionaryInfo.getComponents(value).size());
		assertEquals(value.length, dictionaryInfo.getFieldCount());
		assertEquals(0, dictionaryInfo.getFieldCount("tag2"));
		assertEquals(0, dictionaryInfo.getFieldCount("tag3"));
		assertEquals(0, dictionaryInfo.getFieldCount("tag4"));
		assertEquals(0, dictionaryInfo.getMessages(value).size());
	}

	/**
	 * Tests that adding a message results in adding the message to the message map.
	 */
	@Test
	void testAddMessage() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		List<MessageInfo> list = new ArrayList<MessageInfo>();
		list.add(new MessageInfo(new String[] {"newtag1"}, 10, 5));
		list.add(new MessageInfo(new String[] {"newtag2" }, 0, 10));
		dictionaryInfo.addMessages(list, list.size());

		assertEquals(2, dictionaryInfo.getComponents(new String[] {"newtag1"}).size());
		assertEquals(0, dictionaryInfo.getComponents(new String[] {"newtag2"}).size());
		assertEquals(5, dictionaryInfo.getMessages(new String[] {"newtag1"}).size());
	}

	/**
	 * Tests adding an array of messages.
	 */
	@Test
	void testAddMessages() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo("2.10");

		List<MessageInfo> list = new ArrayList<MessageInfo>();
		list.add(new MessageInfo(new String[] {"newtag1"}, 10, 5));
		list.add(new MessageInfo(new String[] {"newtag2", "newtag3"}));
		dictionaryInfo.addMessages(list.toArray(new MessageInfo[] {}), list.size());

		assertEquals(2, dictionaryInfo.getComponents(new String[] {"newtag1"}).size());
}
}