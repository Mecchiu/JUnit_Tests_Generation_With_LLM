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
/* Test String tokenize */
	@Test
	void tokenizeTest(){
		System.out.println("tokenizeTest");

		String[] cmds = InspirentoUtilities.tokenize("A-B-C-D-E-F-G-H!");
		assertArrayEquals(cmds,"A B C D E F G H!");

		cmds = InspirentoUtilities.tokenize("A--B--C--D--E--F--G--H!");
		assertArrayEquals(cmds,"A--B--C--D--E--F--G--H!");
	}
}
