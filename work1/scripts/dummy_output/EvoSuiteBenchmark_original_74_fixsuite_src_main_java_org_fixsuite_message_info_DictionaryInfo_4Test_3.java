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
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#getMessage(java.lang.String)}.
	 */
	@Test
	public void getMessage_String() {
			
		assertTrue(DictionaryInfo.getMessage(DictionaryInfo_4Test.class.getName()+"Testcase1") instanceof MessageInfo_4TestCase1);

	}

	/**
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#addMessage(org.fixsuite.message.info.MessageInfo)}
	 *
	 * @throws Exception
	 * @throws Exception
	 */
	@Test
	public void addMessage_MessageInfo() throws Exception {
		
    	assertFalse(DictionaryInfo.addMessage(Object.class.getName()+"Testcase1"));
		List<String> msg = new ArrayList<>();
		DictionaryInfo.addMessage(msg);
		assertTrue(msg == DicMessage_4TestCase1.msg.split(";"));

		msg.set(1, DicMessage_4TestCase1.msg.split(";"));
   		assertFalse(DictionaryInfo.addMessage(DicMessage_4TestCase2.class.getName()+"Testcase2"));
	}

	/**
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#replaceAsGroup(org.fixsuite.message.info.MessageInfo, org.fixsuite.message.info.GroupInfo)}
	 *
	 * @throws Exception
	 */
	@Test
	public void replaceAsGroup_MessageInfo() throws Exception {
		DictionaryInfo.replaceAsGroup(Object.class.getName()+"Testcase1", new MessageInfo_4TestCase1());
		MessageInfo msg = DicMessage_4TestCaseX.msg;
		assertEquals(";Testcase1", msg.split(";")[0]);
		
	}
		
	
	/**
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#replaceAsGroup(javax.mail.internet.Message.Header, javax.mail.internet.GroupInfo)}.
	 */
	@Test
	public void replaceAsGroup_Header_GroupInfo() {
		try {
			DictionaryInfo.replaceAsGroup(Object.class.getName(), new MessageHeader_4TestCaseB);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
		
		
	}

	/**
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#replaceAsGroup(javax.mail.internet.Message.Recipient)}.
	 */
	@Test
	public void replaceAsGroup_Recipient() {
		
	}

	/**
	 * Test method for {@link org.fixsuite.message.info.DictionaryInfo#replaceAsGroup(java.lang.String)}.
	 */
	@Test
	public void replaceAsGroup_String() {
		try {
			DictionaryInfo.replaceAsGroup("";);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
		try {
			DictionaryInfo.replaceAsGroup("Testcase1");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
		try {
			DictionaryInfo.replaceAsGroup("Testcase2");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.toString());
		}
		
	}	
	

}