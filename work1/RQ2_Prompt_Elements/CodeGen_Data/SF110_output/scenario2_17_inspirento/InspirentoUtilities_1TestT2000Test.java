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
    private boolean assertThrows(int c, String msg) {
		        try {
		            stringReplaceAll(new StringBuffer(
		                    "&"+c+
		                    "<"+c+
		                    ">"+c+
		                    "&"+c
		                ),
		                "&","&amp;");
		            assertFalse(true);
		        } catch (Exception e) {
		            assertEquals(e.getMessage(), msg);
		            return true;
		        }
		        return false;
		    }
		    @Test
		    public void test() {
		        if (!assertThrows('&', "invalid character '&'" )) {
		            return;
		        }
		        String str = "&nbsp;&rsquo;&lt;&gt;&apos;";
                String actual = InspirentoUtilities.escapeText(str);
		        String expected = "<nbsp><small>&rsquo;&lt;&gt;&apos;</small></nbsp>";
                assertEquals(expected, actual);
		    }
}
