// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilitiesTest {
		
	/**
	* Test case 1 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing no special characters.
	*/
	@Test
	void testEscapeText1() {
		String str = "abcdefg";
		String expected = "abcdefg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only special characters.
	*/
	@Test
	void testEscapeText2() {
		String str = "&<>\"'";
		String expected = "&amp;&lt;&gt;&quot;&apos;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing both normal and special characters.
	*/
	@Test
	void testEscapeText3() {
		String str = "abc&<>\"'defg";
		String expected = "abc&amp;&lt;&gt;&quot;&apos;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText4() {
		String str = "abc&defg";
		String expected = "abc&amp;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText5() {
		String str = "abc<defg";
		String expected = "abc&lt;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText6() {
		String str = "abc>defg";
		String expected = "abc&gt;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText7() {
		String str = "abc\"defg";
		String expected = "abc&quot;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText8() {
		String str = "abc'defg";
		String expected = "abc&apos;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText9() {
		String str = "abc&defg";
		String expected = "abc&amp;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests the method with a string containing only one special character.
	*/
	@Test
	void testEscapeText10() {
		String str = "abc&defg";
		String expected = "abc&amp;defg";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
}