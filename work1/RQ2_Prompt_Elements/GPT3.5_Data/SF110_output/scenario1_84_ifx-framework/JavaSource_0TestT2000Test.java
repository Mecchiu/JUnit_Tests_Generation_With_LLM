// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JavaSource}.
 * It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
 */
class JavaSource_0Test {

    @Test
    void testHasInterfaceReturnsTrueWhenInterfaceExists() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("MyInterface");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasInterfaceReturnsFalseWhenInterfaceDoesNotExist() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasInterface());
    }

    // add more test cases here
}