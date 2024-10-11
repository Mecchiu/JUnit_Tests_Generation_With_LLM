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
		
	/**
	 * Class constructor.
	 */
	public InspirentoUtilities_2Test() {
	}

	/**
	 * Tests the method that wraps a call to {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} with the expected
	 * and actual parameter values.
	 *
	 * Asserts that the string and the replace of a token is as expected.
	 *
	 * Asserts that the string and the replace of a token are as expected and that they have to
	 * be separated by the same character.
	 */
	@Test
	public void testStringReplaceAll(){
		StringTokenizer tok = new StringTokenizer(
				"1,2,3", ",");
		Vector<String> v;
		while(tok.hasMoreTokens()){
			v = new Vector<String>(tok.nextToken());
			String expected = v.elementAt(0);
			String actual = v.elementAt(1);
			if (!expected.equals(actual))
				throw new AssertionError("\nExpected=" + expected + ",Actual=" + actual);
		}
		String actual = v.elementAt(0);
		assertNull("Expecting an error during the call to stringReplaceAll", actual);
		String actual = v.elementAt(1);
		assertNotNull( "Actual string should have been empty", actual );
		v = new Vector<String>(v.elementAt(2));
		if (!v.elementAt(1).equals("0-"))
			throw new AssertionError("\nExpected empty string after the call,\nActual string=" + v.elementAt(0) + "\n" + v.elementAt(1));
		v = new Vector<String>(v.elementAt(3));
		assertEquals("\nExpected empty string after the call,\nActual string=" + v.elementAt(0) + "\n" + v.elementAt(1), v.elementAt(2));
		v = new Vector<String>(v.elementAt(2));
		if (!v.elementAt(1).equals("0-"))
			throw new AssertionError("\nExpected empty string after the call,\nActual string=" + v.elementAt(0) + "\n" + v.elementAt(1));
		v = new Vector<String>(v.elementAt(3));
		assertEquals("\nExpected an empty string after the call,\nActual string=" + v.elementAt(0) + "\n" + v.elementAt(1), v.elementAt(2));
	}

}