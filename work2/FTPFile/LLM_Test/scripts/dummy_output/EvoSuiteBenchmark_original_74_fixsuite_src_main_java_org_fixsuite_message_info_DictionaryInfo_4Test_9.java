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
		private static final String message = "Fixsuite";
		List<GroupInfo> groups;
	    
		@Test
		void getMessage_aDictionaryInfoWithAMessage() {
			MessageInfo messageInfo = new MessageInfo();
			getMessage(messageInfo);
			assertEquals("Fixsuite", messageInfo.getName());
		}

		@Test
		void getMessage_aDictionaryInfoWithAGroup() {
		    String groupName = "Test Group";
		    int id = 42;
				groups = new ArrayList<GroupInfo>();
		    groups.add(new GroupInfo(groupName));
		    List<MessageInfo> messages = new ArrayList<MessageInfo>();
		    getMessage(messages);
		    assertEquals(groupName, messages.get(0).getName());
		}

		@Test
		void getMessage_aLoadedDictionaryInfoWithAMessage() {
			boolean loaded = false;
			MessageInfo messageInfo = new MessageInfo();
			getMessage(messageInfo);
			assertFalse(loaded);
		}

		@Test
		void getMessage_aLoadedDictionaryInfoWithAGroup() {
		    String groupName = "Test Group";
		    int id = 42;
				groups = new ArrayList<GroupInfo>();
			groups.add(new GroupInfo(groupName));
			List<MessageInfo> messages = new ArrayList<MessageInfo>();
			getMessage(messages);
			assertEquals(groupName, messages.get(0).getName());
		}

		@Test
		void getMessage_aLoadedDictionaryInfoWithAMessageAndAGroup_noParsing() {
			MessageInfo messageInfo = new MessageInfo();
			getMessage(messageInfo);
		}

		@Test
		void addMessage_aLoadedDictionaryInfoWithAMessageAndAGroup_noParsing() {
			MessageInfo messageInfo = new MessageInfo();
			addMessage(messageInfo);

		}
}