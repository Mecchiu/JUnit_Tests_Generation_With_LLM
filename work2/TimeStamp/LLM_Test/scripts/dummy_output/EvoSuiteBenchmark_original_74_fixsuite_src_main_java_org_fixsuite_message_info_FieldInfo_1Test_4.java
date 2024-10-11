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
     * Test case for {@link FieldInfo#isValidValue(String)}.
     * It throws an {@link IllegalArgumentException} if the given parameter is {@code null}.
     */
    @Test
    public void testIsValidValue() {
        try {
            FieldInfo.isValidValue(null);
            fail("An IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }
	
    @Test
    public void testGetName() {
        assertNotNull(FieldInfo.getName());
    }

    @Test
    public void testSetName() {
        FieldInfo f = new FieldInfo();
}
}