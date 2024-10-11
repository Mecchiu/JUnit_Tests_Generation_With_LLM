// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
/**
     * Test of getTypeDesc method, of class SearchResult.
     */
    @Test
    public void testGetTypeDesc() {
        SearchResult object = new SearchResult();
        String expResult = "SearchResult";
        String result = object.getTypeDesc();
        assertEquals(expResult, result);
    }

}
