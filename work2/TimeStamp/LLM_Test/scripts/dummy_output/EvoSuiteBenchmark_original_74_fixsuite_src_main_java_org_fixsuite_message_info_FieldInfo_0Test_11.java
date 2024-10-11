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
		    * Unit test for {@link FieldInfo#isRequiredInComponent(ComponentInfo)}.
		    */
	@Test
	public void test_isRequiredInComponentREQC() {
		FieldInfo fi = new FieldInfo();
		fi.setName("FIELD");
		fi.setLength(500);
		fi.setLength(500);
		fi.setDescription("DESCRIPTION");
		
		assertFalse(fi.isRequiredInComponent(null));
		fi.setName("FIELD");
		assertTrue(fi.isRequiredInComponent(null));
		fi.setName("FIELD");
		assertTrue(fi.isRequiredInComponent(null));
		fi.setLength(500);
}
}