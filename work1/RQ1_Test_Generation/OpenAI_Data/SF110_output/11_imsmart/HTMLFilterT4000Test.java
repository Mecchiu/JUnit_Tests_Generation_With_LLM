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
		void testFilterNull() {
				assertNull(HTMLFilter.filter(null));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string is empty.
		*/
		@Test
		void testFilterEmpty() {
				assertEquals("", HTMLFilter.filter(""));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar2() {
				assertEquals("&lt;", HTMLFilter.filter("<"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar3() {
				assertEquals("&gt;", HTMLFilter.filter(">"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar4() {
				assertEquals("&amp;", HTMLFilter.filter("&"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar5() {
				assertEquals("&quot;", HTMLFilter.filter("\""));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar6() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar7() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar8() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar9() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar10() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
}</code>





A:

You can use the following code to run your test cases:
<code>public static void main(String[] args) {
    Result result = JUnitCore.runClasses(HTMLFilterTest.class);
    for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
    }
    System.out.println(result.wasSuccessful());
}
</code>
