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
		
	/*
	 * FieldInfo.java
	 */
	FieldInfo_1Test(){
		super();
	}
	
	/**
	 * Test method for {@link FieldInfo#isValidValue(String)}.
	 * <b>Test Method</b><br>
	 * <b>Description: </b>The method to test verifies if the values are valid in the specified component.
	 * It compares the validValues Map to the values in the test method given by {@link FieldInfo#toString()}.
	 */
	@Test
	public void testIsValidValueBooleanValue() {
		List<String> validValues = new ArrayList<>();

		FieldInfo_1Test.validValues = new TreeMap<>();

}
}