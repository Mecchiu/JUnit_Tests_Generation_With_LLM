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
		private int messagesCount;
		private int fieldsCount;
		private int componentsCount;

	@Test
	void testOneEntry() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		messagesCount = dictionary.getMessages().size();
		fieldsCount = dictionary.getFields().size();
		componentsCount = dictionary.getComponents().size();
	}

	@Test
	void testOneEntryAndAddFields() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		messagesCount = dictionary.getMessages().size();
		fieldsCount = dictionary.getFields().size();
		componentsCount = dictionary.getComponents().size();

		dictionary.addField(new FieldInfo("foo", "foo"));
		fieldCount++;

		assertEquals(6, dictionary.getFields().size());
	}

	@Test
	void testField() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		messagesCount = dictionary.getMessages().size();
		fieldsCount = dictionary.getFields().size();
		componentsCount = dictionary.getComponents().size();

		fieldCount++;

		assertEquals(6, dictionary.getFields().size());
	}

	@Test
	void testComponents() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		messagesCount = dictionary.getMessages().size();
		fieldsCount = dictionary.getFields().size();
		componentsCount = dictionary.getComponents().size();

		componentsCount++;

		assertEquals(6, dictionary.getComponents().size());
	}

	@Test
	void testCount() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		messagesCount = dictionary.getMessages().size();
		fieldsCount = dictionary.getFields().size();
		componentsCount = dictionary.getComponents().size();

		componentsCount++;
		assertEquals(2, dictionary.getComponents().size());	
	}

	@Test
	void testCountNull() {
		DictionaryInfo dictionary = new DictionaryInfo("1.0");

		assertNull(dictionary.getMessages());
		assertNull(dictionary.getComponents());
	}

	private int fieldCount = 0;
	private int componentCount = 0;
	private int messagesCount = 0;
	private int fieldsCount = 0;
	private int componentsCount = 0;
}