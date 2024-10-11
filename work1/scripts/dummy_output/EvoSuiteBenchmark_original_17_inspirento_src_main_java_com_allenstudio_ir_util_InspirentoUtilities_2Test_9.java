// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {
		
    @Test
    public void test__2() {        
        String str = "Hallo";
        String source = "/1.txt";
        StringBuffer b = new StringBuffer(source);
        b.replaceAll(".", "");          // remove the. at first
        String rep = stringReplaceAll(b, '.', str);// replace with the string that contains
        assertEquals("/1.txt", rep);

        str = "Hallo.Hallo.";
        source = "/1.txt";
        b = new StringBuffer(source);
        b.replaceAll(".", ""); // replace with the string that contains
        assertEquals("/1.txt", stringReplaceAll(b, '.', str));

        str = "Hallo.Fähig.Hallo.Hallo.Hallo.Hallo.Hallo.";
        source = "/1.txt";
        b = new StringBuffer
            (source.replaceAll("/", "."));
        b.replaceAll(".", ""); // remove the. at first
        assertEquals("Hallo.Fähig.Hallo.Hallo.Hallo.Hallo.Hallo.Hallo.Hallo.Hallo.Hallo.Hallo.",
                      stringReplaceAll(b, '/',str));
    }

}