// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
    final String message;
    
    HTMLFilterTest(String message) {
            this.message = message;
    }
    
    @Test
    void filter() {            
            assertEquals(filter(message), message);
    }

}