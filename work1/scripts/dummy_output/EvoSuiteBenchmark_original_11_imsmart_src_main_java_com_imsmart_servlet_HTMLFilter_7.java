// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
	/**
	 * Tests {@link HTMLFilter#filter(String)}.
	 */
	@Test
	public final void testFilter() {
        assertEquals(
            "The message was not filtered correctly",
            "This is a plain text message",
            htmlBodyTest("This is a plain text message")
        );
	}
	
	/**
	 * Tests {@link HTMLFilter#filter(String)}.
	 * When the given message is preceded by '>', the corresponding character
	 * is escaped using Unicode (\uFFFE and subsequent characters) or HTML4
	 * (\u00FF) formatting.
	 */
	@Test
	public final void testFilterEscaped() {
	    assertEquals(
            "The message was not filtered correctly",
            "<P>This is a plain text message</P>",
            htmlBodyTest("<P>This is a plain text message</P>")
        );
	}

}