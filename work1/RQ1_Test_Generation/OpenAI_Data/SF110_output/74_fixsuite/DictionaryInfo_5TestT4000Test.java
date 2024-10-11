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
		 * Test case 1 tests the normal case.
		 * 
		 * Test case 1 expects the method to return the message with the given name.
		 */
		@Test
		void testGetMessage_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat");
				assertEquals(messageInfo, result);
		}
		
		/**
		 * Test case 2 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 2 is a negative test case.
		 * 
		 * Test case 2 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 2 expects the method to return null.
		 */
		@Test
		void testGetMessage_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("TestRequest");
				assertNull(result);
		}
		
		/**
		 * Test case 3 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 3 is a negative test case.
		 * 
		 * Test case 3 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 3 expects the method to return null.
		 */
		@Test
		void testGetMessage_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat1");
				assertNull(result);
		}
		
		/**
		 * Test case 4 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 4 is a negative test case.
		 * 
		 * Test case 4 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 4 expects the method to return null.
		 */
		@Test
		void testGetMessage_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat2");
				assertNull(result);
		}
		
		/**
		 * Test case 5 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 5 is a negative test case.
		 * 
		 * Test case 5 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 5 expects the method to return null.
		 */
		@Test
		void testGetMessage_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat3");
				assertNull(result);
		}
		
		/**
		 * Test case 6 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 6 is a negative test case.
		 * 
		 * Test case 6 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 6 expects the method to return null.
		 */
		@Test
		void testGetMessage_6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat4");
				assertNull(result);
		}
		
		/**
		 * Test case 7 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 7 is a negative test case.
		 * 
		 * Test case 7 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 7 expects the method to return null.
		 */
		@Test
		void testGetMessage_7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat5");
				assertNull(result);
		}
		
		/**
		 * Test case 8 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 8 is a negative test case.
		 * 
		 * Test case 8 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 8 expects the method to return null.
		 */
		@Test
		void testGetMessage_8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat6");
				assertNull(result);
		}
		
		/**
		 * Test case 9 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 9 is a negative test case.
		 * 
		 * Test case 9 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 9 expects the method to return null.
		 */
		@Test
		void testGetMessage_9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat7");
				assertNull(result);
		}
		
		/**
		 * Test case 10 for method {@link DictionaryInfo#getMessage(String)}.
		 * 
		 * Test case 10 is a negative test case.
		 * 
		 * Test case 10 tests the case where the message with the given name does not exist.
		 * 
		 * Test case 10 expects the method to return null.
		 */
		@Test
		void testGetMessage_10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.4");
				MessageInfo messageInfo = new MessageInfo(1, "Heartbeat");
				dictionaryInfo.addMessage(messageInfo);
				MessageInfo result = dictionaryInfo.getMessage("Heartbeat8");
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
 * </PRE>
 */
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX message.
 *
 * @author jramoyo
 */
public class MessageInfo {

    private int id;

    private String name;

    private String msgType;

    private String msgCategory;

    private boolean admin;

    private boolean app;

    private boolean repeatingGroup;

    private List<FieldInfo> fields;

    private List<FieldInfo> headerFields;

    private List<FieldInfo> trailerFields;

    private List<FieldInfo> requiredFields;

    private List<FieldInfo> optionalFields;

    private List<FieldInfo> repeatingFields;

    private List<FieldInfo> nonRepeatingFields;

    private List<FieldInfo> nonHeaderFields;

    private List<FieldInfo> nonTrailerFields;

    private List<FieldInfo> nonRequiredFields;

    private List<FieldInfo> nonOptionalFields;

    private List<FieldInfo> nonRepeatingGroupFields;

    private List<FieldInfo> nonRepeatingGroupHeaderFields;

    private List<FieldInfo> nonRepeatingGroupTrailerFields;

    private List<FieldInfo> nonRepeatingGroupRequiredFields;

    private List<FieldInfo> nonRepeatingGroupOptionalFields;

    private List<FieldInfo> nonRepeatingGroupNonHeaderFields;

    private List<FieldInfo> nonRepeatingGroupNonTrailerFields;

    private List<FieldInfo> nonRepeatingGroupNonRequiredFields;

    private List<FieldInfo> nonRepeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupFields;

    private List<FieldInfo> repeatingGroupHeaderFields;

    private List<FieldInfo> repeatingGroupTrailerFields;

    private List<FieldInfo> repeatingGroupRequiredFields;

    private List<FieldInfo> repeatingGroupOptionalFields;

    private List<FieldInfo> repeatingGroupNonHeaderFields;

    private List<FieldInfo> repeatingGroupNonTrailerFields;

    private List<FieldInfo> repeatingGroupNonRequiredFields;

    private List<FieldInfo> repeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupRepeatingFields;

    private List<FieldInfo> repeatingGroupNonRepeatingFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupHeaderFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupTrailerFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRequiredFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupOptionalFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonHeaderFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonTrailerFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonRequiredFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonRepeatingFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupNonRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupHeaderFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupTrailerFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupRequiredFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupOptionalFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonHeaderFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonTrailerFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonRequiredFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupRepeatingFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonRepeatingFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupRepeatingGroupRepeatingGroupNonRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupHeaderFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupTrailerFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRequiredFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupOptionalFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonHeaderFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonTrailerFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonRequiredFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonRepeatingFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupNonRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupHeaderFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupTrailerFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupRequiredFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupOptionalFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonHeaderFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonTrailerFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonRequiredFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonOptionalFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupRepeatingFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonRepeatingFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupRepeatingGroupFields;

    private List<FieldInfo> repeatingGroupNonRepeatingGroupRepeatingGroupNonRepeatingGroupFields;

    private List