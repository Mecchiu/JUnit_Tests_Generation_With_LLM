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
		 * Test case 1 is a positive test case.
		 * 
		 * Test case 1 tests the case where the message name is not null.
		 * 
		 * Test case 1 expects the method to return the message with the given name.
		 */
		@Test
		void testGetMessage_1() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message");
				
				// Verify
				assertEquals(messageInfo, actual);
		}
		
		/**
		 * Test case 2 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 2 is a negative test case.
		 * 
		 * Test case 2 tests the case where the message name is null.
		 * 
		 * Test case 2 expects the method to return null.
		 */
		@Test
		void testGetMessage_2() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage(null);
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 3 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 3 is a negative test case.
		 * 
		 * Test case 3 tests the case where the message name is empty.
		 * 
		 * Test case 3 expects the method to return null.
		 */
		@Test
		void testGetMessage_3() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 4 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 4 is a negative test case.
		 * 
		 * Test case 4 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 4 expects the method to return null.
		 */
		@Test
		void testGetMessage_4() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 5 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 5 is a negative test case.
		 * 
		 * Test case 5 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 5 expects the method to return null.
		 */
		@Test
		void testGetMessage_5() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 6 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 6 is a negative test case.
		 * 
		 * Test case 6 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 6 expects the method to return null.
		 */
		@Test
		void testGetMessage_6() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 7 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 7 is a negative test case.
		 * 
		 * Test case 7 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 7 expects the method to return null.
		 */
		@Test
		void testGetMessage_7() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 8 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 8 is a negative test case.
		 * 
		 * Test case 8 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 8 expects the method to return null.
		 */
		@Test
		void testGetMessage_8() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				// Exercise
				MessageInfo actual = dictionaryInfo.getMessage("Message1");
				
				// Verify
				assertNull(actual);
		}
		
		/**
		 * Test case 9 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 9 is a negative test case.
		 * 
		 * Test case 9 tests the case where the message name is not in the dictionary.
		 * 
		 * Test case 9 expects the method to return null.
		 */
		@Test
		void testGetMessage_9() {
				// Setup
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Message");
				dictionaryInfo.addMessage(messageInfo);
				
				