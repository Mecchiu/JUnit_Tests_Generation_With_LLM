// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
		Test test = new Test();
		/**
		* <code>tokenize(String)</code> method
    * 
		* @throws Exception
    * if the test fails.
    */
	@Test
	public void testTokenize( ) throws Exception {
		String s = "file edit view";
		String[] split = tokenize(s);
		assertEquals(split.length, 6);
		assertTrue(split[0].equals("file"));
		assertTrue(split[1].equals("edit"));
		assertTrue(split[2].equals("view"));
		assertTrue(split[3].equals(""));
		assertTrue(split[4].equals(""));
		assertTrue(split[5].equals(""));
	}
		
		@SuppressWarnings("unchecked")
		String[] split = tokenize("");
	}