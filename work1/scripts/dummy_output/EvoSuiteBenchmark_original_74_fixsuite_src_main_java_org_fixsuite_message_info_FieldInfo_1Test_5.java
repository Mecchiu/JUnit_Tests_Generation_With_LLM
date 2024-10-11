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
		 * It tests the isValidValue function of the {@link FieldInfo} object.
		*/
		@Test
		public void isValidValue_1() {
			// BEGIN findbugs

			int tagNumber = 1;
			String name = "";
			String dataType = "";
			String description = "";
			String abbreviation = "";
			String overrideXmlName = "";
			String baseCategory = "";
			String baseCategoryXmlName = "";
			boolean isNotRequiredXml = false;
			boolean isRequired = false;
			String deprecatingVersion = "";

			// END findbugs

			byte byte_array[] = new byte[12];

			byte_array[0] = 0;
}
}