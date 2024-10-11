// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {

	/**
	* Test case 1 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is null.
	*/
	@Test
	void testStringReplaceAll_1() {
		StringBuffer source = null;
		char token = 'a';
		String replacement = "b";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertNull(result);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string is empty.
	*/
	@Test
	void testStringReplaceAll_2() {
		StringBuffer source = new StringBuffer("");
		char token = 'a';
		String replacement = "b";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "");
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains no token.
	*/
	@Test
	void testStringReplaceAll_3() {
		StringBuffer source = new StringBuffer("abc");
		char token = 'd';
		String replacement = "b";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "abc");
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains one token.
	*/
	@Test
	void testStringReplaceAll_4() {
		StringBuffer source = new StringBuffer("abc");
		char token = 'a';
		String replacement = "b";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbc");
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_5() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "b";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbcbbc");
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_6() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bcbc");
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_7() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "bb";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbbcbbbc");
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_8() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "bbb";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbbbcbbbbc");
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_9() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "bbbb";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbbbbcbbbbbc");
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	* It tests the case that the source string contains multiple tokens.
	*/
	@Test
	void testStringReplaceAll_10() {
		StringBuffer source = new StringBuffer("abcabc");
		char token = 'a';
		String replacement = "bbbbb";
		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);
		assertEquals(result.toString(), "bbbbbbcbbbbbbc");
	}
}

// InspirentoUtilities_3Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_3Test {
		
	/**
	* Test case 1 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the case that the source string is null.
	*/
	@Test
	void testEscapeText_1() {
		String str = null;
		String result = InspirentoUtilities.escapeText(str);
		assertNull(result);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the case that the source string is empty.
	*/
	@Test
	void testEscapeText_2() {
		String str = "";
		String result = InspirentoUtilities.escapeText(str);
		assertEquals(result, "");
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the case that the source string contains no token.
	*/
	@Test
	void testEscapeText_3() {
		String str = "abc";
		String result = InspirentoUtilities.escapeText(str);
		assertEquals(result, "abc");
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the case that the source string contains one token.
	*/
	@Test
	void testEscapeText_4() {
		String str = "a";
		String result = InspirentoUtilities.escapeText(str);
		assertEquals(result, "&amp;");
	}
	
	/**
	*