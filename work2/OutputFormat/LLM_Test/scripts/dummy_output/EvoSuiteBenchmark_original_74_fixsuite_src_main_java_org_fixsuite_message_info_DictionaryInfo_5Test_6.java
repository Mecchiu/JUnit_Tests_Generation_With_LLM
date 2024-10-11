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
		/**
		 * Returns a message given an id
		 *
		 * @param id - an id
		 * @return a message given an id
		 */
		@Test
		public void getMessage_5_1_1() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo("1.1");
			assertNotNull(dictionaryInfo);

			assertNotNull(dictionaryInfo.getVersion());
			assertEquals("1.0", dictionaryInfo.getVersion());

			// checks if the message is loaded
			assertTrue(dictionaryInfo.isLoaded());

			// checks if the load count is not 0
			assertTrue(dictionaryInfo.getLoadCount()>0);

			// checks if the loadCount equals 1
			assertEquals(1, dictionaryInfo.getLoadCount());
		}

		/**
		 * Test a group added as message.
		 */
		@Test
		public void getMessage_5_2() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo("1.1");
			List subMessages = new ArrayList();
			List result = null;

			// checks if the subMessages.size is not null
			assertNotNull(subMessages);

			subMessages.add(dictionaryInfo);

			// sets dictionaryInfo.subMessages and sets subMessages
			dictionaryInfo.setSubMessages(subMessages);

			// tries to retrieve subMessages from dictionaryInfo
			// by loading a different dictionary
			assertTrue(dictionaryInfo.getSubMessages()!=null);
			assertTrue(dictionaryInfo.getSubMessages().size()>0);

			// check the size of the message
			result = dictionaryInfo.getSubMessages();
			if (result!=null) {
				// adds a message to the dictionaryInfo
				assertTrue(result.size()>0);
			}
		}

		/**
		 * Returns a message given an id
		 *
		 * @param id - an id
		 * @return a message given an id
		 */
		@Test
		public void getMessage_5_3() {

			// checks a subgroup.
			DictionaryInfo dictionaryInfo = new DictionaryInfo("1.1");
			List subMessages = new ArrayList();
			List result = null;

			// creates a new message
			dictionaryInfo.addField(new FieldInfo("2", "2"));
			assertTrue(dictionaryInfo.isLoaded());

			// calls getMessage()
			result = dictionaryInfo.getMessages();
			// checks if the result is arraylist
			assertNotNull(result);
			assertEquals(2, result.size());
		}
}