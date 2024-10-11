// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains one unit test case for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {
		
    static String TEST_VALUE = "testvalue"; 
    
    @Test
    public void TestGetTypeDesc() {
        SearchResult searchResult = new SearchResult("title", TEST_VALUE, 0, null, 0, 0, 0, 0);
        assertEquals(typeDesc, searchResult.getTypeDesc());
    }

    
    @Test
    public void TestGetQuery() {
        SearchResult searchResult = new SearchResult("title", null, 0, null, 0, 0, 0, 0);
        assertEquals(TEST_VALUE, searchResult.getQuery());
    }

    @Test
    public void TestGetStartIndex() {
        SearchResult searchResult = new SearchResult("title", null, 0, null, 0, 0, 0, 0);
        assertEquals(0, searchResult.getStartIndex());
    }

    @Test
    public void TestGetEndIndex() {
        SearchResult searchResult = new SearchResult("title", null, 0, null, 0, 0, 0, 0);
        assertEquals(0, searchResult.getEndIndex());
    }

    @Test
    public void TestGetTotalResultsCount() {
        SearchResult searchResult = new SearchResult("title", null, 0, null, 0, 0, 0, 0);
        assertEquals(0, searchResult.getTotalResultsCount());
    }

}