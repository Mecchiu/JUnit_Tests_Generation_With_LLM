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
	 * Test method for {@link DictionaryInfo#getMessage(String)}.
	 */
	@Test
	public void testGetMessage() {
			
		// Default message
		String result = DictionaryInfo.getMessage(null);
		List<String> messageList = new ArrayList<String>();
		
		messageList.add("DummyTestMessage");
		
		// message should be returned
		assertEquals("DummyTestMessage", result);
		
		// Update message
		result = DictionaryInfo.getMessage(MessageInfo_5.DATATAG_1);
		assertEquals("DummyTestMessage", result);
	
		messageList.add("UpdatedMessage");
		
		// message should be returned, and will be updated in this testCase
		result = DictionaryInfo.getMessage(MessageInfo_5.DATATAG_1);
		String updatedMessage = DictionaryInfo.getMessage(messageList.get(0));
		assertEquals("UpdatedMessage", updatedMessage);
	
		// Reset the message 
		messageList.clear();
		
		result = DictionaryInfo.getMessage(MessageInfo_5.DATATAG_1);
		assertEquals("DummyTestMessage", result);
		
		// No change in MessageInfo.setMessage()
		messageList.clear();
		result = DictionaryInfo.getMessage(MessageInfo.DATATAG_1);
		assertEquals("DummyTestMessage", result);
		
		// Reset message list
		messageList.clear();
	}	
}