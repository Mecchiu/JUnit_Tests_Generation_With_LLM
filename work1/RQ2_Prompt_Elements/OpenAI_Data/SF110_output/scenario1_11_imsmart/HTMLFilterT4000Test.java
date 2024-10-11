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
		* This test case tests the method with a null input.
		*/
		@Test
		void testFilterWithNullInput() {
				String input = null;
				String expected = null;
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with an empty input.
		*/
		@Test
		void testFilterWithEmptyInput() {
				String input = "";
				String expected = "";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '<' character.
		*/
		@Test
		void testFilterWithOnlyLessThan() {
				String input = "<";
				String expected = "&lt;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '>' character.
		*/
		@Test
		void testFilterWithOnlyGreaterThan() {
				String input = ">";
				String expected = "&gt;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '&' character.
		*/
		@Test
		void testFilterWithOnlyAmpersand() {
				String input = "&";
				String expected = "&amp;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '"' character.
		*/
		@Test
		void testFilterWithOnlyDoubleQuote() {
				String input = "\"";
				String expected = "&quot;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '<' and '>' characters.
		*/
		@Test
		void testFilterWithOnlyLessThanAndGreaterThan() {
				String input = "<>";
				String expected = "&lt;&gt;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '<', '>' and '&' characters.
		*/
		@Test
		void testFilterWithOnlyLessThanAndGreaterThanAndAmpersand() {
				String input = "<>&";
				String expected = "&lt;&gt;&amp;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing only '<', '>', '&' and '"' characters.
		*/
		@Test
		void testFilterWithOnlyLessThanAndGreaterThanAndAmpersandAndDoubleQuote() {
				String input = "<>&\"";
				String expected = "&lt;&gt;&amp;&quot;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* This test case tests the method with a string containing all the special characters.
		*/
		@Test
		void testFilterWithAllSpecialCharacters() {
				String input = "<>&\"";
				String expected = "&lt;&gt;&amp;&quot;";
				String actual = HTMLFilter.filter(input);
				assertEquals(expected, actual);
		}
		
}