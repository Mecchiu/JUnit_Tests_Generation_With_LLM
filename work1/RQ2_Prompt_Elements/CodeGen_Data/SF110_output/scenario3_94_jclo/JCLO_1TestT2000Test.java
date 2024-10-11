// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {

	/**
     * Create and usage message for the acceptable command line options.
     *
     * @return a String that specifies acceptable options
     */
    @Test
    void usage_1() {
        assertFalse(Modifier.isStatic(JCLO.class.getModifiers()));
        assertFalse(Modifier.isAbstract(JCLO.class.getModifiers()));
        assertNotNull(JCLO.class.getName());
        assertNotNull(JCLO.class.getSimpleName());
        assertEquals(1, JCLO.class.getModifiers());
	}
}

// JCLO_2Test.java
