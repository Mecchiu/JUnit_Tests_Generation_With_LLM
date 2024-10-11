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
	void testStringReplaceAll1() {
		StringBuffer source = new StringBuffer("");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(source, result);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll2() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "b");
		assertEquals(new StringBuffer("b"), result);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll3() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bb");
		assertEquals(new StringBuffer("bb"), result);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll4() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbb");
		assertEquals(new StringBuffer("bbb"), result);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll5() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbb");
		assertEquals(new StringBuffer("bbbb"), result);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll6() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbbb");
		assertEquals(new StringBuffer("bbbbb"), result);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll7() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbbbb");
		assertEquals(new StringBuffer("bbbbbb"), result);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll8() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbbbbb");
		assertEquals(new StringBuffer("bbbbbbb"), result);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll9() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbbbbbb");
		assertEquals(new StringBuffer("bbbbbbbb"), result);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll10() {
		StringBuffer source = new StringBuffer("a");
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'a', "bbbbbbbbb");
		assertEquals(new StringBuffer("bbbbbbbbb"), result);
	}
}