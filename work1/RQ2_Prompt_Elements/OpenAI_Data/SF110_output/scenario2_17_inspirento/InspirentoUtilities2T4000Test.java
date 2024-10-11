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
	* It tests the case when the source string is empty.
	*/
	@Test
	void testStringReplaceAll1() {
		StringBuffer source = new StringBuffer("");
		StringBuffer expected = new StringBuffer("");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll2() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll3() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll4() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll5() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll6() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll7() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll8() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll9() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll10() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(expected.toString(), actual.toString());
	}
}