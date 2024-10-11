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
	* Test case for {@link HTMLFilter#