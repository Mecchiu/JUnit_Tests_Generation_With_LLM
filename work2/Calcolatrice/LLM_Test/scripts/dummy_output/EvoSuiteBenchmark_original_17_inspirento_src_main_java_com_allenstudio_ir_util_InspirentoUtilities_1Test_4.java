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
    public void testGetEscapeText() {
            String str = "Hello";
            String ret;

            ret = InspirentoUtilities.escapeText(str);
            assertEquals("The \"Hello\" string doesn't need any escaping.", ret, str);
	
            str = "Hello, World!";
            ret = InspirentoUtilities.escapeText(str);
            assertEquals("The \"Hello, World!" string doesn't need any escaping.", ret, str);
    }
    @Test
    public void testEquals() {
        assertEquals(true, new InspirentoUtilities_1Test().equals(new InspirentoUtilities_1Test()));
    }
    @Test
    public void testHashCode() {
        int ret;

        ret = new InspirentoUtilities_1Test().hashCode();
        assertEquals(0xd5678801, ret);
    }
     
	@Test
    public void testConstructor() {
        assertNotNull(new InspirentoUtilities_1Test());
    }
    @Test
    public void testGetEscapeTextNumerix() {
        Object ret;
        int num;

        ret = InspirentoUtilities.getEscapeTextNumerix("Hello, World! ");
        assertEquals("", ret);
        
        num = 1;

        ret = InspirentoUtilities.getEscapeTextNumerix(num);
        assertEquals("Hell%0c World! ", ret);

        num = 10;

        ret = InspirentoUtilities.getEscapeTextNumerix(num);
        assertEquals("Hell%0c World! ", ret);

        num = 5;

        ret = InspirentoUtilities.getEscapeTextNumerix(num);
        assertEquals("Hell%0c World! ", ret);

        num = 3;

        ret = InspirentoUtilities.getEscapeTextNumerix(num);
        assertEquals("%Hell%0c World! ", ret);

        num = -1;

        ret = InspirentoUtilities.getEscapeTextNumerix(num);
        assertFalse("There's no escaping at all.", ret.equals(num));

        str = "Hello, World!";

        int num2 = 1;

        ret = InspirentoUtilities.getEscapeTextNumerix(str, num2);
        assertEquals("", ret);

        str = "Hello, World!";

        Vector<Integer> numer = new Vector<Integer>();

        for (int j = 1; j <= str.length(); j++) {
            numer.add(new Integer(str.substring(j, j + 1)));
        }

        num = 1;

        ret = InspirentoUtilities.getEscapeTextNumerix(str, num);
        assertEquals("", ret);

        str = "Hell%0c World! %1c World! Ohm";

        num = 1;

        n = 0;

        ret = InspirentoUtilities.getEscapeTextNumerix(ret, num, numer, num);
        assertEquals("Hell%0c World%12c World%18c World Ohm%0c World! ", ret);
        
        num = 5;

        ret = InspirentoUtilities.getEscapeTextNumerix(str, num, numer, num);
        assertEquals("Hello %1c World%06c World%18c World Ohm%0c World! ", ret);

        str = "Hello, World!";

        num = 0;

        n = 0;

        ret = InspirentoUtilities.getEscapeTextNumerix(str, num, numer, num);
        assertEquals("Hello, World!", ret);
    }
}