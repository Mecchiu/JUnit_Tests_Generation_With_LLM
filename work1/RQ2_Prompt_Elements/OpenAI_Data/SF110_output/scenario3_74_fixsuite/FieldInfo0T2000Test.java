// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfoTest {

	@Test
	void testIsRequiredInComponent() {
		
		// Test case 1
		FieldInfo fieldInfo = new FieldInfo();
		ComponentInfo componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 2
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 3
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 4
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 5
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 6
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 7
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 8
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 9
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 10
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
	}
}

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
        return component.getRequiredFields().contains(this);
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfoTest {
		
	@Test
	void testIsRequiredInComponent() {
		
		// Test case 1
		FieldInfo fieldInfo = new FieldInfo();
		ComponentInfo componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 2
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 3
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 4
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 5
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 6
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 7
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 8
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 9
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 10
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
	}
}

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
        return component.getRequiredFields().contains(this);
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfoTest {
		
	@Test
	void testIsRequiredInComponent() {
		
		// Test case 1
		FieldInfo fieldInfo = new FieldInfo();
		ComponentInfo componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 2
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 3
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 4
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 5
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 6
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 7
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 8
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		
		// Test case 9
		fieldInfo = new FieldInfo();
		componentInfo = new ComponentInfo();
		assertTrue(