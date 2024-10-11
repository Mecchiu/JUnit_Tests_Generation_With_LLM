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
		
	private static String TEST_VALUE = "Hello, World!";

	/**
	 * Test method for
	 * {@link DictionaryInfo#getMessage(String)} without specifying a language or extension.
	 */
	@Test
	public void testGetMessage_5() {
		MessageInfo info = DictionaryInfo.dictionary.getMessage(TEST_VALUE);
		assertEquals("Hello, World!", info.getBody());
	}
	/**
	 * Test method for
	 * {@link DictionaryInfo#getMessage(String)} with specifying language.
	 */
	@Test
	public void testGetMessage_6() {
		MessageInfo message = DictionaryInfo.dictionary.getMessage(TEST_VALUE,
					DictionaryInfo.DICTIONARY_LANGUAGE);
		assertEquals("Hello, World!", message.getBody());
	}
	/**
	 * Test method for
	 * {@link DictionaryInfo#getMessage(String)} with specifying extension.
	 */
	@Test
	public void testGetMessage_7() {
		MessageInfo message = DictionaryInfo.dictionary.getMessage(TEST_VALUE,
					DictionaryInfo.DICTIONARY_EXTENSION);
		assertEquals("Hello, World!", message.getBody());
	}
	/**
	 * Test method for {@link DictionaryInfo#isLoaded()}.
	 */
	@Test
	public void testIsLoaded_5() {
		assertFalse("IsLoaded must return false for undefined messages", DictionaryInfo.dictionary.isLoaded());
	}
	/**
	 * Test method for {@link DictionaryInfo#getLanguages()}.
	 */
	@Test
	public void testGetLanguages_5() {
		List<String> lang = DictionaryInfo.dictionary.getLanguages();
		assertEquals("Not the case", 6, lang.size());
	}
	/**
	 * Test method for {@link DictionaryInfo#isLoaded(String)}.
	 */
	@Test
	public void testIsLoaded_6() {
		assertTrue("IsLoaded must return true for defined messages", DictionaryInfo.dictionary.isLoaded(TEST_VALUE));
	}
	/**
	 * Test method for {@link DictionaryInfo#addMessage(String)}.
	 */
	@Test
	public void testAddMessage_5() {
		MessageInfo message = DictionaryInfo.dictionary.addMessage(TEST_VALUE);
		assertEquals("Added message must be of Type Message", DictionaryInfo.MESSAGE_TYPE, message.getType());
	}
	/**
	 * Test method for {@link DictionaryInfo#replaceMessageGroup(String)}.
	 */
	@Test
	public void testReplacemessagegroup_5() {
		MessageInfo message = DictionaryInfo.dictionary.replaceMessageGroup(TEST_VALUE);
		assertEquals("Message Group replacement must be successful", DICTIONARY_GROUP_2, message.getGroup());
	}
}