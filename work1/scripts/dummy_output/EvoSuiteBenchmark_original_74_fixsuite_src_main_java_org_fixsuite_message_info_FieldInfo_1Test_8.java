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
		private static final String TEST_VALUE = "value of test";
		
		// ====================================================
		// fields
		// ====================================================
	/**
	 * Creates a list containing a value for all the supported fields.
	 * @return a list containing a value for all the supported fields.
	 */
		private static List<String> createValue() {
			List<String> values = new ArrayList();
			for(FieldInfo.FieldInfo.EnumInfo field: FieldInfo.FieldInfo.FieldInfo.values()) {
				values.add(field.getValue().toString());
			}
			return values;
		}

	// ====================================================
	// methods
//	// ====================================================
}