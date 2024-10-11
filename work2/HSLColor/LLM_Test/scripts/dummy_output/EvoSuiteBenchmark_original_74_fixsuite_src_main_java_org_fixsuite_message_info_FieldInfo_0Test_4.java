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
		/**
		* Tests whether the ValueInfo is required in a given component when a field is required
		*/
	@Test
	void isRequiredInComponentWhenRequired() {
		FieldInfo fi = new FieldInfo();
		assertFalse(fi.isRequiredInComponent(new ComponentInfo(FIELD_NAME, false)));

		ComponentInfo ci = new ComponentInfo(FIELD_NAME, true);
		fi.addRequiredComponentValue(ci);
		assertTrue(fi.isRequiredInComponent(ci));
	}

	/**
		* Tests whether the ValueInfo has required components
		*/
	@Test
	void hasRequiredComponents() {
		FieldInfo fi = new FieldInfo();
		assertTrue(fi.hasRequiredComponents());
	}
}