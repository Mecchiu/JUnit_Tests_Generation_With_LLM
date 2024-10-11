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
		
    @Test
    void test() {
        assertEquals(null, null);
        assertEquals("", "");
        assertEquals(" ", " ");
        assertEquals("\n", "\n");
        assertEquals(" \t", "\t");
    }
}