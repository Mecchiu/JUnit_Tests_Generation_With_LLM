// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		@Test
	public void test() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
			DictionaryInfo_1Test testInfo = new DictionaryInfo_1Test("2");

			assertEquals(dictionaryInfo.getVersion(), testInfo.getVersion());
			assertEquals(dictionaryInfo.isLoaded(), testInfo.isLoaded());
			assertNotNull(dictionaryInfo.getMessages());
			assertNotNull(testInfo.getMessages());
	}

}