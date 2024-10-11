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
		* Test method for
		* {@link DictionaryInfo#getMessage(String)}.
		*/
		@Test
		public void testGetMessage() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo(null);
			String msg = dictionaryInfo.getMessage(null).getBody();
			assertNotNull(msg);
			assertTrue(msg.endsWith("Field 0 is not being specified."));
		}
}