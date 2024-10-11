// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfoTest {
		
	@Test
	void testGetComponent() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		ComponentInfo componentInfo = dictionaryInfo.getComponent(1);
		assertEquals(componentInfo.getId(), 1);
	}
}