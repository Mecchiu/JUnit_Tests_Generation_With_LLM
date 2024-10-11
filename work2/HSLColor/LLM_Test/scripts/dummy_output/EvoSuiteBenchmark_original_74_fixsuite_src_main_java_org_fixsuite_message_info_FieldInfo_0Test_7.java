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
		
	@Test
	public void testIsRequiredInComponent_1() throws Exception {

        // GIVEN
        ComponentInfo component = new ComponentInfo();
        component.setType("FOO");
        
        // WHEN
        boolean result = FieldInfo.isRequiredInComponent(component);

        // THEN
        assertFalse(result);
	}

	public static class ComponentInfo {

		@Field
		String type;

		public String getType() {
			return type;
		}
	}
}