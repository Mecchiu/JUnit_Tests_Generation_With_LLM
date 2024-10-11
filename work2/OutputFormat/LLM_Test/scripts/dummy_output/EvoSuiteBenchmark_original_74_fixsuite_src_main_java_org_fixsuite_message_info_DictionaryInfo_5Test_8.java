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
		/*
		 * Tests {@link DictionaryInfo#getMessage(String)} and
		 * {@link DictionaryInfo#addMessage(MessageInfo)}
		 */
		@Test
		public void testGetMessage() {
			// Test
			String testString = "testString";

			// Setup
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Check
			assertNotNull(dictionaryInfo.getMessages());
			assertEquals(1, dictionaryInfo.getMessages().size());
			MessageInfo messageInfo = dictionaryInfo.getMessages().get(0);
			assertNotNull(messageInfo);
			assertEquals(testString, messageInfo.getText());
			assertEquals(testString + "Test message", messageInfo.toString());
		}

		@Test
		public void testAddMessage() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add
			dictionaryInfo.addMessage(new MessageInfo("testStringTest"));
			assertEquals(testString + " added message", dictionaryInfo.getMessages().toString());
		}

		@Test
		public void testAddMessageWithRepeatedMessage() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add
			dictionaryInfo.addMessage(new MessageInfo("testString"));
			dictionaryInfo.addMessage(new MessageInfo("testString"));
			assertEquals(testString + " add two messages", dictionaryInfo.getMessages().toString());
		}

		@Test
		public void testAddAllMessages() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add multiple messages
			dictionaryInfo.addAllMessage(getAllMessage());
			assertEquals(testString + " add multiple messages", dictionaryInfo.getMessages().toString());
		}

		@Test
		public void testAddAllMessagesWithRepeatedMessage() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add multiple messages
			dictionaryInfo.addAllMessage(getAllMessage());
			dictionaryInfo.addAllMessage(getAllMessage());
			assertEquals(testString + " add multiple messages", dictionaryInfo.getMessages().toString());
		}

		@Test
		public void testGetMessages() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add
			List<MessageInfo> messages = new ArrayList<>();
			messages.add(new MessageInfo("message1"));
		String message1 = "message 1";
			messages.add(new MessageInfo(message1));
			String message2 = "message 2";
			messages.add(new MessageInfo(message2));
			String message3 = "message 3";
			messages.add(new MessageInfo(message3));
			dictionaryInfo.addMessages(messages);

			// Check
			List<MessageInfo> messagesTest = dictionaryInfo.getMessages();
			assertEquals(1, messages.size());
			MessageInfo messageInfo = messagesTest.get(0);
			assertNotNull(messageInfo);
			assertEquals(message1, messageInfo.getText());
		}

		@Test
		public void testMessage() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add
			MessageInfo messageInfo = new MessageInfo("test message");
			dictionaryInfo.addMessage(messageInfo);

			// Check
			assertEquals(testString + " added new message", dictionaryInfo.getMessage(messageInfo.getText()).toString());
			assertEquals(1, dictionaryInfo.getMessages().size());
		}

		@Test
		public void testMessages() {
			// Setup
			String testString = "testString";
			DictionaryInfo dictionaryInfo = new DictionaryInfo(testString);

			// Add several messages
}
}