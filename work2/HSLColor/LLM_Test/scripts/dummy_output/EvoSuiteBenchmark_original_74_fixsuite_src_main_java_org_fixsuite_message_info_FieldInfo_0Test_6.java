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
		
	// Field name
	private String fieldName;
		
	// Modifiers
	private int mods;

	public FieldInfo_0Test() {
	
	}

	/**
	 * Test constructor.
	 */
	@Test (expected = NullPointerException.class)
	public void test_1_constructor2() {
		new FieldInfo(null);
	}

	/**
	 * Test constructor.
	 */
	@Test (expected = NullPointerException.class)
	public void test_2_constructor() {
		new FieldInfo(new FieldInfo(null));
	}

	/**
	 * Test constructor without field name.
	 */
}