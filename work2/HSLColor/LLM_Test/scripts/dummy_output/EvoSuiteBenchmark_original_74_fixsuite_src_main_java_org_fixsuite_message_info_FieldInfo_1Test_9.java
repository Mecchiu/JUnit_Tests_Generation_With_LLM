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
		private static final String NAME = "NAME";
    static {
        System.out.println("Name:" + NAME);
    }

    /**
    * Fills the test case with the above name.
    * <code>
    *   {this.NAME = xxxx}
    * </code>
    *
    * @param name - the name to set
    */
    FieldInfo_1Test(String name) {
        System.out.println("Name:" + name);
    }

    /**
    * Tests if the field "NAME" of the object "this" has a correct one: {@link #NAME}
    */
    @Test
    void testValueOf_Name() {
        assertEquals("Xxxx", this.NAME);
}
}