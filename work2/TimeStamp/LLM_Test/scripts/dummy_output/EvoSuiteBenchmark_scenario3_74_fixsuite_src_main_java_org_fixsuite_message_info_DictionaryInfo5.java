// DictionaryInfoTest.java
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
class DictionaryInfoTest {
		
	@Test
	void testGetMessage() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		assertEquals(dictionaryInfo.getMessage("A"), null);
		assertEquals(dictionaryInfo.getMessage("B"), null);
		assertEquals(dictionaryInfo.getMessage("C"), null);
		assertEquals(dictionaryInfo.getMessage("D"), null);
		assertEquals(dictionaryInfo.getMessage("E"), null);
		assertEquals(dictionaryInfo.getMessage("F"), null);
		assertEquals(dictionaryInfo.getMessage("G"), null);
		assertEquals(dictionaryInfo.getMessage("H"), null);
		assertEquals(dictionaryInfo.getMessage("I"), null);
		assertEquals(dictionaryInfo.getMessage("J"), null);
	}
}