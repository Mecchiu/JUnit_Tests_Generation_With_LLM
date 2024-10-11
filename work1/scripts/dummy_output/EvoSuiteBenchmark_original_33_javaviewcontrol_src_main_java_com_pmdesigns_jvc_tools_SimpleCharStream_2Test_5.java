// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
		/**
         * A unit test.
         */
    @Test
	public void testConstructor() throws Exception {
    	boolean rtn = true;
    	// String input = "Abc.de.";
        SimpleCharStream ts = new SimpleCharStream(new char[]{'1','2','3'}, "en_US", 0, 4);
        assertEquals("en_US", ts.toString());
        String input = "Abc.de.";
        SimpleCharStream ts1 = new SimpleCharStream(new byte[]{(byte)0xc2,(byte)0xa9}, "en_US", 0, 5);
        assertEquals("en_US", ts1.toString());
    }

    /**
     * A unit test.
     */
    @Test
	public void testDirectNr() throws Exception {
    	boolean rtn = true;
    	char c = '1';
        SimpleCharStream ts = new SimpleCharStream(new char[]{c}, "US", 0, 3);
        assertEquals("US", ts.toString());
        c = '2';
        ts = new SimpleCharStream(new char[]{c}, "US", 0, 3);
        assertEquals("US", ts.toString());
        return;
    }

	
}