// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {

	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testFilter_null() {
		String input = null;
		String expected = null;
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testFilter_empty() {
		String input = "";
		String expected = "";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar() {
		String input = "a";
		String expected = "a";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_lessThan() {
		String input = "<";
		String expected = "&lt;";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_greaterThan() {
		String input = ">";
		String expected = "&gt;";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_ampersand() {
		String input = "&";
		String expected = "&amp;";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_doubleQuote() {
		String input = "\"";
		String expected = "&quot;";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_singleQuote() {
		String input = "'";
		String expected = "'";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_backSlash() {
		String input = "\\";
		String expected = "\\";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_forwardSlash() {
		String input = "/";
		String expected = "/";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_space() {
		String input = " ";
		String expected = " ";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_tab() {
		String input = "\t";
		String expected = "\t";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_newLine() {
		String input = "\n";
		String expected = "\n";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_carriageReturn() {
		String input = "\r";
		String expected = "\r";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_formFeed() {
		String input = "\f";
		String expected = "\f";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_backspace() {
		String input = "\b";
		String expected = "\b";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_verticalTab() {
		String input = "\u000B";
		String expected = "\u000B";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_nonBreakingSpace() {
		String input = "\u00A0";
		String expected = "\u00A0";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_zeroWidthNoBreakSpace() {
		String input = "\uFEFF";
		String expected = "\uFEFF";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_zeroWidthSpace() {
		String input = "\u200B";
		String expected = "\u200B";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_zeroWidthJoiner() {
		String input = "\u200D";
		String expected = "\u200D";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_zeroWidthNonJoiner() {
		String input = "\u200C";
		String expected = "\u200C";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_leftToRightMark() {
		String input = "\u200E";
		String expected = "\u200E";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_rightToLeftMark() {
		String input = "\u200F";
		String expected = "\u200F";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_leftToRightEmbedding() {
		String input = "\u202A";
		String expected = "\u202A";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_rightToLeftEmbedding() {
		String input = "\u202B";
		String expected = "\u202B";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_leftToRightOverride() {
		String input = "\u202D";
		String expected = "\u202D";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_rightToLeftOverride() {
		String input = "\u202E";
		String expected = "\u202E";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_popDirectionalFormatting() {
		String input = "\u202C";
		String expected = "\u202C";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_leftToRightIsolate() {
		String input = "\u2066";
		String expected = "\u2066";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_rightToLeftIsolate() {
		String input = "\u2067";
		String expected = "\u2067";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_firstStrongIsolate() {
		String input = "\u2068";
		String expected = "\u2068";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_popDirectionalIsolate() {
		String input = "\u2069";
		String expected = "\u2069";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_inhibitSymmetricSwapping() {
		String input = "\u206A";
		String expected = "\u206A";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_activateSymmetricSwapping() {
		String input = "\u206B";
		String expected = "\u206B";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_inhibitArabicFormShaping() {
		String input = "\u206C";
		String expected = "\u206C";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#filter(String)} method.
	* It tests the case when the input string contains only one character.
	*/
	@Test
	void testFilter_oneChar_activateArabicFormShaping() {
		String input = "\u206D";
		String expected = "\u206D";
		String actual = HTMLFilter.filter(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLFilter#