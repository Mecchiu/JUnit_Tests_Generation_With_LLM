// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilitiesTest {
		
	/**
	* Test case 1 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is empty.
	*/
	@Test
	void testStringReplaceAllCase1() {
		StringBuffer source = new StringBuffer("");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, ' ', " ");
		assertEquals(source, result);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is null.
	*/
	@Test
	void testStringReplaceAllCase2() {
		StringBuffer source = null;
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, ' ', " ");
		assertEquals(source, result);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is not in the source string.
	*/
	@Test
	void testStringReplaceAllCase3() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, ' ', " ");
		assertEquals(source, result);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase4() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', " ");
		assertEquals(new StringBuffer(" bc"), result);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase5() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'b', " ");
		assertEquals(new StringBuffer("a c"), result);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase6() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'c', " ");
		assertEquals(new StringBuffer("ab "), result);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase7() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', " ");
		assertEquals(new StringBuffer(" bc"), result);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase8() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'b', " ");
		assertEquals(new StringBuffer("a c"), result);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase9() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'c', " ");
		assertEquals(new StringBuffer("ab "), result);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is not empty and the token is in the source string.
	*/
	@Test
	void testStringReplaceAllCase10() {
		StringBuffer source = new StringBuffer("abc");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', " ");
		assertEquals(new StringBuffer(" bc"), result);
	}
}