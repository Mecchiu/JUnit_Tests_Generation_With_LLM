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
		 * Test the method {@link DictionaryInfo#getComponent(String)}
		 */
		@Test
		void testGetComponent() {
			DictionaryInfo dictionaryInfo = null;

			assertNotNull("dictionaryInfo is null", dictionaryInfo);

			FieldInfo field1 = FieldInfo.getField("FIELD1");
			FieldInfo field2 = FieldInfo.getField("FIELD2");
			FieldInfo field3 = FieldInfo.getField("FIELD3");
			
			try {
				dictionaryInfo.getComponent(field1.getName());
				throw new Exception("Field should not be found in a " +
					"message.");
			} catch (Exception e) {
				assertEquals("unexpected Exception :", "Field should be found in a " +
					"message.", e.getMessage());

				// If a field can't be found, check if it's a text component.
				assertNotNull("dictionaryInfo.getComponent: " +
					"expecting a text component but got not.", dictionaryInfo.getComponent(field1.getName()));
			}
			try {
				dictionaryInfo.getComponent(field3.getName());
				throw new Exception("Message information for " +
					"field \"FIELD3\" was null.");
			} catch (Exception e) {}

		}
		
		/**
		 * Test the method {@link DictionaryInfo#addMessage(MessageInfo)}
		 *
		*/
		@Test
		void testAddMessage() {
			List<MessageInfo> messages = new ArrayList<>();
			MessageInfo message = MessageInfo.getMessage("testAddMessage");
			messages.add(message);			
			
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			dictionaryInfo.addMessage(messages);
			
			assertNotNull("dictionaryInfo.getMessages(): " + "", messages);
			assertTrue("dictionaryInfo.getMessages(): " + 
			"there is no message to be added.", messages.size() > 0);

			assertEquals("dictionaryInfo.getMessages(): " + "", 1, messages.size());
		}
		
		/**
		 * Test the method {@link DictionaryInfo#getMessageList()}
		 */
		@Test
		void testGetMessageArrayList() {
			List<MessageInfo> messageList = new ArrayList<>();
			
			try {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				messageList = dictionaryInfo.getMessageList();

				assertNotNull("dictionaryInfo.getMessages(): " + "", messageList);
				assertTrue("dictionaryInfo.getMessages(): " + 
				"there are not messageList.", messageList.size() > 0);
			} catch (Exception exception) {
				fail("unexpected Exception : \"" + exception.getMessage() + "\"");
			}
		}
}