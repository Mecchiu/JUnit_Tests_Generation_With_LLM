// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfoTest {

	/**
	 * Test case 1 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage1() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 2 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage2() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 3 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage3() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 4 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage4() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 5 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage5() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 6 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage6() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 7 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage7() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 8 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage8() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 9 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage9() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
	
	/**
	 * Test case 10 for {@link DictionaryInfo#getMessage(String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetMessage10() throws Exception {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Message1");
		dictionaryInfo.messagesByName = new TreeMap<String, MessageInfo>();
		dictionaryInfo.messagesByName.put("Message1", messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage("Message1"));
	}
}