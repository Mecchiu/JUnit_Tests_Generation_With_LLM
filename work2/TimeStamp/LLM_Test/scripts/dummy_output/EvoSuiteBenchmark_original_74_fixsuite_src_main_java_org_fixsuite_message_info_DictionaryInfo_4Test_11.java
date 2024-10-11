// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
		/**
		 * Test method of {@link DictionaryInfo#getMessage(int)}.
		 */
		@Test
		public void testGetMessage(int id) {
			// Load
			List<MessageInfo> messagesWithName = new ArrayList<MessageInfo>();
			messagesWithName.add(findMessage(id, null));
			messagesWithName.add(findMessage(id, "default"));
			messagesWithName.add(findMessage(id, "A"));
			List<MessageInfo> messagesWithNameAndDescription = new ArrayList<MessageInfo>();
			messagesWithNameAndDescription.add(findMessage(id, null));
			messagesWithNameAndDescription.add(findMessage(id, "M"));
			findMessage(id, null);

			// Assert
			assertEquals("M", messagesWithName.get(0).getName());
			assertEquals("M", messagesWithNameAndDescription.get(0).getName());
			assertEquals("default", messagesWithNameAndDescription.get(1).getName());
			assertEquals("default", messagesWithNameAndDescription.get(2).getName());
			assertEquals("A", messagesWithNameAndDescription.get(3).getName());
			List<String> groupFieldNames = new ArrayList<String>();
			groupFieldNames.add("M");
			groupFieldNames.add("M");
			groupFieldNames.add("A");

			assertEquals("M", messagesWithName.get(1).getFields().get(0).getName());
			assertEquals("A", messagesWithName.get(3).getFields().get(0).getName());
			assertEquals(groupFieldNames, messagesWithName.get(4).getFields().get(0).getFieldNames());
		}
}