// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
		List<DictionaryInfo_2Test.DictionaryInfo_2Test_FieldInfo> messages;
	DictionaryInfo_2Test() {
		messages = new ArrayList<>(1);
		DictionaryInfo_2Test.messages.add(new DictionaryInfo_2Test.DictionaryInfo_2Test_FieldInfo("id",
			new int[0],
			new int[0],
			new FieldInfo[]{new FieldInfo("name", "n", 8), new FieldInfo("age", 4, 4),
				new FieldInfo("height", 32, 0)}
				));
	}

	/**
	 * Tests the getField(int) method, that gets an existing FieldInfo
	 */
	@Test
	public void test_getComponent() {
		assertNotNull(messages.get(0).getComponent(0));
	}

	//DictionaryInfo_2Test.DictionaryInfo_2Test_FieldInfo
}