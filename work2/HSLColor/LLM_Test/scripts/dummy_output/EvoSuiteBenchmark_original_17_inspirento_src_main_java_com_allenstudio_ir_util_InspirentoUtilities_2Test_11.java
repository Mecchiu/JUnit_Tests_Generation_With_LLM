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
		
  @org.junit.jupiter.api.Test
	void testStringReplaceAll() {
		
		assertEquals("", stringReplaceAll("", 'a', ""));
		assertEquals("abc", stringReplaceAll("abcabc", 'a', "abc"));
		assertEquals("abcabcabcabcabc", stringReplaceAll("abcabcabcabcabc", 'a', "cabegoefg"));
		assertEquals("abcdef", stringReplaceAll("abcde", 'a', "d"));
		
	}
	
}