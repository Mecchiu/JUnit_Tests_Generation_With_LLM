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
		String source = "A\\u007F\\u0092\\u0080\\l\\u0022\\t\\u007C\\u0026\\u0026\\u0023\\u0020\\b\\u0021\\n\\u0007\\r\\z\\a";
		StringBuffer escaped = new StringBuffer(source);
		String result = InspireUtilities.escapeText(source);

    @Test
    public void escapedText() {
        assertEquals(source, result);
    }
}