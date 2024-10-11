// DictionaryInfoTest.java
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
class DictionaryInfoTest {
		
	@Test
	void testGetMessage() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		MessageInfo messageInfo = dictionaryInfo.getMessage(1);
		assertEquals(1, messageInfo.getId());
	}
}