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
	 * Tests the {@link DictionaryInfo#getMessage(String)} method
	 * @throws Exception - if an exception occurs
	 */
	@Test
	public void testGetMessage() throws Exception {
		// Create a new message object
		MessageInfo message = new MessageInfo();
		
		// Set values
		String version = "FIX 20060308";
		message.setVersion(version);
		message.setLoadCount(2);
		message.setLoaders("foo.bar");
		message.setTotals(false);
		message.setRows(10);
		message.setRows("9");
		message.setSender(getEmail());
		message.setSenderHomeCommunityId("HOMECOM");
		message.setStatus(MessageInfoStatus.PUBLISHED);
		message.setSenderStatus(MessageInfoStatus.PUBLISHED);
		message.setSenderURI("");
		
		// Test
		assertEquals("Invalid version", version, message.getVersion());
		assertEquals("Invalid load count", 2, message.getLoadCount());
		assertEquals("Invalid loaders", "foo.bar", message.getLoaders());
		assertEquals("Invalid totals", false, message.isTotals());
		assertFalse("Invalid message", message.isTotals());
		assertEquals("Invalid rows", 10, message.getRows());
		assertEquals("Invalid row count", 9, message.getRows());
		assertEquals("Invalid sender", getEmail(), message.getSender());
		assertEquals("Invalid sender home community id", getEmail(), message.getSenderHomeCommunityId());
		assertEquals("Invalid sender status", MessageInfoStatus.PUBLISHED, message.getSenderStatus());
		assertEquals("Invalid sender message id", message.getId(), message.getSenderMessage());
	}
		
	private String getEmail() {
		return "test@test.org";
	}

}