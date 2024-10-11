// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {

    /**
    * Test case for {@link SearchResultElement#getTypeClass()}.
    * It contains one unit test case for the {@link SearchResultElement#getTypeDesc()} method.
    */
    @Test
    public void testGetTypeClass() {
        assertEquals(SearchElementType.class, searchResultElement.getTypeClass());
        assertNotNull(searchResultElement.getTypeDesc());
    }
    
}
