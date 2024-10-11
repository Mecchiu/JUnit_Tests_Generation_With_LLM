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
		DictionaryInfo dictionary = new DictionaryInfo("fix.dictionary");

		/**
		 * Test of getField(String).
		 */
		@Test
		void getField_String()
		{
			assertNotNull("getField(String) must return message", dictionary.getField("fix.dictionary.message"));
		}

        /**
        * Test of getField(Integer).
        */
        @Test
		void getField_Integer()
		{
			assertNotNull("getField(Integer) must return message", dictionary.getField("fix.dictionary.message.1"));
		}

		/**
		 * Test of getFieldCollection(String).
		 */
		@Test
		void getFieldCollection_String()
		{
			List<MessageInfo> messageObject;
			//
			messageObject = new ArrayList<MessageInfo>();
			//
			assertNotNull("getFieldCollection(String) must return message ", dictionary.getFieldCollection("fix.dictionary.message"));
		}

		/**
		 * Test of getFieldCollection(Integer).
		 */
		@Test
		void getFieldCollection_Integer()
		{
			List<MessageInfo> messageObject;
			//
			messageObject = new ArrayList<MessageInfo>();
			//
			assertNotNull("getFieldCollection(Integer) must return message ", dictionary.getFieldCollection("fix.dictionary.message.1"));
		}
	}