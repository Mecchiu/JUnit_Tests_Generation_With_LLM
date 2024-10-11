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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(1);
				assertEquals(messageInfo, result);
		}
		
		/**
		 * Test case 2 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(2);
				assertNull(result);
		}
		
		/**
		 * Test case 3 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(0);
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(-1);
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MAX_VALUE);
				assertNull(result);
		}
		
		/**
		 * Test case 6 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MIN_VALUE);
				assertNull(result);
		}
		
		/**
		 * Test case 7 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MAX_VALUE - 1);
				assertNull(result);
		}
		
		/**
		 * Test case 8 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MIN_VALUE + 1);
				assertNull(result);
		}
		
		/**
		 * Test case 9 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MAX_VALUE / 2);
				assertNull(result);
		}
		
		/**
		 * Test case 10 for method {@link DictionaryInfo#getMessage(int)}.
		 * 
		 * @see DictionaryInfo#getMessage(int)
		 */
		@Test
		public void testGetMessage_10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MIN_VALUE / 2);
				assertNull(result);
		}
}

// DictionaryInfo_5Test.java
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
class DictionaryInfo_5Test {
		
		/**
		 * Test case 1 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * @see DictionaryInfo#getMessage(String)
		 */
		@Test
		public void testGetMessage_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat");
				assertEquals(messageInfo, result);
		}
		
		/**
		 * Test case 2 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * @see DictionaryInfo#getMessage(String)
		 */
		@Test
		public void testGetMessage_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("TestRequest");
				assertNull(result);
		}
		
		/**
		 * Test case 3 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * @see DictionaryInfo#getMessage(String)
		 */
		@Test
		public void testGetMessage_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("");
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * @see DictionaryInfo#getMessage(String)
		 */
		@Test
		public void testGetMessage_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(null);
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * @see DictionaryInfo#getMessage(String)
		 */
		@Test
		public void testGetMessage_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("HeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeartbeatHeart