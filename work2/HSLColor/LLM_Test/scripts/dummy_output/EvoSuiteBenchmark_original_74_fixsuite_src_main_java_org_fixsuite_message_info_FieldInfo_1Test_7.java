// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {
		
	@Test
	public void test2() {
		TreeMap map = new TreeMap<String, ValueInfo>();
		map.put("text",new ValueInfo("text","text").setValidValue(false));
		map.put("number",new ValueInfo("number","number").setValidValue(true));
		map.put("binary",new ValueInfo("binary","binary").setValidValue(true));
		assertFalse(FieldInfo.isValidValue("text"));
		assertFalse(FieldInfo.isValidValue("number"));
		assertTrue(FieldInfo.isValidValue("binary"));
	}

	@Test
	public void test3() {
		List<Integer> list = new ArrayList<Integer>();
}
}