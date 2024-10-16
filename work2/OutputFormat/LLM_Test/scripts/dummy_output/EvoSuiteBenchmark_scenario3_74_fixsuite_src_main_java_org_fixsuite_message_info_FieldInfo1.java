// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testIsValidValue() {
		FieldInfo fieldInfo = new FieldInfo();
		assertTrue(fieldInfo.isValidValue(""));
		assertTrue(fieldInfo.isValidValue("1"));
		assertTrue(fieldInfo.isValidValue("2"));
		assertTrue(fieldInfo.isValidValue("3"));
		assertTrue(fieldInfo.isValidValue("4"));
		assertTrue(fieldInfo.isValidValue("5"));
		assertTrue(fieldInfo.isValidValue("6"));
		assertTrue(fieldInfo.isValidValue("7"));
		assertTrue(fieldInfo.isValidValue("8"));
		assertTrue(fieldInfo.isValidValue("9"));
	}
}