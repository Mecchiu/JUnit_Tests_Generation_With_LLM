// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		private HTMLFilter instance = new HTMLFilter();

    /**
     * Test method for the {@link HTMLFilter#filter(String)} method.
     * Test method to check if the message filter has been properly initialized.
     */
    @Test
    void testIfFilterHasBeenInitialized() {
        String message="<test>";
        assertNotNull(instance.filter(message));
        message="<</b>";
        assertNull(instance.filter(message));
        message="<</b>";
        assertNull(instance.filter((String)null));
    }}