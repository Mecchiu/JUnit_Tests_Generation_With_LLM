// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {
		private static final int SIZE = 19;
		private static TreeMap<String, ValueInfo[]> validValuedComponents =
				new TreeMap<String, ValueInfo[]>();
		private static TreeMap<String, ValueInfo[]> invalidValuedComponents = new TreeMap<String, ValueInfo[]>();

	/**
	* Modifies the List of validValues
	*
	* @param validValues - the validValues to set
	*/
	static void initializeValueList(List<CompositeComposite.ComponentInfo> validValues,
				String tagString,
				int length) {
		// 1. Create and populate a list with at least a single empty value.
		ValueInfo value;
}
}