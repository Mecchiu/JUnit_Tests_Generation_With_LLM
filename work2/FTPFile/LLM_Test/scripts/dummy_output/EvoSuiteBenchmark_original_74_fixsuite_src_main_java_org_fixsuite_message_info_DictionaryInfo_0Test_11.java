// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		
 	private static final String MESSAGE = "FIX.4.2";
 	private static final String MESSAGE_ID = "FIX.4.2.11131510";

		@Test
		public void getField_0() throws Exception {
			System.out.println("getField_0");
			FieldInfo fieldInfo;
			fieldInfo = DictionaryInfo.getField(MESSAGE);
			assertTrue(fieldInfo!= null);
		}
		// End of tests
		@Test
		public void hasField_0() throws Exception {
                           assertTrue(DictionaryInfo.hasField(MESSAGE_ID));
		}
		@Test
		public void getAllFields_0() throws Exception {
			System.out.println("getAllFields_0");
			FieldInfo fieldInfo;
			List list = new ArrayList();
			fieldInfo = DictionryInfo.getField(MESSAGE_ID, list, MESSAGE);
			assertTrue(fieldInfo!= null);
		}
		// End of tests
		@Test
		public void getDefaultField_0() throws Exception {
			System.out.println("getDefaultField_0");
			FieldInfo fieldInfo;
			fieldInfo = DictionryInfo.getField(MESSAGE_ID, list);
			assertEquals(MESSAGE, fieldInfo.getName());
			assertEquals(MESSAGE_ID, DictionryInfo.getInfoTag(fieldInfo));
		}
		@Test
		public void hasField_0_asDictionaryItem() throws Exception {
			System.out.println("hasField_0 as dictionary item");
			assertTrue(DictionaryInfo.hasField(DictionaryInfo_0.MESSAGE_ID));
			DictionaryInfo_0.MESSAGE_VALUE = null;
			DictionaryInfo.MESSAGE_ID = null;
			DictionaryInfo.getField(MESSAGE);
			assertEquals(null, DictionaryInfo.MESSAGE_VALUE);
			DictionaryInfo.MESSAGE_VALUE = MESSAGE;
			DictionaryInfo.getField(DICTIONARY_INFO.NAME);
			assertEquals(MESSAGE_ID, DictionaryInfo.MESSAGE_VALUE);
			DictionaryInfo_0.MESSAGE_VALUE = null;
			DictionaryInfo.MESSAGE_VALUE = null;
			DictionryInfo.MESSAGE_VALUE = null;
			DictionaryInfo.MESSAGE = MESSAGE;
		}
		@Test
		public void containsFieldWithID_0() throws Exception {
			System.out.println("containsFieldWithID_0");
			DictionaryInfo_0.MESSAGE_VALUE = MESSAGE;
			assertTrue(DictionaryInfo.containsFieldWithID(MESSAGE, MESSAGE_ID));
			assertFalse(DictionaryInfo.containsFieldWithID(MESSAGE, DICTIONARY_INFO.NAME));
			DictionaryInfo.MESSAGE_VALUE = null;
			DictionaryInfo.MESSAGE = null;
		}
		@Test
		public void getAllFields_0_asList() throws Exception {
			System.out.println("getAllFields_0 as list");
			List list = new ArrayList();
			list.add(MESSAGE_ID);
			Object entry;
			entry = list.iterator().next();
			DictionaryInfo.getFields();
		}
		@Test
		public void containsFieldWithName_0() throws Exception {
			System.out.println("containsFieldWithName_0");
       assertTrue(DictionaryInfo.containsFieldWithName(MESSAGE_ID, MESSAGE));
		}
		@Test
		public void containsFieldWithTagNumber_0() throws Exception {
        assertTrue(DictionaryInfo.containsFieldWithTagNumber(MESSAGE_ID, MESSAGE_TAG));
			assertTrue(DictionaryInfo.containsFieldWithTagNumber(MESSAGE_TAG, MESSAGE));
		}
}