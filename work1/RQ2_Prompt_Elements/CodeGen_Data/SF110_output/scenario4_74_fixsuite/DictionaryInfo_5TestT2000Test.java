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
int loadCount;

		DictionaryInfo dictionaryInfo;

		public DictionaryInfo_5Test(DictionaryInfo dictionaryInfo, int loadCount) {
			this.dictionaryInfo = dictionaryInfo;
			this.loadCount = loadCount;
		}

		/**
		 * Test the {@link DictionaryInfo#getMessage(String)} method.
		 * Load and retrieve a message from a dictionary information.
		 * The dictionaryInfo should contain two values
		 * 1. A dictionary information with a Message number of the expected value
		 * 2. A list of messages with a Message number of the expected value
		 * @throws Exception is there is a problem with a method call
		 */
		@Test
		void getMessage() throws Exception {
			assertEquals(dictionaryInfo.getMessage(0), 1);
			assertEquals(dictionaryInfo.getMessagesByName()
					.values().stream().mapToInt(f -> ((int[])f)[0]).min().get(), 1);
			assertEquals(dictionaryInfo.getMessagesByName().values()
					.stream().mapToInt(f -> ((int[])f)[0]).min().get(), 2);
		}

		/**
		 * Test the {@link DictionaryInfo#getMessage(String, int)} method.
		 * Load and retrieve that message from a dictionary information.
		 * The dictionaryInfo should contain a single message
		 * 1. A message with a message id
		 * 2. A field with a Message number of the expected value
		 * 3. A field with a message id
		 * 4. A field with a Message number of the expected value
		 * @throws Exception is there is a problem with a method call
		 */
		@Test
		void getMessageAsField() throws Exception {
			assertEquals(dictionaryInfo.getMessage(0, 1), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(1).get(0), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(2).get(0), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(3).get(0), 1);
		}

		/**
		 * Test the {@link DictionaryInfo#getMessageAsField(String)} method for a field.
		 * Load and retrieve that message from a dictionary information.
		 * The dictionaryInfo should contain a field with a Message number of the expected value
		 * 1. A message with a message id
		 * 2. A field with a Message number of the expected value
		 * 3. A field with a message id
		 * 4. A field with a Message number of the expected value
		 * @throws Exception is there is a problem with a method call
		 */

		@Test
		void getMessageAsFieldAsField() throws Exception {
			assertEquals(dictionaryInfo.getMessageAsFieldAsField(1), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(1).get(0).get("name"), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(2).get(0).get("name"), 1);
			assertEquals(dictionaryInfo.getMessagesByName().get(3).get(0).get("name"), 1);
		}


		/**
		 * Test the {@link DictionaryInfo#getMessages()} method and set and retrieve messages as
		 * a list of MessageInfo objects using a list of dictionaries information.
		 * The dictionaryInfo should contain two dictionaries with a message number of the expected value
		 * 1. A dictionary with a Message number of the expected value
		 * 2. A list of dictionary with a Message number of the expected value
		 * @throws Exception is there is a problem with a method call
		 */

		@Test
		void getMessagesByName() throws Exception {
			List<MessageInfo> list = new ArrayList<>();
			list.add(dictionaryInfo.getMessagesByName().get(1).get(0));
			list.add(dictionaryInfo.getMessagesByName().get(2).get(0));
			assertEquals(dictionaryInfo.getMessagesByName().size(), list.size());
			assertTrue(list.contains(dictionaryInfo