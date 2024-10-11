// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		/**
		* Tests the hasSuperClass method and its return values.
		* @throws Exception should not occur
		*/
	@Test
    public void hasSuperClassTest() throws Exception {
        JavaSource jsf = new JavaSource();

        // Test 1
        boolean result = jsf.hasSuperClass(true);

        // Test 2
        boolean result2 = jsf.hasSuperClass(false);

        assertTrue("hasSuperClass returned false", result);
        assertFalse("hasSuperClass returned true", result2);

        // Test 3
        assertTrue(jsf.hasSuperClass(new Class[]{new byte[]{4}}));
        assertFalse(jsf.hasSuperClass(new Class[]{new String[]{"1"}}));

        // Test 4
        assertTrue(jsf.hasSuperClass(new Class[]{null}));
        
        assertTrue(jsf.hasSuperClass(new Class[]{new byte[]{0}}));

        // Test 5
        assertTrue(jsf.hasSuperClass(new Class[]{new Number[]{true}}));
        assertFalse(jsf.hasSuperClass(new Class[]{new Number[]{true}}));
    }

    /**
     * Convenience method since velocity does not support the conditional
     * "== null". Returns true if this class has a superclass else false.
     * @return true if has superclass, else false.
     */
    public boolean hasSuperClassTest() {
        return true;
    }
}