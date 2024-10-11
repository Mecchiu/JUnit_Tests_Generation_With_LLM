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
// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a Field as defined by the FIX specification.
 *
 * @author jramoyo
 */
public class FieldInfo implements FixInfo {

    /**
     * Returns whether this field is required in the specified component
     *
     * @param component - a component
     * @return whether this field is required in the specified component
     */
    public boolean isRequiredInComponent(ComponentInfo component) {
        if (requiringComponents!= null) {
            return requiringComponents.contains(component);
        } else {
            return false;
        }
    }
}

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
		private FieldInfo field;
		private List<ComponentInfo> components;

		class FieldInfo_0 extends FieldInfo {
			public void addField(String componentId, String name, String type) {

			}
		}
		

		List<ComponentInfo>  getComponents() {
			return this.components;
		}

		@Test
		public void testIsRequiredInComponent_nullParameter() {
			assertEquals(false, new FieldInfo_0().isRequiredInComponent(null));
		}
		
        @Test
		public void testIsRequiredInComponent_notNullParameter() {
            new FieldInfo_0().addField("COMPONENT-ID", "AaD", "STRING");
			assertEquals(false, new FieldInfo_0().isRequiredInComponent("COMPONENT-ID"));
		}
		
        @Test
		public void testIsRequiredInComponent_notNullParameter_notRequired() {
			new FieldInfo_0().addField("COMPONENT-ID", "AaD", "STRING");
			assertEquals(true, new FieldInfo_0().isRequiredInComponent("COMPONENT-ID"));
		}
}
