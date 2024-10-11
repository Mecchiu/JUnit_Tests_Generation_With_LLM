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
		
	/**
	 * Simple test of {@link FieldInfo#isValidValue(String)}.
	 */
	@Test
	public void isValidValueTest() {
		String value = "value";
		boolean result = "true".equals(FieldInfo_1Test.isValidValue(value));
		assertEquals(true, result);
	}
	
	/**
	 * Tests the {@link FieldInfo#getValidValues}  method.
	 */
	@Test
	public void validValuesTest() {
		String value = "bob";
		TreeMap<String, ValueInfo> expectedResults = new TreeMap<>();
		expectedResults.put("name", new ValueInfo(value));
}
}