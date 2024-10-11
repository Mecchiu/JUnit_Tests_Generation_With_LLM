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
		
	private static final Vector<String> DEFAULT_STRING_VECTOR = new Vector<String>();

	static {
		DEFAULT_STRING_VECTOR.add("");
	}
	
	@Test
	void testStringReplaceAll() {
		StringBuffer source = new StringBuffer();
		StringBuffer target = new StringBuffer();
		for(int i = 0; i<DEFAULT_STRING_VECTOR.size(); i++) {
			source.append("hello");
			source.append(DEFAULT_STRING_VECTOR.elementAt(i).charAt(0));
			source.append("there");
			source.append(DEFAULT_STRING_VECTOR.elementAt(i).substring(1, DEFAULT_STRING_VECTOR.elementAt(i).length()-1));
		}

		StringBuffer expected = new StringBuffer();
		for (int token = 0; token < source.length(); token++) {
			expected.append(source.charAt(token));
		}

		String expectedValue = String.valueOf(expected);

		assertEquals(expectedValue, new InspirentoUtilities().stringReplaceAll(source, 'h', "hello"));
		for (int token = 1; token < target.length(); token++) {
			assertFalse(target.charAt(token) == expected.charAt(token));
		}
		assertEquals(expectedValue + " +++++++++*", stringReplaceAll(source, 'h', "hello"));
	}

}

//InspirentoUtils.java