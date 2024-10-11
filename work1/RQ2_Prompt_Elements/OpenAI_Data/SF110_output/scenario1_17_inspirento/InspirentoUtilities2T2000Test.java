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
		char token = 'a';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains no token.
	*/
	@Test
	void testStringReplaceAll2() {
		StringBuffer source = new StringBuffer("abc");
		char token = 'd';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("abc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains only one token.
	*/
	@Test
	void testStringReplaceAll3() {
		StringBuffer source = new StringBuffer("a");
		char token = 'a';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("b");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll4() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'a';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("bbbbcc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll5() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'b';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("aabbcc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll6() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'c';
		String replacement = "b";
		StringBuffer expected = new StringBuffer("aabbbb");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll7() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'a';
		String replacement = "";
		StringBuffer expected = new StringBuffer("bbcc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll8() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'b';
		String replacement = "";
		StringBuffer expected = new StringBuffer("aacc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll9() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'c';
		String replacement = "";
		StringBuffer expected = new StringBuffer("aabb");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case when the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll10() {
		StringBuffer source = new StringBuffer("aabbcc");
		char token = 'a';
		String replacement = "bb";
		StringBuffer expected = new StringBuffer("bbbbbbcc");
		StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(expected.toString(), actual.toString());
	}
}