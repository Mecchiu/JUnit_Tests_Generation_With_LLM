// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {

	/**
	 * Test case 1 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_1() {
		// Test case 1
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 2 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_2() {
		// Test case 2
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 3 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_3() {
		// Test case 3
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 4 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_4() {
		// Test case 4
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 5 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_5() {
		// Test case 5
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 6 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_6() {
		// Test case 6
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 7 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_7() {
		// Test case 7
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 8 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_8() {
		// Test case 8
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 9 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_9() {
		// Test case 9
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 10 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_10() {
		// Test case 10
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
}

// DictionaryInfo_4Test_Coverage.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test_Coverage {
		
	/**
	 * Test case 1 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_1() {
		// Test case 1
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 2 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_2() {
		// Test case 2
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 3 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 * @see DictionaryInfo#getMessage(int)
	 */
	@Test
	public void testGetMessage_3() {
		// Test case 3
		DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
		MessageInfo messageInfo = new MessageInfo(dictionaryInfo, "A", 1);
		dictionaryInfo.addMessage(messageInfo);
		assertEquals(messageInfo, dictionaryInfo.getMessage(1));
	}
	
	/**
	 * Test case 4 for method {@link DictionaryInfo#getMessage(int)}.
	 * 
	 *