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
	* It tests if the method can escape the & character.
	*/
	@Test
	void testEscapeText1() {
		String str = "&";
		String expected = "&amp;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the < character.
	*/
	@Test
	void testEscapeText2() {
		String str = "<";
		String expected = "&lt;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the > character.
	*/
	@Test
	void testEscapeText3() {
		String str = ">";
		String expected = "&gt;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the " character.
	*/
	@Test
	void testEscapeText4() {
		String str = "\"";
		String expected = "&quot;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the ' character.
	*/
	@Test
	void testEscapeText5() {
		String str = "'";
		String expected = "&apos;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the & character in a string.
	*/
	@Test
	void testEscapeText6() {
		String str = "&amp;";
		String expected = "&amp;amp;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the < character in a string.
	*/
	@Test
	void testEscapeText7() {
		String str = "&lt;";
		String expected = "&amp;lt;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the > character in a string.
	*/
	@Test
	void testEscapeText8() {
		String str = "&gt;";
		String expected = "&amp;gt;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the " character in a string.
	*/
	@Test
	void testEscapeText9() {
		String str = "&quot;";
		String expected = "&amp;quot;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#escapeText(String)}.
	* It tests if the method can escape the ' character in a string.
	*/
	@Test
	void testEscapeText10() {
		String str = "&apos;";
		String expected = "&amp;apos;";
		String actual = InspirentoUtilities.escapeText(str);
		assertEquals(expected, actual);
	}
}