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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
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
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage(Integer.MIN_VALUE / 2);
				assertNull(result);
		}
}

// MessageInfo.java
/**
 * MessageInfo.java 11:33:45 PM Apr 21, 2008
 *
 * <PRE>
 * Copyright (c) 2008, Jan Amoyo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     - Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     - Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 'AS IS';
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *