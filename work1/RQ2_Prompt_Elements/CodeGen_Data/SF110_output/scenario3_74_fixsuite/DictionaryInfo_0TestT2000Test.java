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

	List<DictionaryInfo_0TestTestClass> testCases = new ArrayList<DictionaryInfo_0TestTestClass>(); 

	@Test
	void testGetField() {
		testCases.add(new DictionaryInfo_0TestTestClass(null));
		testCases.add(new DictionaryInfo_0TestTestClass("null"));
		testCases.add(new DictionaryInfo_0TestTestClass("NULL"));
		testCases.add(new DictionaryInfo_0TestTestClass("test"));
		testCases.add(new DictionaryInfo_0TestTestClass("NULLNULL")); 
	}

	@Test
	void testToDictionary() {
		for (DictionaryInfo_0TestTestClass testCase : testCases) {
			testCase.testToDictionary();
		}
	}
		
	class DictionaryInfo_0TestTestClass {
		
		/**
		 * Create a new instance of the test class by the given tag
		 *
		 * @param value - the tag number of the field value to store
		 */
	   DictionaryInfo_0TestTestClass(String value) {
	   	_value = value;
   	}
		public String getTagNumber() {
			return _value;
		}
		public void setTagNumber(String value) {
			_value = value;
		}

		public String toString() {
			String messageInfo = "\n<dict-info>\nmaintainer: " + getTagNumber() + "\n";
			return messageInfo;
		}

		private String _value;
	}
	
}
