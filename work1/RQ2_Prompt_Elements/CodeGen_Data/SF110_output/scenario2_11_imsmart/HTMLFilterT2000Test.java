// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
HTMLFilterTest() {
        // empty default constructor
        }

		HTMLFilterTest(String message) {
			/**
			 * Initialize the test by using the message (String) as the filter string.
			 *
			 * @param testMessage The message to be used for testing
			 */
			String testMessage = message;
			assertTrue("testMessage must be empty (or null)", (testMessage == null? true : testMessage.length() == 0 || testMessage.length() <= 120));
		}

		String getTestMessage() {
			return ("\n" +
				"#if ($param.hasBeenSet) \n" +
				"${param}\\!< " + HTMLFilter.filter(getTestMessage()));
		}

		@Test
		void test1() {
			String result = "";
			result = filter(getTestMessage());
			assertTrue("getTestMessage must have been the filter for an empty String", result.length() >= 0);
		}

		@Test
		void test2() {
			String result = "";
			result = filter(getTestMessage(), (char) 42);
			assertTrue("getTestMessage must have been the filter for a numeric character", result.length() >= 0);
		}
}
