// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {
		/**
		* Checks the correct execution of escapeText when
		* passed an empty source string.
		*/
    @Test
    void testEscapeAsSource_0() {
        String source = newString(" ");
        String expected = "&#92;";
        assertEquals(expected,
                     SwingUtilities.substring(source, 0, expected.length()));
    }

    /**
     * Checks the correct execution of escapeText when
     * passed a source string with characters to be replaced.
     */
    @Test
    void testEscapeAsSource_1() {
        String source = newString("Hello world!");
        String expected = "Hello world!&#92;";
        assertEquals(expected,
                     SwingUtilities.substring(source, expected.length()));
    }

// Supplementary classes.
    private static String newString(String string) {
        StringBuffer buf = new StringBuffer(string);
        return buf.toString();
    }
}