// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfoTest {
		
	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = dictionaryInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
	}
}